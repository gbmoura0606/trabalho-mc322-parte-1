{
 "cells": [
  {
   "cell_type": "markdown",
   "metadata": {},
   "source": [
    "Classe: /Classes/grafico.java\n",
    "\n",
    "Autores:\n",
    "\n",
    "Gabriel de Souza Mafra                - RA: 197272\n",
    "\n",
    "Manuela Rafael Onofre de Souza        - RA: 202534\n",
    "\n",
    "Victor Toon de Araújo                 - RA: 225231\n",
    "\n",
    "Gabriel Batista Moura                 - RA: 216101 \n",
    "\n",
    "Augusto Piato Amstalden               - RA: 213364\n",
    "\n",
    "Daniel Cardoso Custodio de Oliveira   - RA: 169400\n",
    "\n",
    "Objetivo:\n",
    "O objetivo do componente é criar um gráfico com a frequência de doenças diagnosticadas e outro com\n",
    "a frequencia de sintomas identificados a fim de guiar a anamnsese médica para doenças mais comuns para facilitar o diagnóstico."
   ]
  },
  {
   "cell_type": "code",
   "execution_count": null,
   "metadata": {},
   "outputs": [],
   "source": [
    "Interface:\n",
    "public interface Grafico{\n",
    "    public void criarGraficoDoencas(String dataSource, Patient[] pacientes); //cria um grafico com as frequencias das doenças\n",
    "    public void criarGraficoSintomas(String dataSource, Patient[] pacientes); //cria um grafico com as frequencias das sintomas\n",
    "}"
   ]
  },
  {
   "cell_type": "markdown",
   "metadata": {},
   "source": [
    "Classe: /Classes/arvoreDecisoes.java\n",
    "\n",
    "Autores:\n",
    "\n",
    "Gabriel de Souza Mafra                - RA: 197272\n",
    "\n",
    "Manuela Rafael Onofre de Souza        - RA: 202534\n",
    "\n",
    "Victor Toon de Araújo                 - RA: 225231\n",
    "\n",
    "Gabriel Batista Moura                 - RA: 216101 \n",
    "\n",
    "Augusto Piato Amstalden               - RA: 213364\n",
    "\n",
    "Daniel Cardoso Custodio de Oliveira   - RA: 169400\n",
    "\n",
    "Objetivo:\n",
    "O componente cria uma árvore de decisões com o intuito de otimizar o diagnóstico em tempo e número de perguntas do Doutor.\n"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": null,
   "metadata": {},
   "outputs": [],
   "source": [
    "Interface:\n",
    "public interface ArvoreDecisoes{\n",
    "    public Raiz criar(String dataSource); //cria uma arvore de decisao\n",
    "    public String buscar(Raiz arvore,String[]sintomas); //busca em uma arvore de decisao a doença\n",
    "}"
   ]
  },
  {
   "cell_type": "markdown",
   "metadata": {},
   "source": [
    "Classe: /Classes/protocoloUrgencia.java\n",
    "\n",
    "Autores:\n",
    "\n",
    "Gabriel de Souza Mafra                - RA: 197272\n",
    "\n",
    "Manuela Rafael Onofre de Souza        - RA: 202534\n",
    "\n",
    "Victor Toon de Araújo                 - RA: 225231\n",
    "\n",
    "Gabriel Batista Moura                 - RA: 216101 \n",
    "\n",
    "Augusto Piato Amstalden               - RA: 213364\n",
    "\n",
    "Daniel Cardoso Custodio de Oliveira   - RA: 169400\n",
    "\n",
    "Objetivo: Esse componente recebe a string que representa os sintomas do Paciente e retorna o nível de urgência de seu atendimento, variando entre \"máxima\", \"alta\", \"média\" ou \"baixa\", priorizando zumbis idosos e crianças, de forma similar aos pronto-socorros do Brasil.\n"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": null,
   "metadata": {},
   "outputs": [],
   "source": [
    "public interface ProtocoloUrgencia extends Grafico{\n",
    "    public String urgencia(String[]sintomas); //classifica as doenças em prioridade \n",
    "    public Patient[] listaAtendimento(Patient[] pacientes) //cria uma lista de atendimento de acordo com a prioridade\n",
    "}"
   ]
  }
 ],
 "metadata": {
  "kernelspec": {
   "display_name": "Java",
   "language": "java",
   "name": "java"
  },
  "language_info": {
   "codemirror_mode": "java",
   "file_extension": ".java",
   "mimetype": "text/x-java-source",
   "name": "Java",
   "pygments_lexer": "java",
   "version": "10.0.1+10-Debian-4"
  }
 },
 "nbformat": 4,
 "nbformat_minor": 2
}
