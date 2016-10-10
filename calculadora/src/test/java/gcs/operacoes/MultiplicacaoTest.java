package gcs.operacoes;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class MultiplicacaoTest {

	private static OperacaoFundamental multiplicacao;
	
	@BeforeClass
	public static void init() {
		multiplicacao = new Multiplicacao();
	}
	
	@Test
	public void multiplicacaoPositivos() {
		Assert.assertEquals(10, multiplicacao.calcula(5, 2), 0.00001);
	}
}
