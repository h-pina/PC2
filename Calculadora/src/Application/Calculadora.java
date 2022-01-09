//Nome: Hugo Antunes Pina
//Disciplina: Programacao de Computadores II
package Application;

public class Calculadora {
    
    private double num1;
    private double num2;
    private String operador;
    private double resultado;
    
    public Calculadora(){
        num1 = 0.0;
        num2 = 0.0;
        operador = "";
        resultado = 0.0;
    }
    
    private void moveNumberUp(){
        num1 = num2;
        num2 = 0;
    }
    
    //todos os valores sao primeiro registrados na variavel num2, e posteiormente
    //copiados para num1 por meio da funcao moveNumberUp, dando espaco para a insercao de um novo numero
    public void setNumber(String numStr){ 
        this.num2 = Double.valueOf(numStr);
    }
    
    public void setOperador(String operador){
        this.operador = operador;
        moveNumberUp(); 
    }
    
    //Getters foram modificados para retornar Strings
    public String getStringNum1() {
        return String.valueOf(num1);
    }

    public String getStringNum2() {
        return String.valueOf(num2);
    }

    public String getStringResultado() {
        return String.valueOf(resultado);
    }
    
    //realiza as operacoes que modificam o numero atual (potencia e porcentagem)
    public String modificarNum(String modifier){
        if (modifier.equals("%")){
            return String.valueOf(num2/100);
        }
        else if(modifier.equals("x^2")){
            return String.valueOf(Math.pow(num2, 2));
        }
        return "";
    }
    
    public void realizarOperacao(){ //realiza a operacao desejada
        resultado = 0.0; //limpa a variavel resultado
        switch(this.operador){
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "/":
                resultado = num1 / num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
        }
        num2 = resultado;
    }
    
    //botao CE
    public void clearOperation(){
        num1 = 0.0;
        num2 = 0.0;
        operador = "";
        resultado = 0.0;
    }


}
