

public class Contador {
	public String ContaPares(int num){
		int i;
		String texto = "n�meros pares";
		for(i = 0; i<= num; i = i+2){
			System.out.println(i);
		}
		return texto;
	}
	
	public String ContaImpares(int num){
		int i;
		String texto = "n�meros impares";
		for(i = 1; i<= num; i = i+2){
			System.out.println(i);
		}
		return texto;
	}
	public String ContaTudo(int num){
		int i;
		String texto = "n�meros";
		for(i = 0; i<= num; i++){
			System.out.println(i);
		}
		return texto;
	}
	
	
}
