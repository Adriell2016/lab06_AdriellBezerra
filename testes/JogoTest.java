import static org.junit.Assert.*;

import org.junit.Test;


public class JogoTest {
	
	@Test
	public void testRegistraJogada() throws Exception {
		Jogo jogo = new JogoLuta("GTA", 100);
		jogo.registraJogada(100, true);
		assertEquals(100, jogo.getMaiorScore());
		assertEquals(1, jogo.getQuantasVezesZerou());
	}
	
	@Test
	public void testJogabilidade() throws Exception{
		Jogo jogo = new JogoLuta("GTA", 100);
		jogo.Jogabilidade(Jogabilidade.COMPETITIVO);
		jogo.Jogabilidade(Jogabilidade.COMPETITIVO);
		String s = jogo.imprimeEnums();
		assertEquals(" COMPETITIVO", s);
	}
	
	@Test
	public void testEquals() throws Exception{
		Jogo jogo = new JogoLuta("GTA", 100);
		Jogo jogo2 = new JogoLuta("Half Life", 100);
		assertTrue(jogo.equals(new JogoLuta("GTA", 100)));
		assertFalse(jogo.equals(jogo2));
	}
	
	

}
