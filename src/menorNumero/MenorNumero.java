/**
 * 
 */
package menorNumero;

/**
 * @author Jeferson
 * 
 *         Verifica um vetor de n�meros e mostra quem � o menor
 */
public class MenorNumero {

	public static void main(String[] args) {
		
		int numeros[] = { 8, 4, 2, 9, 5, 1, 10 };

		int menor = Integer.MAX_VALUE;

		for (int i = 0; i < numeros.length; i++) {

			if (menor > numeros[i]) {
				menor = numeros[i];
			}

		}

		System.out.println("O menor n�mero �: " + menor);
		
	}

}
