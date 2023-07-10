import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class CalculadoraInterfazVector {

	private JFrame frame;
	private JTextField IngresarTamano1;
	private JTextArea ImprimirVector1;
	private JTextField IngresarTamano2;
	private JTextArea Resultado;
	private int[] vector1;
	private int[] vector2;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraInterfazVector window = new CalculadoraInterfazVector();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CalculadoraInterfazVector() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(30, 30, 30));
		frame.getContentPane().setForeground(new Color(30, 30, 30));
		frame.setResizable(false);
		frame.setBounds(100, 100, 475, 345);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JLabel TextoTamanoVector1 = new JLabel("Tamaño vector 1:");
		TextoTamanoVector1.setForeground(Color.WHITE);
		TextoTamanoVector1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		TextoTamanoVector1.setBounds(10, 2, 186, 30);
		frame.getContentPane().add(TextoTamanoVector1);
		
		IngresarTamano1 = new JTextField();
		IngresarTamano1.setForeground(Color.WHITE);
		IngresarTamano1.setBackground(new Color(63, 63, 63));
		IngresarTamano1.setHorizontalAlignment(SwingConstants.CENTER);
		IngresarTamano1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		IngresarTamano1.setBounds(20, 35, 36, 30);
		frame.getContentPane().add(IngresarTamano1);
		IngresarTamano1.setColumns(10);
		
		JButton BotonGenerarVector1 = new JButton("Generar");
		BotonGenerarVector1.setForeground(Color.WHITE);
		BotonGenerarVector1.setBackground(new Color(128, 128, 192));
		BotonGenerarVector1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int tamano = Integer.parseInt(IngresarTamano1.getText()); 
				vector1 = new int[tamano]; 
			
				for (int i = 0; i < tamano; i++) {
				    String inputValue = JOptionPane.showInputDialog("Ingrese el valor para la posici�n " + i + ":");
				    int value = Integer.parseInt(inputValue);
				    vector1[i] = value;
				}
				String vectorText = "[ ";
				for (int i = 0; i < tamano; i++) {
					vectorText += vector1[i];
			        if (i < tamano - 1) 
			        {
			            vectorText += " , ";
			        }
				}
				vectorText += " ]";
				ImprimirVector1.setText(vectorText);
			}
		});
		BotonGenerarVector1.setBounds(66, 35, 130, 30);
		frame.getContentPane().add(BotonGenerarVector1);
		
		ImprimirVector1 = new JTextArea();
		ImprimirVector1.setForeground(Color.WHITE);
		ImprimirVector1.setBackground(new Color(63, 63, 63));
		ImprimirVector1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ImprimirVector1.setEditable(false);
		ImprimirVector1.setBounds(10, 76, 200, 40);
		frame.getContentPane().add(ImprimirVector1);
		
		JTextArea ImprimirVector2 = new JTextArea();
		ImprimirVector2.setForeground(Color.WHITE);
		ImprimirVector2.setBackground(new Color(63, 63, 63));
		ImprimirVector2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ImprimirVector2.setEditable(false);
		ImprimirVector2.setBounds(250, 78, 200, 40);
		frame.getContentPane().add(ImprimirVector2);
		
		IngresarTamano2 = new JTextField();
		IngresarTamano2.setForeground(Color.WHITE);
		IngresarTamano2.setBackground(new Color(63, 63, 63));
		IngresarTamano2.setHorizontalAlignment(SwingConstants.CENTER);
		IngresarTamano2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		IngresarTamano2.setColumns(10);
		IngresarTamano2.setBounds(250, 36, 36, 30);
		frame.getContentPane().add(IngresarTamano2);
		
		JLabel lblTamaoVector = new JLabel("Tamaño vector 2:");
		lblTamaoVector.setForeground(Color.WHITE);
		lblTamaoVector.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTamaoVector.setBounds(240, 2, 186, 30);
		frame.getContentPane().add(lblTamaoVector);
		
		JButton BotonGenerarVector2 = new JButton("Generar");
		BotonGenerarVector2.setForeground(Color.WHITE);
		BotonGenerarVector2.setBackground(new Color(128, 128, 192));
		BotonGenerarVector2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int tamano = Integer.parseInt(IngresarTamano2.getText()); 
				vector2 = new int[tamano]; 
			
				for (int i = 0; i < tamano; i++) {
				    String inputValue = JOptionPane.showInputDialog("Ingrese el valor para la posici�n " + i + ":");
				    int value = Integer.parseInt(inputValue);
				    vector2[i] = value;
				}
				String vectorText = "[ ";
				for (int i = 0; i < tamano; i++) {
					vectorText += vector2[i];
			        if (i < tamano - 1) 
			        {
			            vectorText += " , ";
			        }
				}
				vectorText += " ]";
				ImprimirVector2.setText(vectorText);
			}
		});
		BotonGenerarVector2.setBounds(296, 35, 130, 30);
		frame.getContentPane().add(BotonGenerarVector2);
		
		JButton BotonSumar = new JButton("Sumar");
		BotonSumar.setForeground(Color.WHITE);
		BotonSumar.setBackground(Color.GRAY);
		BotonSumar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		BotonSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (vector1 != null && vector2 != null) {
	            
		            if (vector1.length != vector2.length) {
		                JOptionPane.showMessageDialog(frame, "Los vectores deben tener la misma longitud.", "Error", JOptionPane.ERROR_MESSAGE);
		                return;
		            }
		            
		            int[] resultado = new int[vector1.length];
		            
		            for (int i = 0; i < vector1.length; i++) 
		            {
		                resultado[i] = vector1[i] + vector2[i];
		            }
		            
		            String resultadoText = "[ ";
		            for (int i = 0; i < resultado.length; i++) {
		                resultadoText += resultado[i];
		                if (i < resultado.length - 1) {
		                    resultadoText += " , ";
		                }
		            }
		            resultadoText += " ]";
		            
		            Resultado.setText(resultadoText);
		        } else 
		        {
		            JOptionPane.showMessageDialog(frame, "Debes generar los vectores primero.", "Error", JOptionPane.ERROR_MESSAGE);
		        }
			}
		});
		BotonSumar.setBounds(32, 129, 108, 34);
		frame.getContentPane().add(BotonSumar);
		
		JButton BotonRestar = new JButton("Restar");
		BotonRestar.setForeground(Color.WHITE);
		BotonRestar.setBackground(Color.GRAY);
		BotonRestar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		BotonRestar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (vector1 != null && vector2 != null) {
		            
		            if (vector1.length != vector2.length) {
		                JOptionPane.showMessageDialog(frame, "Los vectores deben tener la misma longitud.", "Error", JOptionPane.ERROR_MESSAGE);
		                return;
		            }
		            
		            int[] resultado = new int[vector1.length];
		            
		            for (int i = 0; i < vector1.length; i++) 
		            {
		                resultado[i] = vector1[i] - vector2[i];
		            }
		            
		            String resultadoText = "[ ";
		            for (int i = 0; i < resultado.length; i++) {
		            	resultadoText += resultado[i];
		            	if (i < resultado.length - 1) {
		                    resultadoText += " , ";
		                }
		            }
		            resultadoText += " ]";
		            Resultado.setText(resultadoText);
		        } else 
		        {
		            JOptionPane.showMessageDialog(frame, "Debes generar los vectores primero.", "Error", JOptionPane.ERROR_MESSAGE);
		        }
				
			}
		});
		BotonRestar.setBounds(32, 174, 108, 34);
		frame.getContentPane().add(BotonRestar);
		
		JButton BotonMultiplicarPorEscalar = new JButton("Multiplicar M1");
		BotonMultiplicarPorEscalar.setForeground(Color.WHITE);
		BotonMultiplicarPorEscalar.setBackground(Color.GRAY);
		BotonMultiplicarPorEscalar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		BotonMultiplicarPorEscalar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String escalarInput = JOptionPane.showInputDialog("Ingrese el escalar:");
				int escalar = Integer.parseInt(escalarInput);

				int[] resultado = new int[vector1.length];

				for (int i = 0; i < vector1.length; i++) {
				    resultado[i] = vector1[i] * escalar;
				}

				String resultadoText = "[ ";
				for (int i = 0; i < resultado.length; i++) {
					resultadoText += resultado[i];
	            	if (i < resultado.length - 1) {
	                    resultadoText += " , ";
	                }
	            }
	            resultadoText += " ]";

				Resultado.setText(resultadoText);
				
			}
		});
		BotonMultiplicarPorEscalar.setBounds(150, 129, 135, 34);
		frame.getContentPane().add(BotonMultiplicarPorEscalar);
		
		JButton BotoneEscalar = new JButton("P. Escalar ");
		BotoneEscalar.setBackground(Color.GRAY);
		BotoneEscalar.setForeground(Color.WHITE);
		BotoneEscalar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (vector1 != null && vector2 != null) {
				    if (vector1.length != vector2.length) {
				        JOptionPane.showMessageDialog(frame, "Los vectores deben tener la misma longitud.", "Error", JOptionPane.ERROR_MESSAGE);
				        return;
				    }
				    
				    int productoEscalar = 0;
				    
				    for (int i = 0; i < vector1.length; i++) {
				        productoEscalar += vector1[i] * vector2[i];
				    }
				    
				    Resultado.setText(String.valueOf(productoEscalar));
				} else {
				    JOptionPane.showMessageDialog(frame, "Debes generar los vectores primero.", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		BotoneEscalar.setBounds(296, 174, 120, 34);
		frame.getContentPane().add(BotoneEscalar);
		
		JButton BotonVectorial = new JButton("P. Vectorial");
		BotonVectorial.setBackground(Color.GRAY);
		BotonVectorial.setForeground(Color.WHITE);
		BotonVectorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (vector1 != null && vector2 != null) {
				    if (vector1.length != 3 || vector2.length != 3) {
				        JOptionPane.showMessageDialog(frame, "Los vectores deben ser tridimensionales.", "Error", JOptionPane.ERROR_MESSAGE);
				        return;
				    }
				    
				    int[] vector3 = new int[3];
				    
				    vector3[0] = (vector1[1] * vector2[2]) - (vector1[2] * vector2[1]);
				    vector3[1] = (vector1[2] * vector2[0]) - (vector1[0] * vector2[2]);
				    vector3[2] = (vector1[0] * vector2[1]) - (vector1[1] * vector2[0]);
				    
				    String vectorText = "[ ";
				    for (int i = 0; i < vector3.length; i++) {
				        vectorText += vector3[i];
				        if (i < vector3.length - 1) {
				            vectorText += " , ";
				        }
				    }
				    vectorText += " ]";
				    
				    Resultado.setText(vectorText);
				} else {
				    JOptionPane.showMessageDialog(frame, "Debes generar los vectores primero.", "Error", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		BotonVectorial.setBounds(296, 130, 120, 33);
		frame.getContentPane().add(BotonVectorial);
		
		Resultado = new JTextArea();
		Resultado.setBackground(new Color(80, 80, 80));
		Resultado.setForeground(Color.WHITE);
		Resultado.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Resultado.setEditable(false);
		Resultado.setBounds(110, 220, 230, 40);
		frame.getContentPane().add(Resultado);
		
		JLabel TextoResultado = new JLabel("Resultado:");
		TextoResultado.setForeground(Color.WHITE);
		TextoResultado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		TextoResultado.setBounds(177, 180, 98, 24);
		frame.getContentPane().add(TextoResultado);
		
		JButton BotonVolver = new JButton("Volver");
		BotonVolver.setBackground(Color.BLACK);
		BotonVolver.setForeground(Color.WHITE);
		BotonVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
            	frame.dispose();
                CalculadoraPrincipal.main(new String[]{});
            }
        });
		BotonVolver.setBounds(361, 255, 89, 40);
		frame.getContentPane().add(BotonVolver);
	}
}

