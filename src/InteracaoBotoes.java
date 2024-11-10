import javax.swing.*;
import java.util.ArrayList;

public class InteracaoBotoes {
public static Visor visor = new Visor();

    public InteracaoBotoes(ArrayList<JButton> botoes ){

        botoes.get(8).addActionListener(e -> {

            this.visor.setOperadores("1");
            this.visor.setMsg();


        });

        botoes.get(9).addActionListener(e -> {

                this.visor.setOperadores("2");

            this.visor.setMsg();

        });

        botoes.get(10).addActionListener(e -> {

                this.visor.setOperadores("3");

            this.visor.setMsg();

        });

        botoes.get(11).addActionListener(e -> {

            this.visor.setOperador('x');
            this.visor.setMsg();

        });
        botoes.get(12).addActionListener(e -> this.visor.realizarOperacao());





    }

    public  Visor getVisor() {
        return this.visor;
    }
}
