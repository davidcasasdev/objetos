/**
 * 
 */
package clases;

import java.util.Objects;

/**
 * @author David
 *
 */
public class Coche {

	// Estado
	/** Definie la marca del vehiculo  */
	private String marca;
	/** Moelo del vehiculo */
	private String modelo;
	private int potencia;
	private double precio;
	private double velocidad;
	private double velocidadMax;
	
	private static double impuestos;
	
	// Comporatamiento
	// se cre un constructor de oficio sin parametro
	public Coche() {
		marca="";
		modelo="";
		potencia=90;
		precio=20000;
		velocidad=0;
		this.velocidadMax=180;
	}
	
	
	
	public Coche(String marca, String modelo, int potencia,
			double precio, double velocidad) {
		this.marca = marca;
		this.modelo = modelo;
		this.potencia = potencia;
		this.precio = precio;
		this.velocidad = velocidad;
		this.velocidadMax=180;
	}



	public static void setImpuestos(double i) {
		impuestos=i;
	}
	
	public Coche(String m) {
		marca=m;
		this.velocidadMax=180;
	}
	
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	
	public void setMarca(String marca) {
		this.marca=marca;
	}
	
	public void setModelo (String modelo) {
		this.modelo=modelo;
	}
	
	public void setVelocidad (double velocidad) {
		if (velocidad<=this.velocidadMax) {
			this.velocidad=velocidad;
		} else {
			this.velocidad=this.velocidadMax;
		}
	}

	/**
	 * @return el potencia
	 */
	public int getPotencia() {
		return potencia;
	}

	/**
	 * @param potencia el potencia a establecer
	 */
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	/**
	 * @return el precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio el precio a establecer
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * @return el velocidadMax
	 */
	public double getVelocidadMax() {
		return velocidadMax;
	}

	
	/**
	 * @param velocidadMax el velocidadMax a establecer
	 */
	private void setVelocidadMax(double velocidadMax) {
		this.velocidadMax = velocidadMax;
	}
	

	public double getVelocidad() {
		return this.velocidad;
	}
	
	public void mostrar() {
		System.out.println("Marca: "+marca+
				"\nmodelo: "+modelo+
				"\nPotencia: "+potencia+
				"\nPrecio: "+precio+
				"\nVelocidad actual: "+velocidad);
	}
	
	
	
	@Override
	public String toString() {
		return "id="+super.toString()+" Coche [marca=" + marca + ", modelo=" + modelo + ", potencia=" + potencia + ", precio=" + precio
				+ ", velocidad=" + velocidad + ", velocidadMax=" + velocidadMax + "]";
	}

	public double calculaImpuestos() {
		return this.precio*Coche.impuestos;
	}



	@Override
	public int hashCode() {
		return Objects.hash(marca, modelo);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coche other = (Coche) obj;
		return Objects.equals(marca, other.marca) 
				&& Objects.equals(modelo, other.modelo);
	}
	
	
	
//	public boolean equals(Coche c) {
//		if (this.marca.equals(c.marca) && 
//				this.modelo.equals(c.modelo))
//				return true;
//		else return false;
//	}
	
}
