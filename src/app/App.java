package app;

import br.com.poo.rh.*;
import br.com.poo.exceptions.*;

//import br.com.poo.servicos.*;
//java -cp '.' 'app.App'
public class App {
    public static void main(String[] args) {

        Empresa emp = new Empresa("FuturoDigital4.0");

        Gerente    g = new Gerente("Joao", "123456", 10000, "123123");
        Secretario s = new Secretario("Jose", "654321", 5000);
        Engenheiro e = new Engenheiro("Maria", "434343", 7000);

        emp.admitir(g);
        emp.admitir(s);
        emp.admitir(e);
        emp.listar();

        System.out.println("---");
        
        try {
            emp.demitir(e);
        }
        catch(ObjectNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        emp.listar();

    }
}