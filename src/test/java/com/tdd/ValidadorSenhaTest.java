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

}
