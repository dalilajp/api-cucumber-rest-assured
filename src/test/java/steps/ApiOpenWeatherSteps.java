package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import tests.ApiOpenWeatherTest;

public class ApiOpenWeatherSteps{

    ApiOpenWeatherTest apiOpenWeatherTest = new ApiOpenWeatherTest();

    @Dado("que eu faca uma requisicao na API Open Weather pelo nome da Cidade")
    public void queEuFacaUmaRequisicaoNaAPIOpenWeatherPeloNomeDaCidade() {
        apiOpenWeatherTest.validarRequisicaoPeloNomeCidade();
    }

    @Dado("que eu faca uma requisicao na API Open Weather pelo id da Cidade")
    public void queEuFacaUmaRequisicaoNaAPIOpenWeatherPeloIdDaCidade() {
        apiOpenWeatherTest.validarRequisicaoPeloIdCidade();
    }

    @Dado("que eu faca uma requisicao na API Open Weather pelas coordenadas geograficas da Cidade")
    public void queEuFacaUmaRequisicaoNaAPIOpenWeatherPelasCoordenadasGeograficasDaCidade() {
        apiOpenWeatherTest.validarRequisicaoPelaCoordenadaGeografica();
    }

    @Quando("eu fizer uma requisicao na API Open Weather pelo cep da Cidade")
    public void euFizerUmaRequisicaoNaAPIOpenWeatherPeloCepDaCidade() {
        apiOpenWeatherTest.validarRequisicaoPeloCepCidade();
    }

    @Entao("todos os Testes da API Open Weather devem funcionar corretamente")
    public void todosOsTestesDaAPIOpenWeatherDevemFuncionarCorretamente() {
        //IsValid();
    }

    @Dado("que eu faca uma requisicao na API Open Weather sem a autenticacao")
    public void queEuFacaUmaRequisicaoNaAPIOpenWeatherSemAAutenticacao() {
        apiOpenWeatherTest.validarRequisicaoSemAppId();
    }

    @Dado("que eu faca uma requisicao na API Open Weather com id autenticacao invalido")
    public void queEuFacaUmaRequisicaoNaAPIOpenWeatherComIdAutenticacaoInvalido() {
        apiOpenWeatherTest.validarRequisicaoComAppIdInvalido();
    }

    @Quando("eu fizer uma requisicao na API Open Weather sem o nome da cidade")
    public void euFizerUmaRequisicaoNaAPIOpenWeatherSemONomeDaCidade() {
        apiOpenWeatherTest.validarRequisicaoSemNomeCidade();
    }
}
