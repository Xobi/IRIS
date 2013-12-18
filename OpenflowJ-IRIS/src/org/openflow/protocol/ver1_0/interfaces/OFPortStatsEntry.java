package org.openflow.protocol.ver1_0.interfaces;

import java.nio.ByteBuffer;



public interface OFPortStatsEntry  {

	public short getPortNumber();
	
	public OFPortStatsEntry setPortNumber(short value);
	
	public long getReceivePackets();
	
	public OFPortStatsEntry setReceivePackets(long value);
	
	public long getTransmitPackets();
	
	public OFPortStatsEntry setTransmitPackets(long value);
	
	public long getReceiveBytes();
	
	public OFPortStatsEntry setReceiveBytes(long value);
	
	public long getTransmitBytes();
	
	public OFPortStatsEntry setTransmitBytes(long value);
	
	public long getReceiveDropped();
	
	public OFPortStatsEntry setReceiveDropped(long value);
	
	public long getTransmitDropped();
	
	public OFPortStatsEntry setTransmitDropped(long value);
	
	public long getReceiveErrors();
	
	public OFPortStatsEntry setReceiveErrors(long value);
	
	public long getTransmitErrors();
	
	public OFPortStatsEntry setTransmitErrors(long value);
	
	public long getReceiveFrameErrors();
	
	public OFPortStatsEntry setReceiveFrameErrors(long value);
	
	public long getReceiveOverrunErrors();
	
	public OFPortStatsEntry setReceiveOverrunErrors(long value);
	
	public long getReceiveCrcErr();
	
	public OFPortStatsEntry setReceiveCrcErr(long value);
	
	public long getCollisions();
	
	public OFPortStatsEntry setCollisions(long value);
	

    public void readFrom(ByteBuffer data);

    public void writeTo(ByteBuffer data);

    public short computeLength();

    // calculate the amount that will be increased by the alignment requirement.
    public short alignment(int total, int req);
    
    // compute the difference with MINIMUM_LENGTH (with alignment)
    public short lengthDiff();
}
