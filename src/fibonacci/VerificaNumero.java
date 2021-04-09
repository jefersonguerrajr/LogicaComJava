/**
 * 
 */
package fibonacci;

import javax.swing.JOptionPane;

/**
 * @author Jeferson
 * 
 *         Classe que verifica se o número informado pertence a sequência de
 *         Fibonacci
 *
 */
public class VerificaNumero {

	public static void main(String[] args) {

		int n1 = 0;
		int n2 = 1;
		int resultado = 0;

		String resposta = JOptionPane.showInputDialog("Informe um numero: ");
		try {

			int numeroInformado = Integer.parseInt(resposta);

			while (true) {

				if (n1 > 2147483645) {
					JOptionPane.showMessageDialog(null, "O numero informado nao pertence a sequencia de Fibonacci");
					break;
				}
				if (n1 == numeroInformado) {
					JOptionPane.showMessageDialog(null,
							"O número " + numeroInformado + " pertence a sequencia de Fibonacci");
					break;
				}

				resultado = n1 + n2;
				n1 = n2;
				n2 = resultado;
			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, resposta + " Nao e um numero inteiro valido: ");
		}
	}
}
