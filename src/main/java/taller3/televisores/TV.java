package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;
	static int numTV = 0;
	public TV(Marca x, boolean y) {
		marca = x;
		estado = y;
		numTV++;
	}
	public int getCanal() {
		return this.canal;
	}
	public void setCanal(int k) {
		this.canal = k;
	}
	public int getVolumen() {
		return this.volumen;
	}
	public void setVolumen(int k) {
		this.volumen = k;
	}
	public int getPrecio() {
		return this.precio;
	}
	public void setPrecio(int k) {
		this.precio = k;
	}
	public Marca getMarca (){
		return this.marca;
	}
	public void setMarca (Marca marca) {
		 this.marca = marca;
	}
	public Control getControl (){
		return this.control;
	}
	public void setControl (Control control) {
		 this.control = control;
	}
	public static void setNumTV (int k) {
		numTV = k;
	}
	public static int getNumTV() {
		return numTV;
	}
	public void turnOn () {
		this.estado = true;
	}
	public void turnOff () {
		this.estado = false;
	}
	public boolean getEstado () {
		return this.estado;
	}
	public void setEstado(boolean k) {
		this.estado = k;
	}
	public void canalUp () {
		if ((this.estado == true) && (this.canal < 120)) {
			this.canal++;
		}
	}
	public void canalDown () {
		if ((this.estado == true) && (this.canal > 1)) {
			this.canal--;
		}
	}
	public void volumenUp () {
		if ((this.estado == true) && (this.volumen < 7)) {
			this.volumen++;
		}
	}
	public void volumenDown () {
		if ((this.estado == true) && (this.volumen > 1)) {
			this.volumen--;
		}
	}
}
