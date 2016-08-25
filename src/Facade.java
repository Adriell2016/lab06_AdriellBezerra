/* 115110099 - Adriell de Sousa Bezerra: LAB 6 - Turma Raquel */

import java.util.ArrayList;


public class Facade {

	private ArrayList<Usuario> usuario = new ArrayList<Usuario>();

	public ArrayList<Usuario> getUsuario() {
		return usuario;
	}

	public void setUsuario(ArrayList<Usuario> usuario) {
		this.usuario = usuario;
	}
	
	public void adicionaUsuario(Usuario usuario){
		this.usuario.add(usuario);
		
	}
	
	public void verStringNulaOuVazia(String s) throws Exception{
		if(s.trim().equals("") || s == null){
			Exception e = new Exception("Nome de Login vazio ou nulo");
			throw e;
		}
	}
	
	public void adicionaDinheiro(String nomeLogin, double dinheiro) throws Exception{
		verStringNulaOuVazia(nomeLogin);
		
		for(int i = 0; i < this.usuario.size(); i++){
			if(this.usuario.get(i).getNomeLogin().equals(nomeLogin)){
				this.usuario.get(i).adicionarDinheiro(dinheiro);
			}
		}
	}
	
	public void vendeJogo(Jogo jogo, String nomeLogin) throws Exception{
		verStringNulaOuVazia(nomeLogin);
		for(int i = 0; i < this.usuario.size(); i++){
			if(this.usuario.get(i).getNomeLogin().equals(nomeLogin)){
				if(this.usuario.get(i).getQtdDinheiro() >= jogo.getPreco()){
					this.usuario.get(i).comprarJogo(jogo);
				}
			}
		}
	}
	
	public void imprimeInformacoes(Usuario usuario){
		for(int i = 0; i < this.usuario.size(); i++){
			if(this.usuario.get(i).equals(usuario)){
				System.out.println("=== Central P2-CG ===\n");
				System.out.println(usuario.toString());
				System.out.println("Lista de Jogos:");
				
				usuario.imprimeJogosComprados();
				System.out.println("\nTotal de preï¿½o dos jogos: R$ " + usuario.totalPrecoJogos());
				System.out.println("\n--------------------------------------------");
			
			}
		}
	}
	
	public Usuario upgrade(String nomeLogin) throws Exception{
		verStringNulaOuVazia(nomeLogin);
		Usuario retorno = null;
		for (Usuario usuario2 : usuario) {
			if(usuario2.getNomeLogin().equals(nomeLogin)){
				if(usuario2 instanceof UsuarioNoob && usuario2.getX2p() > 1000){
					Usuario novoUsuario = new UsuarioVeterano(usuario2.getNome(),usuario2.getNomeLogin(),usuario2.getQtdDinheiro());
					novoUsuario.setJogosComprados(usuario2.getJogosComprados());
					int indice = usuario.indexOf(usuario2);
					usuario.remove(indice);
					usuario.add(novoUsuario);
					retorno = novoUsuario;
					break;
					
				}else{
					retorno = usuario2;
				}
			}
		}
		return retorno;
		
	}


	public void exceptionUsuario(){
		//Testa construtor
		try {
			@SuppressWarnings("unused")
			Usuario usuario = new UsuarioNoob("", "adriell.bezerra", 1000.00);
			
		} catch (Exception e) {
			
			System.out.println("Nome vazio ou nulo.");
			
		}
	
		try {
			@SuppressWarnings("unused")
			Usuario usuario2 = new UsuarioVeterano(null, "adriell.sousa", 2000.00);
			
		} catch (Exception e) {
			
			System.out.println("Nome vazio ou nulo.");
			
		}
		
		try {
			@SuppressWarnings("unused")
			Usuario usuario3 = new UsuarioVeterano("Aryelle", "", 2000.00);
		} catch (Exception e) {
			
			System.out.println("Nome de login vazio ou nulo.");
		}
		
		try {
			@SuppressWarnings("unused")
			Usuario usuario4 = new UsuarioVeterano("Aryelle", null, 2000.00);
		} catch (Exception e) {
			
			System.out.println("Nome de login vazio ou nulo.");
		}
		
		
		//Testa o método registraJogada
		try {
			Usuario usuario5 = new Usuario("Didiu", "didiu.mestre", 23094);
			Jogo jogo = new Jogo("matrix", 200.00);
			usuario5.registraJogada(jogo, -5, true);
		}catch (Exception e) {
			
			System.out.println("Score menor do que 0.");
		}
		try {
			Usuario usuario6 = new Usuario("Didiu", "didiu.mestre", 23094);
			Jogo jogo = new JogoLuta("matrix", 200.00);
			usuario6.registraJogada(jogo, 20000000, true);
		}catch (Exception e) {
			
			System.out.println("Score alcancado maior que 100000.");
		}
		
	}
	
	public void exceptionJogo(){
		//Testa construtor
		try {
			@SuppressWarnings("unused")
			Jogo jogo2 = new Jogo("", 308);
			
		}catch (Exception e) {
			
			System.out.println("Nome do Jogo vazio ou nulo");
		}
		
		try {
			@SuppressWarnings("unused")
			Jogo jogo2 = new Jogo(null, 308);
			
		}catch (Exception e) {
			
			System.out.println("Nome do Jogo vazio ou nulo");
		}
		
		try {
			@SuppressWarnings("unused")
			Jogo jogo2 = new Jogo("Mortal Combat", -87);
		}catch (Exception e) {
			
			System.out.println("Preco inferior a 0.");
		}
	
	}
	
	public void exceptionFacade(Usuario usuario, Jogo jogo){
		try {
			Facade facade = new Facade();
			usuario.comprarJogo(jogo);
			facade.adicionaUsuario(usuario);
			facade.adicionaDinheiro("", 200.00);
		} catch (Exception e) {
			
			System.out.println("Nome de Login nulo ou vazio");
		}
	
		try {
			Facade facade2 = new Facade();
			usuario.comprarJogo(jogo);
			facade2.adicionaUsuario(usuario);
			facade2.adicionaDinheiro(null, 200.00);
		} catch (Exception e) {
			
			System.out.println("Nome de Login nulo ou vazio");
		}
	
		try {
			Facade facade = new Facade();
			usuario.comprarJogo(jogo);
			facade.adicionaUsuario(usuario);
			facade.adicionaDinheiro("adriell.super", -1.00);
		} catch (Exception e) {
			
			System.out.println("Quantidade negativa");
		}
	
		try {
			Facade facade3 = new Facade();
			usuario.comprarJogo(jogo);
			facade3.adicionaUsuario(usuario);
			facade3.vendeJogo(jogo, "");
		} catch (Exception e) {
			
			System.out.println("Nome de Login nulo ou vazio");
		}
	
		try {
			Facade facade4 = new Facade();
			usuario.comprarJogo(jogo);
			facade4.adicionaUsuario(usuario);
			facade4.vendeJogo(jogo, null);
		} catch (Exception e) {
			
			System.out.println("Nome de Login nulo ou vazio");
		}
		
		try {
			Facade facade5 = new Facade();
			usuario.comprarJogo(jogo);
			facade5.adicionaUsuario(usuario);
			facade5.upgrade("");
		} catch (Exception e) {
			
			System.out.println("Nome de Login nulo ou vazio");
		}
		
		try {
			Facade facade5 = new Facade();
			usuario.comprarJogo(jogo);
			facade5.adicionaUsuario(usuario);
			facade5.upgrade(null);
		} catch (Exception e) {
			
			System.out.println("Nome de Login nulo ou vazio");
		}
	
	}
		
}
