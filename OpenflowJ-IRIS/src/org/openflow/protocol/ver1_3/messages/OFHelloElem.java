package org.openflow.protocol.ver1_3.messages;

import java.nio.ByteBuffer;
import org.openflow.util.*;

import org.openflow.protocol.ver1_3.types.*;

public class OFHelloElem    {
    public static int MINIMUM_LENGTH = 4;

    OFHelloElemType  type;
	short  length;

    public OFHelloElem() {
        
    }
    
    public OFHelloElem(OFHelloElem other) {
    	this.type = other.type;
		this.length = other.length;
    }

	public OFHelloElemType getType() {
		return this.type;
	}
	
	public OFHelloElem setType(OFHelloElemType type) {
		this.type = type;
		return this;
	}
			
	public short getLength() {
		return this.length;
	}
	
	public OFHelloElem setLength(short length) {
		this.length = length;
		return this;
	}
			

    public void readFrom(ByteBuffer data) {
        this.type = OFHelloElemType.valueOf(OFHelloElemType.readFrom(data));
		this.length = data.getShort();
    }

    public void writeTo(ByteBuffer data) {
    	
        data.putShort(this.type.getTypeValue());
		data.putShort(this.length);
    }

    public String toString() {
        return  ":OFHelloElem-"+":type=" + type.toString() + 
		":length=" + U16.f(length);
    }
    
    public short computeLength() {
    	short len = (short)MINIMUM_LENGTH;
    	
    	return len;
    }

    @Override
    public int hashCode() {
        		
		final int prime = 2441;
		int result = super.hashCode() * prime;
		result = prime * result + ((type == null)?0:type.hashCode());
		result = prime * result + (int) length;
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
        if (!(obj instanceof OFHelloElem)) {
            return false;
        }
        OFHelloElem other = (OFHelloElem) obj;
		if ( type == null && other.type != null ) { return false; }
		else if ( !type.equals(other.type) ) { return false; }
		if ( length != other.length ) return false;
        return true;
    }
}
