package estrutura_de_dados;

import java.util.Scanner;

public class VetoresString {
	public static void main(String[] args) {
		String[] estados = new String[10];
		estados[0] = "AC";
		estados[1] = "BA";
		estados[2] = "CE";
		estados[3] = "DF";
		estados[4] = "AM";
		estados[5] = "AP";
		estados[5] = "RN";
		estados[6] = "MS";
		estados[7] = "SP";
		estados[8] = "SP";
		estados[9] = "SP";
		
		for(int i = 0 ; i < estados.length ; i ++) {
			System.out.println(estados[i]);
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual estado");
		String siglaBusca = sc.nextLine();		
		
		//buscaLinear
		boolean encontrou = false; 
		
	
		for(int i = 0 ; i < estados.length ; i++) {
			String elemento = estados[i];
			if(elemento == siglaBusca) {
				encontrou = true;
				break;
			}					
		}
		if(encontrou == true) {
			System.out.println("Encontrou");
		} else {
			System.out.println("Não encontrou");
		}	
		
		
	
		
				
	}

}
