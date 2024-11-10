import javax.swing.*;
import java.awt.*;

public class Paineis {
    private Color backgroundColor  =  new Color(146,178,199);
    private Color visorC = new Color(166,203,227);
    private  JPanel visor =  new JPanel();
    private  JPanel teclado = new JPanel();


    public Paineis(){
        Botoes botoes =  new Botoes();

        visor.setBounds(0,0,320,170);
        visor.setLayout(new BorderLayout());
        visor.setBackground(visorC);
        visor.add(InteracaoBotoes.visor, BorderLayout.CENTER);


        teclado.setLayout(new GridLayout(4,4));
        teclado.setBounds(0,170,326,305);
        teclado.setBackground(backgroundColor);
        for(int i = 0; i < 16; i++) this.teclado.add(botoes.getBotoes().get(i));












    }

    public Color getVisorC() {
        return visorC;
    }

    public JPanel getTeclado() {
        return teclado;
    }

    public JPanel getVisor() {
        return visor;
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }
}
