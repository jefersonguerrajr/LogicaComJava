/**
 * 
 */
package arquivos;

import java.io.File;
import java.util.Iterator;

/**
 * @author Jeferson
 *
 */
public class CriandoPastas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		File path = new File("c:\\");

		File[] folders = path.listFiles(File::isDirectory);
		
		//listando pastas existentes
		System.out.println("Folders in c:\\ ");
		for (File folder : folders) {
			System.out.println(folder);

		}
		
		//criando pasta
		
		boolean success = new File("c:\\" + "\\criandoPasta").mkdir();

	}

}
