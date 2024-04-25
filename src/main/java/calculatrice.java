import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculatrice {
    private JPanel calculatrice;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton ACButton;
    private JTextField txtDisplay;
    private JButton CEButton;
    private JButton a7Button;
    private JButton a4Button;
    private JButton a1Button;
    private JButton button9;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a2Button;
    private JButton button13;
    private JButton a9Button;
    private JButton a6Button;
    private JButton a3Button;
    private JButton logButton;
    private JButton a0Button;
    private JButton button7;
    private JButton button8;

    double a, b,  result;
    String sg;
    String c = "";

    public calculatrice() {
        ACButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText("");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a7Button.getText());
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a8Button.getText());
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a9Button.getText());
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a4Button.getText());
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a5Button.getText());
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a6Button.getText());
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a1Button.getText());
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a2Button.getText());
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a3Button.getText());
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() + a0Button.getText());
            }
        });


        button13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText() );
                sg = "%";
                txtDisplay.setText("");
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(txtDisplay.getText());
                sg = "+";
                txtDisplay.setText("");

            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!txtDisplay.getText().contains(".")){
                    txtDisplay.setText(txtDisplay.getText());
                }
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(txtDisplay.getText());
                sg = "-";
                txtDisplay.setText("");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(txtDisplay.getText());
                sg = "*";
                txtDisplay.setText("");
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(txtDisplay.getText());
                sg = "/";
                txtDisplay.setText("");
            }
        });
        logButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(txtDisplay.getText());
                sg = "x^y";
                txtDisplay.setText("");
            }
        });
        CEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c = txtDisplay.getText();
                    if (!c.isEmpty()) {
                        String newC = c.substring(0, c.length() - 1);
                        txtDisplay.setText(newC);
                    }
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b = Double.parseDouble(txtDisplay.getText());
                if (sg.equals("+")) {
                    result = a + b;
                    txtDisplay.setText(Double.toString(result));
                } else if (sg.equals("-")) {
                    result = a - b;
                    txtDisplay.setText(Double.toString(result));
                } else if (sg.equals("*")) {
                    result = a * b;
                    txtDisplay.setText(Double.toString(result));
                } else if (sg.equals("/")) {
                    if (b != 0) {
                        result = a / b;
                    } else {
                        txtDisplay.setText("Erreur: Division par zéro");
                        return;
                    }
                } else if (sg.equals("%")) {
                    result = a % b;
                    txtDisplay.setText(Double.toString(result));
                }
                else if (sg.equals("x^y")){
                    result = Math.pow(a, b);
                    txtDisplay.setText(Double.toString(result));
                }
            }
        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("calculatrice");
        frame.setContentPane(new calculatrice().calculatrice);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}
