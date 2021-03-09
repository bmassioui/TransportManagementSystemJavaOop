/**
 * 
 */
package transportmanagementsystem;

/**
 * @author Bob
 *
 */
public class Marchandise {
	private Long num;
	private double poids;
	private double volume;
	
	public Marchandise(Long num, double poids, double volume) {
		super();
		this.num = num;
		this.poids = poids;
		this.volume = volume;
	}
	
	public Long getNum() {
		return num;
	}
	
	public void setNum(Long num) {
		this.num = num;
	}
	
	public double getPoids() {
		return poids;
	}
	
	public void setPoids(double poids) {
		this.poids = poids;
	}
	
	public double getVolume() {
		return volume;
	}
	
	public void setVolume(double volume) {
		this.volume = volume;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Marchandise marchandise = (Marchandise) obj;
		return (this.num == marchandise.num);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Marchandise [num=" + num + ", poids=" + poids + ", volume=" + volume + "]";
	}
	
	
}
