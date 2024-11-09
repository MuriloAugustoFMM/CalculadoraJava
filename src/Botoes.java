import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Botoes  {
    private  Color tecladoC = new Color(116,141,158);
    private  ArrayList<Button> botoes = new ArrayList<Button>();
    private  ArrayList<Button> op = new ArrayList<Button>();

    public Botoes(){
        for(int i = 0; i < 10; i++){
            botoes.add(new Button());
            botoes.get(i).setBackground(tecladoC);
            if(i >= 0 && i < 6){
                op.add(new Button());
                op.get(i).setBackground(tecladoC);
            }

        }
    }

    public  ArrayList<Button> getBotoes() {
        return botoes;
    }
    public  ArrayList<Button> getOp(){
        return op;
    }
}
