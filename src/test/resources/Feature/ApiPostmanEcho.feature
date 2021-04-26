#language: pt
Funcionalidade: Testes da API Postman Echo
  Usuarios devem conseguir consultar, criar, alterar e deletar itens na API Postman Echo.

  Cenario: Validar os Endpoints da API Postman Echo com Casos de Teste Positivos
    Dado que eu faca uma requisicao GET na API Postman Echo
    E que eu faca uma requisicao POST na API Postman Echo
    E que eu faca uma requisicao PUT na API Postman Echo
    Quando eu fizer uma requisicao DELETE na API Postman Echo
    Entao todos os Testes devem funcionar corretamente