package Dominio;

public class Cuenta {

	private String user;
	private int valoracion;
	private comentarios[] comentarios;
	private String password;
	private Date ultimoAcceso;

	/**
	 * 
	 * @param user
	 * @param valoracion
	 * @param fecha
	 * @param comentarios
	 */
	public Cuenta Comentario(String user, int valoracion, String fecha, comentarios[] comentarios) {
		// TODO - implement Cuenta.Comentario
		throw new UnsupportedOperationException();
	}

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

	public int getValoracion() {
		return this.valoracion;
	}

	/**
	 * 
	 * @param valoracion
	 */
	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}

	public String getUltimoAcceso() {
		// TODO - implement Cuenta.getUltimoAcceso
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param fecha
	 */
	public void setUltimoAcceso(String fecha) {
		// TODO - implement Cuenta.setUltimoAcceso
		throw new UnsupportedOperationException();
	}

	public comentarios[] getComentarios() {
		return this.comentarios;
	}

	public String setPassword() {
		// TODO - implement Cuenta.setPassword
		throw new UnsupportedOperationException();
	}

}