//Nome: Hugo Antunes Pina
//Disciplina: Programacao de Computadores II
package formas_V1;

public class Circulo extends Bidimensional {
    
    //Campos
    
    private double raio;
    
    //Construtor
    
    public Circulo(double raio){
        super("Circulo"); //inicializa tipo como "Circulo"
        this.raio = raio;
    }
    
    //Getters e Setters

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    //Metodos
    
    @Override
    public double obterArea(){
        double area = Math.PI *Math.pow(this.raio ,2);
        return area;
    }
}
