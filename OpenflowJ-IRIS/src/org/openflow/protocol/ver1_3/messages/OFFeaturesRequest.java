package org.openflow.protocol.ver1_3.messages;

import java.nio.ByteBuffer;
import org.openflow.util.*;

import org.openflow.protocol.ver1_3.types.*;

public class OFFeaturesRequest extends OFMessage  {
    public static int MINIMUM_LENGTH = 8;

    

    public OFFeaturesRequest() {
        super();
		setLength(U16.t(MINIMUM_LENGTH));
		setType(OFMessageType.valueOf((byte)5));
    }
    
    public OFFeaturesRequest(OFFeaturesRequest other) {
    	super(other);
    }



    public void readFrom(ByteBuffer data) {
        super.readFrom(data);
    }

    public void writeTo(ByteBuffer data) {
    	super.writeTo(data);
        
    }

    public String toString() {
        return super.toString() +  ":OFFeaturesRequest";
    }
    
    public short computeLength() {
    	short len = (short)MINIMUM_LENGTH;
    	
    	return len;
    }

    @Override
    public int hashCode() {
        		
		final int prime = 2351;
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
        if (!(obj instanceof OFFeaturesRequest)) {
            return false;
        }
        
        return true;
    }
}
