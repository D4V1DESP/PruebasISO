package Dominio;

public class Cuenta {

	private String user;
	private int valoracion;
	private comentarios[] comentarios;
	private String password;
	private Date ultimoAcceso;

	public String getUser() {
		return this.user;
	}

	/**
	 * 
	 * @param user
	 */
	public void setUser(String user) {
		this.user = user;
	}

	public void getValoracion() {
		// TODO - implement Cuenta.getValoracion
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param valoracion
	 */
	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}

	public comentarios[] getComentarios() {
		return this.comentarios;
	}

	/**
	 * 
	 * @param comentarios
	 */
	public void setComentarios(comentarios[] comentarios) {
		this.comentarios = comentarios;
	}

	public String getPassword() {
		return this.password;
	}

	/**
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	public void getUltimoAcceso() {
		// TODO - implement Cuenta.getUltimoAcceso
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ultimoAcceso
	 */
	public void setUltimoAcceso(Date ultimoAcceso) {
		this.ultimoAcceso = ultimoAcceso;
	}

	/**
	 * 
	 * @param user
	 * @param valoracion
	 * @param fecha
	 * @param comentarios
	 */
	public Cuenta Cuenta(String user, int valoracion, String fecha, comentarios[] comentarios) {
		// TODO - implement Cuenta.Cuenta
		throw new UnsupportedOperationException();
	}

}