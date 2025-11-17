package tema2;

public class Hotel {
	String codigo;
	String ciudad;
	String plazas;
	String direccion;
	String nombre;
	
	
	public Hotel(String codigo, String ciudad, String plazas, String direccion, String nombre) {
		super();
		this.codigo=codigo;
		this.ciudad=ciudad;
		this.plazas=plazas;
		this.direccion=direccion;
		this.nombre=nombre;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	public String getPlazas() {
		return plazas;
	}


	public void setPlazas(String plazas) {
		this.plazas = plazas;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public String toString() {
		return "Hotel [codigo=" + codigo + ", ciudad=" + ciudad + ", plazas=" + plazas + ", direccion=" + direccion
				+ ", nombre=" + nombre + "]";
	}
	

}
