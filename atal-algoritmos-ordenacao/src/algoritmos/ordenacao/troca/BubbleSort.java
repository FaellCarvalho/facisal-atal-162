package algoritmos.ordenacao.troca;

public class BubbleSort {
	
	
	public static void main(String[] args) {
		
		int [] vetor = {8,9,3,5,1};
		int aux = 0;
		
		for(int i = 0; i < 5;i++ ){
			for (int j = 0; j < 4; j++){
				if (vetor[j] > vetor[j + 1]){
					aux = vetor[j];
					vetor[j] = vetor [j + 1];
					vetor [j+ 1 ] = aux;
					
				}
			}
		}
		
		System.out.println("Vetor ordenado : ");
		for (int i = 0; i < 5 ;i++){
			System.out.println(" " + vetor[i]);
		}
		
			
	}
}
