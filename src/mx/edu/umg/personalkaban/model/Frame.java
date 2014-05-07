package mx.edu.umg.personalkaban.model;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;


public class Frame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame frame = new Frame();
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
	public Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 547);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblKanban = new JLabel("KanBan");
		lblKanban.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblKanban.setBounds(192, 11, 105, 14);
		contentPane.add(lblKanban);
		
		JLabel lblTitulo = new JLabel("Titulo");
		lblTitulo.setBounds(10, 41, 46, 14);
		contentPane.add(lblTitulo);
		
		textField = new JTextField();
		textField.setBounds(99, 38, 166, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblDescripcin = new JLabel("Descripci\u00F3n");
		lblDescripcin.setBounds(10, 81, 79, 14);
		contentPane.add(lblDescripcin);
		
		textField_1 = new JTextField();
		textField_1.setBounds(99, 78, 166, 51);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEstado = new JLabel("Estado");
		lblEstado.setBounds(10, 154, 46, 14);
		contentPane.add(lblEstado);
		
		JLabel lblCategora = new JLabel("Categor\u00EDa");
		lblCategora.setBounds(10, 207, 67, 14);
		contentPane.add(lblCategora);
		
		textField_3 = new JTextField();
		textField_3.setBounds(99, 204, 166, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblPrioridad = new JLabel("Prioridad");
		lblPrioridad.setBounds(10, 260, 46, 14);
		contentPane.add(lblPrioridad);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(10, 302, 46, 14);
		contentPane.add(lblUsuario);
		
		textField_5 = new JTextField();
		textField_5.setBounds(99, 299, 166, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblFechaDeEntrega = new JLabel("Fecha de entrega");
		lblFechaDeEntrega.setBounds(10, 349, 125, 14);
		contentPane.add(lblFechaDeEntrega);
		
		textField_6 = new JTextField();
		textField_6.setBounds(97, 346, 168, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"HIGH", "NORMAL\t", "LOW"}));
		comboBox.setEditable(true);
		comboBox.setBounds(99, 254, 166, 20);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"DO TO", "IN PROGRESS", "DONE"}));
		comboBox_1.setEditable(true);
		comboBox_1.setBounds(99, 148, 166, 20);
		contentPane.add(comboBox_1);
	}
}