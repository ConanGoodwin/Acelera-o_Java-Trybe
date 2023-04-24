package trybe.main;

public class TiposNaoPrimitivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase = "Estou apredendo Java na Trybe";
		String numeros = "56432";
		String caracter = "a";
		String var1;
		
		String vamos = "Vamos", aprender = " aprender", java = " Java?";
		String fraseCompleta = vamos + aprender + java;
		System.out.println(fraseCompleta);
		
		StringBuilder strBuilder = new StringBuilder();
		String estou = "Estou";
		String aprendendo = " aprendendo";
		String a = " a";
		String usar = " usar";
		String stringB = " stringBuilder";
		String em = " em";
		String java2 = " Java";
		
		StringBuilder frase2 = strBuilder.append(estou)
				.append(aprendendo)
				.append(a)
				.append(usar)
				.append(stringB)
				.append(em)
				.append(java2);
		
		System.out.println(frase2);
		
		StringBuilder frase3 = strBuilder.replace(23, 37, " Tipos Primitivos e Strings");
		System.out.println(frase3);
		
		double[] arrayDouble = new double[9];
		arrayDouble[0] = 200.00;
		arrayDouble[1] = 985.54;
		arrayDouble[2] = 11111.23;
		arrayDouble[3] = 349.89;
		arrayDouble[4] = 244.97;
		arrayDouble[5] = 567.09;
		arrayDouble[6] = 456.23;
		arrayDouble[7] = 9784.66;
		arrayDouble[8] = 345.98;
		
		System.out.println(arrayDouble[8]);
		System.out.println(arrayDouble[2]);
		
//		arrayDouble[9] = 55.98; // indice 9 estoura a pilha
		String[] arrayDeStrings = {"na Trybe", "Partiu ", "Java ", "aprender "};
		int[][] matriz = new int[2][3];
		int[] arrayDeInteiros = { 10, 20, 30 };
		
		matriz[0][0] = 10;
		matriz[1][0] = 20;
		
		System.out.println(arrayDeStrings[1] + arrayDeStrings[3] + arrayDeStrings[2] + arrayDeStrings[0]);
		System.out.println(matriz[0][0]);
		System.out.println(matriz[1][2]);
		System.out.println(arrayDeInteiros.length);
	}

}
