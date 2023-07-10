import java.awt.EventQueue;
import java.util.Stack;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;

public class CalculadoraInterfazEstandar {

    private JFrame frame;
    private JTextField InsertarValores;
    private JTextField ImprimirResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CalculadoraInterfazEstandar window = new CalculadoraInterfazEstandar();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public CalculadoraInterfazEstandar() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setResizable(false);
        frame.setBackground(SystemColor.menu);
        frame.getContentPane().setBackground(new Color(30, 30, 30));
        frame.setBounds(100, 100, 300, 422);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        InsertarValores = new JTextField();
        InsertarValores.setForeground(Color.WHITE);
        InsertarValores.setFont(new Font("Tahoma", Font.PLAIN, 15));
        InsertarValores.setBackground(new Color(63, 63, 63));
        InsertarValores.setHorizontalAlignment(4);
        InsertarValores.setBounds(10, 11, 264, 30);
        frame.getContentPane().add(InsertarValores);
        InsertarValores.setColumns(10);

        ImprimirResultado = new JTextField();
        ImprimirResultado.setToolTipText("");
        ImprimirResultado.setForeground(Color.WHITE);
        ImprimirResultado.setFont(new Font("Tahoma", Font.PLAIN, 15));
        ImprimirResultado.setBackground(new Color(80, 80, 80));
        ImprimirResultado.setEditable(false);
        ImprimirResultado.setHorizontalAlignment(4);
        ImprimirResultado.setBounds(10, 51, 264, 30);
        frame.getContentPane().add(ImprimirResultado);
        ImprimirResultado.setColumns(10);

        JButton BotonSuma = new JButton("+");
        BotonSuma.setForeground(Color.WHITE);
        BotonSuma.setBackground(Color.GRAY);
        BotonSuma.setFont(new Font("Tahoma", Font.PLAIN, 20));
        BotonSuma.setBounds(30, 119, 65, 50);
        frame.getContentPane().add(BotonSuma);
        BotonSuma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                agregarOperador("+");
            }
        });

        JButton BotonResta = new JButton("-");
        BotonResta.setForeground(Color.WHITE);
        BotonResta.setBackground(Color.GRAY);
        BotonResta.setFont(new Font("Tahoma", Font.PLAIN, 20));
        BotonResta.setBounds(108, 119, 65, 50);
        frame.getContentPane().add(BotonResta);
        BotonResta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                agregarOperador("-");
            }
        });

        JButton BotonMultiplicar = new JButton("*");
        BotonMultiplicar.setForeground(Color.WHITE);
        BotonMultiplicar.setBackground(Color.GRAY);
        BotonMultiplicar.setFont(new Font("Tahoma", Font.PLAIN, 20));
        BotonMultiplicar.setBounds(183, 119, 65, 50);
        frame.getContentPane().add(BotonMultiplicar);
        BotonMultiplicar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                agregarOperador("*");
            }
        });

        JButton BotonDividir = new JButton("/");
        BotonDividir.setForeground(Color.WHITE);
        BotonDividir.setBackground(Color.GRAY);
        BotonDividir.setFont(new Font("Tahoma", Font.PLAIN, 20));
        BotonDividir.setBounds(30, 180, 65, 50);
        frame.getContentPane().add(BotonDividir);
        BotonDividir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                agregarOperador("/");
            }
        });

        JButton BotonPotencia = new JButton("x^");
        BotonPotencia.setForeground(Color.WHITE);
        BotonPotencia.setBackground(Color.GRAY);
        BotonPotencia.setFont(new Font("Tahoma", Font.PLAIN, 20));
        BotonPotencia.setBounds(108, 180, 65, 50);
        frame.getContentPane().add(BotonPotencia);
        BotonPotencia.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                agregarOperador("^");
            }
        });

        JButton BotonClear = new JButton("CL");
        BotonClear.setFont(new Font("Tahoma", Font.PLAIN, 20));
        BotonClear.setForeground(new Color(255, 255, 255));
        BotonClear.setBackground(new Color(0, 128, 192));
        BotonClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clear();
            }
        });
        BotonClear.setBounds(30, 302, 65, 50);
        frame.getContentPane().add(BotonClear);
        
        JButton BotonAbrirParentesis = new JButton("(");
        BotonAbrirParentesis.setForeground(Color.WHITE);
        BotonAbrirParentesis.setFont(new Font("Tahoma", Font.PLAIN, 20));
        BotonAbrirParentesis.setBackground(Color.GRAY);
        BotonAbrirParentesis.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                agregarOperador("(");
            }
        });
        BotonAbrirParentesis.setBounds(30, 241, 65, 50);
        frame.getContentPane().add(BotonAbrirParentesis);

        JButton BotonCerrarParentesis = new JButton(")");
        BotonCerrarParentesis.setForeground(Color.WHITE);
        BotonCerrarParentesis.setBackground(Color.GRAY);
        BotonCerrarParentesis.setFont(new Font("Tahoma", Font.PLAIN, 20));
        BotonCerrarParentesis.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                agregarOperador(")");
            }
        });
        BotonCerrarParentesis.setBounds(108, 241, 65, 50);
        frame.getContentPane().add(BotonCerrarParentesis);

        JButton BotonMostrarResultado = new JButton("=");
        BotonMostrarResultado.setFont(new Font("Tahoma", Font.PLAIN, 20));
        BotonMostrarResultado.setBackground(new Color(128, 128, 192));
        BotonMostrarResultado.setForeground(new Color(255, 255, 255));
        BotonMostrarResultado.setToolTipText("");
        BotonMostrarResultado.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcularResultado();
            }
        });
        BotonMostrarResultado.setBounds(108, 302, 65, 50);
        frame.getContentPane().add(BotonMostrarResultado);

        JButton BotonRaiz = new JButton("√");
        BotonRaiz.setForeground(Color.WHITE);
        BotonRaiz.setBackground(Color.GRAY);
        BotonRaiz.setFont(new Font("Tahoma", Font.PLAIN, 20));
        BotonRaiz.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                agregarOperador("√");
            }
        });
        BotonRaiz.setBounds(183, 180, 65, 50);
        frame.getContentPane().add(BotonRaiz);
        
        JButton BotonVolver = new JButton("Volver");
        BotonVolver.setForeground(Color.WHITE);
        BotonVolver.setBackground(Color.BLACK);
        BotonVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
            	frame.dispose();
                CalculadoraPrincipal.main(new String[]{});
            }
        });
        BotonVolver.setBounds(183, 311, 89, 40);
        frame.getContentPane().add(BotonVolver);
    }

    private void agregarOperador(String operador) {
        String valorActual = InsertarValores.getText();
        InsertarValores.setText(valorActual + operador);
    }

    private void calcularResultado() {
        String operacionCompleta = InsertarValores.getText();
        double resultado = evaluarExpresion(operacionCompleta);
        ImprimirResultado.setText(String.valueOf(resultado));
    }

    private void clear() {
        InsertarValores.setText("");
        ImprimirResultado.setText("");
    }

    private double evaluarExpresion(String expresion) {
        Stack<Double> numeros = new Stack<>();
        Stack<Character> operadores = new Stack<>();

        for (int i = 0; i < expresion.length(); i++) {
            char c = expresion.charAt(i);

            if (Character.isDigit(c)) {
                StringBuilder numero = new StringBuilder();
                numero.append(c);

                while (i + 1 < expresion.length() && (Character.isDigit(expresion.charAt(i + 1)) || expresion.charAt(i + 1) == '.')) {
                    numero.append(expresion.charAt(i + 1));
                    i++;
                }

                double operando = Double.parseDouble(numero.toString());
                numeros.push(operando);
            } else if (c == '(') {
                operadores.push(c);
            } else if (c == ')') {
                while (!operadores.isEmpty() && operadores.peek() != '(') {
                    aplicarOperador(numeros, operadores);
                }

                if (!operadores.isEmpty() && operadores.peek() == '(') {
                    operadores.pop();
                }
            } else if (esOperador(c)) {
                while (!operadores.isEmpty() && precedencia(operadores.peek()) >= precedencia(c)) {
                    aplicarOperador(numeros, operadores);
                }
                operadores.push(c);
            }
        }

        while (!operadores.isEmpty()) {
            aplicarOperador(numeros, operadores);
        }

        return numeros.pop();
    }

    private void aplicarOperador(Stack<Double> operandos, Stack<Character> operadores) {
        char operador = operadores.pop();

        double numero2 = operandos.pop();
        double numero1 = operandos.pop();

        double resultado = 0;

        switch (operador) {
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                resultado = numero1 / numero2;
                break;
            case '^':
                resultado = Math.pow(numero1, numero2);
                break;
            case '√':
            	resultado = Math.pow(numero2, 1 / numero1);
            	break;
        }

        operandos.push(resultado);
    }

    private boolean esOperador(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^' || c == '√';
    }

    private int precedencia(char operador) {
        if (operador == '+' || operador == '-') {
            return 1;
        } else if (operador == '*' || operador == '/') {
            return 2;
        } else if (operador == '^' || operador == '√') {
            return 3;
        } else {
            return 0;
        }
    }
}
