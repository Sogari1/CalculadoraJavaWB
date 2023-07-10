import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import java.awt.Color;

public class CalculadoraInterfazEcuacion2x2 {

	private JFrame frame;
	private JTextField CoeficienteA;
	private JTextField CoeficienteB;
	private JTextField CoeficienteC;
	private JLabel TextoX_1;
	private JLabel TextoY_1;
	private JTextField CoeficienteD;
	private JTextField CoeficienteE;
	private JTextField CoeficienteF;
	private JLabel TextoX_2;
	private JLabel TextoY_2;
	private JLabel TextoResultadoX;
	private JLabel TextoResultadoY;
	private JTextField ImprimirResultadoX;
	private JTextField ImprimirResultadoY;
	private JButton BotonVolver;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraInterfazEcuacion2x2 window = new CalculadoraInterfazEcuacion2x2();
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
	public CalculadoraInterfazEcuacion2x2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(30, 30, 30));
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.setResizable(false);
		frame.setBounds(100, 100, 290, 470);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JLabel TextoEcuacion1 = new JLabel("Ecuacion 1");
		TextoEcuacion1.setForeground(Color.WHITE);
		TextoEcuacion1.setBackground(new Color(240, 240, 240));
		TextoEcuacion1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		TextoEcuacion1.setBounds(10, 0, 95, 42);
		frame.getContentPane().add(TextoEcuacion1);
		
		JLabel TextoEcuacion2 = new JLabel("Ecuacion 2");
		TextoEcuacion2.setForeground(Color.WHITE);
		TextoEcuacion2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		TextoEcuacion2.setBounds(10, 120, 95, 42);
		frame.getContentPane().add(TextoEcuacion2);
		
		CoeficienteA = new JTextField();
		CoeficienteA.setBackground(new Color(63, 63, 63));
		CoeficienteA.setHorizontalAlignment(SwingConstants.CENTER);
		CoeficienteA.setBounds(20, 50, 46, 46);
		frame.getContentPane().add(CoeficienteA);
		CoeficienteA.setColumns(10);
		
		CoeficienteB = new JTextField();
		CoeficienteB.setBackground(new Color(63, 63, 63));
		CoeficienteB.setHorizontalAlignment(SwingConstants.CENTER);
		CoeficienteB.setColumns(10);
		CoeficienteB.setBounds(118, 50, 46, 46);
		frame.getContentPane().add(CoeficienteB);
		
		CoeficienteC = new JTextField();
		CoeficienteC.setBackground(new Color(63, 63, 63));
		CoeficienteC.setHorizontalAlignment(SwingConstants.CENTER);
		CoeficienteC.setColumns(10);
		CoeficienteC.setBounds(214, 50, 46, 46);
		frame.getContentPane().add(CoeficienteC);
		
		TextoX_1 = new JLabel("X +");
		TextoX_1.setForeground(Color.WHITE);
		TextoX_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		TextoX_1.setBounds(76, 53, 46, 43);
		frame.getContentPane().add(TextoX_1);
		
		TextoY_1 = new JLabel("Y =");
		TextoY_1.setForeground(Color.WHITE);
		TextoY_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		TextoY_1.setBounds(174, 50, 46, 46);
		frame.getContentPane().add(TextoY_1);
		
		CoeficienteD = new JTextField();
		CoeficienteD.setBackground(new Color(63, 63, 63));
		CoeficienteD.setHorizontalAlignment(SwingConstants.CENTER);
		CoeficienteD.setColumns(10);
		CoeficienteD.setBounds(20, 173, 46, 46);
		frame.getContentPane().add(CoeficienteD);
		
		CoeficienteE = new JTextField();
		CoeficienteE.setBackground(new Color(63, 63, 63));
		CoeficienteE.setHorizontalAlignment(SwingConstants.CENTER);
		CoeficienteE.setColumns(10);
		CoeficienteE.setBounds(118, 173, 46, 46);
		frame.getContentPane().add(CoeficienteE);
		
		CoeficienteF = new JTextField();
		CoeficienteF.setBackground(new Color(63, 63, 63));
		CoeficienteF.setHorizontalAlignment(SwingConstants.CENTER);
		CoeficienteF.setColumns(10);
		CoeficienteF.setBounds(214, 173, 46, 46);
		frame.getContentPane().add(CoeficienteF);
		
		TextoX_2 = new JLabel("X +");
		TextoX_2.setForeground(Color.WHITE);
		TextoX_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		TextoX_2.setBounds(76, 173, 46, 46);
		frame.getContentPane().add(TextoX_2);
		
		TextoY_2 = new JLabel("Y =");
		TextoY_2.setForeground(Color.WHITE);
		TextoY_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		TextoY_2.setBounds(174, 173, 46, 46);
		frame.getContentPane().add(TextoY_2);
		
		TextoResultadoX = new JLabel("X =");
		TextoResultadoX.setForeground(Color.WHITE);
		TextoResultadoX.setFont(new Font("Tahoma", Font.PLAIN, 20));
		TextoResultadoX.setBounds(20, 310, 46, 36);
		frame.getContentPane().add(TextoResultadoX);
		
		TextoResultadoY = new JLabel("Y =");
		TextoResultadoY.setForeground(Color.WHITE);
		TextoResultadoY.setFont(new Font("Tahoma", Font.PLAIN, 20));
		TextoResultadoY.setBounds(118, 310, 46, 36);
		frame.getContentPane().add(TextoResultadoY);
		
		ImprimirResultadoX = new JTextField();
		ImprimirResultadoX.setBackground(new Color(80, 80, 80));
		ImprimirResultadoX.setFont(new Font("Tahoma", Font.PLAIN, 11));
		ImprimirResultadoX.setHorizontalAlignment(SwingConstants.CENTER);
		ImprimirResultadoX.setEditable(false);
		ImprimirResultadoX.setColumns(10);
		ImprimirResultadoX.setBounds(60, 309, 46, 46);
		frame.getContentPane().add(ImprimirResultadoX);
		
		ImprimirResultadoY = new JTextField();
		ImprimirResultadoY.setBackground(new Color(80, 80, 80));
		ImprimirResultadoY.setHorizontalAlignment(SwingConstants.CENTER);
		ImprimirResultadoY.setEditable(false);
		ImprimirResultadoY.setColumns(10);
		ImprimirResultadoY.setBounds(156, 309, 46, 46);
		frame.getContentPane().add(ImprimirResultadoY);
		
		JButton BotonCalcular = new JButton("Calcular");
		BotonCalcular.setForeground(Color.WHITE);
		BotonCalcular.setBackground(new Color(128, 128, 192));
		BotonCalcular.addMouseListener(new MouseAdapter() {
		    public void mouseClicked(MouseEvent e) {		    	
		    	double a = Double.parseDouble(CoeficienteA.getText());
		    	double b = Double.parseDouble(CoeficienteB.getText());
		    	double c = Double.parseDouble(CoeficienteC.getText());
		    	double d = Double.parseDouble(CoeficienteD.getText());
		    	double E = Double.parseDouble(CoeficienteE.getText());
		    	double f = Double.parseDouble(CoeficienteF.getText());

	                // Calcular los resultados del sistema de ecuaciones
	                double determinante = a * E - b * d;

	                if (determinante != 0) {
	                    double x = (c * E - b * f) / determinante;
	                    double y = (a * f - c * d) / determinante;

	                    // Mostrar los resultados en los campos de texto correspondientes
	                    ImprimirResultadoX.setText(Double.toString(x));
	                    ImprimirResultadoY.setText(Double.toString(y));
	                } else {
	                    // Si el determinante es cero, el sistema no tiene solución única
	                    ImprimirResultadoX.setText("N/A");
	                    ImprimirResultadoY.setText("N/A");
	                }
		    }
		});

		BotonCalcular.setBounds(81, 246, 121, 36);
		frame.getContentPane().add(BotonCalcular);
		
		BotonVolver = new JButton("Volver");
		BotonVolver.setBackground(Color.BLACK);
		BotonVolver.setForeground(Color.WHITE);
		BotonVolver.setBounds(175, 378, 89, 42);
		BotonVolver.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	frame.dispose();
                CalculadoraPrincipal.main(new String[]{});
            }
        });
		frame.getContentPane().add(BotonVolver);
	}
}