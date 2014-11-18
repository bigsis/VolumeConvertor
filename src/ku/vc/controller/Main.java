package ku.vc.controller;
import javax.swing.JFrame;

import ku.vc.service.VolumeUnit;
import ku.vc.service.VolumeUnitSoap;
import ku.vc.service.Volumes;
import ku.vc.view.VolumeConvertorUI;

/**
 * 
 * @author Sarit Suriyasangpetch 5510546191
 * Run the Volume Convertor program
 */

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		VolumeController vc = new VolumeController();
		VolumeConvertorUI ui = new VolumeConvertorUI( vc );
	}

}
