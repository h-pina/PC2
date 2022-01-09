//Nome: Hugo Antunes Pina
//Disciplina: Programacao de Computadores II

package com.mycompany.atendemergencia_hugopina;

public class UnidadeServico {
    
    //Campos
    
    private String servicoOferecido;
    private String regiaoAtendida;    
    
    //Construtor

    public UnidadeServico(String servicoOferecido, String regiaoAtendida) {
        this.servicoOferecido = servicoOferecido;
        this.regiaoAtendida = regiaoAtendida;
    }
    
    //Getters e Setters

    public String getServicoOferecido() {
        return this.servicoOferecido;
    }

    public void setServicoOferecido(String servicoOferecido) {
        this.servicoOferecido = servicoOferecido;
    }

    public String getRegiaoAtendida() {
        return this.regiaoAtendida;
    }

    public void setRegiaoAtendida(String regiaoAtendida) {
        this.regiaoAtendida = regiaoAtendida;
    }
    
}
