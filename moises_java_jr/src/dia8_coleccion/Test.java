package dia8_coleccion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
 public static void main(String[] args) {
	 //lista de productos
	 List<Producto> productos;
	 productos = new ArrayList<>();
	 Producto p1 = new Producto(1, "Laptop", 1200);
	 productos.add(p1);
	 productos.add(new Producto(2, "Mouse", 25.50));
	 productos.add(new Producto(3, "Teclado", 45.0));
	 //imprimir
	 for(Producto p:productos) {
		 System.out.println(p.toString());
	 }
	 
	 System.out.println("Ingrese el codigo a buscar: ");
	 Scanner sc = new Scanner(System.in);
	 int codigoBuscado = sc.nextInt();
	 sc.close();
	 boolean existe = false;
	 for(Producto p:productos) {
		 if(p.getCodigo() == codigoBuscado) {
			 System.out.println(p);
			 existe = true;
			 break;
		 }
	 }
	 if(!existe) {
		 System.out.println("Producto no existe");
	 }
	 
	 // Eliminar un producto
	 System.out.println("Eliminar producto 1");
	 productos.removeIf(p -> p.getCodigo() == 1);
	 //
	 //imprimir
	 for(Producto p:productos) {
		 System.out.println(p.toString());
	 }
	 
	 
 }
}
