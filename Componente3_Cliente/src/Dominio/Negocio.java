package Dominio;

public class Negocio {

	private string nombre;
	private string ubicacion;
	private double superficie;
	private int capacidad;
	private string dueno;

	public string getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(string nombre) {
		this.nombre = nombre;
	}

	public string getUbicacion() {
		return this.ubicacion;
	}

	/**
	 * 
	 * @param ubicacion
	 */
	public void setUbicacion(string ubicacion) {
		this.ubicacion = ubicacion;
	}

	public float getSuperficie() {
		// TODO - implement Negocio.getSuperficie
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param superficie
	 */
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public int getCapacidad() {
		return this.capacidad;
	}

	/**
	 * 
	 * @param capacidad
	 */
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public string toString() {
		// TODO - implement Negocio.toString
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nombre
	 * @param ubicacion
	 * @param superficie
	 * @param capacidad
	 * @param dueno
	 */
	public Negocio(string nombre, string ubicacion, float superficie, int capacidad, string dueno) {
		// TODO - implement Negocio.Negocio
		throw new UnsupportedOperationException();
	}

}