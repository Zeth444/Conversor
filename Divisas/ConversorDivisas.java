package Divisas;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;


public class ConversorDivisas extends JFrame {

	private JPanel contentPane;
	private JTextField Cantidad;
	private JComboBox Opciones;
	private JButton btConv;
	private JTextField result;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel Fondo;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConversorDivisas frame = new ConversorDivisas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
   

	
	public ConversorDivisas() {
		setResizable(false);
		setBackground(new Color(0, 128, 128));
		setTitle("Conversor de Monedas");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 599, 523);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Opciones = new JComboBox();
		Opciones.setModel(new DefaultComboBoxModel(new String[] {"Qutzales a Dolares", "Dolares a Quetzales", "Euros a Quetzales", "Quetzales a Euros", "Yuanes a Quetzales", "Quetzales a Yuanes ", "Yenes a Quetzales", "Quetzales a Yenes", "Pesos Mexicanos a Quetzales", "Quetzales a Pesos Mexicanos"}));
		Opciones.setBounds(195, 86, 186, 39);
		contentPane.add(Opciones);
		
		JLabel lblNewLabel_1 = new JLabel("Ingrese una cantidad ");
		lblNewLabel_1.setForeground(new Color(255, 255, 0));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(37, 187, 167, 39);
		contentPane.add(lblNewLabel_1);
		
		Cantidad = new JTextField();
		Cantidad.setBounds(37, 223, 167, 39);
		contentPane.add(Cantidad);
		Cantidad.setColumns(10);
		
		btConv = new JButton("Convertir\r\n");
		btConv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String val2 = Cantidad.getText();
				double ValCapt = Double.parseDouble(val2);

			//*convertir Dolares*	
				
				double tipoCambio = 7.84;
				double resFinal = 0.0;
				
				DecimalFormat limitar = new DecimalFormat(""+"0.00");
				
				if(Opciones.getSelectedIndex()==0) {
					
					// Quetzales a Dolares
					resFinal = (ValCapt/tipoCambio);
					result.setText("Equivale a: "+limitar.format(resFinal));
				}
					// Dolares a Quetzales
					else if (Opciones.getSelectedIndex()==1) {
						resFinal = (ValCapt*tipoCambio);
						result.setText("Equivale a: " +limitar.format(resFinal));
					}

				//*Convertir Euros a Quetzales y Quetzales a Euros*
					
				double tipocambioE = 8.54;

				//Euros a Quetzales 
				if (Opciones.getSelectedIndex()==2) {
					resFinal = (ValCapt*tipocambioE);
					result.setText( "Equivale a:"+limitar.format(resFinal));
				}
				// Quetzales a Euros 
				else if (Opciones.getSelectedIndex()==3){
					resFinal = (ValCapt/tipocambioE);
					result.setText("Equivale a: " + limitar.format(resFinal));
				}

                double tipoCambioY = 1.08;

				// Yuanes a Quetzales 
				if (Opciones.getSelectedIndex()==4) {
					resFinal = (ValCapt*tipoCambioY);
					result.setText("Equivale a: " + limitar.format(resFinal));
				}
				// Quetzales a Yuanes
				else if (Opciones.getSelectedIndex()==5){
					resFinal =(ValCapt/tipoCambioY);
					result.setText("Equivale a: "+ limitar.format(resFinal));
				}
				// Yenes a Quetzales 
				double tipocambioYE = 0.054;

				if (Opciones.getSelectedIndex()==6){
					resFinal = (ValCapt*tipocambioYE);
					result.setText("Equivale a: " + limitar.format(resFinal));
				}
				// Qutzales a Yenes
				else if (Opciones.getSelectedIndex()==7){
					resFinal = (ValCapt/tipocambioYE);
					result.setText("Equivale a: "+ limitar.format(resFinal));
				}

				// Pesos Mexicanos a Qutzales
				double tipoCambioPM = 0.46;
				if (Opciones.getSelectedIndex()==8) {
					resFinal = (ValCapt*tipoCambioPM);
					result.setText("Equivale a: "+ limitar.format(resFinal));
				} 
				//Quetzales a pesos Mexicanos
				else if(Opciones.getSelectedIndex()==9)
				resFinal = (ValCapt/tipoCambioPM);
				result.setText("Equivale a: "+ limitar.format(resFinal));
			}
		});
		btConv.setBounds(208, 338, 160, 51);
		contentPane.add(btConv);
		
		result = new JTextField("0");
		result.setHorizontalAlignment(SwingConstants.LEFT);
		result.setFont(new Font("Arial Black", Font.PLAIN, 11));
		result.setBackground(Color.WHITE);
		result.setBounds(371, 227, 187, 39);
		contentPane.add(result);
		
		JLabel lblNewLabel_3 = new JLabel("Total");
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 13));
		lblNewLabel_3.setForeground(new Color(255, 255, 0));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(385, 187, 173, 39);
		contentPane.add(lblNewLabel_3);
		
		Fondo = new JLabel("New label");
		Fondo.setIcon(new ImageIcon(ConversorDivisas.class.getResource("/Fondo/divisa negro.jpg")));
		Fondo.setBounds(0, 0, 583, 484);
		contentPane.add(Fondo);
		
	
	}
}
