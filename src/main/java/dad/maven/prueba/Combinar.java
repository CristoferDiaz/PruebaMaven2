package dad.maven.prueba;

public class Combinar {
	
	public static String combinar (Object[] cambiar) {
		String devuelve= "\"";
		int i;
		for (i= 0; i < cambiar.length-1; i++) {
			devuelve += cambiar[i].toString() + " ";
		}
		devuelve += cambiar[i].toString() + "\"";
		return devuelve;
		
	}
	
	public static void main(String[] args) {
		
		String salida;
		Object[] cambiar = new Object[] {"Hola", 3456 , "ddd"};
		salida = combinar(cambiar);
		System.out.println(salida);
	}

}
