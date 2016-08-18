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
				
				System.out.println("=== Central P2-CG ===\n");
				System.out.println(usuario.toString());
				System.out.println("Lista de Jogos:");
				
				usuario.imprimeJogosComprados();
				System.out.println("\nTotal de preço dos jogos: R$ " + usuario.totalPrecoJogos());
				System.out.println("\n--------------------------------------------");
			
			}
		}
	}
}
