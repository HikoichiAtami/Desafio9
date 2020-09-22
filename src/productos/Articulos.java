package productos;

public class Articulos {

	protected int valor;
	protected String codigo;
	protected int talla;
	protected String marca;
	protected String nombre;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Articulos(int valor, String codigo, int talla, String marca, String nombre) {
		this.valor = valor;
		this.codigo = codigo;
		this.talla = talla;
		this.marca = marca;
		this.nombre = nombre;
	}

	public Articulos(Zapatos zapato) {
		// TODO Auto-generated constructor stub
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getTalla() {
		return talla;
	}

	public void setTalla(int talla) {
		this.talla = talla;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
}
