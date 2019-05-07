/*Classe: /Classes/arvoreDecisoes.java

Autores:
Gabriel de Souza Mafra - RA 197272
Manuela Rafael Onofre de Souza - RA 202534
Victor Toon de Araujo - RA 225231
Gabriel Batista Moura - RA 216101
Augusto Piato Amstalden - RA 213364
Daniel Cardoso Custodio de Oliveira - RA 169400

Objetivo:

O componente cria uma árvore de decisões com o intuito de otimizar o diagnóstico em tempo e número de perguntas do Doutor.

Interface:
*/
public interface ArvoreDecisoes {
    public Raiz criar(String dataSource); //cria uma arvore de decisao
    public String buscar(Raiz arvore,String[]sintomas); //busca em uma arvore de decisao a doença
}