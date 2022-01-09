//Nome: Hugo Antunes Pina
//Disciplina: Programacao de Computadores II
package formas_V1;

public abstract class Tridimensional implements Forma {
    
    //Campos
    
    protected final String tipo; //especifica qual forma tridimensional determinado objeto se trata
    
    //Construtor
    
    protected Tridimensional(String tipo){
        this.tipo = tipo;
    }
    
    //Getter

    public String getTipo() {
        return tipo;
    }
    
    
    //Metodos
    
    public abstract double obterVolume();
}
