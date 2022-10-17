package futbol;

public abstract class Futbolista implements Comparable<Object>{
	private String nombre;
	private int edad;
	private final String posicion;
	
	public Futbolista(String nombre, int edad, String posicion) {
		setNombre(nombre);
		setEdad(edad);
		this.posicion = posicion;
	}
	
	public Futbolista() {
		this("Maradona", 30, "delantero");	
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getPosicion() {
		return posicion;
	}
	
	@Override
	public String toString() {
		return "El futbolista "+getNombre()+" tiene "+getEdad()+ ", y juega de "+getPosicion();
	}
	
	public boolean equals(Futbolista f) {
		if (this!= f) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public abstract boolean jugarConLasManos();
}
