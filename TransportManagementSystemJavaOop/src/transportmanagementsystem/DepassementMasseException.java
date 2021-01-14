/**
 * 
 */
package transportmanagementsystem;

/**
 * @author bob
 * Customize Exception for handling New merchandise 'Marchandise' when the Masse's amount is exceeded the allowed Masse
 */
public class DepassementMasseException extends Exception {

	/**
	 * 
	 */
	public DepassementMasseException() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public DepassementMasseException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public DepassementMasseException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public DepassementMasseException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public DepassementMasseException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
