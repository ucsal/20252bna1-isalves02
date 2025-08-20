package cms.user;

public class GuestUser extends User {
	public GuestUser(int id, String nome, String email, String password) {
		setId(id);
		setNome(nome);
		setEmail(email);
		setSenha(password);
	}

	public void viewContent(int contentId) {
		/* exclusivo do visitante */ }
}
