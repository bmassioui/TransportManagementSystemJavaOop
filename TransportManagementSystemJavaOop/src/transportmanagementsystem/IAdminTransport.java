/**
 * 
 */
package transportmanagementsystem;

/**
 * @author Bob
 *
 */
public interface IAdminTransport extends IClientTransport {
	void ajouterCargaison(Cargaison cargaison);
	void ajouterMarchandiseAuCargaison(Cargaison cargaison, Marchandise marchandise);
	void supprimerCargaison(Cargaison cargaison);
}
