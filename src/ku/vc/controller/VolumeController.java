package ku.vc.controller;

import ku.vc.service.VolumeUnit;
import ku.vc.service.VolumeUnitSoap;
import ku.vc.service.Volumes;

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
	
	public void initSoap(){
		if( factory == null ){
			factory =  new VolumeUnit();
		}
		volumeUnitSoap = factory.getVolumeUnitSoap(); 
	}

}
