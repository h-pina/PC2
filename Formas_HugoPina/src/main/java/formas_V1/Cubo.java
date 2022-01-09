//Nome: Hugo Antunes Pina
//Disciplina: Programacao de Computadores II
package formas_V1;

public class Cubo extends Tridimensional {
    
    //Campos
    
    private double lado;
    
    //Construtor
    
    public Cubo(double lado){
        super("Cubo"); //Define tipo como "Cubo"
        this.lado = lado;
    }
    
    //Getters e Setter

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    //Metodos
    
    public double obterArea(){
       double area = Math.pow(this.lado , 2) * 6;
       return area;
    }
    
    @Override
    public double obterVolume(){
        double volume = Math.pow(this.lado,3);
        return volume;
    }
    
}
