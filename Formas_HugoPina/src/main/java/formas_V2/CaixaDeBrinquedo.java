//Nome: Hugo Antunes Pina
//Disciplina: Programacao de Computadores II
package formas_V2;
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
    
    
    public void processarForma(Forma forma){
        try {
            System.out.print("Eu sou um(a) " + forma.getTipo() + ".\n"
                    + "Minha area e " + String.format("%,.2f",forma.obterArea()) + ". \n"
                    + "Meu volume e: ");
            System.out.println(String.format("%,.2f",forma.obterVolume()));
            
        } catch (NaoExisteVolumeException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void processarAllFormas(){
        for(Forma forma : formas){
            processarForma(forma);
            System.out.println("");
        }
    }   
}
