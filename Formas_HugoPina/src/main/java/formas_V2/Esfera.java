//Nome: Hugo Antunes Pina
//Disciplina: Programacao de Computadores II
package formas_V2;

public class Esfera extends Tridimensional {
    
    //campos
    
    private double raio;
    
    //construtores
    
    public Esfera(double raio){
        super("Esfera");
        this.raio = raio;
    }
    
    //getters e setters

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    //metodos
    
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
