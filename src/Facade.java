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
	
	public void adicionaDinheiro(String nomeLogin, double dinheiro){
		for(int i = 0; i < this.usuario.size(); i++){
			if(this.usuario.get(i).getNomeLogin().equals(nomeLogin)){
				this.usuario.get(i).adicionarDinheiro(dinheiro);
			}
		}
	}
	
	public void vendeJogo(Jogo jogo, String nomeLogin){
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
				//System.out.println(usuario.getX2p());
				System.out.println("=== Central P2-CG ===\n");
				System.out.println(usuario.toString());
				System.out.println("Lista de Jogos:");
				
				usuario.imprimeJogosComprados();
				System.out.println("\nTotal de pre�o dos jogos: R$ " + usuario.totalPrecoJogos());
				System.out.println("\n--------------------------------------------");
			
			}
		}
	}
	
	public void upgrade(String nomeLogin){
		for (Usuario usuario2 : usuario) {
			if(usuario2.getNomeLogin().equals(nomeLogin)){
				if(usuario2 instanceof UsuarioNoob && usuario2.getX2p() > 1000){
					Usuario novoUsuario = new UsuarioVeterano(usuario2.getNome(),usuario2.getNomeLogin(),usuario2.getQtdDinheiro());
					
					for(int i = 0; i < usuario2.sizeJogosComprados(); i++){
						novoUsuario.setJogosComprados(usuario2.getJogosComprados());
					}
				
					
					int indice = usuario.indexOf(usuario2);
					usuario.remove(indice);
					usuario.add(novoUsuario);
					
					
				}
			}
		}
		
	}
}
