package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Entao;
import tests.ApiPostmanEchoTest;

public class ApiPostmanEchoSteps {

    ApiPostmanEchoTest apiPostmanEchoTest = new ApiPostmanEchoTest();

    @Dado("que eu faca uma requisicao GET na API Postman Echo")
    public void que_eu_faca_uma_requisicao_GET_na_API_Postman_Echo(){
        apiPostmanEchoTest.validarRequisicaoGET();
    }

    @Dado("que eu faca uma requisicao POST na API Postman Echo")
    public void que_eu_faca_uma_requisicao_POST_na_API_Postman_Echo(){
        apiPostmanEchoTest.validarRequisicaoPOST();
    }

    @Dado("que eu faca uma requisicao PUT na API Postman Echo")
    public void que_eu_faca_uma_requisicao_PUT_na_API_Postman_Echo(){
        apiPostmanEchoTest.validarRequisicaoPUT();
    }

    @Quando("eu fizer uma requisicao DELETE na API Postman Echo")
    public void eu_fizer_uma_requisicao_DELETE_na_API_Postman_Echo(){
        apiPostmanEchoTest.validarRequisicaoDELETE();
    }

    @Entao("todos os Testes devem funcionar corretamente")
    public void todos_os_Testes_devem_funcionar_corretamente(){
        //IsValid();
    }
}
