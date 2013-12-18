package org.openflow.protocol.ver1_3.interfaces;

import java.nio.ByteBuffer;



public interface OFInstructionExperimenter extends OFInstruction {

	public int getExperimenterId();
	
	public OFInstructionExperimenter setExperimenterId(int value);
	
	public byte[] getData();
	
	public OFInstructionExperimenter setData(byte[] value);
	

    public void readFrom(ByteBuffer data);

    public void writeTo(ByteBuffer data);

    public short computeLength();

    // calculate the amount that will be increased by the alignment requirement.
    public short alignment(int total, int req);
    
    // compute the difference with MINIMUM_LENGTH (with alignment)
    public short lengthDiff();
}
