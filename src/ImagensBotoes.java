import javax.swing.*;
import java.util.ArrayList;


public class ImagensBotoes {

    public ImagensBotoes(ArrayList<JButton> botoes) {
        botoes.get(7).setIcon(new ImageIcon(Botoes.class.getResource("menos.png")));
        botoes.get(8).setIcon(new ImageIcon(Botoes.class.getResource("n1.png")));
        botoes.get(9).setIcon(new ImageIcon(Botoes.class.getResource("n2.png")));
        botoes.get(10).setIcon(new ImageIcon(Botoes.class.getResource("n3.png")));
        botoes.get(3).setIcon(new ImageIcon(Botoes.class.getResource("mais.png")));
        botoes.get(4).setIcon(new ImageIcon(Botoes.class.getResource("n4.png")));
        botoes.get(5).setIcon(new ImageIcon(Botoes.class.getResource("n5.png")));
        botoes.get(6).setIcon(new ImageIcon(Botoes.class.getResource("n6.png")));
        botoes.get(0).setIcon(new ImageIcon(Botoes.class.getResource("n7.png")));
        botoes.get(2).setIcon(new ImageIcon(Botoes.class.getResource("n9.png")));
        botoes.get(11).setIcon(new ImageIcon(Botoes.class.getResource("vezes.png")));
        botoes.get(13).setIcon(new ImageIcon(Botoes.class.getResource("n0.png")));
        botoes.get(12).setIcon(new ImageIcon(Botoes.class.getResource("igual.png")));
        botoes.get(14).setIcon(new ImageIcon(Botoes.class.getResource("backspace.png")));
        botoes.get(1).setIcon(new ImageIcon(Botoes.class.getResource("n8.png")));
        botoes.get(15).setIcon(new ImageIcon(Botoes.class.getResource("dividir.png")));

    }
}
