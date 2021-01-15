/**
 * 
 */
package transportmanagementsystem;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author bob Transport System Owner/Manager
 */
public abstract class SocieteTransport implements IClientTransport, IAdminTransport {
	private Collection<Cargaison> cargaisons;

	public SocieteTransport() {
		cargaisons = new ArrayList<Cargaison>();
	}

	public void ajouterCargaison(Cargaison cargaison) {
		this.cargaisons.add(cargaison);
	}

	public void supprimerCargaison(Cargaison cargaison) {
		this.cargaisons.remove(cargaison);
	}

	public Cargaison cargaisonParRef(long ref) {
		return this.cargaisons.stream().filter(cargaion -> cargaion.getRef() == ref).findFirst().orElse(null);
	}
	
	public Collection<Cargaison> consulterCargaisons()
	{
		return this.cargaisons;
	}
}
