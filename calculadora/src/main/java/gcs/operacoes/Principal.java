package gcs.operacoes;

public class Principal {

	public static void main(String[] args) {
		OperacaoFundamental soma = new Soma();
		Long dois = 2L;
		Long tres = 3L;
		System.out.println("A soma de " + dois + "+" + tres + " = " + soma.calcula(dois, tres));
	}

}
