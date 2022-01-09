//Nome: Hugo Antunes Pina
//Disciplina: Programacao de Computadores II
package formas_V1;

public class Tetraedro extends Tridimensional {
    
    //Campos
    
    private double aresta;
    
    //Construtores
    
    public Tetraedro(double aresta){
        super("Tetraedro"); //Define tipo como "Tetraedro"
        this.aresta = aresta;
    }
    
    //Getters e setters

    public double getAresta() {
        return aresta;
    }

    public void setAresta(double aresta) {
        this.aresta = aresta;
    }
    
    //Metodos
    
    @Override
    public double obterArea(){
        double areaBase = ( Math.sqrt(3) / 4 )* (Math.pow(this.aresta,2));
        double areaTotal = 4*areaBase;
        return areaTotal;
    }
    
    @Override
    public double obterVolume(){
        double volume = (Math.sqrt(2)/12) * Math.pow(this.aresta,3);
        return volume;
    }
    
}
