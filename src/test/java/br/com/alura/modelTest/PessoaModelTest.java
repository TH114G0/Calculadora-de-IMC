package br.com.alura.modelTest;

import br.com.alura.model.PessoaModel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PessoaModelTest {


    @Test
    public void testSetNomeValido() {
        PessoaModel pessoaModel = new PessoaModel();
        pessoaModel.setNome("João");
        assertEquals("João", pessoaModel.getNome());
    }

    @Test
    public void testSetNomeNulo() {
        PessoaModel pessoaModel = new PessoaModel();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
           pessoaModel.setNome(null);
        });
        assertEquals("O nome não deve ser nulo e nem vazio!", exception.getMessage());
    }

    @Test
    public void testSetIdadeValida() {
        PessoaModel pessoaModel = new PessoaModel();
        pessoaModel.setIdade(25);
        assertEquals(25, pessoaModel.getIdade());
    }

    @Test
    public void testSetIdadeInvalida() {
        PessoaModel pessoaModel = new PessoaModel();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            pessoaModel.setIdade(-1);
        });
        assertEquals("A idade deve ser um valor positivo e razoável.", exception.getMessage());
    }

    @Test
    public void testSetAlturaValida() {
        PessoaModel pessoaModel = new PessoaModel();
        pessoaModel.setAltura(1.73);
        assertEquals(1.73, pessoaModel.getAltura());
    }

    @Test
    public void testSetAlturaInvalida() {
        PessoaModel pessoaModel = new PessoaModel();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            pessoaModel.setAltura(0);
        });
        assertEquals("A altura deve ser um valor positivo e razoável.", exception.getMessage());
    }

    @Test
    public void testSetPesoValido() {
        PessoaModel pessoaModel = new PessoaModel();
        pessoaModel.setPeso(79);
        assertEquals(79, pessoaModel.getPeso());
    }

    @Test
    public void testSetPesoInvalido() {
        PessoaModel pessoaModel = new PessoaModel();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            pessoaModel.setPeso(500);
        });
        assertEquals("O peso deve ser um valor positivo e razoável.", exception.getMessage());
    }
}
