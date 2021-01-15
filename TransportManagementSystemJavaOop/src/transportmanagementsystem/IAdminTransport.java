/**
 * 
 */
package transportmanagementsystem;

/**
 * @author bob
 * Represent the contract of Transport System Administrator
 */
public interface IAdminTransport {
	void ajouterCargaison(Cargaison cargaison);
	void ajouterMarchandisePourCargaison(Marchandise marchandise) throws DepassementMasseException;
	void supprimerCargaison(Cargaison cargaison);
}
