#language: pt
Funcionalidade: Testes da API Open Weather
  Usuarios devem conseguir consultar, criar, alterar e deletar itens na API Open Weather.

  Cenario: Validar os Endpoints da API Open Weather com Casos de Teste Positivos
    Dado que eu faca uma requisicao na API Open Weather pelo nome da Cidade
    E que eu faca uma requisicao na API Open Weather pelo id da Cidade
    E que eu faca uma requisicao na API Open Weather pelas coordenadas geograficas da Cidade
    Quando eu fizer uma requisicao na API Open Weather pelo cep da Cidade
    Entao todos os Testes da API Open Weather devem funcionar corretamente

  Cenario: Validar os Endpoints da API Open Weather com Casos de Teste Negativos
    Dado que eu faca uma requisicao na API Open Weather sem a autenticacao
    E que eu faca uma requisicao na API Open Weather com id autenticacao invalido
    Quando eu fizer uma requisicao na API Open Weather sem o nome da cidade
    Entao todos os Testes da API Open Weather devem funcionar corretamente