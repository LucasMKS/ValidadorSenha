package com.tdd;

import java.util.ArrayList;
import java.util.List;

public class ValidadorSenha {

    public static List<String> validar(String senha) {
        List<String> erros = new ArrayList<>();

        if (!temTamanhoMinimo(senha)) {
            erros.add("A senha deve ter pelo menos 8 caracteres");
        }

        if (!temDoisDigitos(senha)) {
            erros.add("A senha deve conter pelo menos 2 dígitos");
        }

        if (!contemLetraMaiuscula(senha)) {
            erros.add("A senha deve conter pelo menos uma letra maiuscula");
        }

        if (!contemCaractereEspecial(senha)) {
            erros.add("A senha deve conter pelo menos um caractere especial");
        }

        if (!contemLetraMinuscula(senha)) {
            erros.add("A senha deve conter pelo menos uma letra minuscula");
        }

        return erros;
    }

    public static boolean temTamanhoMinimo(String senha) {
        return senha.length() >= 8;
    }

    public static boolean temDoisDigitos(String senha) {
        return senha.chars().filter(Character::isDigit).count() >= 2;
    }

    public static boolean contemLetraMaiuscula(String senha) {
        return senha.matches(".*[A-Z].*");
    }

    public static boolean contemCaractereEspecial(String senha) {
        return senha.matches(".*[^A-Za-z0-9].*");
    }

    public static boolean contemLetraMinuscula(String senha) {
        return senha.matches(".*[a-z].*");
    }
}
