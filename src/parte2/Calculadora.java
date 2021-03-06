package parte2;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.SwingConstants;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JToggleButton;
import javax.swing.JSeparator;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.Toolkit;

public class Calculadora {
	public enum Conjunto {NATURALES, ENTEROS, RACIONALES};
	private char operator;
	private Operacion operacion;

	private JFrame frame;
	private JTextField textFieldRespuesta;
	private JButton buttonSeleccionarTipo;
	private JButton buttonNum7;
	private JButton buttonNum8;
	private JButton buttonNum9;
	private JButton ButtonNum4;
	private JButton buttonNum5;
	private JButton buttonNum6;
	private JButton buttonNum3;
	private JButton buttonNum2;
	private JButton buttonNum1;
	private JButton buttonNum0;
	private JButton button;
	private JButton btnIn;
	private JButton buttonIgual;
	private JButton buttonSuma;
	private JButton buttonMulti;
	private JButton buttonExpo;
	private JButton btnRaiz;
	private JButton buttonDivision;
	private JButton buttonResta;
	static ButtonGroup grupo= new ButtonGroup();
	protected String texto ="";
	private JRadioButton rdbtnN;
	private JRadioButton rdbtnZ;
	private JRadioButton rdbtnQ;
	

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
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("./imgs/calc-icon.png"));
		frame.setResizable(false);
		frame.setBounds(100, 100, 359, 323);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		buttonNum0 = new JButton("0");
		buttonNum0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texto = textFieldRespuesta.getText();
				
					textFieldRespuesta.setText(texto+ "0");
				if (texto.equals("ln "))/////////////////////
	               	Operacion.setPrimerDato("8");////////////////
			}
		});
		buttonNum0.setBounds(21, 254, 46, 23);
		frame.getContentPane().add(buttonNum0);
		
		buttonNum7 = new JButton("7");
		buttonNum7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texto = textFieldRespuesta.getText();
				if (texto.equals("0") || texto.equals("ERROR") || texto.equals("ERROR")){
					textFieldRespuesta.setText("7");
				}
				else{
					textFieldRespuesta.setText(texto+ "7");
				}
			}
		});
		buttonNum7.setBounds(21, 152, 46, 23);
		frame.getContentPane().add(buttonNum7);
		
		buttonNum8 = new JButton("8");
		buttonNum8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texto = textFieldRespuesta.getText();
				if (texto.equals("0") || texto.equals("ERROR")){
					textFieldRespuesta.setText("8");
				}	
				else{
					textFieldRespuesta.setText(texto+ "8");
				}
				if (texto.equals("ln "))/////////////////////
                	Operacion.setPrimerDato("8");////////////////
			}
		});
		buttonNum8.setBounds(77, 152, 46, 23);
		frame.getContentPane().add(buttonNum8);
		
		buttonNum9 = new JButton("9");
		buttonNum9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 texto = textFieldRespuesta.getText();
				if (texto.equals("0") || texto.equals("ERROR")){
					textFieldRespuesta.setText("9");
				}
				else{
					textFieldRespuesta.setText(texto+ "9");
				}
				if (texto.equals("ln "))/////////////////////
                	Operacion.setPrimerDato("9");////////////////
			}
		});
		buttonNum9.setBounds(133, 152, 46, 23);
		frame.getContentPane().add(buttonNum9);
		
		btnRaiz = new JButton("\u221A");
		btnRaiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Operacion.setPrimerDato( textFieldRespuesta.getText() );
            	operator = 'l';
            	textFieldRespuesta.setText("0");
				
			}
		});
		btnRaiz.setBounds(199, 152, 59, 23);
		frame.getContentPane().add(btnRaiz);
		
		buttonExpo = new JButton("^");
		buttonExpo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Operacion.setPrimerDato( textFieldRespuesta.getText() );
				operator = '^';
				textFieldRespuesta.setText("0");				
			}
		});
		buttonExpo.setBounds(268, 152, 59, 23);
		frame.getContentPane().add(buttonExpo);
		

		ButtonNum4 = new JButton("4");
        ButtonNum4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                texto = textFieldRespuesta.getText();
                if (texto.equals("0") || texto.equals("ERROR")){
                    textFieldRespuesta.setText("4");
                }
                else{
                    textFieldRespuesta.setText(texto+ "4");
                }
                if (texto.equals("ln "))/////////////////////
                	Operacion.setPrimerDato("4");////////////////
            }
        });
        ButtonNum4.setBounds(21, 186, 46, 23);
        frame.getContentPane().add(ButtonNum4);
        
        buttonNum5 = new JButton("5");
        buttonNum5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                texto = textFieldRespuesta.getText();
                if (texto.equals("0") || texto.equals("ERROR")){
                    textFieldRespuesta.setText("5");
                }
                else{
                    textFieldRespuesta.setText(texto+ "5");
                }
                if (texto.equals("ln "))/////////////////////
                	Operacion.setPrimerDato("5");////////////////
            }
        });
        buttonNum5.setBounds(77, 186, 46, 23);
        frame.getContentPane().add(buttonNum5);
        
        buttonNum6 = new JButton("6");
        buttonNum6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                texto = textFieldRespuesta.getText();
                if (texto.equals("0") || texto.equals("ERROR")){
                    textFieldRespuesta.setText("6");
                }
                else{
                    textFieldRespuesta.setText(texto+ "6");
                }
                if (texto.equals("ln "))/////////////////////
                	Operacion.setPrimerDato("6");////////////////
            }
        });
        buttonNum6.setBounds(133, 186, 46, 23);
        frame.getContentPane().add(buttonNum6);
        
        buttonDivision = new JButton("/");
        buttonDivision.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	Operacion.setPrimerDato( textFieldRespuesta.getText() );
            	operator = '/';
            	textFieldRespuesta.setText("0");
            }
        });
        buttonDivision.setBounds(199, 186, 59, 23);
        frame.getContentPane().add(buttonDivision);
        
        buttonMulti = new JButton("*");
        buttonMulti.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            	Operacion.setPrimerDato( textFieldRespuesta.getText() );
            	operator = '*';
            	textFieldRespuesta.setText("0");
            }
        });
        buttonMulti.setBounds(268, 186, 59, 23);
        frame.getContentPane().add(buttonMulti);
        
        buttonNum3 = new JButton("3");
        buttonNum3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                texto = textFieldRespuesta.getText();
                if (texto.equals("0") || texto.equals("ERROR")){
                    textFieldRespuesta.setText("3");
                }
                else{
                    textFieldRespuesta.setText(texto+ "3");
                }
                if (texto.equals("ln "))/////////////////////
                	Operacion.setPrimerDato("3");////////////////
            }
        });
        buttonNum3.setBounds(133, 220, 46, 23);
        frame.getContentPane().add(buttonNum3);
        
        buttonNum2 = new JButton("2");
        buttonNum2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                texto = textFieldRespuesta.getText();
                if (texto.equals("0") || texto.equals("ERROR")){
                    textFieldRespuesta.setText("2");
                }
                else{
                    textFieldRespuesta.setText(texto+ "2");
                }
                if (texto.equals("ln "))/////////////////////
                	Operacion.setPrimerDato("2");////////////////
            }
        });
        buttonNum2.setBounds(77, 220, 46, 23);
        frame.getContentPane().add(buttonNum2);
        
        buttonNum1 = new JButton("1");
        buttonNum1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                texto = textFieldRespuesta.getText();
                if (texto.equals("0") || texto.equals("ERROR")){
                    textFieldRespuesta.setText("1");
                }
                else{
                    textFieldRespuesta.setText(texto+ "1");
                }
                if (texto.equals("ln "))/////////////////////
                	Operacion.setPrimerDato("1");////////////////
                
            }
        });
        buttonNum1.setBounds(21, 220, 46, 23);
        frame.getContentPane().add(buttonNum1);
        
        buttonResta = new JButton("-");
        buttonResta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	Operacion.setPrimerDato( textFieldRespuesta.getText() );
            	operator = '-';
            	textFieldRespuesta.setText("0");
           }
        });
        buttonResta.setBounds(199, 220, 59, 23);
        frame.getContentPane().add(buttonResta);
        
        buttonSuma = new JButton("+");
        buttonSuma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	Operacion.setPrimerDato( textFieldRespuesta.getText() );
            	operator = '+';
            	textFieldRespuesta.setText("0");
            }
            
        });
        buttonSuma.setBounds(199, 254, 59, 23);
        frame.getContentPane().add(buttonSuma);
        
        button = new JButton(".");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                texto = textFieldRespuesta.getText();
                if(!texto.contains(".")){//Hay a lo sumo un punto
                    textFieldRespuesta.setText(texto+ ".");
                }                
            }
        });
        button.setBounds(77, 254, 46, 23);
        frame.getContentPane().add(button);
        
        btnIn = new JButton("Log");
        btnIn.setFont(new Font("Tahoma", Font.PLAIN, 8));
        btnIn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	Operacion.setPrimerDato( textFieldRespuesta.getText() );
            	
            	System.out.println(Operacion.getPrimerDato());
            	operator = 'l';
            	textFieldRespuesta.setText("ln ");
            	
            }
        });
        btnIn.setBounds(133, 254, 46, 23);
        frame.getContentPane().add(btnIn);
        
        buttonIgual = new JButton("=");
        buttonIgual.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if(!texto.equals("ERROR")){
	        		switch (operator){
	        			case '*':
		        			operacion = new Multiplicacion();
		        			break;
	        			case '/':
	        				operacion = new Division();
	        				break;
	        			case '-':
	        				operacion = new Resta();
	        				break;
	        			case '+':
	        				operacion = new Suma();
	        				break;
	        			case 'l':
	        				operacion = new Ln();
	        				break;
	        			case 'r':
	        				//operacion = new Raiz();
	        				break;	
	        			case '^':
	        				operacion = new Potencia();
	        		}
	        		if( operator != 0){
		        		if(operator != '=' ){
		        			Operacion.setSegundoDato(textFieldRespuesta.getText());
		        		}
		        		operacion.realizarOperacion(getConjunto());
		        		textFieldRespuesta.setText(Operacion.getResultado());
		        		Operacion.setPrimerDato(textFieldRespuesta.getText());
		        		operator = '=';
	        		}
        		}
        	}
        });
        buttonIgual.setBounds(268, 220, 59, 57);
        frame.getContentPane().add(buttonIgual);
        
        rdbtnN = new JRadioButton("N");
        rdbtnN.setSelected(true);
        rdbtnN.setBounds(40, 81, 46, 23);
        frame.getContentPane().add(rdbtnN);
        grupo.add(rdbtnN);
        
        rdbtnZ = new JRadioButton("Z");
        rdbtnZ.setBounds(109, 81, 46, 23);
        frame.getContentPane().add(rdbtnZ);
        grupo.add(rdbtnZ);
        
        rdbtnQ = new JRadioButton("Q");
        rdbtnQ.setBounds(178, 81, 46, 23);
        frame.getContentPane().add(rdbtnQ);
        grupo.add(rdbtnQ);
        
        buttonSeleccionarTipo = new JButton("\u2190");
        buttonSeleccionarTipo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                textFieldRespuesta.setText("0");
            }
        });
        buttonSeleccionarTipo.setBounds(228, 81, 89, 23);
        frame.getContentPane().add(buttonSeleccionarTipo);
        
        textFieldRespuesta = new JTextField();
        textFieldRespuesta.setHorizontalAlignment(SwingConstants.RIGHT);
        textFieldRespuesta.setEditable(false);
        textFieldRespuesta.setFont(new Font("Tahoma", Font.PLAIN, 34));
        textFieldRespuesta.setText("0");
        textFieldRespuesta.setBounds(0, 0, 343, 74);
        frame.getContentPane().add(textFieldRespuesta);
        textFieldRespuesta.setColumns(10);
        
        JPanel panel = new JPanel();
        panel.setBorder(new LineBorder(Color.LIGHT_GRAY));
        panel.setBounds(10, 144, 333, 139);
        frame.getContentPane().add(panel);
    }

	public Conjunto getConjunto(){
		if(rdbtnN.isSelected()){
        	return Conjunto.NATURALES;	
        }
		else if(rdbtnZ.isSelected()){
        	return Conjunto.ENTEROS;
        }
		else{
			return Conjunto.RACIONALES;
		}
	}
}
