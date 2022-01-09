//Nome: Hugo Antunes Pina
//Disciplina: Programacao de Computadores II
package formas_V2;

public class Tetraedro extends Tridimensional {
    
    //campos
    
    private double aresta;
    
    //construtores
    
    public Tetraedro(double aresta){
        super("Tetraedro");
        this.aresta = aresta;
    }
    
    //getters e setters

    public double getAresta() {
        return aresta;
    }

    public void setAresta(double aresta) {
        this.aresta = aresta;
    }
    
    //metodos
    
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
