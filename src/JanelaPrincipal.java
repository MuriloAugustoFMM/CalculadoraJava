import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

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




    }


}
