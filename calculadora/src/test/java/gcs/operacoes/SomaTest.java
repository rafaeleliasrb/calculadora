package gcs.operacoes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SomaTest {

	private static OperacaoFundamental soma;
	private static double resultado;

	@BeforeClass
	public static void init() {
		soma = new Soma();
	}

	@Before
	public void inicializaResultado() {
		resultado = 0;
	}
	
	@Test
	public void somaNormal() {
		resultado++;
		assertEquals(5, soma.calcula(2, 3), 0.0000001);
		assertEquals(1, resultado, 0.0001);
	}
	
	@Test
	public void somaSinaisDiferentes() {
		resultado++;
		assertEquals(-1, soma.calcula(5, -6), 0.000001);
		assertEquals(1, resultado, 0.0001);
	}
}
