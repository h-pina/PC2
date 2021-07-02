//Nome: Hugo Antunes Pina
//Disciplina: Programacao de Computadores II
package com.mycompany.leilao;

public class TesteLeilao {
    public static void main(String[] args) {
        // ------------- Criar um Leilao -------------
        Leilao leilao = new Leilao(3); //criando um leilao com 3 lotes
        
        
        // ------------- Criar um Lote -------------
        System.out.println("Criando Lotes...");
        Lote lote1 = new Lote(4);
        Lote lote2 = new Lote(2);
        Lote lote3 = new Lote(1);
        
        Lote lote4 = new Lote(7); //lote extra, para testar os casos de borda
        

        // ------------- Inserir Lotes no Leilao ---------------
        System.out.println("Inserindo Lotes ...");
        leilao.inserirLote(lote1);
        leilao.inserirLote(lote2);
        leilao.inserirLote(lote3);
               
        System.out.println("Tentando Inserir Lote alem da capacidade do leilao:");
        leilao.inserirLote(lote4); //tentando inserir um lote a mais
 
        

        // ------------- Criar Pessoas -------------
        System.out.println("Criando Pessoas...");
        Pessoa joao = new Pessoa("Joao" , "321456123");
        Pessoa maria = new Pessoa("Maria", "3145678212");
        Pessoa arthur = new Pessoa("Arthur", "arthur.22@gmail.com");
        
        
        
        // ------------- Criar alguns produtos -------------
        System.out.println("Criando Produtos...");
        Produto prod1 = new Produto("Produto1", new Lance(arthur, 1000)); //Criando produto com lance inicial
        Produto prod2 = new Produto("Produto2"); //Criando produto sem lance inicial
        Produto prod3 = new Produto("Produto3"); 
        Produto prod4 = new Produto("Produto4");
        Produto prod5 = new Produto("Produto5");
        Produto prod6 = new Produto("Produto6");
        Produto prod7 = new Produto("Produto7");
        
        
        
        //Inserir Produtos
        System.out.println("Inserindo Produtos No Leilao...");
        lote1.inserirProduto(prod1);
        lote1.inserirProduto(prod2);
        lote1.inserirProduto(prod3);
        lote1.inserirProduto(prod4);
        
        lote2.inserirProduto(prod5);
        lote2.inserirProduto(prod6);
        
        lote3.inserirProduto(prod7);
        
        //Dar Lances nos Produtos
        leilao.receberLance(1,"Produto2",new Lance(joao, 300));
        leilao.receberLance(1,"Produto3",new Lance(maria, 3000));
        leilao.receberLance(1,"Produto4",new Lance(maria, 1000));
        
        leilao.receberLance(2,"Produto5",new Lance(arthur, 4402));
        leilao.receberLance(2,"Produto6",new Lance(joao, 50));
        
        leilao.receberLance(3,"Produto7",new Lance(arthur, 368));
        
        //Declarar um produto vendido
        
        leilao.declararVenda(1, "Produto3");
        
        //Tentar dar um lance em um produto vendido
        
        leilao.receberLance(1,"Produto3",new Lance(joao, 4000));
        
        //Tentar dar um lance menor que o maior Lance em um produto nao vendido
        
        leilao.receberLance(2,"Produto5",new Lance(maria, 1000));
        
        //Listar produtos e Lances
        System.out.println("Listando Produtos no Leilao ...");
        leilao.listarProdutos();
        
        //Encerrar Leilão
        System.out.println("");
        System.out.println("Encerrando Leilao..");
        leilao.encerrarLeilao();
        
    }
}