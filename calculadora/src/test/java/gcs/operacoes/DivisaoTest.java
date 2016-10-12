package gcs.operacoes;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DivisaoTest {

public static OperacaoFundamental divisao;
	
	@Rule
	public ExpectedException excecao = ExpectedException.none();

	@BeforeClass
	public static void init() {
		divisao = new Divisao();
	}
	
	@Test
	public void divisaoNormal() {
		Assert.assertEquals(5, divisao.calcula(10, 2), 0.0001);
	}
	
	@Test(expected=ArithmeticException.class)
	public void divisaoPorZero() {
		Assert.assertEquals(100000, divisao.calcula(1, 0), 0.00001);
	}
	
	@Test
	public void divisaoPorZeroOutraForma() {
		excecao.expect(ArithmeticException.class);
		excecao.expectMessage("O divisor deve ser maior que 0(zero)!");
		
		Assert.assertEquals(100000, divisao.calcula(1, 0), 0.00001);
	}
}
