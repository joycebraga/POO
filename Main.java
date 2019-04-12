package br.com.edu.ifg.projetoPOO;

import br.com.edu.ifg.projetoPOO.cadastro.Cadastro;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("Inicializando o sistema.....\n\n");
        Cadastro service = new Cadastro();
        
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        
        whilePrograma:
        while (true) {            
            System.out.println("Selecione uma opção:");
            System.out.println("[1] Cadastrar Pessoa");
            System.out.println("[2] Deletar Pessoa");
            System.out.println("[3] Listar Pessoa");
            System.out.println("[4] Sair do Sistema");
            opcao = scanner.nextInt();
            System.out.println("\n\n");
            switch (opcao) {
                case 1:
                    service.cadastrar();
                    break;
                case 2:
                    service.deletar();
                    break;
                case 3:
                    service.listar();
                    break;
                case 4:
                    break whilePrograma;
            }
        }
        
    }
    
}
