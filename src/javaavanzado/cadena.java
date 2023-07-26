package javaavanzado;

public class cadena {
	
	public static void main (String []argumentos) {
	
String cadena = "Hola jose,buenos díaas,que tengas un buen día";
	String cadenaB = "Estamos comiendo una sopa muy deliciosa";
	
	int b;
	int buscar = 20 ;
	b = cadena.indexOf((int) 'F',buscar);
	System.out.println(b);
	
	int x;
	x = cadenaB.indexOf((int) 'Y' );
	System.out.println(x);
	
	x=cadenaB.lastIndexOf("muy");
	System.out.println("x");
	
	}
}

