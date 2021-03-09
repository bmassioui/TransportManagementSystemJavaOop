/**
 * 
 */
package transportmanagementsystem;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bob
 *
 */
public class SocieteTransport implements IAdminTransport {

	private List<Cargaison> cargaisons = new ArrayList<Cargaison>();

	@Override
	public void ajouterCargaison(Cargaison c) {
		cargaisons.add(c);
	}

	@Override
	public void ajouterMarchandiseAuCargaison(Cargaison cargaison, Marchandise marchandise) {
		try {
			for (Cargaison car : cargaisons) {
				if (car.equals(cargaison)) {
					car.ajouterMarchanse(marchandise);
				}
			}
		} catch (DepassementMasseException e) {
		}
	}

	@Override
	public void supprimerCargaison(Cargaison cargaison) {
		cargaisons.remove(cargaison);
	}

	@Override
	public Cargaison getCargaison(Long ref) {
		for (Cargaison car : cargaisons) {
			if (car.getRef() == ref) {
				return car;
			}
		}
		return null;
	}

	@Override
	public Marchandise getMarchandise(Long num) {
		for (Cargaison car : cargaisons) {
			for (Marchandise mar : car.marchandises) {
				if (mar.getNum() == num) {
					return mar;
				}
			}
		}
		return null;
	}

	@Override
	public List<Cargaison> getAllCargaison() {
		return cargaisons;
	}

}
