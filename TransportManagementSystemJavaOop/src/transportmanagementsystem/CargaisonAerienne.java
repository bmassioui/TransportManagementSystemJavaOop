/**
 * 
 */
package transportmanagementsystem;

/**
 * @author bob Represents 'CargaisonAerienne' Entity as concrete type of
 *         'Cargaison'
 */
public class CargaisonAerienne extends Cargaison {

	private final double huit_milles = 80000;
	private final double dix = 10;
	private final double douze = 12;

	public CargaisonAerienne(long ref, double distanceDeParcours, double masseLimite) {
		super(ref, distanceDeParcours, masseLimite);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double coutDeTransport() {
		// TODO Auto-generated method stub
		if (volumeTotal() < huit_milles)
			return (dix * distanceDeParcours * poidsTotal());
		else
			return (douze * distanceDeParcours * poidsTotal());
	}

	@Override
	public String toString() {
		return "CargaisonAerienne [ref=" + ref + ", cout de transport=" + coutDeTransport() + "$.]";
	}
}
