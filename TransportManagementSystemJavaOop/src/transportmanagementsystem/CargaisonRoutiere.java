/**
 * 
 */
package transportmanagementsystem;

/**
 * @author Bob
 *
 */
public class CargaisonRoutiere extends Cargaison {

	public CargaisonRoutiere(Long ref, double distanceParcours, double masseLimite) {
		super(ref, distanceParcours, masseLimite);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculerCoutTransport() {
		// TODO Auto-generated method stub
		double v = getVolumeTotal();
		double p = getPoidsTotal();
		if (v < 80000) {
			return 10 * distanceParcours * p;
		} else {
			return 12 * distanceParcours * p;
		}
	}

	@Override
	public String toString() {
		return "Cargaison Routière [" + ref + "] cout = " + calculerCoutTransport();
	}

}
