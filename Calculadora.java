import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Calculadora extends JFrame {

    JLabel Letrero, lblTotal;
    JTextField txtTotal;
    JButton btnBorrar, btnDiv, btnMult, btnRes, btnSuma, btnIgual, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnPunto;
    JPanel panel;
    private Object objTextField;
    public String guardar[] = new String[2];
    public int cont = 0, fun = 0, conti = 0, punto = 0;

    public Calculadora() {
        initComponents();
    }

    private void initComponents() {
        setSize(200, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        txtTotal = new JTextField(10);
        txtTotal.setEditable(false);

        btnBorrar = new JButton("Borrar");
        btnDiv = new JButton("/");
        btnMult = new JButton("x");
        btnRes = new JButton("-");
        btnSuma = new JButton("+");
        btnIgual = new JButton("=");
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        btn0 = new JButton("0");
        btnPunto = new JButton(".");
        btnBorrar.setBackground(java.awt.Color.red);
        btnDiv.setBackground(java.awt.Color.blue);
        btnMult.setBackground(java.awt.Color.blue);
        btnRes.setBackground(java.awt.Color.blue);
        btnSuma.setBackground(java.awt.Color.blue);
        btnIgual.setBackground(java.awt.Color.green);
        btnPunto.setBackground(java.awt.Color.blue);

        panel = new JPanel();
        txtTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtTotal.setBounds(132, 28, 144, 20);
        txtTotal.setText("0");
        panel.add(txtTotal);
        panel.add(btnBorrar);
        panel.add(btnDiv);
        panel.add(btnMult);
        panel.add(btnRes);
        panel.add(btn7);
        panel.add(btn8);
        panel.add(btn9);
        panel.add(btnSuma);
        panel.add(btn4);
        panel.add(btn4);
        panel.add(btn5);
        panel.add(btn6);
        panel.add(btnPunto);
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btn0);
        panel.add(btnIgual);
        guardar[0] = "";
        guardar[1] = "";

        btnBorrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnBorrarTodoActionPerformed(evt);
            }
        });

        btnDiv.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnDividirActionPerformed(evt);
            }
        });
        btnMult.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnMultiActionPerformed(evt);
            }
        });
        btnRes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnRestarActionPerformed(evt);
            }
        });
        btnRes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnRestarActionPerformed(evt);
            }
        });
        btnIgual.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });
        btnSuma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnSumaActionPerformed(evt);
            }
        });
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        btn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        btn9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        btn0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        btnPunto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });

        setTitle("CalculadoraG");

        setContentPane(panel);
        setVisible(true);
    }

    private void btnBorrarTodoActionPerformed(ActionEvent evt) {
        String c = txtTotal.getText();
        float display = Float.parseFloat(c.trim());
        txtTotal.setText("0");
        guardar[0] = "";
        guardar[1] = "";
        conti = 0;
        punto = 0;
    }

    private void btnDividirActionPerformed(ActionEvent evt) {
        txtTotal.setText("0");
        cont++;
        fun = 1;
        conti = 1;
        punto = 0;
    }

    private void btnMultiActionPerformed(ActionEvent evt) {
        txtTotal.setText("0");
        cont++;
        fun = 3;
        conti = 0;
        punto = 0;
    }

    private void btnRestarActionPerformed(ActionEvent evt) {
        txtTotal.setText("0");
        cont++;
        fun = 4;
        conti = 0;
        punto = 0;
    }

    private void btnIgualActionPerformed(ActionEvent evt) {
        float num1 = Float.parseFloat(guardar[0].trim());
        float num2 = Float.parseFloat(guardar[1].trim());
        if (fun == 1) {
            txtTotal.setText(Divicion(num1, num2) + "");
        } else {
            if (fun == 3) {
                txtTotal.setText(Multiplicacion(num1, num2) + "");
            } else {
                if (fun == 4) {
                    txtTotal.setText(Resta(num1, num2) + "");
                } else {
                    if (fun == 5) {
                        txtTotal.setText(Suma(num1, num2) + "");
                    }
                }

            }
        }
        cont--;
        guardar[0] = "";
        guardar[1] = "";
        conti = 0;
        punto = 0;
    }

    private void btnSumaActionPerformed(ActionEvent evt) {
        txtTotal.setText("0");
        cont++;
        fun = 5;
        conti = 0;
        punto = 0;
    }

    private void btn1ActionPerformed(ActionEvent evt) {
        if (conti == 1) {
            guardar[cont] = guardar[cont] + "1";
            txtTotal.setText(txtTotal.getText() + "1");
        } else {
            guardar[cont] = guardar[cont] + "1";
            txtTotal.setText("1");
            conti = 1;
        }

    }

    private void btn2ActionPerformed(ActionEvent evt) {
        if (conti == 1) {
            guardar[cont] = guardar[cont] + "2";
            txtTotal.setText(txtTotal.getText() + "2");
        } else {
            guardar[cont] = guardar[cont] + "2";
            txtTotal.setText("2");
            conti = 1;
        }
    }

    private void btn3ActionPerformed(ActionEvent evt) {
        if (conti == 1) {
            guardar[cont] = guardar[cont] + "3";
            txtTotal.setText(txtTotal.getText() + "3");
        } else {
            guardar[cont] = guardar[cont] + "3";
            txtTotal.setText("3");
            conti = 1;
        }
    }

    private void btn4ActionPerformed(ActionEvent evt) {
        if (conti == 1) {
            guardar[cont] = guardar[cont] + "4";
            txtTotal.setText(txtTotal.getText() + "4");
        } else {
            guardar[cont] = guardar[cont] + "4";
            txtTotal.setText("4");
            conti = 1;
        }
    }

    private void btn5ActionPerformed(ActionEvent evt) {
        if (conti == 1) {
            guardar[cont] = guardar[cont] + "5";
            txtTotal.setText(txtTotal.getText() + "5");
        } else {
            guardar[cont] = guardar[cont] + "5";
            txtTotal.setText("5");
            conti = 1;
        }
    }

    private void btn6ActionPerformed(ActionEvent evt) {
        if (conti == 1) {
            guardar[cont] = guardar[cont] + "6";
            txtTotal.setText(txtTotal.getText() + "6");
        } else {
            guardar[cont] = guardar[cont] + "6";
            txtTotal.setText("6");
            conti = 1;
        }
    }

    private void btn7ActionPerformed(ActionEvent evt) {
        if (conti == 1) {
            guardar[cont] = guardar[cont] + "7";
            txtTotal.setText(txtTotal.getText() + "7");
        } else {
            guardar[cont] = guardar[cont] + "7";
            txtTotal.setText("7");
            conti = 1;
        }
    }

    private void btn8ActionPerformed(ActionEvent evt) {
        if (conti == 1) {
            guardar[cont] = guardar[cont] + "8";
            txtTotal.setText(txtTotal.getText() + "8");
        } else {
            guardar[cont] = guardar[cont] + "8";
            txtTotal.setText("8");
            conti = 1;
        }
    }

    private void btn9ActionPerformed(ActionEvent evt) {
        if (conti == 1) {
            guardar[cont] = guardar[cont] + "9";
            txtTotal.setText(txtTotal.getText() + "9");
        } else {
            guardar[cont] = guardar[cont] + "9";
            txtTotal.setText("9");
            conti = 1;
        }
    }

    private void btn0ActionPerformed(ActionEvent evt) {
        guardar[cont] = guardar[cont] + "0";
        txtTotal.setText(txtTotal.getText() + "0");
    }

    private void btnPuntoActionPerformed(ActionEvent evt) {
        if (punto == 0) {
            punto = 1;
            if (conti == 1) {
                guardar[cont] = guardar[cont] + ".";
                txtTotal.setText(txtTotal.getText() + ".");
                
            } else {
                guardar[cont] = guardar[cont] + ".";
                txtTotal.setText("0.");
                conti = 1;
            }
        }
    }

    public static float Suma(float num1, float num2) {
        float suma = num1 + num2;
        return suma;
    }

    public static float Resta(float num1, float num2) {
        float resta = num1 - num2;
        return resta;
    }

    public static float Multiplicacion(float num1, float num2) {
        float multiplicacion = num1 * num2;
        return multiplicacion;
    }

    public static float Divicion(float num1, float num2) {
        float division = num1 / num2;
        return division;
    }
    
    private class MyListener extends MouseAdapter {

        public void mouseClicked(MouseEvent event) {
            System.exit(0);
        }
    }
}
