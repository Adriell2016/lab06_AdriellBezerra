public enum Jogabilidade {
	
	//ONLINE, OFFLINE, MULTIPLAYER, COOPERATIVO, COMPETITIVO;
	
	
	ONLINE(1), OFFLINE(2), MULTIPLAYER(3), COOPERATIVO(4), COMPETITIVO(5);
	private final int valor;
	Jogabilidade(int valorOpcao){
		valor = valorOpcao;
	}
	public int getValor(){
		return valor;
	}
	

}
