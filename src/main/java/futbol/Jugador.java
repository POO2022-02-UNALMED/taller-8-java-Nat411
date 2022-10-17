package futbol;

public class Jugador extends Futbolista{
	
	public short golesMarcados;
	public byte dorsal;
	
	public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
		super(nombre, edad, posicion);
		setGolesMarcados(golesMarcados);
		setDorsal(dorsal);
	}
	
	public Jugador() {
		super();
		this.golesMarcados = 289;
		this.dorsal = 7;
	}
	
	public short getGolesMarcados() {
		return golesMarcados;
	}
	public void setGolesMarcados(short golesMarcados) {
		this.golesMarcados = golesMarcados;
	}
	
	public byte getDorsal() {
		return dorsal;
	}
	public void setDorsal(byte dorsal) {
		this.dorsal = dorsal;
	}
	
	@Override
	public int compareTo(Object o) {
		Jugador j = (Jugador) o;
		return Math.abs(this.getEdad() - j.getEdad());
	}
	
	@Override
	public String toString() {
		return "El futbolista "+getNombre()+" tiene "+getEdad()+ ", y juega de "+getPosicion()+" con el dorsal "+getDorsal()+ ". Ha marcado "
				+getGolesMarcados();
	}

	@Override
	public boolean jugarConLasManos() {
		return false;
	}
}
