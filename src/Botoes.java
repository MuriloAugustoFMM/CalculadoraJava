import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class Botoes   {
    private  Color tecladoC = new Color(116,141,158);
    private  ArrayList<JButton> botoes = new ArrayList<JButton>();
    private Dimension dimensaoBotao =  new Dimension(85,85);
    private JLabel visorL = new JLabel("..");



    public Botoes(){
        Imagens imagens = new Imagens();
        for(int i = 0; i < 16; i++){
            botoes.add(new JButton());
            botoes.get(i).setBackground(tecladoC);
            botoes.get(i).setPreferredSize(dimensaoBotao);

        }
        this.visorL.setBackground(Color.BLACK);
        this.visorL.setSize(50,50);
        this.visorL.setFont(new Font("Arial",Font.PLAIN,40));

        this.botoes.get(0).setIcon(imagens.n1);

    }


    public  ArrayList<JButton> getBotoes() {
        return botoes;
    }

    public JLabel getVisorL() {
        return visorL;
    }
}
