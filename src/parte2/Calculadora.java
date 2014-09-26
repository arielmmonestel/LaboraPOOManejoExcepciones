package parte2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora {

	private JFrame frame;
	private JTextField textFieldRespuesta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 379, 352);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton buttonNum0 = new JButton("0");
		buttonNum0.setBounds(21, 254, 59, 23);
		frame.getContentPane().add(buttonNum0);
		
		JButton buttonNum7 = new JButton("7");
		buttonNum7.setBounds(21, 152, 59, 23);
		frame.getContentPane().add(buttonNum7);
		
		JButton buttonNum8 = new JButton("8");
		buttonNum8.setBounds(90, 152, 59, 23);
		frame.getContentPane().add(buttonNum8);
		
		JButton buttonNum9 = new JButton("9");
		buttonNum9.setBounds(159, 152, 59, 23);
		frame.getContentPane().add(buttonNum9);
		
		JButton btnRaiz = new JButton("Raiz");
		btnRaiz.setBounds(228, 152, 59, 23);
		frame.getContentPane().add(btnRaiz);
		
		JButton buttonExpo = new JButton("^");
		buttonExpo.setBounds(294, 152, 59, 23);
		frame.getContentPane().add(buttonExpo);
		
		JButton ButtonNum4 = new JButton("4");
		ButtonNum4.setBounds(21, 186, 59, 23);
		frame.getContentPane().add(ButtonNum4);
		
		JButton buttonNum5 = new JButton("5");
		buttonNum5.setBounds(90, 186, 59, 23);
		frame.getContentPane().add(buttonNum5);
		
		JButton buttonNum6 = new JButton("6");
		buttonNum6.setBounds(159, 186, 59, 23);
		frame.getContentPane().add(buttonNum6);
		
		JButton buttonDivision = new JButton("/");
		buttonDivision.setBounds(228, 186, 59, 23);
		frame.getContentPane().add(buttonDivision);
		
		JButton buttonMulti = new JButton("*");
		buttonMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		buttonMulti.setBounds(294, 186, 59, 23);
		frame.getContentPane().add(buttonMulti);
		
		JButton buttonNum3 = new JButton("3");
		buttonNum3.setBounds(21, 220, 59, 23);
		frame.getContentPane().add(buttonNum3);
		
		JButton buttonNum2 = new JButton("2");
		buttonNum2.setBounds(90, 220, 59, 23);
		frame.getContentPane().add(buttonNum2);
		
		JButton buttonNum1 = new JButton("1");
		buttonNum1.setBounds(159, 220, 59, 23);
		frame.getContentPane().add(buttonNum1);
		
		JButton buttonResta = new JButton("-");
		buttonResta.setBounds(228, 220, 59, 23);
		frame.getContentPane().add(buttonResta);
		
		JButton buttonSuma = new JButton("+");
		buttonSuma.setBounds(294, 220, 59, 78);
		frame.getContentPane().add(buttonSuma);
		
		JButton button_14 = new JButton(".");
		button_14.setBounds(90, 254, 59, 23);
		frame.getContentPane().add(button_14);
		
		JButton btnIn = new JButton("In");
		btnIn.setBounds(159, 254, 59, 23);
		frame.getContentPane().add(btnIn);
		
		JButton buttonIgual = new JButton("=");
		buttonIgual.setBounds(228, 254, 59, 23);
		frame.getContentPane().add(buttonIgual);
		
		JRadioButton rdbtnN = new JRadioButton("N");
		rdbtnN.setBounds(40, 81, 46, 23);
		frame.getContentPane().add(rdbtnN);
		
		JRadioButton rdbtnZ = new JRadioButton("Z");
		rdbtnZ.setBounds(109, 81, 46, 23);
		frame.getContentPane().add(rdbtnZ);
		
		JRadioButton rdbtnQ = new JRadioButton("Q");
		rdbtnQ.setBounds(178, 81, 46, 23);
		frame.getContentPane().add(rdbtnQ);
		
		JButton buttonSeleccionarTipo = new JButton("<------");
		buttonSeleccionarTipo.setBounds(228, 81, 89, 23);
		frame.getContentPane().add(buttonSeleccionarTipo);
		
		textFieldRespuesta = new JTextField();
		textFieldRespuesta.setEditable(false);
		textFieldRespuesta.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textFieldRespuesta.setText("0");
		textFieldRespuesta.setBounds(0, 0, 363, 74);
		frame.getContentPane().add(textFieldRespuesta);
		textFieldRespuesta.setColumns(10);
	}
}
