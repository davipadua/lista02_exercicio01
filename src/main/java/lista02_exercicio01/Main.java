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
//		app.start();
		app.resposta();

	}
	
	private Map<Integer, Candidato> mapaDeCandidatos = new HashMap<Integer, Candidato>();

	private void resposta() {
		// TODO Auto-generated method stub
		
		inicializarMapaDeCandidatos();
		
		while(true) {
			
			int voto = obterVoto();
			if(voto == 0) {
				break;
			}
			
			System.out.println("Numero do voto " + voto);
			
		}
		
		System.out.println("Fim da aplicação");
		

	}
	
	private void inicializarMapaDeCandidatos() {
		
		Candidato joao = new Candidato(1, "João");
		mapaDeCandidatos.put(joao.getId(), joao);
		
		Candidato maria = new Candidato(2, "Maria");
		mapaDeCandidatos.put(maria.getId(), maria);
		
		Candidato jose = new Candidato(3, "José");
		mapaDeCandidatos.put(jose.getId(), jose);
		
		Candidato antonio = new Candidato(4, "Antonio");
		mapaDeCandidatos.put(antonio.getId(), antonio);
		
		Candidato tiburssinho = new Candidato(5, "Tiburssinho");
		mapaDeCandidatos.put(tiburssinho.getId(), tiburssinho);
		
	}

	private int obterVoto() {
		
		System.out.println("Digite seu voto: ");
		Scanner scanner = new Scanner(System.in);
		
		try {
			
			return scanner.nextInt();

		} catch (Exception e) {
			
			scanner.next();
			System.out.println("Valor inválido");
			return -1;
			
		}
		
	}
	
	private void registrarVoto(int voto) {
		
		/// NOME_MAPA.containsKey(CHAVE_EM_QUESTAO)
		/// NOME_MAPA.get(CHAVE_EM_QUESTAO)
		
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
