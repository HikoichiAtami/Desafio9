package productos;

public class Zapatos extends Articulos {

	private String modelo;

	public Zapatos(int valor, String codigo, int talla, String marca, String nombre) {
		super(valor, codigo, talla, marca, nombre);
		this.valor = valor;
		this.codigo = codigo;
		this.talla = talla;
		this.marca = marca;
		// TODO Auto-generated constructor stub
	}

	public String getModelo() {
		return getModelo();
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


}
