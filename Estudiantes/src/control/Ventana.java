package control;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import modelo.Estudiante;
import modelo.ExcepcionEstudiante;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Validacion validar = new Validacion();
	public static JTextField textNombre;
	public static JTextField textApellidoP;
	public static JTextField textApellidoM;
	public static JTextField textMatricula;
	public static JTextField textCorreoIns;
	public static JTextField textCorreoPer;
	public static JTextField textNoCelular;
	public static JTextField textNoCasa;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Ventana() {
		setTitle("PLANEACION DE HORARIOS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 554, 361);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRegistro = new JLabel("Registro");
		lblRegistro.setBounds(10, 11, 52, 26);
		contentPane.add(lblRegistro);
		
		JLabel lblNombre = new JLabel("Nombre*");
		lblNombre.setBounds(72, 32, 70, 23);
		contentPane.add(lblNombre);
		
		textNombre = new JTextField();
		textNombre.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(Character.isDigit(c)){
					e.consume();
				}
			}
		});
		textNombre.setBounds(300, 33, 138, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblApellidoPaterno = new JLabel("Apellido Paterno*");
		lblApellidoPaterno.setBounds(72, 67, 181, 14);
		contentPane.add(lblApellidoPaterno);
		
		textApellidoP = new JTextField();
		textApellidoP.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(Character.isDigit(c)){
					e.consume();
				}
			}
		});
		textApellidoP.setBounds(300, 64, 138, 20);
		contentPane.add(textApellidoP);
		textApellidoP.setColumns(10);
		
		JLabel lblApellidoMaterno = new JLabel("Apellido Materno");
		lblApellidoMaterno.setBounds(72, 98, 181, 14);
		contentPane.add(lblApellidoMaterno);
		
		textApellidoM = new JTextField();
		textApellidoM.addKeyListener(new KeyAdapter() {
			@Override 
		    public void keyTyped(KeyEvent e) {
			char c = e.getKeyChar();
			if(Character.isDigit(c)){
				e.consume();
			}
		}
	});
		textApellidoM.setBounds(300, 95, 138, 20);
		contentPane.add(textApellidoM);
		textApellidoM.setColumns(10);
		
		JLabel lblMatricula = new JLabel("Matricula*");
		lblMatricula.setBounds(72, 126, 181, 14);
		contentPane.add(lblMatricula);
		
		textMatricula = new JTextField();
		textMatricula.addKeyListener(new KeyAdapter() {
			
		});
		textMatricula.setBounds(300, 123, 138, 20);
		contentPane.add(textMatricula);
		textMatricula.setColumns(10);
		

		JLabel CorreoInstitucinal = new JLabel("Correo Institucinal*");
		CorreoInstitucinal.setBounds(72, 157, 181, 14);
		contentPane.add(CorreoInstitucinal);
		
		textCorreoIns = new JTextField();	
		textCorreoIns.setBounds(300, 157, 216, 20);
		contentPane.add(textCorreoIns);
		textCorreoIns.setColumns(10);
		
		textCorreoPer = new JTextField();
		textCorreoPer.setBounds(300, 188, 216, 20);
		contentPane.add(textCorreoPer);
		textCorreoPer.setColumns(10);
		
		JLabel lblCorreoPersonal = new JLabel("Correo Personal*");
		lblCorreoPersonal.setBounds(72, 188, 181, 14);
		contentPane.add(lblCorreoPersonal);
		
		textNoCelular = new JTextField();

		textNoCelular.setBounds(300, 219, 138, 20);
		contentPane.add(textNoCelular);
		textNoCelular.setColumns(10);
		
		JLabel lblNoCelular = new JLabel("No. Celular*");
		lblNoCelular.setBounds(72, 219, 181, 14);
		contentPane.add(lblNoCelular);
		
		textNoCasa = new JTextField();
		
		textNoCasa.setBounds(300, 250, 138, 20);
		contentPane.add(textNoCasa);
		textNoCasa.setColumns(10);
		
		JLabel lblNoCasa = new JLabel("No. Casa");
		lblNoCasa.setBounds(72, 244, 181, 14);
		contentPane.add(lblNoCasa);
		
		JButton btnSalir = new JButton("   Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(318, 289, 89, 23);
		contentPane.add(btnSalir);
		
		JButton btnGuardar = new JButton("Continuar...");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Validacion check = new Validacion();
				String matricula = Ventana.textMatricula.getText();
				String correoPersonal = Ventana.textCorreoPer.getText();
				String correoInstitucional = Ventana.textCorreoIns.getText();
				String telCel = Ventana.textNoCelular.getText();
				String numCasa = Ventana.textNoCasa.getText();
				Boolean validar = check.validarCorreoInstitucional(correoInstitucional) &&
						check.validarCorreoPersonal(correoPersonal) && check.validarMatricula(matricula)
						&& check.validarNumCasa(numCasa) && check.validarNumTel(telCel);
				if (check.validarMatricula(matricula)==false) {
					//Crear el estudiante 
				} else {
					if( check.validarMatricula(matricula) == false ){
						textMatricula.setBackground(Color.red);
					}
					if( check.validarCorreoPersonal(correoPersonal) == false ){
						textCorreoPer.setBackground(Color.red);
					}
					if( check.validarCorreoInstitucional(correoInstitucional) == false ){
						textCorreoIns.setBackground(Color.red);
					}
					if( check.validarNumCasa(numCasa) == false ){
						textNoCasa.setBackground(Color.red);
					}
					if( check.validarNumTel(telCel) == false ){
						textNoCelular.setBackground(Color.red);
					}
					textNombre.setBackground(Color.green);
					textApellidoM.setBackground(Color.green);
					textApellidoP.setBackground(Color.green);
				}
			}
		});
		btnGuardar.setBounds(22, 289, 99, 23);
		contentPane.add(btnGuardar);
	}

}
