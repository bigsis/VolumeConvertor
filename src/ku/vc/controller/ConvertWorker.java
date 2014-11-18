package ku.vc.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingWorker;
import javax.swing.Timer;

import ku.vc.service.Volumes;

/**
 * 
 * @author Sarit Suriyasangpetch 5510546191 Swing worker for Volume Convertor to
 *         do multitreds
 */
public class ConvertWorker extends SwingWorker<String, Void> {
	private Double input;
	private Volumes from;
	private Volumes to;
	private VolumeController vc;
	private JTextField out;
	private final Timer t;
	private ConvertWorker cw = this;
	private JLabel img;

	/**
	 * contructor of class
	 * 
	 * @param vus
	 *            VolumeUnitSoap
	 * @param out
	 *            textfield of output
	 */
	public ConvertWorker(final VolumeController vc, final JTextField out,
			final JLabel img) {
		this.vc = vc;
		this.out = out;
		this.img = img;

		t = new Timer(7000, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Object[] options = { "Wait", "Cancel" };
				cw.cancel(true);
				t.stop();
				int input = JOptionPane
						.showOptionDialog(
								new JFrame(),
								"Connection seem to be too slow would you like to wait?",
								"Connection", JOptionPane.OK_CANCEL_OPTION,
								JOptionPane.WARNING_MESSAGE, null, options,
								options[0]);
				if (input == JOptionPane.OK_OPTION) {
					t.start();
					System.out.println("sss");
				}else {
					t.stop();
					cw.cancel(true);
					img.setIcon(null);
				}
				

			}
		});

	}

	/**
	 * set the component
	 * 
	 * @param input
	 *            input to convert
	 * @param from
	 *            convert unit from
	 * @param to
	 *            convert unit to
	 */
	public void set(Double input, Volumes from, Volumes to) {
		this.input = input;
		this.from = from;
		this.to = to;
	}

	@Override
	protected String doInBackground() throws Exception {
		t.stop();
		t.start();
		double changeVolumeUnit;
		try {
			this.vc.initSoap();
			changeVolumeUnit = vc.convert(input, from, to);
		} catch (NumberFormatException e) {
			return "Please input String";
		}

		return changeVolumeUnit + "";
	}

	@Override
	protected void done() {
		if (!cw.isCancelled()) {
			try {
				t.stop();
				img.setIcon(null);
				out.setText(get() + "");

			} catch (Exception e) {
				Object[] options = { "Retry", "Cancel" };
				cw.cancel(true);
				t.stop();
				int input = JOptionPane
						.showOptionDialog(
								new JFrame(),
								"Please connect to internet",
								"No internet connection", JOptionPane.OK_CANCEL_OPTION,
								JOptionPane.ERROR_MESSAGE, null, options,
								options[0]);
				if (input == JOptionPane.OK_OPTION) {
					cw = new ConvertWorker(vc, out, img);
					cw.execute();
					t.stop();
				}else {
					System.exit(0);
				}
				
			}
		}
	}

}
