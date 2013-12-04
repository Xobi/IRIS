package org.openflow.protocol.ver1_3.messages;

import java.nio.ByteBuffer;
import org.openflow.util.*;

import org.openflow.protocol.ver1_3.types.*;

public class OFMultipartQueueRequest extends OFMultipartRequest  {
    public static int MINIMUM_LENGTH = 24;

    OFPortNo  port_no;
	int  queue_id;

    public OFMultipartQueueRequest() {
        super();
		setLength(U16.t(MINIMUM_LENGTH));
		setType(OFMessageType.valueOf((byte)18));
		setMultipartType(OFMultipartType.valueOf((short)5, getType()));
    }
    
    public OFMultipartQueueRequest(OFMultipartQueueRequest other) {
    	super(other);
		this.port_no = other.port_no;
		this.queue_id = other.queue_id;
    }

	public OFPortNo getPortNo() {
		return this.port_no;
	}
	
	public OFMultipartQueueRequest setPortNo(OFPortNo port_no) {
		this.port_no = port_no;
		return this;
	}
			
	public int getQueueId() {
		return this.queue_id;
	}
	
	public OFMultipartQueueRequest setQueueId(int queue_id) {
		this.queue_id = queue_id;
		return this;
	}
			

    public void readFrom(ByteBuffer data) {
        super.readFrom(data);
		this.port_no = OFPortNo.valueOf(OFPortNo.readFrom(data));
		this.queue_id = data.getInt();
    }

    public void writeTo(ByteBuffer data) {
    	super.writeTo(data);
        data.putInt(this.port_no.getValue());
		data.putInt(this.queue_id);
    }

    public String toString() {
        return super.toString() +  ":OFMultipartQueueRequest-"+":port_no=" + port_no.toString() + 
		":queue_id=" + U32.f(queue_id);
    }
    
    public short computeLength() {
    	short len = (short)MINIMUM_LENGTH;
    	
    	return len;
    }

    @Override
    public int hashCode() {
        		
		final int prime = 1627;
		int result = super.hashCode() * prime;
		result = prime * result + ((port_no == null)?0:port_no.hashCode());
		result = prime * result + (int) queue_id;
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
        if (!(obj instanceof OFMultipartQueueRequest)) {
            return false;
        }
        OFMultipartQueueRequest other = (OFMultipartQueueRequest) obj;
		if ( port_no == null && other.port_no != null ) { return false; }
		else if ( !port_no.equals(other.port_no) ) { return false; }
		if ( queue_id != other.queue_id ) return false;
        return true;
    }
}
