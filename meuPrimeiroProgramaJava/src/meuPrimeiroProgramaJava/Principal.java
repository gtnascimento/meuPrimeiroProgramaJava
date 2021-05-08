/**
 * Meu primeiro programa Java
 * 
 * Este programa mostra ao aluno:
 * 1) Que um programa Java é construído dentro de um projeto Java.
 * 2) Todo programa Java deve ter uma classe com um método main.
 * 3) Como exibir informaçõees no terminal (console) do Java.
 * 4) Como ler uma string do terminal (console) do Java.
 * 
 */
package meuPrimeiroProgramaJava;

import java.util.Scanner;

/**
 * @author biel1 data: 03/02/2021
 */
public class Principal { // Classe que contém o métoodo principal.
	public static void main(String[] args) { // Este é o método principal.
		
		// Saudação e pergunta o nome.
		System.out.println("Olá, amigo!\nQual é o seu nome?");
		
		// Ler o nome.
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		
		// Saudação para o nome lido
		System.out.printf("Olá! %s!\n", nome);
		
		//Perguntar a Idade
		System.out.printf("%s, qual é a sua idade?", nome);
		
		//Ler idade.
		Integer idade = in.nextInt();
		
		System.out.printf("%d! Puxa! Como você é jovem!", idade);
		
		//NOTA: Implementar leitura da idade e exibi-la.
	}

}
