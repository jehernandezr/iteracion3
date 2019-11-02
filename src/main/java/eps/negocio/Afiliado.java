package eps.negocio;

public class Afiliado {


	/**
	 * Atributo que representa la fecha de nacimiento de un afiliado
	 */
	private String fecha_Nacimiento;
	/**
	 * Atrubuto que representa el nombre de un afiliado
	 */
	private String nombre;
	/**
	 * Atributo que representa el numero de cedula de un afiliado
	 */
	private String numero_Documento;

	/**
	 * Atributo que representa el tipo de documento de un afiliado
	 */
	private TipoDeDocumento tipo_De_Documento;

	/**
	 * Atributo que representa la lista de citas reservadas de un afiliado
	 */
	//private List<Long> citasReservadas;

	/**
	 * Atributo que representa la lista de ordenes de servicios de un afiliado
	 */
	//private List<Long> ordenes;
	
	/**
	 * constructor por defecto
	 */
	@SuppressWarnings("deprecation")
	public Afiliado() {
		this.fecha_Nacimiento = "";
		this.nombre = "";
		this.numero_Documento ="";
		this.tipo_De_Documento = null;
		//this.citasReservadas = (List<Long>) new java.awt.List();
		//this.ordenes = (List<Long>) new java.awt.List();
	}

	/**
	 * Constructor de un afiliado
	 * 
	 * @param fechaDeNacimiento
	 * @param nombre
	 * @param numeroDeDocumento
	 * @param tipoDocumento
	 * @param citasReservadas
	 * @param ordenes
	 */
	public Afiliado(String fechaDeNacimiento, String nombre, String numeroDeDocumento, TipoDeDocumento tipoDocumento) {
		this.fecha_Nacimiento = fechaDeNacimiento;
		this.nombre = nombre;
		this.numero_Documento = numeroDeDocumento;
		this.tipo_De_Documento = tipoDocumento;
		//this.citasReservadas = (List<Long>) new java.awt.List();
		//this.ordenes = (List<Long>) new java.awt.List();
	}

	/**
	 * @return the fechaDeNacimiento
	 */
	public String getFecha_Nacimiento() {
		return fecha_Nacimiento;
	}

	/**
	 * @param fechaDeNacimiento the fechaDeNacimiento to set
	 */
	public void setFecha_Nacimiento(String fechaDeNacimiento) {
		this.fecha_Nacimiento = fechaDeNacimiento;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the numeroDeDocumento
	 */
	public String getNumero_Documento() {
		return numero_Documento;
	}

	/**
	 * @param numeroDeDocumento the numeroDeDocumento to set
	 */
	public void setNumero_Documento(String numeroDeDocumento) {
		this.numero_Documento = numeroDeDocumento;
	}

	/**
	 * @return the tipoDocumento
	 */
	public TipoDeDocumento getTipo_De_Documento() {
		return tipo_De_Documento;
	}

	/**
	 * @param tipoDocumento the tipoDocumento to set
	 */
	public void setTipo_De_Documento(TipoDeDocumento tipoDocumento) {
		this.tipo_De_Documento = tipoDocumento;
	}

	/**
	 * agrega a la lista
	 */
	//private void addCitaRecervada(Long cita)
	//{
	//	citasReservadas.add(cita);
	//}

	/**
	 * agrega a la lista
	 */
	//private void addOrden(Long orden)
	//{ordenes.add(orden);
	//}

	/**
	 * @return the citasRecervadas
	 */
	//public List<Long> getCitasRecervadas() {
	//	return citasReservadas;
	//}

//	/**
//	 * @param citasRecervadas the citasRecervadas to set
//	 */
//	public void setCitasRecervadas(List<Long> citasRecervadas) {
//		this.citasReservadas = citasRecervadas;
//	}
//
//	/**
//	 * @return the ordenes
//	 */
//	public List<Long> getOrdenes() {
//		return ordenes;
//	}
//
//	/**
//	 * @param ordenes the ordenes to set
//	 */
//	public void setOrdenes(List<Long> ordenes) {
//		this.ordenes = ordenes;
//	} 
}
