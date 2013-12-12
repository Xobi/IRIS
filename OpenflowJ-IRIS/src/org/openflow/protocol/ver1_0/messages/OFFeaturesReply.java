package org.openflow.protocol.ver1_0.messages;

import java.nio.ByteBuffer;
import org.openflow.util.*;

import java.util.List;
import java.util.LinkedList;
import org.openflow.protocol.ver1_0.types.*;

public class OFFeaturesReply extends OFMessage  {
    public static int MINIMUM_LENGTH = 32;

    long  datapath_id;
	int  n_buffers;
	byte  n_tables;
	short pad_1th;
	byte pad_2th;
	int  capabilities;
	int  actions;
	List<OFPortDesc>  ports;

    public OFFeaturesReply() {
        super();
		setLength(U16.t(MINIMUM_LENGTH));
		setType(OFMessageType.valueOf((byte)6));
		this.ports = new LinkedList<OFPortDesc>();
    }
    
    public OFFeaturesReply(OFFeaturesReply other) {
    	super(other);
		this.datapath_id = other.datapath_id;
		this.n_buffers = other.n_buffers;
		this.n_tables = other.n_tables;
		this.capabilities = other.capabilities;
		this.actions = other.actions;
		this.ports = (other.ports == null)? null: new LinkedList<OFPortDesc>();
		for ( OFPortDesc i : other.ports ) { this.ports.add( new OFPortDesc(i) ); }
    }

	public long getDatapathId() {
		return this.datapath_id;
	}
	
	public OFFeaturesReply setDatapathId(long datapath_id) {
		this.datapath_id = datapath_id;
		return this;
	}
			
	public int getNBuffers() {
		return this.n_buffers;
	}
	
	public OFFeaturesReply setNBuffers(int n_buffers) {
		this.n_buffers = n_buffers;
		return this;
	}
			
	public byte getNTables() {
		return this.n_tables;
	}
	
	public OFFeaturesReply setNTables(byte n_tables) {
		this.n_tables = n_tables;
		return this;
	}
			
	public int getCapabilities() {
		return this.capabilities;
	}
	
	public OFFeaturesReply setCapabilities(int capabilities) {
		this.capabilities = capabilities;
		return this;
	}
			
	public int getActions() {
		return this.actions;
	}
	
	public OFFeaturesReply setActions(int actions) {
		this.actions = actions;
		return this;
	}
			
	public List<OFPortDesc> getPorts() {
		return this.ports;
	}
	
	public OFFeaturesReply setPorts(List<OFPortDesc> ports) {
		this.ports = ports;
		return this;
	}
			

    public void readFrom(ByteBuffer data) {
        int mark = data.position();
		super.readFrom(data);
		this.datapath_id = data.getLong();
		this.n_buffers = data.getInt();
		this.n_tables = data.get();
		this.pad_1th = data.getShort();
		this.pad_2th = data.get();
		this.capabilities = data.getInt();
		this.actions = data.getInt();
		if (this.ports == null) this.ports = new LinkedList<OFPortDesc>();
		int __cnt = ((int)getLength() - (data.position() - mark));
		while (__cnt > 0) { OFPortDesc t = new OFPortDesc(); t.readFrom(data); this.ports.add(t); __cnt -= OFPortDesc.MINIMUM_LENGTH; }
    }

    public void writeTo(ByteBuffer data) {
    	super.writeTo(data);
        data.putLong(this.datapath_id);
		data.putInt(this.n_buffers);
		data.put(this.n_tables);
		data.putShort(this.pad_1th);
		data.put(this.pad_2th);
		data.putInt(this.capabilities);
		data.putInt(this.actions);
		if (this.ports != null ) for (OFPortDesc t: this.ports) { t.writeTo(data); }
    }

    public String toString() {
        return super.toString() +  ":OFFeaturesReply-"+":datapath_id=" + U64.f(datapath_id) + 
		":n_buffers=" + U32.f(n_buffers) + 
		":n_tables=" + U8.f(n_tables) + 
		":capabilities=" + U32.f(capabilities) + 
		":actions=" + U32.f(actions) + 
		":ports=" + ports.toString();
    }

	// compute length (without final alignment)    
    public short computeLength() {
    	short len = (short)MINIMUM_LENGTH;
    	for ( OFPortDesc i : this.ports ) { len += i.computeLength(); }
    	return len;
    }
    
    // calculate the amount that will be increased by the alignment requirement.
    public short alignment(int total, int req) {
    	return (short)((total + (req-1))/req*req - total);
    }
    
    // compute the difference with MINIMUM_LENGTH (with alignment)
    public short lengthDiff() {
    	short total = computeLength();
    	return (short)(total - (short)MINIMUM_LENGTH + alignment(total, 0));
    }

    @Override
    public int hashCode() {
        		
		final int prime = 2887;
		int result = super.hashCode() * prime;
		result = prime * result + (int) datapath_id;
		result = prime * result + (int) n_buffers;
		result = prime * result + (int) n_tables;
		result = prime * result + (int) capabilities;
		result = prime * result + (int) actions;
		result = prime * result + ((ports == null)?0:ports.hashCode());
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
        if (!(obj instanceof OFFeaturesReply)) {
            return false;
        }
        OFFeaturesReply other = (OFFeaturesReply) obj;
		if ( datapath_id != other.datapath_id ) return false;
		if ( n_buffers != other.n_buffers ) return false;
		if ( n_tables != other.n_tables ) return false;
		if ( capabilities != other.capabilities ) return false;
		if ( actions != other.actions ) return false;
		if ( ports == null && other.ports != null ) { return false; }
		else if ( !ports.equals(other.ports) ) { return false; }
        return true;
    }
}
