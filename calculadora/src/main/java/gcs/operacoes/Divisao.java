package gcs.operacoes;

public class Divisao extends OperacaoFundamental {

	@Override
	public double calcula(double valor1, double valor2) {
		if (valor2 == 0) {
			throw new ArithmeticException("O divisor deve ser maior que 0(zero)!");
		}
		return valor1/valor2;
	}

}
