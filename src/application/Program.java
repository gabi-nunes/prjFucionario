package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		
		
			//Funcionario fun = new Funcionario();
			List<Funcionario>list = new ArrayList<>();
			Scanner sc = new Scanner (System.in);
			char opc;
			
			do {
				sc.nextLine();
				System.out.println("Formulario de Cadastro de Funcionarios: ");
				sc.nextLine();
				System.out.print("Nome: ");
				String name = sc.nextLine();
				System.out.print("email: ");
				String email = sc.nextLine();
				System.out.print("CPF OU CNPJ: ");
				String cpf = sc.next();
				System.out.print("Telefone: ");
				String telefone= sc.next();
				System.out.print("CEP: ");
				String cep = sc.next();
				System.out.print("Logadouro: ");
				String logadouro= sc.nextLine();
				sc.nextLine();
				System.out.print("Numero:  ");
				String number = sc.next();
				System.out.print("Bairro:  ");
				sc.nextLine();
				String bairro= sc.nextLine();		
				System.out.print("Cidade: ");
				String cidade= sc.nextLine();
				System.out.print("Estado: ");
				String estado= sc.nextLine();
						
				
				list.add(new Funcionario(name,email,cpf,telefone,cep,logadouro,number,bairro,cidade,estado));
				
				System.out.println("Deseja cadastrar outro funcionario? (s/n)");
				opc = sc.next().charAt(0);
						
				
				
				
				
				
			}while (opc == 's' || opc == 'S');
			
			
			
			
			for(Funcionario func: list) {
				
				System.out.println("nome: " + func.getName() 
						+" \n" +  "email: "+ func.getEmail()
						+" \n" +  "CPF OU CNPJ:  "+ func.getCpfCnpj()
						+" \n" +  "Telefone:  "+ func.getTelefone()
						+" \n" +  "CEP "+ func.getCep()
						+" \n" +  "Logadouro:  "+ func.getLogadouro()
						+" \n" +  "Numero: "+ func.getNumero()
						+" \n" +  "Bairro: "+ func.getBairro()
						+" \n" +  "Cidade: "+func.getCidade()
						+" \n" +  "Estado: "+ func.getCidade()
						+ "\n");
	
			}
			
			
			System.out.println("Qual funcionario deseja remover da lista: ");
			String cpfRemove= sc.next();

				
			
			for(Funcionario fc: list) {
				
				if(fc.getCpfCnpj().equals(cpfRemove)) {
					
					list.remove(fc);
					System.out.println("Removido com sucesso!");

		}
				
				else {
					System.out.println("Esse valor não existe!");
				}
				
				
				for(Funcionario func: list) {
					
					System.out.println("Lista de funcionarios: ");
					
					System.out.println("nome: " + func.getName() 
							+" \n" +  "email: "+ func.getEmail()
							+" \n" +  "CPF OU CNPJ:  "+ func.getCpfCnpj()
							+" \n" +  "Telefone:  "+ func.getTelefone()
							+" \n" +  "CEP "+ func.getCep()
							+" \n" +  "Logadouro:  "+ func.getLogadouro()
							+" \n" +  "Numero: "+ func.getNumero()
							+" \n" +  "Bairro: "+ func.getBairro()
							+" \n" +  "Cidade: "+func.getCidade()
							+" \n" +  "Estado: "+ func.getCidade()
							+ "\n");
	
				
			}
			}
			
			sc.close();
	}
}
			
			
			
			

	


