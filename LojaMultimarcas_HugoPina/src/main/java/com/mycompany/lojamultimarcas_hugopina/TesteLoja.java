//Nome: Hugo Antunes Pina
//Disciplina: Programacao de Computadores II

package com.mycompany.lojamultimarcas_hugopina;
import java.util.Scanner;
import java.util.ArrayList;

public class TesteLoja {
    public static void main(String[] args) {
        Loja loja = new Loja("CefetMobiles", "WallStreet, NY - numero 1");
        Scanner s = new Scanner(System.in);
        
        boolean executando = true;
        
        //variaveis utilizadas ao longo do teste
        String tipo, nome, marca, modelo, numSerie, dataFabricacao, nomeTransportadora, telefone;
        int numLote;
        Produto prod;
        ArrayList<Produto> produtosDesejados;
        
        System.out.println("Bem vindo a CEFETMobiles!! O que deseja fazer?");
        while(executando){
            System.out.println("==============================\n"
                              +"(1)Informacoes da Loja\n"
                              +"(2)Cadastrar Novo Produto\n"
                              +"(3)Cadastrar novo fornecedor para um produto\n"
                              +"(4)Buscar Produto(por nome)\n"
                              +"(5)Buscar produtos (por Fornecedor)\n"
                              +"(6)Listar Produtos Disponiveis\n"
                              +"(0)Sair\n"
                              +"==============================\n");
           
            int opcaoEscolhida = s.nextInt();
            s.nextLine(); //capturar o \n
            
            switch(opcaoEscolhida){
                case 1:
                    System.out.println("Nome: " + loja.getNome());
                    System.out.println("Endereco: " + loja.getEndereco());
                    break;
                    
                case 2:
                    System.out.println("Tipo: ");
                    tipo = s.nextLine();
                    if(tipo.equalsIgnoreCase("celular") || tipo.equalsIgnoreCase("notebook")){
                        System.out.println("Nome:");
                        nome = s.nextLine();
                        System.out.println("Marca:");
                        marca = s.nextLine();
                        System.out.println("Modelo:");
                        modelo = s.nextLine();
                        System.out.println("Numero de Serie:");
                        numSerie = s.nextLine();
                        System.out.println("Data de Fabricacao:");
                        dataFabricacao = s.nextLine();
                        System.out.println("Nome da Transportadora:");
                        nomeTransportadora = s.nextLine();
                        System.out.println("Numero de Lote:");
                        numLote = s.nextInt();
                        
                        prod = new Produto(tipo, nome, marca, modelo, numSerie, dataFabricacao, nomeTransportadora, numLote);
                        loja.cadastrarProduto(prod);
                        System.out.println("Produto Cadastrado!");
                    }
                    else{
                        System.out.println("Me desculpe, mas a loja atualmente so trabalha com notebooks e celulares");
                    }
                    break;
                    
                case 3:
                    System.out.println("Insira o nome do produto: ");
                    prod = loja.buscarProdutoPorNome(s.nextLine());
                    System.out.println("Digite o nome do novo fornecedor:");
                    nome = s.nextLine();
                    System.out.println("Digite o telefone do novo fornecedor:");
                    telefone = s.nextLine();
                    prod.cadastrarFornecedor(nome, telefone);
                    System.out.println("Fornecedor Cadastrado!");
                    break;
                    
                case 4:
                    System.out.println("Insira o nome do produto desejado:");
                    prod = loja.buscarProdutoPorNome(s.nextLine());
                    prod.exibirInformacoes();
                    break;
                    
                case 5:
                    System.out.println("Insira o nome do Fornecedor desejado:");
                    nome = s.nextLine();
                    System.out.println("");
                    produtosDesejados = loja.buscarProdutoPorFornecedor(nome);
                    for(Produto tmpProd: produtosDesejados){
                        tmpProd.exibirInformacoes();
                        System.out.println("");
                    }
                    
                    break;
                    
                case 6:
                    loja.listarProdutos();
                    break;
                    
                case 0:
                    executando = false;
            }
        }
    }
}

