package com.tdd;

import java.util.ArrayList;
import java.util.List;

public class ValidadorSenha {
     public static List<String> validar(String senha) {
        List<String> erros = new ArrayList<>();

        // 1) comprimento mínimo
        if (senha == null || senha.length() < 8) {
            erros.add("A senha deve ter pelo menos 8 caracteres");
        }

        // 2) pelo menos 2 dígitos
        long countDigitos = (senha == null)
                ? 0
                : senha.chars().filter(Character::isDigit).count();
        if (countDigitos < 2) {
            erros.add("A senha deve conter pelo menos 2 dígitos");
        }

        // 3) ao menos 1 letra maiúscula
        if (senha == null || !senha.chars().anyMatch(Character::isUpperCase)) {
            erros.add("A senha deve conter pelo menos uma letra maiuscula");
        }

        // 4) ao menos 1 caractere especial
        if (senha == null || !senha.matches(".[^A-Za-z0-9].")) {
            erros.add("A senha deve conter pelo menos um caractere especial");
        }

        return erros;
    }
}