import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculadora {
    private JTextField txtPrimeiroValor;
    private JTextField txtSegundoValor;
    private JButton btnSomar;
    private JButton btnLimpar;
    private JLabel txtResultado;
    private JPanel painelMain;

    public calculadora() {
        btnSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Integer primeiro = Integer.valueOf(txtPrimeiroValor.getText());
                Integer segundo = Integer.valueOf(txtSegundoValor.getText());

                Integer soma = primeiro + segundo;
                txtResultado.setText(soma.toString());

            }

        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Minha Calculadora");
        frame.setContentPane(new calculadora().painelMain);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
