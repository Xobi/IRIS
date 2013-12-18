package org.openflow.protocol.ver1_0.interfaces;

import java.nio.ByteBuffer;

import java.util.List;

public interface OFStatisticsQueueReply extends OFStatisticsReply {

	public List<OFQueueStatsEntry> getEntries();
	
	public OFStatisticsQueueReply setEntries(List<OFQueueStatsEntry> value);
	

    public void readFrom(ByteBuffer data);

    public void writeTo(ByteBuffer data);

    public short computeLength();

    // calculate the amount that will be increased by the alignment requirement.
    public short alignment(int total, int req);
    
    // compute the difference with MINIMUM_LENGTH (with alignment)
    public short lengthDiff();
}
