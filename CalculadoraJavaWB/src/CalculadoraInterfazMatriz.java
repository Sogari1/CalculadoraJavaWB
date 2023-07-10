import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

public class CalculadoraInterfazMatriz {

	private JFrame frame;
	private JTextField IngresarFilas1;
	private JTextField IngresarColumnas1;
	private JTextField IngresarFilas2;
	private JTextField IngresarColumnas2;
	private JTextArea ImprimirMatriz1;
	private JTextArea ImprimirMatriz2;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraInterfazMatriz window = new CalculadoraInterfazMatriz();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CalculadoraInterfazMatriz() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(30, 30, 30));
		frame.setResizable(false);
		frame.setBackground(new Color(240, 240, 240));
		frame.setBounds(100, 100, 425, 500);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton GenerarMatriz1 = new JButton("Generar");
		GenerarMatriz1.setForeground(Color.WHITE);
		GenerarMatriz1.setBackground(new Color(128, 128, 192));
		GenerarMatriz1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int filas = Integer.parseInt(IngresarFilas1.getText());
				int columnas = Integer.parseInt(IngresarColumnas1.getText());
				int[][] matriz1 = new int[filas][columnas];
				StringBuilder sb = new StringBuilder();
				for (int i = 0; i < filas; i++) {
					for (int j = 0; j < columnas; j++) {
						String inputValue = JOptionPane.showInputDialog(
								"Ingrese el valor para la posici�n [" + i + "][" + j + "]:");
						int value = Integer.parseInt(inputValue);
						matriz1[i][j] = value;
						sb.append(matriz1[i][j]).append(" ");
					}
					sb.append("\n");
				}
				ImprimirMatriz1.setText(sb.toString());
			}
		});
		GenerarMatriz1.setBounds(90, 44, 89, 23);
		frame.getContentPane().add(GenerarMatriz1);

		JLabel TextoMatriz1 = new JLabel("Dimensiones de Matriz 1");
		TextoMatriz1.setForeground(Color.WHITE);
		TextoMatriz1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		TextoMatriz1.setBounds(10, 0, 169, 33);
		frame.getContentPane().add(TextoMatriz1);

		IngresarFilas1 = new JTextField();
		IngresarFilas1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		IngresarFilas1.setHorizontalAlignment(SwingConstants.CENTER);
		IngresarFilas1.setForeground(Color.WHITE);
		IngresarFilas1.setBackground(new Color(63, 63, 63));
		IngresarFilas1.setText("");
		IngresarFilas1.setBounds(10, 40, 30, 30);
		frame.getContentPane().add(IngresarFilas1);
		IngresarFilas1.setColumns(10);

		IngresarColumnas1 = new JTextField();
		IngresarColumnas1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		IngresarColumnas1.setHorizontalAlignment(SwingConstants.CENTER);
		IngresarColumnas1.setForeground(Color.WHITE);
		IngresarColumnas1.setBackground(new Color(63, 63, 63));
		IngresarColumnas1.setText("");
		IngresarColumnas1.setColumns(10);
		IngresarColumnas1.setBounds(50, 40, 30, 30);
		frame.getContentPane().add(IngresarColumnas1);

		ImprimirMatriz1 = new JTextArea();
		ImprimirMatriz1.setForeground(Color.WHITE);
		ImprimirMatriz1.setBackground(new Color(63, 63, 63));
		ImprimirMatriz1.setFont(new Font("Arial", Font.PLAIN, 19));
		ImprimirMatriz1.setEditable(false);
		ImprimirMatriz1.setBounds(10, 78, 130, 130);
		frame.getContentPane().add(ImprimirMatriz1);

		ImprimirMatriz2 = new JTextArea();
		ImprimirMatriz2.setForeground(Color.WHITE);
		ImprimirMatriz2.setBackground(new Color(63, 63, 63));
		ImprimirMatriz2.setFont(new Font("Arial", Font.PLAIN, 19));
		ImprimirMatriz2.setEditable(false);
		ImprimirMatriz2.setBounds(220, 80, 130, 130);
		frame.getContentPane().add(ImprimirMatriz2);

		IngresarFilas2 = new JTextField();
		IngresarFilas2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		IngresarFilas2.setHorizontalAlignment(SwingConstants.CENTER);
		IngresarFilas2.setForeground(Color.WHITE);
		IngresarFilas2.setBackground(new Color(63, 63, 63));
		IngresarFilas2.setText("");
		IngresarFilas2.setColumns(10);
		IngresarFilas2.setBounds(220, 44, 30, 30);
		frame.getContentPane().add(IngresarFilas2);

		JLabel TextoMatriz2 = new JLabel("Dimensiones de Matriz 2");
		TextoMatriz2.setForeground(Color.WHITE);
		TextoMatriz2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		TextoMatriz2.setBounds(220, 0, 169, 33);
		frame.getContentPane().add(TextoMatriz2);

		IngresarColumnas2 = new JTextField();
		IngresarColumnas2.setHorizontalAlignment(SwingConstants.CENTER);
		IngresarColumnas2.setForeground(Color.WHITE);
		IngresarColumnas2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		IngresarColumnas2.setBackground(new Color(63, 63, 63));
		IngresarColumnas2.setText("");
		IngresarColumnas2.setColumns(10);
		IngresarColumnas2.setBounds(260, 44, 30, 30);
		frame.getContentPane().add(IngresarColumnas2);

		JButton GenerarMatriz2 = new JButton("Generar");
		GenerarMatriz2.setForeground(Color.WHITE);
		GenerarMatriz2.setBackground(new Color(128, 128, 192));
		GenerarMatriz2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int filas = Integer.parseInt(IngresarFilas2.getText());
				int columnas = Integer.parseInt(IngresarColumnas2.getText());
				int[][] matriz2 = new int[filas][columnas];
				StringBuilder sb = new StringBuilder();
				for (int i = 0; i < filas; i++) {
					for (int j = 0; j < columnas; j++) {
						String inputValue = JOptionPane.showInputDialog(
								"Ingrese el valor para la posici�n [" + i + "][" + j + "]:");
						int value = Integer.parseInt(inputValue);
						matriz2[i][j] = value;
						sb.append(matriz2[i][j]).append(" ");
					}
					sb.append("\n");
				}
				ImprimirMatriz2.setText(sb.toString());
			}
		});
		GenerarMatriz2.setBounds(300, 48, 89, 23);
		frame.getContentPane().add(GenerarMatriz2);

		JTextArea Resultado = new JTextArea();
		Resultado.setForeground(Color.WHITE);
		Resultado.setBackground(new Color(80, 80, 80));
		Resultado.setFont(new Font("Arial", Font.PLAIN, 19));
		Resultado.setEditable(false);
		Resultado.setBounds(10, 267, 150, 130);
		frame.getContentPane().add(Resultado);

		JLabel TextoResultado = new JLabel("Resultado:");
		TextoResultado.setForeground(Color.WHITE);
		TextoResultado.setFont(new Font("Tahoma", Font.PLAIN, 17));
		TextoResultado.setBounds(10, 225, 99, 34);
		frame.getContentPane().add(TextoResultado);
		
		JButton BotonSuma = new JButton("Sumar");
		BotonSuma.setForeground(Color.WHITE);
		BotonSuma.setBackground(Color.GRAY);
		BotonSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int filas1 = Integer.parseInt(IngresarFilas1.getText());
		        int columnas1 = Integer.parseInt(IngresarColumnas1.getText());
		        int[][] matriz1 = new int[filas1][columnas1];
		        for (int i = 0; i < filas1; i++) {
		            String[] valores = ImprimirMatriz1.getText().split("\n")[i].split(" ");
		            for (int j = 0; j < columnas1; j++) {
		                matriz1[i][j] = Integer.parseInt(valores[j]);
		            }
		        }

		        int filas2 = Integer.parseInt(IngresarFilas2.getText());
		        int columnas2 = Integer.parseInt(IngresarColumnas2.getText());
		        int[][] matriz2 = new int[filas2][columnas2];
		        for (int i = 0; i < filas2; i++) {
		            String[] valores = ImprimirMatriz2.getText().split("\n")[i].split(" ");
		            for (int j = 0; j < columnas2; j++) {
		                matriz2[i][j] = Integer.parseInt(valores[j]);
		            }
		        }
		        
		        // Verificar si las dimensiones de las matrices son compatibles para la suma	        
		        if (filas1 == filas2 && columnas1 == columnas2) {
		            // Realizar la suma de las matrices
		            int[][] resultado = new int[filas1][columnas1];
		            for (int i = 0; i < filas1; i++) {
		                for (int j = 0; j < columnas1; j++) {
		                    resultado[i][j] = matriz1[i][j] + matriz2[i][j];
		                }
		            }

		            // Mostrar el resultado en el �rea de texto correspondiente
		            StringBuilder sb = new StringBuilder();
		            for (int i = 0; i < filas1; i++) {
		                for (int j = 0; j < columnas1; j++) {
		                    sb.append(resultado[i][j]).append(" ");
		                }
		                sb.append("\n");
		            }
		            Resultado.setText(sb.toString());
		        } else {
		            JOptionPane.showMessageDialog(frame, "Las dimensiones de las matrices no son compatibles para la suma.");
		        }
			}
		});
		BotonSuma.setBounds(181, 234, 99, 33);
		frame.getContentPane().add(BotonSuma);
		
		JButton BotonResta = new JButton("Restar");
		BotonResta.setForeground(Color.WHITE);
		BotonResta.setFont(new Font("Tahoma", Font.PLAIN, 11));
		BotonResta.setBackground(Color.GRAY);
		BotonResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int filas1 = Integer.parseInt(IngresarFilas1.getText());
		        int columnas1 = Integer.parseInt(IngresarColumnas1.getText());
		        int[][] matriz1 = new int[filas1][columnas1];
		        for (int i = 0; i < filas1; i++) {
		            String[] valores = ImprimirMatriz1.getText().split("\n")[i].split(" ");
		            for (int j = 0; j < columnas1; j++) {
		                matriz1[i][j] = Integer.parseInt(valores[j]);
		            }
		        }

		        int filas2 = Integer.parseInt(IngresarFilas2.getText());
		        int columnas2 = Integer.parseInt(IngresarColumnas2.getText());
		        int[][] matriz2 = new int[filas2][columnas2];
		        for (int i = 0; i < filas2; i++) {
		            String[] valores = ImprimirMatriz2.getText().split("\n")[i].split(" ");
		            for (int j = 0; j < columnas2; j++) {
		                matriz2[i][j] = Integer.parseInt(valores[j]);
		            }
		        }

		        // Verificar si las dimensiones de las matrices son compatibles para la suma
		        if (filas1 == filas2 && columnas1 == columnas2) {
		            // Realizar la suma de las matrices
		            int[][] resultado = new int[filas1][columnas1];
		            for (int i = 0; i < filas1; i++) {
		                for (int j = 0; j < columnas1; j++) {
		                    resultado[i][j] = matriz1[i][j] - matriz2[i][j];
		                }
		            }

		            StringBuilder sb = new StringBuilder();
		            for (int i = 0; i < filas1; i++) {
		                for (int j = 0; j < columnas1; j++) {
		                    sb.append(resultado[i][j]).append(" ");
		                }
		                sb.append("\n");
		            }
		            Resultado.setText(sb.toString());
		        } else {
		            JOptionPane.showMessageDialog(frame, "Las dimensiones de las matrices no son compatibles para la suma.");
		        }
			}
		});
		BotonResta.setBounds(290, 234, 99, 33);
		frame.getContentPane().add(BotonResta);
		
		JButton BotonEscalar = new JButton("Escalar M1");
		BotonEscalar.setBackground(Color.GRAY);
		BotonEscalar.setForeground(Color.WHITE);
		BotonEscalar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int filas = Integer.parseInt(IngresarFilas1.getText());
		        int columnas = Integer.parseInt(IngresarColumnas1.getText());
		        int[][] matriz1 = new int[filas][columnas];
		        for (int i = 0; i < filas; i++) {
		            String[] valores = ImprimirMatriz1.getText().split("\n")[i].split(" ");
		            for (int j = 0; j < columnas; j++) {
		                matriz1[i][j] = Integer.parseInt(valores[j]);
		            }
		        }

		        // Obtener el escalar ingresado
		        String escalarInput = JOptionPane.showInputDialog(frame, "Ingrese el valor del escalar:");
		        int escalar = Integer.parseInt(escalarInput);

		        // Realizar la multiplicaci�n de la matriz1 por el escalar
		        int[][] resultado = new int[filas][columnas];
		        for (int i = 0; i < filas; i++) {
		            for (int j = 0; j < columnas; j++) {
		                resultado[i][j] = matriz1[i][j] * escalar;
		            }
		        }

		        // Mostrar el resultado en el �rea de texto correspondiente
		        StringBuilder sb = new StringBuilder();
		        for (int i = 0; i < filas; i++) {
		            for (int j = 0; j < columnas; j++) {
		                sb.append(resultado[i][j]).append(" ");
		            }
		            sb.append("\n");
		        }
		        Resultado.setText(sb.toString());
			}
		});
		BotonEscalar.setBounds(181, 278, 99, 34);
		frame.getContentPane().add(BotonEscalar);
		
		JButton BotonMatrizXmatriz = new JButton("Multiplicar");
		BotonMatrizXmatriz.setBackground(Color.GRAY);
		BotonMatrizXmatriz.setForeground(Color.WHITE);
		BotonMatrizXmatriz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int filas1 = Integer.parseInt(IngresarFilas1.getText());
		        int columnas1 = Integer.parseInt(IngresarColumnas1.getText());
		        int[][] matriz1 = new int[filas1][columnas1];
		        for (int i = 0; i < filas1; i++) {
		            String[] valores = ImprimirMatriz1.getText().split("\n")[i].split(" ");
		            for (int j = 0; j < columnas1; j++) {
		                matriz1[i][j] = Integer.parseInt(valores[j]);
		            }
		        }

		        int filas2 = Integer.parseInt(IngresarFilas2.getText());
		        int columnas2 = Integer.parseInt(IngresarColumnas2.getText());
		        int[][] matriz2 = new int[filas2][columnas2];
		        for (int i = 0; i < filas2; i++) {
		            String[] valores = ImprimirMatriz2.getText().split("\n")[i].split(" ");
		            for (int j = 0; j < columnas2; j++) {
		                matriz2[i][j] = Integer.parseInt(valores[j]);
		            }
		        }

		        // Verificar si las dimensiones de las matrices son compatibles para la multiplicación
		        if (columnas1 != filas2) {
		            JOptionPane.showMessageDialog(frame, "Las dimensiones de las matrices no son compatibles para la multiplicación.");
		            return;
		        }

		        // Realizar la multiplicación de las matrices
		        int[][] resultado = new int[filas1][columnas2];
		        for (int i = 0; i < filas1; i++) {
		            for (int j = 0; j < columnas2; j++) {
		                int suma = 0;
		                for (int k = 0; k < columnas1; k++) {
		                    suma += matriz1[i][k] * matriz2[k][j];
		                }
		                resultado[i][j] = suma;
		            }
		        }

		        // Mostrar el resultado en el área de texto correspondiente
		        StringBuilder sb = new StringBuilder();
		        for (int i = 0; i < filas1; i++) {
		            for (int j = 0; j < columnas2; j++) {
		                sb.append(resultado[i][j]).append(" ");
		            }
		            sb.append("\n");
		        }
		        Resultado.setText(sb.toString());
			}
		});
		BotonMatrizXmatriz.setBounds(290, 278, 99, 34);
		frame.getContentPane().add(BotonMatrizXmatriz);
		
		JButton BotonDeterminante = new JButton("Determinante M1");
		BotonDeterminante.setForeground(Color.WHITE);
		BotonDeterminante.setBackground(Color.GRAY);
		BotonDeterminante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int filas = Integer.parseInt(IngresarFilas1.getText());
		        int columnas = Integer.parseInt(IngresarColumnas1.getText());
		        int[][] matriz = new int[filas][columnas];
		        for (int i = 0; i < filas; i++) {
		            String[] valores = ImprimirMatriz1.getText().split("\n")[i].split(" ");
		            for (int j = 0; j < columnas; j++) {
		                matriz[i][j] = Integer.parseInt(valores[j]);
		            }
		        }

		        if (filas == columnas) {
		            int determinante = calcularDeterminante(matriz, filas);
		            Resultado.setText(String.valueOf(determinante));
		        } else {
		            JOptionPane.showMessageDialog(frame, "La matriz no es cuadrada, no se puede calcular la determinante.");
		        }				
			}
		});
		BotonDeterminante.setBounds(220, 367, 140, 33);
		frame.getContentPane().add(BotonDeterminante);
		
		JButton BotonDivision = new JButton("Division");
		BotonDivision.setBackground(Color.GRAY);
		BotonDivision.setForeground(Color.WHITE);
		BotonDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				int filas1 = Integer.parseInt(IngresarFilas1.getText());
		        int columnas1 = Integer.parseInt(IngresarColumnas1.getText());
		        int filas2 = Integer.parseInt(IngresarFilas2.getText());
		        int columnas2 = Integer.parseInt(IngresarColumnas2.getText());

		        int[][] matriz1 = new int[filas1][columnas1];
		        int[][] matriz2 = new int[filas2][columnas2];

		        // Obtener valores de la matriz 1
		        for (int i = 0; i < filas1; i++) {
		            for (int j = 0; j < columnas1; j++) {
		                matriz1[i][j] = Integer.parseInt(ImprimirMatriz1.getText().split("\\s+")[i * columnas1 + j]);
		            }
		        }

		        // Obtener valores de la matriz 2
		        for (int i = 0; i < filas2; i++) {
		            for (int j = 0; j < columnas2; j++) {
		                matriz2[i][j] = Integer.parseInt(ImprimirMatriz2.getText().split("\\s+")[i * columnas2 + j]);
		            }
		        }

		        // Calcular la división de matrices
		        double[][] resultado = dividirMatrices(matriz1, matriz2);

		        if (resultado == null) {
		            JOptionPane.showMessageDialog(frame, "No es posible realizar la división de matrices.");
		        } else {
		            DecimalFormat df = new DecimalFormat("#.##");
		            StringBuilder sb = new StringBuilder();
		            for (int i = 0; i < resultado.length; i++) {
		                for (int j = 0; j < resultado[0].length; j++) {
		                    sb.append(df.format(resultado[i][j])).append(" ");
		                }
		                sb.append("\n");
		            }
		            Resultado.setText(sb.toString());
		        }
			}
		});
		BotonDivision.setBounds(290, 323, 99, 33);
		frame.getContentPane().add(BotonDivision);
		
		JButton BotonInversa = new JButton("Inversa");
		BotonInversa.setForeground(Color.WHITE);
		BotonInversa.setBackground(Color.GRAY);
		BotonInversa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int filas = Integer.parseInt(IngresarFilas1.getText());
				int columnas = Integer.parseInt(IngresarColumnas1.getText());
				int[][] matriz1 = new int[filas][columnas];
				for (int i = 0; i < filas; i++) {
					for (int j = 0; j < columnas; j++) {
						matriz1[i][j] = Integer.parseInt(ImprimirMatriz1.getText().split("\\s+")[i * columnas + j]);
					}
				}
				double[][] matrizInversa = calcularInversa(matriz1);
				if (matrizInversa == null) {
					JOptionPane.showMessageDialog(frame, "La matriz no es invertible.");
				} else {
					DecimalFormat df = new DecimalFormat("#.##");
					StringBuilder sb = new StringBuilder();
					for (int i = 0; i < matrizInversa.length; i++) {
						for (int j = 0; j < matrizInversa[0].length; j++) {
							sb.append(df.format(matrizInversa[i][j])).append(" ");
						}
						sb.append("\n");
					}
					Resultado.setText(sb.toString());
				}
			}
		});
		BotonInversa.setBounds(181, 323, 99, 33);
		frame.getContentPane().add(BotonInversa);
		
		JButton BotonVolver = new JButton("Volver");
		BotonVolver.setForeground(Color.WHITE);
		BotonVolver.setBackground(Color.BLACK);
		BotonVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
            	frame.dispose();
                CalculadoraPrincipal.main(new String[]{});
            }
        });
		BotonVolver.setBounds(300, 411, 89, 39);
		frame.getContentPane().add(BotonVolver);
	}	
	private int calcularDeterminante(int[][] matriz, int n) {
	    int det = 0;
	    if (n == 1) {
	        det = matriz[0][0];
	    } else if (n == 2) {
	        det = matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0];
	    } else {
	        det = 0;
	        for (int i = 0; i < n; i++) {
	            int[][] submatriz = new int[n - 1][n - 1];
	            for (int j = 1; j < n; j++) {
	                for (int k = 0; k < n; k++) {
	                    if (k < i) {
	                        submatriz[j - 1][k] = matriz[j][k];
	                    } else if (k > i) {
	                        submatriz[j - 1][k - 1] = matriz[j][k];
	                    }
	                }
	            }
	            det += matriz[0][i] * Math.pow(-1, i) * calcularDeterminante(submatriz, n - 1);
	        }
	    }
	    return det;
	}
	public double[][] calcularInversa(int[][] matriz) {
	    int filas = matriz.length;
	    int columnas = matriz[0].length;

	    // Paso 1: Calcular el determinante
	    int determinante = calcularDeterminante(matriz, filas);
	    if (determinante == 0) {
	        // La matriz no es invertible
	        return null;
	    }

	    // Paso 2: Calcular la adjunta
	    int[][] adjunta = calcularAdjunta(matriz);

	    // Paso 3: Calcular la inversa (1/determinante * adjunta)
	    double[][] matrizInversa = new double[filas][columnas];
	    for (int i = 0; i < filas; i++) {
	        for (int j = 0; j < columnas; j++) {
	            matrizInversa[i][j] = adjunta[i][j] / (double) determinante;
	        }
	    }
	    return matrizInversa;
	}
	public int[][] calcularAdjunta(int[][] matriz) {
	    int n = matriz.length;
	    int[][] adjunta = new int[n][n];

	    for (int i = 0; i < n; i++) {
	        for (int j = 0; j < n; j++) {
	            int[][] submatriz = obtenerSubmatriz(matriz, i, j);
	            int signo = (int) Math.pow(-1, i + j);
	            adjunta[j][i] = signo * calcularDeterminante(submatriz, n - 1);
	        }
	    }

	    return adjunta;
	}

	private int[][] obtenerSubmatriz(int[][] matriz, int filaExcluida, int columnaExcluida) {
	    int n = matriz.length;
	    int[][] submatriz = new int[n - 1][n - 1];
	    int filaDestino = 0;
	    int columnaDestino = 0;

	    for (int fila = 0; fila < n; fila++) {
	        for (int columna = 0; columna < n; columna++) {
	            if (fila != filaExcluida && columna != columnaExcluida) {
	                submatriz[filaDestino][columnaDestino] = matriz[fila][columna];
	                columnaDestino++;
	                if (columnaDestino == n - 1) {
	                    columnaDestino = 0;
	                    filaDestino++;
	                }
	            }
	        }
	    }

	    return submatriz;
	}
	public double[][] dividirMatrices(int[][] matriz1, int[][] matriz2) {
	    // Calcular la inversa de matriz2
	    double[][] matrizInversa = calcularInversa(matriz2);
	    if (matrizInversa == null) {
	        // No se puede dividir, matriz2 no es invertible
	        return null;
	    }

	    int filas1 = matriz1.length;
	    int columnas1 = matriz1[0].length;
	    int filas2 = matriz2.length;
	    int columnas2 = matriz2[0].length;

	    if (columnas1 != filas2) {
	        // No se puede dividir, las dimensiones de las matrices no son compatibles
	        return null;
	    }

	    double[][] resultado = new double[filas1][columnas2];
	    for (int i = 0; i < filas1; i++) {
	        for (int j = 0; j < columnas2; j++) {
	            double suma = 0;
	            for (int k = 0; k < columnas1; k++) {
	                suma += matriz1[i][k] * matrizInversa[k][j];
	            }
	            resultado[i][j] = suma;
	        }
	    }

	    return resultado;
	}
}


