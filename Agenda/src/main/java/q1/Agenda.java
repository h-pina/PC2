//Nome: Hugo Antunes Pina
//Disciplina: Programacao de Computadores 2
//Data: 24/06/2021

package q1;
import java.util.ArrayList;
import java.util.Iterator;

public class Agenda {
    
    //Campos
    
    private ArrayList<Contato> agenda;
    
    //Construtores
    
    public Agenda(){
        this.agenda = new ArrayList<Contato>();
    }
    
    
    //Getters e Setters
    
    public ArrayList<Contato> getAgenda(){
        return agenda;
    }
    
    public void setAgenda(ArrayList<Contato> agenda){
        this.agenda = agenda;
    }
    
    
    //Metodos
    
    public void adicionarContato(Contato contato){
        agenda.add(contato);
    }
    
    public int getTotalContatos(){
        return agenda.size();
    }
    
    public Contato pesquisarContato(String nome){ 
        for(Contato tmpCont:agenda){ //iterando pela arrayList com enhanced for loop
            if(tmpCont.getNome().equals(nome)){
                return tmpCont;
            }         
        }
        return null;
    }
    
    public void removerContato(String nome){
        for(int i = 0; i<agenda.size(); i++){ //Nao e possivel utilizar iteradores nesse caso pois a funcao modifica a ArrayList
            Contato tmpCont = agenda.get(i);
            if(tmpCont.getNome().equals(nome)){
                agenda.remove(i);
            }
        }
    }
    
    public void listarContatos(){
        Iterator<Contato> i = agenda.iterator(); //iterando pela arrayList com iterator
        Contato tmpCont;
        while(i.hasNext()){
            tmpCont = i.next();
            System.out.println("");
            System.out.println("Nome:" + tmpCont.getNome());
            System.out.println("Telefone:" + tmpCont.getTelefone());
            System.out.println("Nome:" + tmpCont.getEmail());
        }
    }   
}
