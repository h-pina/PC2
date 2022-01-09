//Nome: Hugo Antunes Pina
//Disciplina: Programacao de Computadores II

package com.mycompany.atendemergencia_hugopina;
import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        // -------- Parte 1 : Configuracao da Central de Atendimento --------------
        
        String data = "15/07/2021";
        
        //Criacai das Unidades de Servico
        String[] regioes = {"Norte","Sul","Leste","Oeste"};
        String[] servicos = {"Policial","Medica","DefesaCivil"};
        ArrayList<UnidadeServico> unidadesDisponiveis = new ArrayList<UnidadeServico>();
        for(String r : regioes){
            for(String s : servicos){
                unidadesDisponiveis.add(new UnidadeServico(s,r));
            }
        }
        
        //Criacao dos atendentes
        ArrayList<String> atendentes = new ArrayList<String>();
        atendentes.add("Hugo");
        atendentes.add("Ana");
        atendentes.add("Beatriz");
        atendentes.add("Marcos");
        
        
        CentralAtendimento central = new CentralAtendimento(unidadesDisponiveis,atendentes,data);
        
        // -------- Parte 2 : Criacao de solicitacoes-teste --------------
        
            //variaveis auxiliares
        String telefone, atendente;
        UnidadeServico unidadeServico;
        Emergencia emergencia;
        Solicitacao solicitacao;
        
            //Emegencia medica teste
        emergencia = new Medica("Masculino",32,false);
        telefone = "995532087";
        unidadeServico = central.definirUnidadeResponsavel(telefone, emergencia);
        atendente = central.getAtendenteDisponivel();
        solicitacao = new Solicitacao("Diogo Antunes","Avenida Amazonas, 200",telefone,emergencia,unidadeServico,atendente,data);
        central.adicionarSolicitacao(solicitacao);
        
            //Emergencia policial teste
        emergencia = new Policial(true, true ,false);
        telefone = "924153365";
        unidadeServico = central.definirUnidadeResponsavel(telefone, emergencia);
        atendente = central.getAtendenteDisponivel();
        solicitacao = new Solicitacao("Breno","Rua Maria das Rosas, Bairro Ouro Preto, 102",telefone,emergencia,unidadeServico,atendente,data);
        central.adicionarSolicitacao(solicitacao);
        
            //Emergencia de Defesa Civil teste
        emergencia = new DefesaCivil(true,true,"Desabamento de Predio");
        telefone = "945688877";
        unidadeServico = central.definirUnidadeResponsavel(telefone, emergencia);
        atendente = central.getAtendenteDisponivel();
        solicitacao = new Solicitacao("Carolina","Rua Alberto Nazaré, Dona Clara, 50",telefone,emergencia,unidadeServico,atendente,data);
        central.adicionarSolicitacao(solicitacao);
        
        // -------- Parte 3 : Exibicao das Solicitacoes criadas --------------
        
        ArrayList<Solicitacao> solicitacoes = central.getSolicitacoes(); //recebe a lista de solicitacoes
        Emergencia tmpEmerg;
        String respostaBoolean; // armazena respostas "sim" ou "nao" de acordo com booleanos
        int count = 1; //Contagem do numero de solicitacoes armazenadas
       
        for(Solicitacao tmpSoli : solicitacoes ){
           System.out.println(String.format(" ---- Solicitacao %d -----", count));
           
           System.out.println("Informacoes do autor do chamado:");
           
           System.out.println("  " + "Nome: " + tmpSoli.getNome());
           System.out.println("  " + "Endereco: "+ tmpSoli.getEndereco());
           System.out.println("  " + "Numero de Telefone: "+ tmpSoli.getNumTelefone());
           
           
           System.out.println("Informacoes de emergencia:");
           
           tmpEmerg = tmpSoli.getEmergencia();
           switch(tmpEmerg.getCategoria()){ //Diferentes informacoes sao mostradas para diferentes emergencias
               case "Policial":
                   Policial pol = (Policial)tmpEmerg;
                   respostaBoolean = (pol.isPessoasArmadas() ? "Sim" : "Nao" );
                   System.out.println("  " +"Há pessoas armadas:" + respostaBoolean);
                   respostaBoolean = (pol.isPessoasFeridas() ? "Sim" : "Nao" );
                   System.out.println("  " +"Há pessoas feridas:" + respostaBoolean);
                   respostaBoolean = (pol.isAreaEmRisco() ? "Sim" : "Nao" );
                   System.out.println("  " +"A area esta em risco: " + respostaBoolean);
                   break;
               case "Medica":
                   Medica med = (Medica)tmpEmerg;
                   System.out.println("  " +"Sexo do paciente: " + med.getSexo());
                   System.out.println("  " +"Idade do paciente: " + med.getIdade());
                   respostaBoolean = (med.isConsciente() ? "Sim" : "Nao" );
                   System.out.println("  " +"O paciente esta consciente: " + respostaBoolean);
                   break;
               case "DefesaCivil":
                   DefesaCivil defCiv = (DefesaCivil)tmpEmerg;
                   System.out.println("  " +"Desastre ocorrido: " + defCiv.getTipoDeDesastre());
                   respostaBoolean = (defCiv.isNecessidadeDeSuprimentos() ? "Sim" : "Nao" );
                   System.out.println("  " +"Há necessidade de envio de suprimentos: " + respostaBoolean);
                   respostaBoolean = (defCiv.isPessoasDesaparecidas() ? "Sim" : "Nao" );
                   System.out.println("  " +"Há pessoas desaparecidas: " + respostaBoolean);
                   break;
           }
           UnidadeServico uniResponsavel = tmpSoli.getUnidadeResponsavel(); //Unidade responsavel
           System.out.println("  " +"Unidade Responsavel: " + uniResponsavel.getServicoOferecido() + " " + uniResponsavel.getRegiaoAtendida());
           
           System.out.println("Informacoes de atendimento:");
           System.out.println("  " + "Nome do atendente: "+ tmpSoli.getNomeAtendente());
           System.out.println("-----------------------\n\n");
           count++;
       }
    }
}
