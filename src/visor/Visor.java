package visor;

import javax.swing.*;
import java.awt.*;

public class  Visor extends JLabel {
    private Integer operando1; // armazena o primeiro numero adjacente ao operado
    private Integer operando2; // armazena o segundo numero adjacente ao operador
    private Character operador; // armazenda o operador que indica a operação a ser realizada
    private String exp = "";  // armazena a expressão digitada no visor
    private Integer memoria; //armazena o resultado de operações
    private String msg = operando1.toString() + operador.toString() + operando2.toString();


    public Visor() {
        //Definiçã padrão do visor
        this.setText(msg);
        this.setBackground(Color.BLACK);
        this.setSize(50, 50);
        this.setFont(new Font("Arial", Font.PLAIN, 40));
        this.setHorizontalAlignment(JLabel.RIGHT);
    }
}

