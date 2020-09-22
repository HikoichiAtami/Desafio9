package productos;

public class Polera extends Articulos{

	private String colorPolera;
	
	public Polera(int valor, String codigo, int talla, String marca, String nombre, String colorPolera) {
		super(valor, codigo, talla, marca, nombre);
		// TODO Auto-generated constructor stub
	}

	public String getColorPolera() {
		return colorPolera;
	}

	public void setColorPolera(String colorPolera) {
		this.colorPolera = colorPolera;
	}

}
