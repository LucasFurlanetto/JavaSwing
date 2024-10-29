import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm {
    private JPanel mainPainel;

    public MainForm(){
        BtnValidar.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        //Obter nome do imput
                        String nomeDigitado = txtNome.getText();

                        txtResultado.setText(nomeDigitado);
                    }
                }
        );
    }
    private JTextField txtNome;
    private JButton BtnValidar;
    private JLabel txtResultado;

    public static void main(String[] args){

        //Cria a minha tela
        JFrame frame = new JFrame("Minha primeira tela");
        //Mostra qual painel vai ser assistido
        frame.setContentPane(new MainForm().mainPainel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Ajusta minha TV no tamanho do meu painel
        frame.pack();
        frame.setSize(500, 500);
        //Ligar a TV
        frame.setVisible(true);
    }


}


