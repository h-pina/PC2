//Nome: Hugo Antunes Pina
//Disciplina: Programacao de Computadores II

package com.mycompany.atendemergencia_hugopina;

public class Emergencia {
    //Campo
    
    //contem o proprio nome da emergencia (medica, policial, defesaCivil), 
    //utilizada para identificacao das classes pelo corpo do codigo
    protected final String categoria; 

    //Construtores
    
    protected Emergencia(String categoria) {
        this.categoria = categoria;
    }

    //getter (campo final)
    
    public String getCategoria() {
        return categoria;
    }
    
}
