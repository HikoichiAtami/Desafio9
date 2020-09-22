package productos;

public class Pantalones extends Articulos {

	private String colorPantalon;
	private int cantidadBolsillos;
	
	public Pantalones(int valor, String codigo, int talla, String marca, String nombre, String colorPantalon, int cantidadBolsillos) {
		super(valor, codigo, talla, marca, nombre);
		// TODO Auto-generated constructor stub
	}

	public String getColor() {
		return colorPantalon;
	}

	public void setColor(String color) {
		this.colorPantalon = color;
	}

	public int getCantidadBolsillos() {
		return cantidadBolsillos;
	}

	public void setCantidadBolsillos(int cantidadBolsillos) {
		this.cantidadBolsillos = cantidadBolsillos;
	}

}
