/**
 * 
 */
package fibonacci;

import javax.swing.JOptionPane;

/**
 * @author Jeferson
 * 
 *         Classe que verifica se o n�mero informado pertence a sequ�ncia de
 *         Fibonacci
 *
 */
public class VerificaNumero {

	public static void main(String[] args) {

		int n1 = 0;
		int n2 = 1;
		int resultado = 0;

		String resposta = JOptionPane.showInputDialog("Informe um numero: ");

		int numeroInformado = Integer.parseInt(resposta);

		while (true) {
			if (n1 > 999999) {
				JOptionPane.showMessageDialog(null, "O numero informado nao pertence a sequencia de Fibonacci");
				break;
			}
			if (n1 == numeroInformado) {
				JOptionPane.showMessageDialog(null,
						"O n�mero " + numeroInformado + " pertence a sequencia de Fibonacci");
				break;
			}

			resultado = n1 + n2;
			n1 = n2;
			n2 = resultado;
		}
	}
}
