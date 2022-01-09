//Nome: Hugo Antunes Pina
//Disciplina: Programacao de Computadores 2
//Data: 24/06/2021

package q2;
import q1.Contato;
import java.util.Scanner;

public class TesteNovaAgenda {
    public static void main(String[] args) {
        boolean execution = true;
        NovaAgenda agenda = new NovaAgenda();
        Scanner s = new Scanner(System.in);
        
        String nome, telefone, email;
        
        while(execution){
        
            System.out.println("==================================\n"
                + "Selecione a opção desejada:\n"
                + "(1) - Insere novo contato na agenda\n"
                + "(2) - Exibe o número total de contatos da agenda\n"
                + "(3) - Exibe um contato (pesquisa pelo nome)\n"
                + "(4) - Exclui um contato (pesquisa pelo nome)\n"
                + "(5) - Exibe todos os contatos da agenda\n"
                + "(0) - Sair\n"
                + "==================================");
        

            int opcaoEscolhida = s.nextInt();
            s.nextLine(); //Captura o \n apos o input

            switch(opcaoEscolhida){
                case 0:
                    execution = false;
                    break;
                case 1:
                    System.out.println("Insira o nome do contato:");
                    nome = s.nextLine();
                    System.out.println("Insira o telefone:");
                    telefone = s.nextLine();
                    System.out.println("Insira o email do contato:");
                    email = s.nextLine();
                    agenda.adicionarContato(new Contato(nome,telefone,email));
                    System.out.println("Contato adicionado com sucesso!!");
                    break;
                case 2:
                    System.out.println("Numero de contatos na agenda:" + agenda.getTotalContatos());
                    break;
                case 3:
                    System.out.println("Insira o nome do contato desejado: ");
                    nome = s.nextLine();
                    
                    Contato cont = agenda.pesquisarContato(nome);
                    System.out.println("Nome:" + cont.getNome());
                    System.out.println("Telefone:" +cont.getTelefone());
                    System.out.println("Email:" +cont.getEmail());
                    break;
                case 4:
                    System.out.println("Insira o nome do contato a ser removido:");
                    nome = s.nextLine();
                    agenda.removerContato(nome);
                    break;
                case 5:
                    agenda.listarContatos();
                    break;
            }
            
        }
        
    }

}
