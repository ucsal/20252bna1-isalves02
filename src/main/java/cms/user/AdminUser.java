package cms.user;

public class AdminUser extends User {
	public AdminUser(int id, String nome, String email, String senha) {
		setId(id);
		setNome(nome);
		setEmail(email);
		setSenha(senha);
	}

	public void deleteContent(int contentId) {
		/* exclusivo do admin */ }
}
