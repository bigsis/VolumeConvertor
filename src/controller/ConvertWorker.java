package controller;
import javax.swing.JTextField;
import javax.swing.SwingWorker;

import net.webservicex.VolumeUnitSoap;
import net.webservicex.Volumes;

/**
 * 
 * @author Sarit Suriyasangpetch 5510546191
 * Swing worker for Volume Convertor to do multitreds
 */
public class ConvertWorker extends SwingWorker<String, Void>{
	private Double input;
	private Volumes from;
	private Volumes to;
	private VolumeController vc;
	private JTextField out;
	
	/**
	 * contructor of class
	 * @param vus VolumeUnitSoap
	 * @param out textfield of output
	 */
	public ConvertWorker(VolumeController vc, JTextField out) {
		this.vc = vc;
		this.out = out;
	}
	
	/**
	 * set the component
	 * @param input input to convert
	 * @param from convert unit from
	 * @param to convert unit to
	 */
	public void set(Double input, Volumes from, Volumes to){
		this.input = input;
		this.from = from;
		this.to = to;
	}

	@Override
	protected String doInBackground() throws Exception {
		double changeVolumeUnit;
		try {
			changeVolumeUnit = vc.convert(input, from, to);
		}catch (NumberFormatException e) {
			return "Please input String";
		}
		
		return changeVolumeUnit + "";
	}

	@Override
	protected void done() {
		try {
			out.setText(get()+"");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
