import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;


public class CalculadoraInterfazEcuacion3x3 {

	private JFrame frame;
	private JTextField CoeficienteA;
	private JTextField CoeficienteB;
	private JTextField CoeficienteC;
	private JTextField CoeficienteE;
	private JTextField CoeficienteF;
	private JTextField CoeficienteG;
	private JTextField ImprimirResultadoX;
	private JTextField ImprimirResultadoY;
	private JTextField ImprimirResultadoZ;
	private JTextField CoeficienteD;
	private JTextField CoeficienteH;
	private JTextField CoeficienteI;
	private JTextField CoeficienteJ;
	private JTextField CoeficienteK;
	private JTextField CoeficienteL;
	private JButton BotonVolver;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraInterfazEcuacion3x3 window = new CalculadoraInterfazEcuacion3x3();
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
	public CalculadoraInterfazEcuacion3x3() {
		initialize();
		frame.getContentPane().setLayout(null);
		
		JLabel TextoEcuacion1 = new JLabel("Ecuacion 1");
		TextoEcuacion1.setForeground(Color.WHITE);
		TextoEcuacion1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		TextoEcuacion1.setBounds(10, 0, 95, 42);
		frame.getContentPane().add(TextoEcuacion1);
		
		JLabel TextoEcuacion2 = new JLabel("Ecuacion 2");
		TextoEcuacion2.setForeground(Color.WHITE);
		TextoEcuacion2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		TextoEcuacion2.setBounds(10, 107, 95, 42);
		frame.getContentPane().add(TextoEcuacion2);
		
		CoeficienteA = new JTextField();
		CoeficienteA.setForeground(Color.WHITE);
		CoeficienteA.setBackground(new Color(63, 63, 63));
		CoeficienteA.setHorizontalAlignment(SwingConstants.CENTER);
		CoeficienteA.setColumns(10);
		CoeficienteA.setBounds(20, 50, 46, 46);
		frame.getContentPane().add(CoeficienteA);
		
		CoeficienteB = new JTextField();
		CoeficienteB.setForeground(Color.WHITE);
		CoeficienteB.setBackground(new Color(63, 63, 63));
		CoeficienteB.setHorizontalAlignment(SwingConstants.CENTER);
		CoeficienteB.setColumns(10);
		CoeficienteB.setBounds(120, 50, 46, 46);
		frame.getContentPane().add(CoeficienteB);
		
		CoeficienteC = new JTextField();
		CoeficienteC.setForeground(Color.WHITE);
		CoeficienteC.setBackground(new Color(63, 63, 63));
		CoeficienteC.setHorizontalAlignment(SwingConstants.CENTER);
		CoeficienteC.setColumns(10);
		CoeficienteC.setBounds(219, 50, 46, 46);
		frame.getContentPane().add(CoeficienteC);
		
		JLabel TextoX_1 = new JLabel("X +");
		TextoX_1.setForeground(Color.WHITE);
		TextoX_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		TextoX_1.setBounds(76, 50, 46, 46);
		frame.getContentPane().add(TextoX_1);
		
		JLabel TextoY_1 = new JLabel("Y +");
		TextoY_1.setForeground(Color.WHITE);
		TextoY_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		TextoY_1.setBounds(176, 50, 46, 46);
		frame.getContentPane().add(TextoY_1);
		
		CoeficienteE = new JTextField();
		CoeficienteE.setForeground(Color.WHITE);
		CoeficienteE.setBackground(new Color(63, 63, 63));
		CoeficienteE.setHorizontalAlignment(SwingConstants.CENTER);
		CoeficienteE.setColumns(10);
		CoeficienteE.setBounds(20, 160, 46, 46);
		frame.getContentPane().add(CoeficienteE);
		
		CoeficienteF = new JTextField();
		CoeficienteF.setForeground(Color.WHITE);
		CoeficienteF.setBackground(new Color(63, 63, 63));
		CoeficienteF.setHorizontalAlignment(SwingConstants.CENTER);
		CoeficienteF.setColumns(10);
		CoeficienteF.setBounds(120, 160, 46, 46);
		frame.getContentPane().add(CoeficienteF);
		
		CoeficienteG = new JTextField();
		CoeficienteG.setForeground(Color.WHITE);
		CoeficienteG.setBackground(new Color(63, 63, 63));
		CoeficienteG.setHorizontalAlignment(SwingConstants.CENTER);
		CoeficienteG.setColumns(10);
		CoeficienteG.setBounds(219, 160, 46, 46);
		frame.getContentPane().add(CoeficienteG);
		
		JLabel TextoX_2 = new JLabel("X +");
		TextoX_2.setForeground(Color.WHITE);
		TextoX_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		TextoX_2.setBounds(76, 160, 46, 46);
		frame.getContentPane().add(TextoX_2);
		
		JLabel TextoY_2 = new JLabel("Y +");
		TextoY_2.setForeground(Color.WHITE);
		TextoY_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		TextoY_2.setBounds(176, 162, 46, 44);
		frame.getContentPane().add(TextoY_2);
		
		JLabel TextoResultadoX = new JLabel("X =");
		TextoResultadoX.setForeground(Color.WHITE);
		TextoResultadoX.setFont(new Font("Tahoma", Font.PLAIN, 20));
		TextoResultadoX.setBounds(40, 397, 46, 46);
		frame.getContentPane().add(TextoResultadoX);
		
		JLabel TextoResultadoY = new JLabel("Y =");
		TextoResultadoY.setForeground(Color.WHITE);
		TextoResultadoY.setFont(new Font("Tahoma", Font.PLAIN, 20));
		TextoResultadoY.setBounds(140, 397, 46, 46);
		frame.getContentPane().add(TextoResultadoY);
		
		ImprimirResultadoX = new JTextField();
		ImprimirResultadoX.setForeground(Color.WHITE);
		ImprimirResultadoX.setBackground(new Color(80, 80, 80));
		ImprimirResultadoX.setHorizontalAlignment(SwingConstants.CENTER);
		ImprimirResultadoX.setColumns(10);
		ImprimirResultadoX.setBounds(76, 397, 46, 46);
		frame.getContentPane().add(ImprimirResultadoX);
		
		ImprimirResultadoY = new JTextField();
		ImprimirResultadoY.setBackground(new Color(80, 80, 80));
		ImprimirResultadoY.setForeground(Color.WHITE);
		ImprimirResultadoY.setHorizontalAlignment(SwingConstants.CENTER);
		ImprimirResultadoY.setColumns(10);
		ImprimirResultadoY.setBounds(178, 397, 46, 46);
		frame.getContentPane().add(ImprimirResultadoY);
		
		JLabel TextoResultadoZ = new JLabel("Z =");
		TextoResultadoZ.setForeground(Color.WHITE);
		TextoResultadoZ.setFont(new Font("Tahoma", Font.PLAIN, 20));
		TextoResultadoZ.setBounds(252, 397, 46, 46);
		frame.getContentPane().add(TextoResultadoZ);
		
		ImprimirResultadoZ = new JTextField();
		ImprimirResultadoZ.setForeground(Color.WHITE);
		ImprimirResultadoZ.setBackground(new Color(80, 80, 80));
		ImprimirResultadoZ.setHorizontalAlignment(SwingConstants.CENTER);
		ImprimirResultadoZ.setColumns(10);
		ImprimirResultadoZ.setBounds(295, 397, 46, 46);
		frame.getContentPane().add(ImprimirResultadoZ);
		
		JLabel TextoZ_1 = new JLabel("Z =");
		TextoZ_1.setForeground(Color.WHITE);
		TextoZ_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		TextoZ_1.setBounds(275, 50, 46, 46);
		frame.getContentPane().add(TextoZ_1);
		
		CoeficienteD = new JTextField();
		CoeficienteD.setForeground(Color.WHITE);
		CoeficienteD.setFont(new Font("Tahoma", Font.PLAIN, 11));
		CoeficienteD.setBackground(new Color(63, 63, 63));
		CoeficienteD.setHorizontalAlignment(SwingConstants.CENTER);
		CoeficienteD.setColumns(10);
		CoeficienteD.setBounds(315, 50, 46, 46);
		frame.getContentPane().add(CoeficienteD);
		
		JLabel TextoZ_2 = new JLabel("Z =");
		TextoZ_2.setForeground(Color.WHITE);
		TextoZ_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		TextoZ_2.setBounds(275, 160, 46, 46);
		frame.getContentPane().add(TextoZ_2);
		
		CoeficienteH = new JTextField();
		CoeficienteH.setForeground(Color.WHITE);
		CoeficienteH.setBackground(new Color(63, 63, 63));
		CoeficienteH.setHorizontalAlignment(SwingConstants.CENTER);
		CoeficienteH.setColumns(10);
		CoeficienteH.setBounds(315, 160, 46, 46);
		frame.getContentPane().add(CoeficienteH);
		
		JLabel TextoEcuacion3 = new JLabel("Ecuacion 3");
		TextoEcuacion3.setForeground(Color.WHITE);
		TextoEcuacion3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		TextoEcuacion3.setBounds(10, 217, 95, 42);
		frame.getContentPane().add(TextoEcuacion3);
		
		CoeficienteI = new JTextField();
		CoeficienteI.setBackground(new Color(63, 63, 63));
		CoeficienteI.setForeground(Color.WHITE);
		CoeficienteI.setHorizontalAlignment(SwingConstants.CENTER);
		CoeficienteI.setColumns(10);
		CoeficienteI.setBounds(20, 272, 46, 46);
		frame.getContentPane().add(CoeficienteI);
		
		JLabel TextoX_3 = new JLabel("X +");
		TextoX_3.setForeground(Color.WHITE);
		TextoX_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		TextoX_3.setBounds(76, 272, 46, 46);
		frame.getContentPane().add(TextoX_3);
		
		CoeficienteJ = new JTextField();
		CoeficienteJ.setBackground(new Color(63, 63, 63));
		CoeficienteJ.setForeground(Color.WHITE);
		CoeficienteJ.setHorizontalAlignment(SwingConstants.CENTER);
		CoeficienteJ.setColumns(10);
		CoeficienteJ.setBounds(120, 272, 46, 46);
		frame.getContentPane().add(CoeficienteJ);
		
		JLabel TextoY_3 = new JLabel("Y +");
		TextoY_3.setForeground(Color.WHITE);
		TextoY_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		TextoY_3.setBounds(176, 272, 46, 46);
		frame.getContentPane().add(TextoY_3);
		
		CoeficienteK = new JTextField();
		CoeficienteK.setForeground(Color.WHITE);
		CoeficienteK.setBackground(new Color(63, 63, 63));
		CoeficienteK.setHorizontalAlignment(SwingConstants.CENTER);
		CoeficienteK.setColumns(10);
		CoeficienteK.setBounds(219, 272, 46, 46);
		frame.getContentPane().add(CoeficienteK);
		
		JLabel TextoZ_3 = new JLabel("Z =");
		TextoZ_3.setForeground(Color.WHITE);
		TextoZ_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		TextoZ_3.setBounds(275, 272, 46, 46);
		frame.getContentPane().add(TextoZ_3);
		
		CoeficienteL = new JTextField();
		CoeficienteL.setBackground(new Color(63, 63, 63));
		CoeficienteL.setForeground(Color.WHITE);
		CoeficienteL.setHorizontalAlignment(SwingConstants.CENTER);
		CoeficienteL.setColumns(10);
		CoeficienteL.setBounds(315, 272, 46, 46);
		frame.getContentPane().add(CoeficienteL);
		
		JButton BotonCalcular = new JButton("Calcular");
		BotonCalcular.setForeground(Color.WHITE);
		BotonCalcular.setBackground(new Color(128, 128, 192));
		BotonCalcular.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				double a = Double.parseDouble(CoeficienteA.getText());
		        double b = Double.parseDouble(CoeficienteB.getText());
		        double c = Double.parseDouble(CoeficienteC.getText());
		        double d = Double.parseDouble(CoeficienteD.getText());
		        double e1 = Double.parseDouble(CoeficienteE.getText());
		        double f = Double.parseDouble(CoeficienteF.getText());
		        double g = Double.parseDouble(CoeficienteG.getText());
		        double h = Double.parseDouble(CoeficienteH.getText());
		        double i = Double.parseDouble(CoeficienteI.getText());
		        double j = Double.parseDouble(CoeficienteJ.getText());
		        double k = Double.parseDouble(CoeficienteK.getText());
		        double l = Double.parseDouble(CoeficienteL.getText());

		        // Calcular los determinantes
		        double determinantePrincipal = (a * f * k) + (b * g * i) + (c * e1 * j) - (c * f * i) - (b * e1 * k) - (a * g * j);
		        double determinanteX = (d * f * k) + (b * g * l) + (c * h * j) - (c * f * l) - (b * h * k) - (d * g * j);
		        double determinanteY = (a * h * k) + (d * g * i) + (c * e1 * l) - (c * h * i) - (d * e1 * k) - (a * g * l);
		        double determinanteZ = (a * f * l) + (b * h * i) + (d * e1 * j) - (d * f * i) - (b * e1 * l) - (a * h * j);

		        // Calcular los valores de x, y, z
		        double valorX = determinanteX / determinantePrincipal;
		        double valorY = determinanteY / determinantePrincipal;
		        double valorZ = determinanteZ / determinantePrincipal;

		        // Mostrar los resultados en la interfaz de usuario
		        ImprimirResultadoX.setText(String.valueOf(valorX));
		        ImprimirResultadoY.setText(String.valueOf(valorY));
		        ImprimirResultadoZ.setText(String.valueOf(valorZ));
			}
		});
		BotonCalcular.setBounds(140, 342, 121, 36);
		frame.getContentPane().add(BotonCalcular);
		
		BotonVolver = new JButton("Volver");
		BotonVolver.setForeground(Color.WHITE);
		BotonVolver.setBackground(Color.BLACK);
		BotonVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
            	frame.dispose();
                CalculadoraPrincipal.main(new String[]{});
            }
        });
		BotonVolver.setBounds(285, 454, 89, 46);
		frame.getContentPane().add(BotonVolver);
	}

	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(30, 30, 30));
		frame.setResizable(false);
		frame.setBounds(100, 100, 400, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
