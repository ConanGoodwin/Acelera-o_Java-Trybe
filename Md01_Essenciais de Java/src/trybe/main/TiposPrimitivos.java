package trybe.main;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20;
		byte b = 10;
		short num = 300, formatedWithUnderscore = 20_000;
		long numA = 102040;
        long numB = 102030405060L;
        
        float tipoFloatA = 2000.59f;
        float tipoFloatB = 1500.38f;
        System.out.println(tipoFloatA - tipoFloatB);
        
        double tipoDoubleA = 2000.59;
        double tipoDoubleB = 1500.38;
        System.out.println(tipoDoubleA - tipoDoubleB);
        
		int soma = a + b;
		int subtracao = a - b;
		int divisao = a / b;
		int multiplicacao = a * b;
		int restoDivisao = a % b;
		
		System.out.println(num);
		System.out.println(formatedWithUnderscore);
		
		System.out.println(numA);
        System.out.println(numB);
        
		System.out.println(soma);
		System.out.println(subtracao);
		System.out.println(divisao);
		System.out.println(multiplicacao);
		System.out.println(restoDivisao);
		
		char letraCzinha = 'c';
		char letraC = 'C';
		System.out.println(letraCzinha == letraC);
		
		boolean ehSexta = false;
		boolean ehValido = true;
		
		System.out.println(ehSexta);
		System.out.println(ehValido);
	}

}
