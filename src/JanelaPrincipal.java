import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class JanelaPrincipal extends JFrame {

    public JanelaPrincipal(){
        Color background  =  new Color(146,178,199);
        Botoes botoes = new Botoes();
        JPanel visor =  new JPanel();
        visor.setBounds(0,0,350,100);
        visor.setLayout(null);
        visor.setBackground(new Color(166,203,227));


        JPanel teclado = new JPanel();
        teclado.setLayout(new GridLayout(4,3));
        teclado.setBounds(0,100,250,330);
        teclado.setBackground(background);
        for(int i = 0; i < 10; i++) teclado.add(botoes.getBotoes().get(i));
        JPanel operacoes = new JPanel();
        operacoes.setLayout(new BoxLayout(operacoes,BoxLayout.Y_AXIS));
        operacoes.setBackground(background);
        operacoes.setBounds(250,100,100,420);
        for(int i = 0; i < 6; i++) operacoes.add(botoes.getOp().get(i));


        this.setSize(350,550);
        this.setVisible(true);
        this.getContentPane().setBackground(background);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);
        this.add(visor);
        this.add(teclado);
        this.add(operacoes);




    }


}
