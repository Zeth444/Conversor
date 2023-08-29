package Temperatura;


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


public class ConversorTemperatura extends JFrame {

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
					ConversorTemperatura frame = new ConversorTemperatura();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public ConversorTemperatura() {
		setResizable(false);
		setBackground(new Color(0, 128, 128));
		setTitle("Conversor de Temperatura");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 599, 523);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Opciones = new JComboBox();
		Opciones.setModel(new DefaultComboBoxModel(new String[] {"Celsius a Kelvin", "Celsius a Fahrenheit", "Kelvin a Celsius", "Kelvin a Fahrenheit", "Fahrenheit a Celsius", "Fahrenheit a Kelvin", " "}));
		Opciones.setBounds(195, 86, 186, 39);
		contentPane.add(Opciones);
		
		JTextField lblNewLabel_1 = new JTextField("Ingrese una cantidad ");
		lblNewLabel_1.setBackground(new Color(0, 255, 255));
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
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

				double resFinal= 0.00;

				DecimalFormat limitar = new DecimalFormat("0.00");
				
				// Grados Celsius a Grados Kelvin

				double Kelvin= 273.00;
				if (Opciones.getSelectedIndex()==0) {
					resFinal=(ValCapt + Kelvin);
					result.setText("Equivalen a: " + limitar.format(resFinal));
					
				}

				// Grados Celsius a grados Fahrenheit
				double multC = 1.8;
				double sumC = 32.0;

				if(Opciones.getSelectedIndex()==1){
					resFinal=((ValCapt*multC)+sumC);
					result.setText("Equivalen a: "+ limitar.format(resFinal));

				}

				// Grados kelvin a Celsius
				if (Opciones.getSelectedIndex()==2) {
					resFinal=(ValCapt - Kelvin);
					result.setText("Equivalen a: " + limitar.format(resFinal));
					
				}

				// Grados Kelvin a Fahrenheit
				//Como no hay formula para convertir grados kelvin directamente a grados Fahrenheit, primero se deben convertir a grados Celsius y luego a grados Fahrenheit.

				if (Opciones.getSelectedIndex()==3) {
					resFinal= (((ValCapt-Kelvin)*multC)+sumC);
					result.setText("Equivalen a: " + limitar.format(resFinal));		
				}
				//Grados Fahrenheit a grados Celsius
				if (Opciones.getSelectedIndex()==4) {
					resFinal=((ValCapt-sumC)/multC);
					result.setText("Equivalen a: " + limitar.format(resFinal));			
				}

				// Grados Fahrenheit a Kelvin
				//Como no hay formula para convertir grados fahrenheit directamente a grados Kelvin, primero se deben convertir a grados Celsius y luego a grados Kelvin.

				if (Opciones.getSelectedIndex()==5) {

					resFinal=(((ValCapt - sumC)/multC)+ Kelvin);

					result.setText("Equivalen a: " + limitar.format(resFinal));
					
				}

			
			}
		});
		btConv.setBounds(195, 339, 186, 52);
		contentPane.add(btConv);
		
		result = new JTextField("0");
		result.setHorizontalAlignment(SwingConstants.LEFT);
		result.setFont(new Font("Arial Black", Font.PLAIN, 11));
		result.setBackground(Color.WHITE);
		result.setBounds(371, 227, 187, 39);
		contentPane.add(result);
		
		JTextField lblNewLabel_3 = new JTextField("Total");
		lblNewLabel_3.setBackground(new Color(0, 255, 255));
		lblNewLabel_3.setFont(new Font("Arial Black", Font.BOLD, 13));
		lblNewLabel_3.setForeground(new Color(255, 0, 0));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(371, 186, 187, 39);
		contentPane.add(lblNewLabel_3);
		
		Fondo = new JLabel("New label");
		Fondo.setBackground(new Color(255, 128, 0));
		Fondo.setHorizontalAlignment(SwingConstants.RIGHT);
		Fondo.setIcon(new ImageIcon(ConversorTemperatura.class.getResource("/Fondo/TempF.jpg")));
		Fondo.setBounds(0, 0, 599, 484);
		contentPane.add(Fondo);
		
	
	}
}

