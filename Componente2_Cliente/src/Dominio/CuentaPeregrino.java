package Iteracion2.Dominio;

public class CuentaPeregrino {

	private string user;
	private string password;
	private string dni;
	private string fechaNacimiento;
	private int tiempo;
	private double recursos;

	public string getUser() {
		return this.user;
	}

	/**
	 * 
	 * @param user
	 */
	public void setUser(string user) {
		this.user = user;
	}

	public string getPassword() {
		return this.password;
	}

	/**
	 * 
	 * @param password
	 */
	public void setPassword(string password) {
		this.password = password;
	}

	public string getDni() {
		return this.dni;
	}

	/**
	 * 
	 * @param dni
	 */
	public void setDni(string dni) {
		this.dni = dni;
	}

	public string getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	/**
	 * 
	 * @param fechaNacimiento
	 */
	public void setFechaNacimiento(string fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getTiempo() {
		return this.tiempo;
	}

	/**
	 * 
	 * @param tiempo
	 */
	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	public double getRecursos() {
		return this.recursos;
	}

	/**
	 * 
	 * @param recursos
	 */
	public void setRecursos(double recursos) {
		this.recursos = recursos;
	}

	/**
	 * 
	 * @param user
	 * @param password
	 * @param dni
	 * @param fechaNacimiento
	 * @param tiempo
	 * @param recursos
	 */
	public CuentaPeregrino(string user, string password, string dni, string fechaNacimiento, int tiempo, double recursos) {
		// TODO - implement CuentaPeregrino.CuentaPeregrino
		throw new UnsupportedOperationException();
	}

}