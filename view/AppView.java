package view;

import java.util.Scanner;

public class AppView {
    public static int menuInicial() {
        int retorno = -1;
        System.out.println("1.listar turmas");
        System.out.println("2.Incluir turmas");
        
        System.out.println("");
        System.out.println("escolha sua opção:");
        Scanner scan = new Scanner(System.in);
        retorno = scan.nextInt();
        

        return retorno;
    }
    
}
