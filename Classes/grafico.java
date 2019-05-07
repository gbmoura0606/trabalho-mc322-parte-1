/*Classe: /Classes/grafico.java

Autores:
Gabriel de Souza Mafra - RA 197272
Manuela Rafael Onofre de Souza - RA 202534
Victor Toon de Araujo - RA 225231
Gabriel Batista Moura - RA 216101
Augusto Piato Amstalden - RA 213364
Daniel Cardoso Custodio de Oliveira - RA 169400

Objetivo:

O objetivo do componente é criar um gráfico com a frequência de doenças diagnosticadas e outro com a frequencia de sintomas identificados a fim de guiar a anamnsese médica para doenças mais comuns para facilitar o diagnóstico.

Interface:
*/
public interface Grafico {
    public void criarGraficoDoencas(String dataSource, Patient[] pacientes); //cria um grafico com as frequencias das doenças
    public void criarGraficoSintomas(String dataSource, Patient[] pacientes); //cria um grafico com as frequencias das sintomas
}
