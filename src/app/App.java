package app;

import br.com.poo.rh.*;
import br.com.poo.servicos.*;
//java -cp '.' 'app.App'
public class App {
    public static void main(String[] args) throws Exception {

        Gerente g = new Gerente("Joao", "123456", 10000, "123123");
        Autenticavel a = g;
        Funcionario f = g;

        if (a instanceof Autenticavel) {
            System.out.println("A classe é autenticável");
        }

        if (!(a.getAutenticado())) {
            SistemaInterno.login((Autenticavel) a);
        }

        if (a.getAutenticado()) {
            System.out.println("Usuário autenticado!");
        }

    }
}