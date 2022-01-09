//Nome: Hugo Antunes Pina
//Disciplina: Programacao de Computadores II
package formas_V1;

public class Esfera extends Tridimensional {
    
    //Campos
    
    private double raio;
    
    //Construtor
    
    public Esfera(double raio){
        super("Esfera"); //Define tipo como "Esfera"
        this.raio = raio;
    }
    
    //Getters e setters

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    //Metodos
    
    public double obterArea(){
        double area = 4*Math.PI*Math.pow(this.raio, 2);
        return area;
    }
    
    @Override
    public double obterVolume(){
        double volume = 4.0/3.0*Math.PI*Math.pow(this.raio,3);
        return volume;
    }
}
