//Nome: Hugo Antunes Pina
//Disciplina: Programacao de Computadores II
package formas_V2;

/*-----------------------------------------------------------------------------------------------
    Obs: Como a interface forma foi modificada, nao foi possivel reaproveitar nenhuma das classes 
    anteriormente criadas por meio de imports, apesar de suas implementacoes serem praticamente
    identicas as primeiras
-----------------------------------------------------------------------------------------------*/

public abstract interface Forma {
    public double obterArea();
    public double obterVolume() throws NaoExisteVolumeException;
    //e importante que todas as formas retornem seu tipo para sua identificacao pelo aplicativo
    public String getTipo(); 
}
 