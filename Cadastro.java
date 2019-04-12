package br.com.edu.ifg.projetoPOO.cadastro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cadastro {

    private List<Pessoa> listaDePessoas;

    public Cadastro() {
        listaDePessoas = new ArrayList<>();
    }
    
    public void cadastrar(){
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        
        System.out.println("---------------------");
        System.out.println("Cadastrando ...\n");
        
        System.out.print("Informe o código: ");
        pessoa.setCodigo(scanner.nextInt());
        
        scanner = new Scanner(System.in);
        
        System.out.print("Informe o nome: ");
        pessoa.setNome(scanner.nextLine());
        
        System.out.print("Informe a idade: ");
        pessoa.setIdade(scanner.nextInt());
        
        scanner = new Scanner(System.in);
        
        System.out.print("Informe o setor: ");
        pessoa.setSetor(scanner.nextLine());
        
        System.out.println("---------------------");
        
        listaDePessoas.add(pessoa);
    }
    
    
    public void deletar(){
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        System.out.println("---------------------");
        System.out.println("Deletando.....");
        System.out.print("Informe o código: ");
        pessoa.setCodigo(scanner.nextInt());
        listaDePessoas.remove(pessoa);
        System.out.println("Removido com sucesso!");
        System.out.println("---------------------");
    }
    
    public void verDetalhes(int codigo){
        
    }
    
    public void listar(){
        for (Pessoa itemDaLista : listaDePessoas) {
            System.out.println("-------Funcionario-------");
            
            System.out.println("Código: "+itemDaLista.getCodigo());
            System.out.println("Nome: "+itemDaLista.getNome());
            System.out.println("Idade: "+itemDaLista.getIdade());
         
            System.out.println("---------------------");
        }
        System.out.println("\n\n");
    }
    
}
