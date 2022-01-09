//Nome: Hugo Antunes Pina
//Disciplina: Programacao de Computadores II
package formas_V2;


public abstract class Tridimensional implements Forma {
    
    //Campos
    
    protected final String tipo;
    
    //Construtor
    
    protected Tridimensional(String tipo){
        this.tipo = tipo;
    }
    
    //Getters
    
    @Override
    public String getTipo() {
        return tipo;
    }
}
