//Nome: Hugo Antunes Pina
//Disciplina: Programacao de Computadores II
package formas_V1;

public abstract class Bidimensional implements Forma  {
    
    //Campos

    protected final String tipo;  //especifica qual forma bidimensional determinado objeto se trata
    
    //Construtor
    
    protected Bidimensional(String tipo){
        this.tipo = tipo;
    }

    //Getter 
    
    public String getTipo() {
        return tipo;
    }
    
}
