/**
 * 
 */
package eps.negocio;

import org.apache.log4j.Logger;

import com.google.gson.JsonObject;

import eps.persistencia.EpsAndesPersistencia;
import uniandes.isis2304.parranderos.negocio.Bebedor;


/**
 * @author jonat
 *
 */
public class EpsAndes {
	/* ****************************************************************
	 * 			Constantes
	 *****************************************************************/
	/**
	 * Logger para escribir la traza de la ejecución
	 */
	private static Logger log = Logger.getLogger(EpsAndes.class.getName());

	/* ****************************************************************
	 * 			Atributos
	 *****************************************************************/
	/**
	 * El manejador de persistencia
	 */
	private EpsAndesPersistencia Ep;

	/* ****************************************************************
	 * 			Métodos
	 *****************************************************************/
	/**
	 * El constructor por defecto
	 */
	public EpsAndes() {

		Ep = EpsAndesPersistencia.getInstance ();
	}

	public EpsAndes(JsonObject tableConfig)
	{
		Ep=EpsAndesPersistencia.getInstance(tableConfig);
	}



	/**
	 * Encuentra un adminsitrador y su información básica, según su identificador
	 * @param numCc - El identificador del administrador buscado
	 * @return Un objeto Administrador que corresponde con el identificador buscado y lleno con su información básica
	 * 			null, si un Administrador con dicho identificador no existe
	 */
	public Administrador darAdminsitradorId (String numCc)
	{
		log.info ("Dar información de un administrador por id: " + numCc);
		Administrador administrador = Ep.darAdministradorPorId(numCc) ;
		log.info ("Buscando Administrador por Id: " + administrador != null ? administrador : "NO EXISTE");
		return administrador;
	}

	/**
	 * Cierra la conexión con la base de datos (Unidad de persistencia)
	 */
	public void cerrarUnidadPersistencia ()
	{
		Ep.cerrarUnidadPersistencia ();
	}

	/* ****************************************************************
	 * 			Métodos para administración
	 *****************************************************************/

	/**
	 * Elimina todas las tuplas de todas las tablas de la base de datos de Parranderos
	 * @return Un arreglo 
	 */
	public long [] limpiarEpsAndes ()
	{
		log.info ("Limpiando la BD de EpsAndes");
		long [] borrrados = Ep.limpiarEpsAndes();	
		log.info ("Limpiando la BD de EpsAndes: Listo!");
		return borrrados;
	}

	/**
	 * Elimnar un administrador
	 * @param numcc número de cédula del administrador
	 */
	public void eliminarAdministrador(String         numcc)
	{

	}
	public boolean existeAdmin( String NumCc) {
		System.out.println(Ep.darAdministradorPorId(NumCc)+"         aaaaaaaaaaaaaaaaa");
		return Ep.darAdministradorPorId(NumCc) !=null? true:false;
	}

	public boolean existeRecepcionista(long idNumCc) {
		return true;
	}
	public boolean existeAfiliado(long idNumCc) {
		return true;
	}
	public boolean existeMedico(long idNumCc) {
		return true;
	}

	public String crearAdministrador(String nombre,  String pCorreo,String numCc)
	{
		return Ep.adicionarAdministrador(nombre, pCorreo, numCc).toString();
	}
}