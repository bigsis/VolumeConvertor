package view;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import net.webservicex.VolumeUnitSoap;
import net.webservicex.Volumes;
import controller.ConvertWorker;
import controller.VolumeController;

/**
 * 
 * @author Sarit Suriyasangpetch 5510546191
 * UI of the Volume Converter
 */
public class VolumeConvertorUI extends JFrame {
	/** Field to input amount of volume*/
	private JTextField inField;
	
	/** Field of the volume after convert*/
	private JTextField outField;
	
	/** Volume controller*/
	private VolumeController vc;
	
	/** Swing Worker*/
	private ConvertWorker cw;
	
	/** Label of input*/
	private JLabel lblInput;
	
	/** Label of input unit*/
	private JLabel lblFrom;
	
	/** Label of of output unit*/
	private JLabel lblTo;
	
	/** Label of output*/
	private JLabel lblOutput;
	
	/** Convertor button*/
	private JButton btnConvert;
	
	private GroupLayout groupLayout;
	
	/** ConboBox of input unit*/
	private JComboBox<Volumes> comFrom;
	
	/** ComboBox of output unit*/
	private JComboBox<Volumes> comTo;
	
	public VolumeConvertorUI(final VolumeController vc) {
		super("Volume Convertor");
		this.vc =vc;
		this.initComponent();
		this.setPosition();
		inField.setColumns(10);
		this.setPreferredSize(new Dimension(450, 300));
		this.pack();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	/**
	 * method to init the component in UI
	 */
	public void initComponent(){
		inField = new JTextField();
		
		comFrom = new JComboBox<Volumes>(Volumes.values());

		comTo = new JComboBox<Volumes>(Volumes.values());
		
		lblInput = new JLabel("Input");
		
		lblFrom = new JLabel("From");
		
		lblTo = new JLabel("To");
		
		outField = new JTextField();
		
		outField.setColumns(10);
		
		outField.setEditable(false);
		
		lblOutput = new JLabel("Output");
		
		btnConvert = new JButton("Convert!");
		
		btnConvert.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cw = new ConvertWorker(vc, outField);
				cw.set(Double.parseDouble(inField.getText()), (Volumes)comFrom.getSelectedItem(), (Volumes)comTo.getSelectedItem());
				cw.execute();
			}
		});
		groupLayout = new GroupLayout(getContentPane());
	}
	
	/**
	 * method to set the position of component
	 */
	public void setPosition(){
		groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
					.addGroup(groupLayout.createSequentialGroup()
						.addGap(68)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
							.addGroup(groupLayout.createSequentialGroup()
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addComponent(lblInput)
									.addComponent(lblFrom)
									.addComponent(lblTo))
								.addGap(13))
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(lblOutput)
								.addPreferredGap(ComponentPlacement.UNRELATED)))
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(outField, Alignment.LEADING)
							.addComponent(inField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
							.addComponent(comTo, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(comFrom, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap(90, Short.MAX_VALUE))
					.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
						.addContainerGap(163, Short.MAX_VALUE)
						.addComponent(btnConvert, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
						.addGap(145))
			);
			groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(Alignment.TRAILING)
					.addGroup(groupLayout.createSequentialGroup()
						.addContainerGap(51, Short.MAX_VALUE)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(inField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblInput))
						.addGap(18	)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(comFrom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblFrom))
						.addGap(29)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(comTo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblTo))
						.addGap(16)
						.addComponent(btnConvert)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(outField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblOutput))
						.addContainerGap())
			);
			getContentPane().setLayout(groupLayout);
	}
}
