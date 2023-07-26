package javaavanzado;

public class instanceof_pertenece {
	public static void main (String []argumentos) {
	Number numero = 9.9F;
	
	if( numero instanceof Float) {
		System.out.println("Flotante");
	}
	
	if( numero instanceof Double) {
		System.out.println("Double");
	
	}
	if( numero instanceof Integer) {
		System.out.println("Entero");

}
}
}
