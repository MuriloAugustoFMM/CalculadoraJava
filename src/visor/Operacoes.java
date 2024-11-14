package visor;



public class Operacoes {
    private Float operando1 = null;
    private Float operando2 = null;
    private Integer ControladorDePosicao = 0;
    private Character operador = '?';
    private String exp = "";
    private Float memoria;


    protected int SeparadorDeExpressoes(String exp) {
        int c =0;
        for(int i = 0; i <exp.length();i++){
            if(this.VerificaSeEOperador(exp.toCharArray()[i])){
                c++;
                System.out.println(c);
            }
        }
        for(int i =0 ; i< c;i++){
            if (this.memoria == null) {
                this.operando1 = this.RetiraNumero(exp, this.ControladorDePosicao);
                System.out.println(this.operando1);
                this.operador = this.RetirarOperacao(exp, this.ControladorDePosicao);
                System.out.println(this.operador);
                this.operando2 = this.RetiraNumero(exp, this.ControladorDePosicao);
                System.out.println(this.operando2);
                this.memoria = this.RealizaOperacao(this.operando1, this.operando2);
                System.out.println(this.memoria);
            } else {
                this.operador = this.RetirarOperacao(exp, this.ControladorDePosicao);
                System.out.println(this.operador);
                this.operando2 = this.RetiraNumero(exp, this.ControladorDePosicao);
                System.out.println(this.operando2);
                this.memoria = this.RealizaOperacao(this.memoria, this.operando2);
                System.out.println(this.memoria);
            }
        }
        return 0;
    }

    protected boolean VerificaSeENumero(Character c){
        // verifica se o parametro é um numero
        for(Integer i =0; i < 10; i ++){
            if(c.equals(i.toString().charAt(0)))
                return true;
        }
        return false;
    }

    protected boolean VerificaSeEOperador(Character c){
        //verifica se é um operador dentre os possíveis no momento: +-x/
        if(c.equals('+') || c.equals('-') || c.equals('x') || c.equals('/'))
            return true;

        return false;
    }

    protected float RealizaOperacao(Float n1,  Float n2){
        switch (this.operador){
            case '+' :
                this.operando1 = 0f;
                this.operando2 = 0f;
                this.operador = '?';
                return n1 + n2;

            case '-' :
                this.operando1 = 0f;
                this.operando2 = 0f;
                this.operador = '?';
                return n1 - n2;

            case 'x' :
                this.operando1 = 0f;
                this.operando2 = 0f;
                this.operador = '?';
                return n1 * n2;

            case '/' :
                this.operando1 = 0f;
                this.operando2 = 0f;
                this.operador = '?';
                return n1 / n2;
        }
        return -1f;
    }

    protected Character RetirarOperacao(String exp, Integer controladorDePosicao){
        Character c = exp.toCharArray()[this.ControladorDePosicao];
        this.ControladorDePosicao++;
        return c;
    }

    protected Float RetiraNumero(String exp, Integer controladorDePosicao ) {
        Float op = 0f;
        Character c;
        Integer aux = 0;
        for (Integer i = controladorDePosicao; i < this.exp.length(); i++) {
            c = this.exp.toCharArray()[i];

            if (this.VerificaSeENumero(c)) {
                aux =  op.intValue();
                op = Float.parseFloat(aux.toString() + c);
            }else{
                this.ControladorDePosicao = i;
                System.out.println(this.ControladorDePosicao);
                break;
            }
        }
        return op;
    }
}