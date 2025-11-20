package main.java.controller;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CadastreUser {
	Scanner input = new Scanner(System.in);
	public CadastreUser() {
		
	}
	
	public void CreateFileForBD() {
		try{
			File file = new File("cadastre.txt");
			if(!file.exists()){
				file.createNewFile();
				System.out.println("Arquivo Criado!");
			}
			
			FileWriter writer = new FileWriter(file, true);
			
			writer.write("Nome: " + nameUser() + "\n");
			writer.write("Senha: " + passUser() + "\n" );
			
			writer.close();
			
		}catch(IOException e) {
			System.out.println("Não foi possível");
			e.printStackTrace();
		}
	}
	
	public String nameUser() {
		System.out.println("Typing your name");	
		return input.nextLine();
	}
	
	public String passUser() {
		System.out.println("Typing your password");
		return input.nextLine();
	}
	
}
