#Author: carlosandre.lopes@hotmail.com


Feature: Pesquisar Veiculo
  Como usuario quero pesquisar marca modelo e versao do veiculo para aquisicao

  
  Scenario: Validar marca modelo e versao veiculo
    Given que acesso o site da "https://www.webmotors.com.br/"
    When pesquiso veiculo "Honda City"
    Then acesso listagem de estoque
    

  