import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class Botoes   {
    private  Color tecladoC = new Color(116,141,158);
    private  ArrayList<JButton> botoes = new ArrayList<JButton>();
    private Dimension dimensaoBotao =  new Dimension(85,85);
    private JLabel visorL = new JLabel("..");



    public Botoes(){
        for(int i = 0; i < 16; i++){
            botoes.add(new JButton());
            botoes.get(i).setBackground(tecladoC);
            botoes.get(i).setPreferredSize(dimensaoBotao);

        }
        this.visorL.setBackground(Color.BLACK);
        this.visorL.setSize(50,50);
        this.visorL.setFont(new Font("Arial",Font.PLAIN,40));

        this.botoes.get(7).setIcon(new ImageIcon(Botoes.class.getResource("menos.png")));
        this.botoes.get(8).setIcon(new ImageIcon(Botoes.class.getResource("n1.png")));
        this.botoes.get(9).setIcon(new ImageIcon(Botoes.class.getResource("n2.png")));
        this.botoes.get(10).setIcon(new ImageIcon(Botoes.class.getResource("n3.png")));
        this.botoes.get(3).setIcon(new ImageIcon(Botoes.class.getResource("mais.png")));
        this.botoes.get(4).setIcon(new ImageIcon(Botoes.class.getResource("n4.png")));
        this.botoes.get(5).setIcon(new ImageIcon(Botoes.class.getResource("n5.png")));
        this.botoes.get(6).setIcon(new ImageIcon(Botoes.class.getResource("n6.png")));
        this.botoes.get(0).setIcon(new ImageIcon(Botoes.class.getResource("n7.png")));
        this.botoes.get(2).setIcon(new ImageIcon(Botoes.class.getResource("n9.png")));
        this.botoes.get(11).setIcon(new ImageIcon(Botoes.class.getResource("vezes.png")));
        this.botoes.get(13).setIcon(new ImageIcon(Botoes.class.getResource("n0.png")));
        this.botoes.get(12).setIcon(new ImageIcon(Botoes.class.getResource("igual.png")));
        this.botoes.get(14).setIcon(new ImageIcon(Botoes.class.getResource("backspace.png")));
        this.botoes.get(1).setIcon(new ImageIcon(Botoes.class.getResource("n8.png")));
        this.botoes.get(15).setIcon(new ImageIcon(Botoes.class.getResource("dividir.png")));

    }


    public  ArrayList<JButton> getBotoes() {
        return botoes;
    }

    public JLabel getVisorL() {
        return visorL;
    }
}
