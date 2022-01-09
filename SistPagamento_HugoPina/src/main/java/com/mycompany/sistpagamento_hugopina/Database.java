//Nome: Hugo Antunes Pina
//Disciplina: Programacao de Computadores II
package com.mycompany.sistpagamento_hugopina;

/*
Classe criada para auxiliar na construcao dos objetos na classe Teste, tornando-a menos poluida visualmente
Seu conteudo consiste em algumas listas com exemplos de informacoes de funcionarios e contas,
e um metodo capaz de converte-los em seus respectivos objetos
*/
public class Database {
    /*
    As arrays criadas utilizam-se dos wrappers para colocar dados de diferentes
    tipos juntos. Como consequencia, sera necessario o casting dos elementos dessa
    array no momento de criacao dos objetos para que o unboxing possa ser realizado.
    */
    private Object[][] assalariados; 
    private Object[][] comissionados;
    private Object[][] assalariadosComissionados;
    private Object[][] terceirizados;
    
    private Object[][] titulos;
    private Object[][] concessionarias;
    
    public Database(){
        assalariados = new Object[][]{    
            {"Hugo","Pina",23456781,5}, //informacoes organizadas de acordo com os parametros dos construtores
            {"Maria","Clara",78555132,20},
            {"Rebeca","Fernandes",45457891,0}
        };
        
        comissionados = new Object[][]{
            {"Victor","Augusto",55547863,80000.63},
            {"Ellen", "Beatriz",78555132,2000.00},
            {"Robson","Frederico",12345678,2000.00}
        };
        
        assalariadosComissionados = new Object[][]{
            {"Joao", "Augusto", 77777777,15000.00},
            {"Carlos","Henrique",89668125,200000.00},
            {"Alexandre", "Reis",56332145,900.00},
        };
        
        terceirizados = new Object[][]{
            {"Ian","Aurelio",99545882,180},
            {"Flavia","Beatriz",63124875,160},
            {"Gabriela","Antunes",88568421,60}
        };
        
        titulos = new Object[][]{
            {07, 07,725.30,"Titulo1",true},
            {20,10,100.00,"Titulo2",false},
            {8,8,200.00,"Titulo3",true}
        };
        
        concessionarias = new Object[][] {
            {3,5,300.00,"Copasa"},
            {6,9,250.00,"Internet Vivo"},
            {1,1,750.00, "CEMIG"}
        };
    }
    
    //gera os objetos utilizando as informacoes das arrays criadas
    public Pagavel gerarPagavel(String tipo, int index){
        Pagavel pagavel = null;
        switch(tipo){
                case "assalariado":
                    pagavel = new Assalariado((String)assalariados[index][0],(String)assalariados[index][1], //Casting para os wrappes correspondentes
                    (Integer)assalariados[index][2],(Integer)assalariados[index][3]);
                    break;
                case "comissionado":
                    pagavel = new Comissionado((String)comissionados[index][0],(String)comissionados[index][1],
                    (Integer)comissionados[index][2],(Double)comissionados[index][3]);
                    break;
                case "assalariadoComissionado":
                    pagavel = new AssalariadoComissionado((String)assalariadosComissionados[index][0],(String)assalariadosComissionados[index][1],
                    (Integer)assalariadosComissionados[index][2],(Double)assalariadosComissionados[index][3]);
                    break;
                case "terceirizado":
                    pagavel = new Terceirizado((String)terceirizados[index][0],(String)terceirizados[index][1],
                    (Integer)terceirizados[index][2],(Integer)terceirizados[index][3]);
                    break;
                case "titulo":
                    pagavel = new Titulo((Integer)titulos[index][0],(Integer)titulos[index][1],(Double)titulos[index][2],
                    (String)titulos[index][3],(Boolean)titulos[index][4]);
                    break;
                case "concessionaria":
                    pagavel = new Concessionaria((Integer)concessionarias[index][0],(Integer)concessionarias[index][1],(Double)concessionarias[index][2],
                    (String)concessionarias[index][3]);
                    break;
        }
        return pagavel;
    }          
}