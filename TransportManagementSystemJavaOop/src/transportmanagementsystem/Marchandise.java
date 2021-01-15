/**
 * 
 */
package transportmanagementsystem;

/**
 * @author bob Represents 'Marchandise' Entity
 */
public class Marchandise {
	private long num;
	private double poids;
	private double volume;

	public Marchandise(long num, double poids, double volume) {
		this.num = num;
		this.poids = poids;
		this.volume = volume;
	}

	public long getNum() {
		return num;
	}
	
	public double getPoids() {
		return poids;
	}

	public double getVolume() {
		return volume;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;

		if (obj.getClass() != this.getClass())
			return false;
		
		return this.num == ((Marchandise)obj).num;
	}

}
