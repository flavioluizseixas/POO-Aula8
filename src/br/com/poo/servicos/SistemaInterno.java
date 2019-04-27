package br.com.poo.servicos;

import java.util.Scanner;

import br.com.poo.rh.Autenticavel;

/**
 * SistemaInterno
 */
public class SistemaInterno {

    private static Scanner teclado = new Scanner(System.in);

    public static void login(Autenticavel a) {

        System.out.print("Digite a senha: ");
        String senha = teclado.nextLine();

        
        if (senha.equals(a.getSenha())) {
            a.setAutenticado(true);
            System.out.println("Bem vindo !");
        }
        else {
            a.setAutenticado(false);
            System.out.println("Erro na autenticacao");
        }
    }
}