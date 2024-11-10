import javax.swing.*;

public class JanelaPrincipal extends JFrame {

    public JanelaPrincipal(){
        Paineis paineis = new Paineis();






        this.setSize(340,510);
        this.setVisible(true);
        this.getContentPane().setBackground(paineis.getBackgroundColor());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);
        this.add(paineis.getVisor());
        this.add(paineis.getTeclado());

        this.setIconImage((new ImageIcon(JanelaPrincipal.class.getResource("Calculadora24.png")).getImage()));






    }


}
