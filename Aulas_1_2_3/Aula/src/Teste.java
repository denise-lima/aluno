
public class Teste {
	public static void main(String[] arg) {
		
		Fila.adiciona(1);
		Fila.adiciona(2);
		Fila.adiciona(3);
		
		System.out.println(Fila.print(Fila.iRPos));
		System.out.println("\n");
		
		Fila.remove();
		Fila.adiciona(5);

		
		System.out.println(Fila.print(Fila.iRPos));
	
		
	}
}
