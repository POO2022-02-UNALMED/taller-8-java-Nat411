package futbol;

public class Portero extends Futbolista{
	public short golesRecibidos;
	public byte dorsal;
	
	public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
		super(nombre, edad, "Portero");
		setGolesRecibidos(golesRecibidos);
		setDorsal(dorsal);
	}
	
	@Override
	public boolean jugarConLasManos() {
		return true;
	}
	
	@Override
	public String toString() {
		return "El futbolista "+getNombre()+" tiene "+getEdad()+ ", y juega de "+getPosicion()+" con el dorsal "+getDorsal()+ ". Le han marcado "
				+getGolesRecibidos();
	}
	
	@Override
	public int compareTo(Object o) {
		Portero p = (Portero) o;
		return Math.abs(this.getGolesRecibidos() - p.getGolesRecibidos());
	}
	
	
	public short getGolesRecibidos() {
		return golesRecibidos;
	}
	public void setGolesRecibidos(short golesRecibidos) {
		this.golesRecibidos = golesRecibidos;
	}
	
	public byte getDorsal() {
		return dorsal;
	}
	public void setDorsal(byte dorsal) {
		this.dorsal = dorsal;
	}
	

}
