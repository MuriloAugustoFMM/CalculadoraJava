import javax.print.DocFlavor;
import javax.swing.*;
import java.awt.*;

public class  Visor extends JLabel {
    private  String operando1 = "";
    private  String operando2 = "";
    private  Character operador ='#' ;
    private String msg = operando1.toString() + operador.toString() + operando2.toString();
    private  StringBuilder op1 = new StringBuilder(operando1);
    private StringBuilder op2 = new StringBuilder(operando2);

    public Visor(){
        //Definiçã padrão do visor
        this.setText(msg);
        this.setBackground(Color.BLACK);
        this.setSize(50,50);
        this.setFont(new Font("Arial",Font.PLAIN,40));
        this.setHorizontalAlignment(JLabel.RIGHT);
    }

    public  void setOperador(char operador) {
        if(this.operando1 != "")this.operador = operador;
        else this.setText("Operação Invalida");
    }
    public void setOperadores(String operador){
        if (this.operador.equals('#')) {
            this.operando1 = this.operando1 + operador;
            this.op1 = new StringBuilder(this.operando1);
        }
        if(this.operador != '#') {
            this.operando2 = this.operando2 + operador;
            this.op2 =  new StringBuilder(this.operando2);
        }
    }

    public void apagar(){
        if(this.operando2 != ""){
            this.op2.deleteCharAt(this.operando2.length()-1);
            this.operando2 = this.op2.toString();
            this.setMsg();
        }else if(this.operador != '#'){
            this.operador = '#';
            this.setMsg();
        }else if(this.operando1 != ""){
            this.op1.deleteCharAt(this.operando1.length()-1);
            this.operando1 = this.op1.toString();
            this.setMsg();
        }

    }

    public void realizarOperacao(){
        if(this.operando2 == "" && this.operando1 != ""){
            this.setText("Operação invalida");
            this.operando1 = "";
            this.operando2 = "";
        }
        else{
            Integer aux;
            switch (this.operador){
                case '+' :
                    aux = Integer.parseInt(this.operando1) + Integer.parseInt(this.operando2);
                    this.setText(aux.toString());
                    break;

                case '-' :
                    aux = Integer.parseInt(this.operando1) - Integer.parseInt(this.operando2);
                    this.setText(aux.toString());
                    break;

                case 'x' :
                    aux = Integer.parseInt(this.operando1) * Integer.parseInt(this.operando2);
                    this.setText(aux.toString());
                    break;

                case '/' :
                    aux = Integer.parseInt(this.operando1) / Integer.parseInt(this.operando2);
                    this.setText(aux.toString());
                    break;
            }
            this.operando1 = "";
            this.operando2 = "";
            this.operador = '#';
        }
    }

    public char getOperador() {
        return operador;

    }

    public String getOperando1() {
        return operando1;
    }

    public String getOperando2() {
        return operando2;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(){
        this.msg = this.operando1+ this.operador + this.operando2;
        this.setText(msg);
    }
}

