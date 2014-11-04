package controller;

import net.webservicex.VolumeUnit;
import net.webservicex.VolumeUnitSoap;
import net.webservicex.Volumes;

/**
 * 
 * @author Sarit Suriyasangpetch 5510546191 
 * Controller of Volume controller
 */
public class VolumeController {
	private VolumeUnit factory;
	private VolumeUnitSoap volumeUnitSoap;
	
	/**
	 * Contructor
	 */
	public VolumeController() {
		factory =  new VolumeUnit();
		volumeUnitSoap = factory.getVolumeUnitSoap();
	}
	
	/**
	 * Convert method
	 * @param input input to convert
	 * @param from convert unit from
	 * @param to convert unit to
	 */
	public Double convert( Double input, Volumes from, Volumes to){
		return volumeUnitSoap.changeVolumeUnit(input, from, to);
	}

}
