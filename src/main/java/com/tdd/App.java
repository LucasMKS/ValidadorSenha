package com.tdd;

import java.util.Scanner;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a senha para validar: ");
        String senha = sc.nextLine();

        List<String> erros = ValidadorSenha.validar(senha);
        if (erros.isEmpty()) {
            System.out.println("Senha válida!");
        } else {
            System.out.println("Erros encontrados:");
            erros.forEach(e -> System.out.println(" - " + e));
        }
        sc.close();
    }
}
