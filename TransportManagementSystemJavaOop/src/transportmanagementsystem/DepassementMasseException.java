/**
 * 
 */
package transportmanagementsystem;

/**
 * @author bob Customize Exception for handling New merchandise 'Marchandise'
 *         when the Masse's amount is exceeded the allowed Masse
 */
public class DepassementMasseException extends Exception {
	private static final long serialVersionUID = 1L;

	public DepassementMasseException() {
		System.out.println("Ajout impossible !!!");
	}
}
