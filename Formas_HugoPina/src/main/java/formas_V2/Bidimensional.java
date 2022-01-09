//Nome: Hugo Antunes Pina
//Disciplina: Programacao de Computadores II
package formas_V2;

public abstract class Bidimensional implements Forma  {
    //Campos
    
    protected final String tipo;
    
    //Construtor
    
    protected Bidimensional(String tipo){
        this.tipo = tipo;
    }

    @Override
    public String getTipo() {
        return tipo;
    }
    
    //nenhuma forma bidimensional possui volume
    @Override
    public double obterVolume() throws NaoExisteVolumeException{
        throw new NaoExisteVolumeException("EXCEPTION -> Formas Bidimensionais nao possuem volume");
    }
    
    
    
}
