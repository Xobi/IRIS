package org.openflow.protocol.ver1_0.messages;

import java.nio.ByteBuffer;
import org.openflow.util.*;

import org.openflow.protocol.ver1_0.types.*;

public class OFFlowModify extends OFFlowMod  {
    public static int MINIMUM_LENGTH = 72;

    

    public OFFlowModify() {
        super();
		setLength(U16.t(MINIMUM_LENGTH));
		setType(OFMessageType.valueOf((byte)14));
		setCommand(OFFlowModCommand.valueOf((short)1));
    }
    
    public OFFlowModify(OFFlowModify other) {
    	super(other);
    }



    public void readFrom(ByteBuffer data) {
        super.readFrom(data);
    }

    public void writeTo(ByteBuffer data) {
    	super.writeTo(data);
        
    }

    public String toString() {
        return super.toString() +  ":OFFlowModify";
    }
    
    public short computeLength() {
    	short len = (short)MINIMUM_LENGTH;
    	
    	return len;
    }

    @Override
    public int hashCode() {
        		
		final int prime = 2713;
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
        if (!(obj instanceof OFFlowModify)) {
            return false;
        }
        
        return true;
    }
}
