package org.openflow.protocol.ver1_3.messages;

import java.nio.ByteBuffer;
import org.openflow.util.*;

import org.openflow.protocol.ver1_3.types.*;

public class OFActionDecNwTtl extends OFAction  {
    public static int MINIMUM_LENGTH = 8;

    int pad_1th;

    public OFActionDecNwTtl() {
        super();
		setLength(U16.t(MINIMUM_LENGTH));
		setType(OFActionType.valueOf((short)24));
    }
    
    public OFActionDecNwTtl(OFActionDecNwTtl other) {
    	super(other);
    }



    public void readFrom(ByteBuffer data) {
        super.readFrom(data);
		this.pad_1th = data.getInt();
    }

    public void writeTo(ByteBuffer data) {
    	super.writeTo(data);
        data.putInt(this.pad_1th);
    }

    public String toString() {
        return super.toString() +  ":OFActionDecNwTtl";
    }
    
    public short computeLength() {
    	short len = (short)MINIMUM_LENGTH;
    	
    	return len;
    }

    @Override
    public int hashCode() {
        		
		final int prime = 2179;
		int result = super.hashCode() * prime;
		
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
        if (!(obj instanceof OFActionDecNwTtl)) {
            return false;
        }
        
        return true;
    }
}
