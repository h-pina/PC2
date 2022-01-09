//Nome: Hugo Antunes Pina
//Disciplina: Programacao de Computadores II

package com.mycompany.atendemergencia_hugopina;
import java.util.ArrayList;
import java.util.Random;

/*----
Nota:
Passei a responsabilidade de definicao da Unidade de Servicos para a central de atendimento,
de modo que a classe Solicitacao ja e inicializada com Unidade Responsavel definida.
Alem disso, achei interessante tirar essa funcao da classe Solicitacao pois assim a parte
logica do atendimento se concentra na central, e as solicitacoes funcionam mais como
registros, que interagem com outras classes para setorizar as informacoes.
------*/

public class CentralAtendimento {
    
    //Campos
    
    private ArrayList<Solicitacao> solicitacoes;
    private ArrayList<UnidadeServico> unidadesDisponiveis;
    private ArrayList<String> atendentes;
    private String dataHoje;
    
    //Construtor
    
    public CentralAtendimento(ArrayList<UnidadeServico> unidadesDisponiveis, ArrayList<String> atendentes, String dataHoje) {
        this.solicitacoes = new ArrayList<Solicitacao>();
        this.unidadesDisponiveis = unidadesDisponiveis;
        this.atendentes = atendentes;
        this.dataHoje = dataHoje;
    }
    
    //Getters e Setters
    
    public ArrayList<Solicitacao> getSolicitacoes() {
        return solicitacoes;
    }

    public void setSolicitacoes(ArrayList<Solicitacao> solicitacoes) {
        this.solicitacoes = solicitacoes;
    }

    public ArrayList<UnidadeServico> getUnidadesDisponiveis() {
        return unidadesDisponiveis;
    }

    public void setUnidadesDisponiveis(ArrayList<UnidadeServico> unidadesDisponiveis) {
        this.unidadesDisponiveis = unidadesDisponiveis;
    }

    public ArrayList<String> getAtendentes() {
        return atendentes;
    }

    public void setAtendentes(ArrayList<String> atendentes) {
        this.atendentes = atendentes;
    }

    public String getDataHoje() {
        return dataHoje;
    }

    public void setDataHoje(String dataHoje) {
        this.dataHoje = dataHoje;
    }
    
    public void adicionarSolicitacao(Solicitacao s){
        solicitacoes.add(s);
    }
    
    //Metodos
    
    //Escolhe um dos atendentes presentes na Central para determinada solicitacao
    public String getAtendenteDisponivel(){
        Random random = new Random();
        int rand = random.nextInt(this.atendentes.size());
        return atendentes.get(rand);
        
    }
    
    //define a unidade de servico desejada com base no numero de telefone e emergencia recebida
    public UnidadeServico definirUnidadeResponsavel(String telefone, Emergencia emergencia){
        String tipoEmergencia = emergencia.getCategoria();
        String regiao = CiaTelefonica.buscaRegiao(telefone);
        UnidadeServico unidadeResponsavel = null;
        
        for(UnidadeServico us: unidadesDisponiveis){
            if(us.getRegiaoAtendida().equalsIgnoreCase(regiao) && us.getServicoOferecido().equalsIgnoreCase(tipoEmergencia)){
                unidadeResponsavel = us;
            }
        }
               
        //caso nao haja unidade disponivel, coloque a primeira unidade daquele servico disponivel
        if(unidadeResponsavel == null){
            for(UnidadeServico us: unidadesDisponiveis){
                if(us.getServicoOferecido().equalsIgnoreCase(tipoEmergencia)){
                    unidadeResponsavel = us;
                }
            }          
        }
        
        return unidadeResponsavel;
    }
    
    
    
    
    
    
}
