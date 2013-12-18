package org.openflow.protocol.ver1_3.interfaces;

import java.nio.ByteBuffer;

import java.util.List;
import org.openflow.protocol.ver1_3.types.*;

public interface OFFlowStatsEntry  {

	public short getLength();
	
	public OFFlowStatsEntry setLength(short value);
	
	public byte getTableId();
	
	public OFFlowStatsEntry setTableId(byte value);
	
	public int getDurationSec();
	
	public OFFlowStatsEntry setDurationSec(int value);
	
	public int getDurationNsec();
	
	public OFFlowStatsEntry setDurationNsec(int value);
	
	public short getPriority();
	
	public OFFlowStatsEntry setPriority(short value);
	
	public short getIdleTimeout();
	
	public OFFlowStatsEntry setIdleTimeout(short value);
	
	public short getHardTimeout();
	
	public OFFlowStatsEntry setHardTimeout(short value);
	
	public short getFlags();
	
	public OFFlowStatsEntry setFlags(short value);
	
	public long getCookie();
	
	public OFFlowStatsEntry setCookie(long value);
	
	public long getPacketCount();
	
	public OFFlowStatsEntry setPacketCount(long value);
	
	public long getByteCount();
	
	public OFFlowStatsEntry setByteCount(long value);
	
	public OFMatchOxm getMatch();
	
	public OFFlowStatsEntry setMatch(OFMatchOxm value);
	
	public List<OFInstruction> getInstructions();
	
	public OFFlowStatsEntry setInstructions(List<OFInstruction> value);
	

    public void readFrom(ByteBuffer data);

    public void writeTo(ByteBuffer data);

    public short computeLength();

    // calculate the amount that will be increased by the alignment requirement.
    public short alignment(int total, int req);
    
    // compute the difference with MINIMUM_LENGTH (with alignment)
    public short lengthDiff();
}
