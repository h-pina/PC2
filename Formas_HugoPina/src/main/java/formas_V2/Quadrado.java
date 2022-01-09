//Nome: Hugo Antunes Pina
//Disciplina: Programacao de Computadores II
package formas_V2;


public class Quadrado extends Bidimensional{
    
    //campos
    
    private double lado;
    
    //construtor
    
    public Quadrado(double lado){
        super("Quadrado");
        this.lado = lado;
    }
    
    //Getters e Setters

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    //metodos
    
    @Override
    public double obterArea(){
        double area = Math.pow(this.lado, 2);
        return area;
    }
    
}
