package org.openflow.protocol.ver1_3.messages;

import java.nio.ByteBuffer;
import org.openflow.util.*;

import org.openflow.protocol.ver1_3.types.*;

public class OFMeterFeatures    {
    public static int MINIMUM_LENGTH = 16;

    int  max_meter;
	int  band_types;
	OFCapabilities  capabilities;
	byte  max_bands;
	byte  max_color;
	short pad_1th;

    public OFMeterFeatures() {
        
    }
    
    public OFMeterFeatures(OFMeterFeatures other) {
    	this.max_meter = other.max_meter;
		this.band_types = other.band_types;
		this.capabilities = other.capabilities;
		this.max_bands = other.max_bands;
		this.max_color = other.max_color;
    }

	public int getMaxMeter() {
		return this.max_meter;
	}
	
	public OFMeterFeatures setMaxMeter(int max_meter) {
		this.max_meter = max_meter;
		return this;
	}
			
	public int getBandTypes() {
		return this.band_types;
	}
	
	public OFMeterFeatures setBandTypes(int band_types) {
		this.band_types = band_types;
		return this;
	}
			
	public int getCapabilities() {
		return this.capabilities.getValue();
	}
	
	public OFMeterFeatures setCapabilities(int capabilities) {
		if (this.capabilities == null) this.capabilities = new OFCapabilities();
		this.capabilities.setValue( capabilities );
		return this;
	}
	public byte getMaxBands() {
		return this.max_bands;
	}
	
	public OFMeterFeatures setMaxBands(byte max_bands) {
		this.max_bands = max_bands;
		return this;
	}
			
	public byte getMaxColor() {
		return this.max_color;
	}
	
	public OFMeterFeatures setMaxColor(byte max_color) {
		this.max_color = max_color;
		return this;
	}
			

    public void readFrom(ByteBuffer data) {
        this.max_meter = data.getInt();
		this.band_types = data.getInt();
		if (this.capabilities == null) this.capabilities = new OFCapabilities();
		this.capabilities.setValue( OFCapabilities.readFrom(data) );
		this.max_bands = data.get();
		this.max_color = data.get();
		this.pad_1th = data.getShort();
    }

    public void writeTo(ByteBuffer data) {
    	
        data.putInt(this.max_meter);
		data.putInt(this.band_types);
		data.putInt(this.capabilities.getValue());
		data.put(this.max_bands);
		data.put(this.max_color);
		data.putShort(this.pad_1th);
    }

    public String toString() {
        return  ":OFMeterFeatures-"+":max_meter=" + U32.f(max_meter) + 
		":band_types=" + U32.f(band_types) + 
		":capabilities=" + capabilities.toString() + 
		":max_bands=" + U8.f(max_bands) + 
		":max_color=" + U8.f(max_color);
    }
    
    public short computeLength() {
    	short len = (short)MINIMUM_LENGTH;
    	
    	return len;
    }

    @Override
    public int hashCode() {
        		
		final int prime = 1663;
		int result = super.hashCode() * prime;
		result = prime * result + (int) max_meter;
		result = prime * result + (int) band_types;
		result = prime * result + ((capabilities == null)?0:capabilities.hashCode());
		result = prime * result + (int) max_bands;
		result = prime * result + (int) max_color;
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
        if (!(obj instanceof OFMeterFeatures)) {
            return false;
        }
        OFMeterFeatures other = (OFMeterFeatures) obj;
		if ( max_meter != other.max_meter ) return false;
		if ( band_types != other.band_types ) return false;
		if ( capabilities == null && other.capabilities != null ) { return false; }
		else if ( !capabilities.equals(other.capabilities) ) { return false; }
		if ( max_bands != other.max_bands ) return false;
		if ( max_color != other.max_color ) return false;
        return true;
    }
}
