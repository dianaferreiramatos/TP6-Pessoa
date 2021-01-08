package org.dei.excecaoUnchecked;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    @DisplayName("Teste1")
    public void givenNomeNullThrowException() {
        Exception exception = assertThrows(RuntimeException.class, () -> {
            Pessoa pessoa = new Pessoa(null, 123);
        });

        String expectedMessage = "Argumento fora dos limites !!!";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

}