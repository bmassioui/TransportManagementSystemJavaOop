/**
 * 
 */
package transportmanagementsystem;

import java.util.List;

/**
 * @author Bob
 *
 */
public interface IClientTransport {
	Cargaison getCargaison(Long ref);
	Marchandise getMarchandise(Long num);
	List<Cargaison> getAllCargaison();
}
