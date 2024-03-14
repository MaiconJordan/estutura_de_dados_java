package busca_binaria;

import java.util.Scanner;

public class Main {
	  public static void main(String[] args) throws Exception {
	        int[] vetor = new int[8];

	        for (int i = 0; i < vetor.length; i++) {
	            vetor[i] = i * 2;
	        }

	        System.out.println("QUal numero? ");
	        Scanner sc = new Scanner(System.in);
	        int buscado = sc.nextInt();

	        boolean achou = false;
	        int inicio = 0;
	        int fim = vetor.length - 1;
	        int meio;
	        while (inicio <= fim) {
	            meio = (int) ((inicio + fim) / 2);
	            if (vetor[meio] == buscado) {
	                achou = true;
	                break;
	            } else if (vetor[meio] < buscado) {
	                inicio = meio + 1;
	            } else {
	                fim = meio - 1;
	            }
	        }
	        if (achou == true) {
	            System.out.println("Achou");
	        } else {
	            System.out.println("Não achou");
	        }
	    }
}
