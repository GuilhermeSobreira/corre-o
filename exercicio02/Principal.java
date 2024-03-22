package exercicio02;

import java.util.Arrays;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Conta c1 = new Conta("Guilherme", 900.00);
        Conta c2 = new Conta("Micaelly", 870.00);
        Conta c3 = new Conta("Hellen", 850.00);

        CadastroConta cad = new CadastroConta();
        cad.adicionarConta(c1.getNome(), c1.getValor());
        cad.adicionarConta(c2.getNome(), c2.getValor());
        cad.adicionarConta(c3.getNome(), c3.getValor());
        
        System.out.println(Arrays.toString(cad.listarContas()));
        
        cad.adicionarPorPosicao(c3, 1);
        
        System.out.println(Arrays.toString(cad.listarContas()));
                

        Scanner scanner = new Scanner(System.in);
        
        boolean continuar = true;
        while (continuar) {
            System.out.println("Digite a conta que quer procurar: ");
            String contaProc = scanner.nextLine();
            cad.procurarConta(contaProc);
            
            System.out.println("Deseja procurar outra conta? \nSIM \nNÃO");
            String resp = scanner.nextLine();
            if (!resp.equalsIgnoreCase("SIM")) {
                continuar = false;
            }
        }
        
        System.out.println("\nSaindo...");
    }      
}