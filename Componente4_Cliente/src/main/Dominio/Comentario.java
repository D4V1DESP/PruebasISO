package Iteracion4.Dominio;

public class Comentario {

	private String user;
	private int valoracion;
	private String fecha;
	private comentarios[] comentarios;

	/**
	 * 
	 * @param user
	 * @param valoracion
	 * @param fecha
	 * @param comentarios
	 */
	public Comentario Comentario(String user, int valoracion, String fecha, comentarios[] comentarios) {
		// TODO - implement Comentario.Comentario
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

	public String getFecha() {
		return this.fecha;
	}

	/**
	 * 
	 * @param fecha
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public comentarios[] getComentarios() {
		return this.comentarios;
	}

}