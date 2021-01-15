/**
 * 
 */
package transportmanagementsystem;

import java.util.Collection;

/**
 * @author bob
 * Represent the contract of Transport System EndUser(Customer/stakeholder)
 */
public interface IClientTransport {
	Cargaison cargaisonParRef(long ref);
	Marchandise marchandiseParNum(long num);
	Collection<Cargaison> consulterCargaisons();
}
