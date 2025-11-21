package controller;
import main.java.model.Database;
import java.util.Scanner;

public class LoginUser {
	Scanner input = new Scanner(System.in);
	Database dataB = new Database("Julia", "0609");
	int i;
	public LoginUser() {
		System.out.println("Realize o login para a votação");
		login();
	}
	
	public void login() {
		String userT = inUser();
		String passT = inPass();
	
	for(i = 1;; i++) {
			if(userT.equals(dataB.getUser()) && passT.equals(dataB.getPass())) {
				System.out.println("Bem vindo de volta " + dataB.getUser());
				System.out.println("O que você deseja fazer");
				break;
			}else if(i == 5) {
				System.out.println("Número máximo de Tentativa é " + i);
				System.out.println("Bloqueado temporariamente");
				break;
			}else {
				System.out.println("User or Password incorrect");
				userT = inUser();
				passT = inPass();
			}
			
		}
	}
	
	public String inUser() {
		System.out.println("User:");
		return input.nextLine();
	}
	
	public String inPass() {
		System.out.println("Pass:");
		return input.nextLine();
	}	
	
	
}
