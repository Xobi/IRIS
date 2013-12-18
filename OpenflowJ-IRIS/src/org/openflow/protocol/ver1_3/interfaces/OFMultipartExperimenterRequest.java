package org.openflow.protocol.ver1_3.interfaces;

import java.nio.ByteBuffer;



public interface OFMultipartExperimenterRequest extends OFMultipartRequest {

	public int getExperimenterId();
	
	public OFMultipartExperimenterRequest setExperimenterId(int value);
	
	public int getExperimentType();
	
	public OFMultipartExperimenterRequest setExperimentType(int value);
	
	public byte[] getData();
	
	public OFMultipartExperimenterRequest setData(byte[] value);
	

    public void readFrom(ByteBuffer data);

    public void writeTo(ByteBuffer data);

    public short computeLength();

    // calculate the amount that will be increased by the alignment requirement.
    public short alignment(int total, int req);
    
    // compute the difference with MINIMUM_LENGTH (with alignment)
    public short lengthDiff();
}
