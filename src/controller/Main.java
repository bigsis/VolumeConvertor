package controller;
import javax.swing.JFrame;

import view.VolumeConvertorUI;
import net.webservicex.VolumeUnit;
import net.webservicex.Volumes;
import net.webservicex.VolumeUnitSoap;

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
