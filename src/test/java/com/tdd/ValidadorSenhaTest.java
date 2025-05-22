package com.tdd;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidadorSenhaTest {

    @Test
    void senhaMuitoCurtaDeveDarErro() {
        List<String> erros = ValidadorSenha.validar("Ab1!");
        assertTrue(erros.contains("A senha deve ter pelo menos 8 caracteres"),
                   "Esperava erro de tamanho mínimo");
    }

    @Test
    void senhaComPoucosDigitosDeveDarErro() {
        List<String> erros = ValidadorSenha.validar("Abcdefgh!");
        assertTrue(erros.contains("A senha deve conter pelo menos 2 dígitos"),
                   "Esperava erro de dígitos mínimos");
    }
    
    @Test
    void variosErrosSimultaneos() {
        // “senha”: menor que 8, 0 dígitos, sem maiúscula, sem especial
        List<String> erros = ValidadorSenha.validar("senha");
        assertEquals(4, erros.size(), "Esperava 4 erros distintos");
        assertTrue(erros.contains("A senha deve ter pelo menos 8 caracteres"));
        assertTrue(erros.contains("A senha deve conter pelo menos 2 dígitos"));
        assertTrue(erros.contains("A senha deve conter pelo menos uma letra maiuscula"));
        assertTrue(erros.contains("A senha deve conter pelo menos um caractere especial"));
    }

    

}
