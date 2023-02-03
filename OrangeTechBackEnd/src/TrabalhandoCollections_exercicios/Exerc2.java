package TrabalhandoCollections_exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Exerc2 {

	
	public static void main(String[] args) {
		
		ArrayList<String> respostas = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A seguir teremos 5 parguntas sobre o crime, responda com S para sim e N para não:  ");
		System.out.println();
		
		String res = "";
		
		System.out.println("Telefonou para a vítima?");
		res = sc.next();
		
		if (res.equals("s") || res.equals("S")) respostas.add(res);
	
		
		
		System.out.println("Esteve no local do crime?");
		res = sc.next();
		
		if (res.equals("s") || res.equals("S")) respostas.add(res);
		
		
		System.out.println("Mora perto da vítima?");
		res = sc.next();
		
		if (res.equals("s") || res.equals("S")) respostas.add(res);
		
		
		System.out.println("Devia para a vítima?");
		res = sc.next();
		
		if (res.equals("s") || res.equals("S")) respostas.add(res);
		
		
		System.out.println("Já trabalhou com a vítima?");
		res = sc.next();
		
		if (res.equals("s") || res.equals("S")) respostas.add(res);
		
		int s = respostas.size();
		
		if (s == 2) {
			System.out.println("Você é um suspeito!");
		}else if(s == 3 || s == 4) {
			System.out.println("Você é um Cúmplice!");
		}else if(s == 5) {
			System.out.println("Você é o Assassino!");
		}else {
			System.out.println("Você é inocente!");
		}
		
		
		
		sc.close();
		
		
	}
}
