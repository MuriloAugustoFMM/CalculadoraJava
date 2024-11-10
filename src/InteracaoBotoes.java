import javax.swing.*;
import java.util.ArrayList;

public class InteracaoBotoes {
public static Visor visor = new Visor();

    public InteracaoBotoes(ArrayList<JButton> botoes ){

        botoes.get(0).addActionListener(e -> {
            this.visor.setOperadores("7");
            this.visor.setMsg();
        });

        botoes.get(1).addActionListener(e -> {
            this.visor.setOperadores("8");
            this.visor.setMsg();
        });

        botoes.get(2).addActionListener(e -> {
            this.visor.setOperadores("9");
            this.visor.setMsg();
        });

        botoes.get(3).addActionListener(e -> {
            this.visor.setOperador('+');
            this.visor.setMsg();
        });

        botoes.get(4).addActionListener(e -> {
            this.visor.setOperadores("4");
            this.visor.setMsg();
        });

        botoes.get(5).addActionListener(e -> {
            this.visor.setOperadores("5");
            this.visor.setMsg();
        });

        botoes.get(6).addActionListener(e -> {
            this.visor.setOperadores("6");
            this.visor.setMsg();
        });

        botoes.get(7).addActionListener(e -> {
            this.visor.setOperador('-');
            this.visor.setMsg();
        });

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

        botoes.get(13).addActionListener(e -> {
            this.visor.setOperadores("0");
            this.visor.setMsg();
        });

        botoes.get(14).addActionListener(e -> {
            this.visor.apagar();
            this.visor.setMsg();
        });

        botoes.get(15).addActionListener(e -> {
            this.visor.setOperador('/');
            this.visor.setMsg();
        });

    }

    public  Visor getVisor() {
        return this.visor;
    }
}
