package br.com.alura.serviceTest;

import br.com.alura.model.PessoaModel;
import br.com.alura.service.CalcularIMCService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcularIMCServiceTest {
    @Test
    public void testCalcularIMC() {
        PessoaModel pessoaModel = new PessoaModel();
        pessoaModel.setAltura(1.73);
        pessoaModel.setPeso(79);

        double resultado = CalcularIMCService.calcular(pessoaModel);
        assertEquals(26.3, resultado, 0.1);
    }
}
