package cms.user;

public class EditorUser extends User {
	public EditorUser(int id, String nome, String email, String password) {
		setId(id);
		setNome(nome);
		setEmail(email);
		setSenha(password);
	}

	public void editContent(int contentId, String body) {
		/* exclusivo do editor */ }
}
