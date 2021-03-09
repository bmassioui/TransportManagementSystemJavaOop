/**
 * 
 */
package transportmanagementsystem;

/**
 * @author Bob
 *
 */
public class CargaisonAerienne extends Cargaison {

	public CargaisonAerienne(Long ref, double distanceParcours, double masseLimite) {
		super(ref, distanceParcours, masseLimite);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculerCoutTransport() {
		// TODO Auto-generated method stub
		double v = getVolumeTotal();
		double p = getPoidsTotal();
		if (v < 380000) {
			return 4 * distanceParcours * p;
		} else {
			return 6 * distanceParcours * p;
		}
	}

	@Override
	public String toString() {
		return "Cargaison Aerienne [" + ref + "] cout = " + calculerCoutTransport();
	}

}
