/**
 * 
 */
package maiorNumero;

/**
 * @author Jeferson
 * 
 *         verifica um vetor de números e mostra quem é o maior
 *
 */

public class MaiorNumero {

	public static void main(String[] args) {

		int numeros[] = { 8, 4, 2, 9, 5, 1, 10 };

		int maior = 0;

		for (int i = 0; i < numeros.length; i++) {

			if (maior < numeros[i]) {
				maior = numeros[i];
			}

		}

		System.out.println("O maior número é: " + maior);

	}

}
