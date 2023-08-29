import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Divisas.ConversorDivisas;
import Temperatura.ConversorTemperatura;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Conversor extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conversor frame = new Conversor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Conversor() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 557, 484);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bienvenido ¿Que desea convertir?");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(57, 39, 411, 60);
		contentPane.add(lblNewLabel);
		
		JButton ConvMonedas = new JButton("Convertir Monedas");
		ConvMonedas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 ConversorDivisas monedas = new ConversorDivisas();
			  monedas.setVisible(true);
			}
		});
		ConvMonedas.setBounds(61, 147, 225, 60);
		contentPane.add(ConvMonedas);
		
		JButton ConvTemp = new JButton("Convertir Temperatura");
		ConvTemp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConversorTemperatura temperatura = new ConversorTemperatura();
				temperatura.setVisible(true);
			}
		});
		ConvTemp.setBounds(61, 257, 225, 60);
		contentPane.add(ConvTemp);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial Black", Font.BOLD, 53));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText("¤");
		textField.setForeground(new Color(0, 0, 0));
		textField.setBackground(new Color(0, 128, 0));
		textField.setBounds(329, 147, 97, 60);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("°");
		textField_1.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_1.setForeground(Color.BLACK);
		textField_1.setFont(new Font("Arial Black", Font.BOLD, 67));
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(255, 128, 0));
		textField_1.setBounds(329, 257, 97, 60);
		contentPane.add(textField_1);
		
		JButton Salir = new JButton("Salir");
		Salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		Salir.setBounds(208, 392, 109, 29);
		contentPane.add(Salir);
	}
}
