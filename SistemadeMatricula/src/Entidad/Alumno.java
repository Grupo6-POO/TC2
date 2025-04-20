package Entidad;

public class Alumno {
	private int cod;
	private String dni, nombre, apellido;
	private boolean disponible;
	public Alumno(int cod, String dni, String nombre, String apellido, boolean disponible) {
		this.cod = cod;
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.disponible = disponible;
	}
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	
}
