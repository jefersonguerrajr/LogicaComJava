/**
 * 
 */
package fibonacci;

import javax.swing.JOptionPane;

/**
 * @author Jeferson
 *
 *         Lógica simples que imprime a sequência de Fibonacci
 */
public class LogicaSimples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int n1 = 0;
		int n2 = 1;
		int resultado = 0;

		for (int i = 0; i < 11; i++) {
			System.out.println("Sequencia de Fibonacci: " + n1);
			resultado = n1 + n2;
			n1 = n2;
			n2 = resultado;
		}
	}

}
