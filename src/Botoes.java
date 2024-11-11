import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class Botoes   {
    private  Color tecladoC = new Color(116,141,158);
    private  ArrayList<JButton> botoes = new ArrayList<JButton>();
    private Dimension dimensaoBotao =  new Dimension(85,85);

    public Botoes(){
        for(int i = 0; i < 16; i++){
            botoes.add(new JButton());
            botoes.get(i).setBackground(tecladoC);
            botoes.get(i).setPreferredSize(dimensaoBotao);
        }
        //imagem dos botoes
        new ImagensBotoes(botoes);
        //interação dos botões com o visor
         new InteracaoBotoes(botoes);
    }

    public  ArrayList<JButton> getBotoes() {
        return botoes;
    }

}
