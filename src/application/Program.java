package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;


public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Champion champion_1;
		Champion champion_2;
		
		// Champion_1	
		
		System.out.println("Digite os dados do primeiro campeão: ");
		System.out.print("Nome: ");		
		String name = sc.nextLine();		
		
		System.out.print("Vida inicial: ");
		int life = sc.nextInt();
		
		System.out.print("Ataque: ");
		int attack = sc.nextInt();
		
		System.out.print("Armadura: ");
		int armor = sc.nextInt();
		
		champion_1 = new Champion(name, life, attack, armor);
		
		// Champion_2
		
		System.out.println();
		System.out.println("Digite os dados do segundo campeão: ");
		System.out.print("Nome: ");
		sc.nextLine();
		name = sc.nextLine();		
		
		System.out.print("Vida inicial: ");
		life = sc.nextInt();
		
		System.out.print("Ataque: ");
		attack = sc.nextInt();
		
		System.out.print("Armadura: ");
		armor = sc.nextInt();
		
		champion_2 = new Champion(name, life, attack, armor);
		
		// Rounds
		
		System.out.println();
		System.out.print("Quantos turnos você deseja executar? ");
		int n = sc.nextInt();		
				
		for(int i = 0; i < n; i++) {
			System.out.println();
			if(champion_1.getLife() > 0 && champion_2.getLife() > 0) {				
				System.out.printf("Resultado do turno %d:%n", i+1);				
				champion_1.takeDamage(champion_2);
				System.out.println(champion_1);				
				champion_2.takeDamage(champion_1);
				System.out.println(champion_2);				
			}
			else {
				i = n;
			}					
		}
		
		System.out.println();
		System.out.println("FIM DE COMBATE");
		
		sc.close();	
		
	}
}
