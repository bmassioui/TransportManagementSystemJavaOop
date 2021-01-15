/**
 * 
 */
package transportmanagementsystem;

/**
 * @author bob Represents 'CargaisonRoutiere' Entity as concrete type of
 *         'Cargaison'
 */
public class CargaisonRoutiere extends Cargaison {

	private final double trois_cent_quatre_vingt_mille = 380000;
	private final double quatre = 4;
	private final double six = 6;

	public CargaisonRoutiere(long ref, double distanceDeParcours, double masseLimite) {
		super(ref, distanceDeParcours, masseLimite);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double coutDeTransport() {
		// TODO Auto-generated method stub
		if (volumeTotal() < trois_cent_quatre_vingt_mille)
			return (quatre * distanceDeParcours * poidsTotal());
		else
			return (six * distanceDeParcours * poidsTotal());
	}

	@Override
	public String toString() {
		return "CargaisonRoutiere [ref=" + ref + ", cout de transport=" + coutDeTransport() + "$.]";
	}
}
