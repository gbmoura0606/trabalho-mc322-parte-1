/*Classe: /Classes/protocoloUrgencia.java

Autores:
Gabriel de Souza Mafra - RA 197272
Manuela Rafael Onofre de Souza - RA 202534
Victor Toon de Araujo - RA 225231
Gabriel Batista Moura - RA 216101
Augusto Piato Amstalden - RA 213364
Daniel Cardoso Custodio de Oliveira - RA 169400

Objetivo:

Esse componente recebe a string que representa os sintomas do Paciente e retorna o nível de urgência de seu atendimento, variando entre "máxima", "alta", "média" ou "baixa", priorizando zumbis idosos e crianças, de forma similar aos pronto-socorros do Brasil.

Interface:
*/
public interface ProtocoloUrgencia extends Grafico {
    public String urgencia(String[]sintomas); //classifica as doenças em prioridade
    public Patient[] listaAtendimento(Patient[] pacientes) //cria uma lista de atendimento de acordo com a prioridade
}