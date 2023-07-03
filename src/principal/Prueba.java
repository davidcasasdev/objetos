package principal;

import clases.Coche;

public class Prueba {

	public static void main(String[] args) {
		Coche coche1=new Coche("Renault");
		
		System.out.println("El coche es "+coche1);
		
		coche1.setModelo("Clio");
		System.out.println("La marca del coche "+coche1.getMarca());
		System.out.println("el modelo del vehiculo es "
				+coche1.getModelo());
		
		Coche c2 = new Coche();
		System.out.println("El coche es "+c2);
		System.out.println("el modelo del vehiculo es "
				+c2.getModelo());
		
		c2.setMarca("Seat");
		c2.setModelo("León");
		System.out.println("el vehiculo es un "
				+c2.getMarca()+ "  "+c2.getModelo());
		
		c2.setVelocidad(200);
		System.out.printf("Va a una velocidad de %.2f",c2.getVelocidad());
		
		System.out.println("mostrando información del coche");
		c2.mostrar();
		System.out.println("el coche 1 es ");
		coche1.mostrar();
		
		coche1.setPrecio(25000);
		c2.setPrecio(82500);
		c2.setPrecio(1000);
		Coche.setImpuestos(.10);
		System.out.printf("Los iumpuesto del coche 1 son %.2f"
				+ " y del coche 2 %.2f", 
				coche1.calculaImpuestos(),c2.calculaImpuestos() );
		
		Coche.setImpuestos(.15);
		System.out.printf("\nLos iumpuesto del coche 1 son %.2f"
				+ " y del coche 2 %.2f", 
				coche1.calculaImpuestos(),c2.calculaImpuestos() );
		
		System.out.println("\nEl cche 1 es "+coche1);
		
		
		Coche c3 = new Coche("Audi","A3",180,45000,0);
		Coche c4 = new Coche();
		c4.setMarca("Audi");
		c4.setModelo("A3");
		c4.setPotencia(180);
		c4.setPrecio(45000);
		c4.setVelocidad(0);
		
		if (c3==c4) {
			System.out.println("los coches son iguales");
		} else {
			System.out.println("Los coches son distintos");
		}
		System.out.println("Coche3: "+c3+"\nCoche4: "+c4);
		
		Coche c5=c4;
		if (c5==c4) {
			System.out.println("los coches son iguales");
		} else {
			System.out.println("Los coches son distintos");
		}
		System.out.println("Coche3: "+c4+"\nCoche4: "+c5);
		
		
		if (c3.equals(c4)) {
			System.out.println("los coches son iguales");
		} else {
			System.out.println("Los coches son distintos");
		}
		System.out.println("Coche3: "+c3+"\nCoche4: "+c4);
	}

}
