//Nome: Hugo Antunes Pina
//Disciplina: Programacao de Computadores II
package formas_V1;
import java.util.ArrayList;

public class CaixaDeBrinquedo {
    
    //Campos
    
    private ArrayList<Forma> formas;
    
    //Construtor
    
    public CaixaDeBrinquedo(){
        this.formas = new ArrayList<Forma>();
    }
    
    //Getters e Setters

    public ArrayList<Forma> getFormas() {
        return formas;
    }

    public void setFormas(ArrayList<Forma> formas) {
        this.formas = formas;
    }
    
    //Metodos
    
    public void inserirForma(Forma forma){
        formas.add(forma);
    }
    
    
    private void dimensoesBidimensional(Bidimensional forma){
        System.out.println("Eu sou um(a) " + forma.getTipo() + " e minha area e " 
                            + String.format("%,.2f",forma.obterArea()));
    }
    
    private void dimensoesTridimensional(Tridimensional forma){
        System.out.println("Eu sou um(a) " + forma.getTipo() + ". Minha area e " + String.format("%,.2f",forma.obterArea())
                            + " e meu volume e " + String.format("%,.2f",forma.obterVolume()));
    }
    
    public void processarForma(Forma forma){
        if(forma instanceof Bidimensional){
            //Downcasting para garantir a existencia dos recursos especificos de Bidimensional
            dimensoesBidimensional((Bidimensional)forma); 
        }
        else{
            //Downcasting para garantir a existencia dos recursos especificos de Tridimensional
            dimensoesTridimensional((Tridimensional)forma);
        }
    }
    
    public void processarAllFormas(){
        for(Forma forma : formas){
            processarForma(forma);
        }
    }   
}
