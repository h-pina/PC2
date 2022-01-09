//Nome: Hugo Antunes Pina
//Disciplina: Programacao de Computadores II

package com.mycompany.atendemergencia_hugopina;

public class DefesaCivil extends Emergencia {
    
    //Campos: Informacoes pedidas durante o atendimento de Defesa Civil
    
    private boolean necessidadeDeSuprimentos;
    private boolean pessoasDesaparecidas;
    private String tipoDeDesastre;
    
    //Construtor

    public DefesaCivil(boolean necessidadeDeSuprimentos, boolean pessoasDesaparecidas, String tipoDeDesastre) {
        super("DefesaCivil");
        this.necessidadeDeSuprimentos = necessidadeDeSuprimentos;
        this.pessoasDesaparecidas = pessoasDesaparecidas;
        this.tipoDeDesastre = tipoDeDesastre;
    }

    //Getters e Setters
    
    public boolean isNecessidadeDeSuprimentos() {
        return necessidadeDeSuprimentos;
    }

    public void setNecessidadeDeSuprimentos(boolean necessidadeDeSuprimentos) {
        this.necessidadeDeSuprimentos = necessidadeDeSuprimentos;
    }

    public boolean isPessoasDesaparecidas() {
        return pessoasDesaparecidas;
    }

    public void setPessoasDesaparecidas(boolean pessoasDesaparecidas) {
        this.pessoasDesaparecidas = pessoasDesaparecidas;
    }

    public String getTipoDeDesastre() {
        return tipoDeDesastre;
    }

    public void setTipoDeDesastre(String tipoDeDesastre) {
        this.tipoDeDesastre = tipoDeDesastre;
    }
    
}
