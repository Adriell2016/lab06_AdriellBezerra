import java.util.ArrayList;


public class Facade {

	private ArrayList<Usuario> usuario = new ArrayList<Usuario>();

	public ArrayList<Usuario> getUsuario() {
		return usuario;
	}

	public void setUsuario(ArrayList<Usuario> usuario) {
		this.usuario = usuario;
	}
}
