import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Font;

public class CalculadoraPrincipal extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private JTextField txtSumaRestaDivision;
    private JTextField txtX;
    private JTextField txtEscalar;
    private JTextField txtCalculoDeX;
    private JTextField txtCalculoDeX_1;

	public CalculadoraPrincipal() {
		setResizable(false);
    	getContentPane().setBackground(new Color(63, 63, 63));
        setTitle("Calculadora");
        setSize(449, 352);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton botonAbrirEstandar = new JButton(" Estandar ");
        botonAbrirEstandar.setBackground(new Color(5, 238, 250));
        botonAbrirEstandar.setFont(new Font("Arial Black", Font.PLAIN, 11));
        botonAbrirEstandar.setBounds(10, 21, 121, 46);
        botonAbrirEstandar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	dispose();
                CalculadoraInterfazEstandar.main(new String[]{});
            }
        });
        getContentPane().setLayout(null);

        getContentPane().add(botonAbrirEstandar);
        
        JButton botonAbrir2x2 = new JButton("Sistemas 2x2");
        botonAbrir2x2.setBackground(new Color(78, 163, 177));
        botonAbrir2x2.setFont(new Font("Arial Black", Font.PLAIN, 11));
        botonAbrir2x2.setBounds(10, 192, 121, 46);
        botonAbrir2x2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	dispose();
                CalculadoraInterfazEcuacion2x2.main(new String[]{});
            }
        });
        getContentPane().add(botonAbrir2x2);
        
        JButton botonAbrir3x3 = new JButton("Sistemas 3x3");
        botonAbrir3x3.setBackground(new Color(104, 142, 151));
        botonAbrir3x3.setFont(new Font("Arial Black", Font.PLAIN, 11));
        botonAbrir3x3.setBounds(10, 249, 121, 46);
        botonAbrir3x3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	dispose();
                CalculadoraInterfazEcuacion3x3.main(new String[]{});
                
            }
        
        });
        getContentPane().add(botonAbrir3x3);
        
        JButton botonAbrirVectores = new JButton("Vectores");
        botonAbrirVectores.setFont(new Font("Arial Black", Font.PLAIN, 11));
        botonAbrirVectores.setBackground(new Color(31, 224, 224));
        botonAbrirVectores.setBounds(10, 78, 121, 46);        botonAbrirVectores.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	dispose();
                CalculadoraInterfazVector.main(new String[]{});
                
            }
        
        });
        getContentPane().add(botonAbrirVectores);
        
        JButton botonAbrirMatriz = new JButton("Matrices");
        botonAbrirMatriz.setBackground(new Color(34, 193, 221));
        botonAbrirMatriz.setFont(new Font("Arial Black", Font.PLAIN, 11));
        botonAbrirMatriz.setBounds(10, 135, 122, 46);
        botonAbrirMatriz.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	dispose();
                CalculadoraInterfazMatriz.main(new String[]{});
                
            }
        
        });
        getContentPane().add(botonAbrirMatriz);
        
        txtSumaRestaDivision = new JTextField();
        txtSumaRestaDivision.setFont(new Font("Arial Black", Font.PLAIN, 22));
        txtSumaRestaDivision.setText("+, -, *, /, x^, ^√x");
        txtSumaRestaDivision.setBounds(169, 22, 250, 46);
        getContentPane().add(txtSumaRestaDivision);
        txtSumaRestaDivision.setColumns(10);
        
        txtX = new JTextField();
        txtX.setFont(new Font("Arial Black", Font.PLAIN, 15));
        txtX.setText("+, -, x, P.Escalar, P.Vectorial");
        txtX.setBounds(169, 78, 250, 46);
        getContentPane().add(txtX);
        txtX.setColumns(10);
        
        txtEscalar = new JTextField();
        txtEscalar.setFont(new Font("Arial Black", Font.PLAIN, 15));
        txtEscalar.setText("+, -, x, /, Escalar, Det, Inversa ");
        txtEscalar.setBounds(169, 135, 250, 46);
        getContentPane().add(txtEscalar);
        txtEscalar.setColumns(10);
        
        txtCalculoDeX = new JTextField();
        txtCalculoDeX.setFont(new Font("Arial Black", Font.PLAIN, 18));
        txtCalculoDeX.setText("Calculo de X e Y");
        txtCalculoDeX.setBounds(169, 192, 250, 46);
        getContentPane().add(txtCalculoDeX);
        txtCalculoDeX.setColumns(10);
        
        txtCalculoDeX_1 = new JTextField();
        txtCalculoDeX_1.setFont(new Font("Arial Black", Font.PLAIN, 18));
        txtCalculoDeX_1.setText("Calculo de X, Y y Z");
        txtCalculoDeX_1.setBounds(169, 249, 250, 46);
        getContentPane().add(txtCalculoDeX_1);
        txtCalculoDeX_1.setColumns(10);
        
    }

    public static void main(String[] args) {
        CalculadoraPrincipal ventanaPrincipal = new CalculadoraPrincipal();
        ventanaPrincipal.setVisible(true);
    }
}
