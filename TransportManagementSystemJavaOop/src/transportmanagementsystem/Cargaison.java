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
public abstract class Cargaison {
	protected Long ref;
	protected double distanceParcours;
	protected double masseLimite;
	protected List<Marchandise> marchandises = new ArrayList<Marchandise>();

	public Cargaison(Long ref, double distanceParcours, double masseLimite) {
		super();
		this.ref = ref;
		this.distanceParcours = distanceParcours;
		this.masseLimite = masseLimite;
	}

	public abstract double calculerCoutTransport();

	public void ajouterMarchanse(Marchandise m) throws DepassementMasseException {
		if (getPoidsTotal() + m.getPoids() > masseLimite) {
			throw new DepassementMasseException();
		}
		this.marchandises.add(m);
	}

	public void supprimerMarchandise(Marchandise marchandise) {
		this.marchandises.remove(marchandise);
	}

	public Marchandise getMarchandise(Long num) {
		for (Marchandise m : marchandises) {
			if (m.getNum() == num) {
				return m;
			}
		}

		return null;
	}

	public double getPoidsTotal() {
		double poidsTotal = 0;

		for (Marchandise m : marchandises) {
			poidsTotal += m.getPoids();
		}

		return poidsTotal;
	}

	public double getVolumeTotal() {
		double volumeTotal = 0;

		for (Marchandise m : marchandises) {
			volumeTotal += m.getVolume();
		}

		return volumeTotal;
	}

	public List<Marchandise> getMarchandises() {
		return marchandises;
	}

	public Long getRef() {
		return ref;
	}

	public void setRef(Long ref) {
		this.ref = ref;
	}

	public double getDistanceParcours() {
		return distanceParcours;
	}

	public void setDistanceParcours(double distanceParcours) {
		this.distanceParcours = distanceParcours;
	}

	public double getMasseLimite() {
		return masseLimite;
	}

	public void setMasseLimite(double masseLimite) {
		this.masseLimite = masseLimite;
	}

	@Override
	public boolean equals(Object obj) {
		Cargaison c = (Cargaison) obj;
		return (this.ref == c.ref);
	}

	@Override
	public String toString() {
		return "Cargaison [ref=" + ref + ", distanceParcours=" + distanceParcours + ", masseLimite=" + masseLimite
				+ "]";
	}

}
