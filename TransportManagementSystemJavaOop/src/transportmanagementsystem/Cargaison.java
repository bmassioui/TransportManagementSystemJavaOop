/**
 * 
 */
package transportmanagementsystem;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author bob Represent 'Cargaison' Entity
 */
public abstract class Cargaison extends SocieteTransport {
	protected long ref;
	protected double distanceDeParcours;
	protected double masseLimite;
	private Collection<Marchandise> marchandises;

	public Cargaison(long ref, double distanceDeParcours, double masseLimite) {
		super();
		this.ref = ref;
		this.distanceDeParcours = distanceDeParcours;
		this.masseLimite = masseLimite;
		marchandises = new ArrayList<Marchandise>();
	}

	public long getRef() {
		return ref;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;

		if (obj.getClass() != this.getClass())
			return false;

		return this.ref == ((Cargaison) obj).ref;
	}

	abstract double coutDeTransport();

	public void ajouterMarchandisePourCargaison(Marchandise marchandise) throws DepassementMasseException {
		if (this.masseLimite == poidsTotal())
			throw new DepassementMasseException();

		this.marchandises.add(marchandise);
	}

	public Marchandise marchandiseParNum(long num) {
		return this.marchandises.stream().filter(marchandise -> marchandise.getNum() == num).findFirst().orElse(null);
	}

	public double poidsTotal() {
		return this.marchandises.stream().mapToDouble(marchandise -> marchandise.getPoids()).sum();
	}

	public double volumeTotal() {
		return this.marchandises.stream().mapToDouble(marchandise -> marchandise.getVolume()).sum();
	}
}
