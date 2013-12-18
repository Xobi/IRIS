package org.openflow.protocol.ver1_0.interfaces;

import java.nio.ByteBuffer;



public interface OFStatisticsDescReply extends OFStatisticsReply {

	public String getManufacturerDescription();
	
	public OFStatisticsDescReply setManufacturerDescription(String value);
	
	public String getHardwareDescription();
	
	public OFStatisticsDescReply setHardwareDescription(String value);
	
	public String getSoftwareDescription();
	
	public OFStatisticsDescReply setSoftwareDescription(String value);
	
	public String getSerialNumber();
	
	public OFStatisticsDescReply setSerialNumber(String value);
	
	public String getDatapathDescription();
	
	public OFStatisticsDescReply setDatapathDescription(String value);
	

    public void readFrom(ByteBuffer data);

    public void writeTo(ByteBuffer data);

    public short computeLength();

    // calculate the amount that will be increased by the alignment requirement.
    public short alignment(int total, int req);
    
    // compute the difference with MINIMUM_LENGTH (with alignment)
    public short lengthDiff();
}
