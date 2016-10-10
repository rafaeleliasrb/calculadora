package gcs.operacoes;

public class Multiplicacao extends OperacaoFundamental {

	@Override
	public double calcula(double valor1, double valor2) {
		/*double resultado = 0;
		for(int i=0; i<valor2; i++) {
			resultado+=valor1;
		}
		return resultado;*/
		
		return valor1*valor2;
	}

}
