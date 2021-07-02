//Nome: Hugo Antunes Pina
package com.mycompany.pc2_p1_q4_hugopina;

public class Empresa {
    private String nome;
    private String cnpj;
    private Empregado[] empregados;
    
    //Construtores
    
    public Empresa(String nome, String cnpj, int numero_de_empregados){
        this.nome = nome;
        this.cnpj = cnpj;
        this.empregados = new Empregado[numero_de_empregados];
    }
    
    public Empresa(String nome, String cnpj, Empregado[] empregados){
        this.nome = nome;
        this.cnpj = cnpj;
        this.empregados = empregados;
    }
    
    //Getters e Setters
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getCNPJ(){
        return this.cnpj;
    }
    
    public void setCNPJ(String cnpj){
        this.cnpj = cnpj;
    }

    
    //Metodos

    public void adicionarEmpregado(Empregado empregado){
        for(int i = 0; i<this.empregados.length;i++){
            if(this.empregados[i] == null){
                this.empregados[i] = empregado;
                return;
            }
        }
        System.out.println("Todas as vagas da empresa ja estao preenchidas");
    }
    
    public boolean verificarEmpregado(Empregado empregado){
        boolean flag = false;
        for(Empregado funcionario_atual : empregados){
            if(funcionario_atual.equals(empregado)){
                flag = true;
            }
        }
        return flag;
    }
}
