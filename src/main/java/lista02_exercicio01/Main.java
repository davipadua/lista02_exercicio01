package lista02_exercicio01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main app = new Main();
		app.start();

	}

	private void start() {
		// TODO Auto-generated method stub
		
		Map<String, Integer> candidatos = new HashMap<String, Integer>();
		candidatos.put("Joao", 0);
		candidatos.put("Maria", 0);
		candidatos.put("Jose", 0);
		candidatos.put("Antonio", 0);
		candidatos.put("Tiburssinho", 0);
	
		
		System.out.print("Digite seu voto");
		Scanner scanner = new Scanner(System.in);
		int voto = scanner.nextInt();
		
		while(voto != 0) {
			if(voto == 1) {
				
			}
		}
		
	}

}
