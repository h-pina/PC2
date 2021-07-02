package com.mycompany.pc2_p1_q4_hugopina;

public class Empregado {
    private String nome;
    private String sobrenome;
    private double salario; //salario definido como double para permitir a utilizacao de centavos
    
    
    //Construtor
    
    public Empregado(String nome, String sobrenome, double salario){
        this.nome = nome;
        this.sobrenome = sobrenome;
        if(salario >= 0){
            this.salario = salario;
        }
    }
    
    //Getters e Setters
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getSobrenome(){
        return this.sobrenome;
    }
    
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    
    public double getSalario(){
        return this.salario;
    }
    
    public void setSalario(int salario){
        if(salario >= 0){
            this.salario = salario;
        }
    }
    
    //Metodos
    
    public void darAumento(double porcentagem){ 
        this.salario += (this.salario * (porcentagem/100));
    }
    
    //retorna o valor (double) do salario anual
    public double getSalarioAnual(){ 
        return (this.salario * 12);
    }
    
    // retorna o valor do salario mensal formatado para duas casas decimais
    public String getSalarioFormatado(){
        String valor_formatado = String.format("R$ %.2f", this.salario);
        return valor_formatado;
    }
    
    // retorna o valor do salario anual formatado para duas casas decimais
    public String getSalarioAnualFormatado(){
        double salario_anual = this.salario*12;
        String valor_formatado = String.format("R$ %.2f", salario_anual);
        return valor_formatado;
    }
    
    public void exibirDados(){
        System.out.println("Funcionario: " + this.nome + " " + this.sobrenome);
        System.out.println("Salario Mensal: " + this.getSalarioFormatado());
        System.out.println("Salario Anual: " + this.getSalarioAnualFormatado());
    }
    
}
