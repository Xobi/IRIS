package org.openflow.protocol.ver1_3.messages;

import java.nio.ByteBuffer;
import org.openflow.util.*;

import org.openflow.protocol.ver1_3.types.*;

public class OFActionPopMpls extends OFAction  {
    public static int MINIMUM_LENGTH = 8;

    short  ethertype;
	short pad_1th;

    public OFActionPopMpls() {
        super();
		setLength(U16.t(MINIMUM_LENGTH));
		setType(OFActionType.valueOf((short)20));
    }
    
    public OFActionPopMpls(OFActionPopMpls other) {
    	super(other);
		this.ethertype = other.ethertype;
    }

	public short getEthertype() {
		return this.ethertype;
	}
	
	public OFActionPopMpls setEthertype(short ethertype) {
		this.ethertype = ethertype;
		return this;
	}
			

    public void readFrom(ByteBuffer data) {
        super.readFrom(data);
		this.ethertype = data.getShort();
		this.pad_1th = data.getShort();
    }

    public void writeTo(ByteBuffer data) {
    	super.writeTo(data);
        data.putShort(this.ethertype);
		data.putShort(this.pad_1th);
    }

    public String toString() {
        return super.toString() +  ":OFActionPopMpls-"+":ethertype=" + U16.f(ethertype);
    }
    
    public short computeLength() {
    	short len = (short)MINIMUM_LENGTH;
    	
    	return len;
    }

    @Override
    public int hashCode() {
        		
		final int prime = 2221;
		int result = super.hashCode() * prime;
		result = prime * result + (int) ethertype;
		return result;
    }

    @Override
    public boolean equals(Object obj) {
        
		if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof OFActionPopMpls)) {
            return false;
        }
        OFActionPopMpls other = (OFActionPopMpls) obj;
		if ( ethertype != other.ethertype ) return false;
        return true;
    }
}
