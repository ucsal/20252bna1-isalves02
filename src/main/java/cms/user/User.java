package cms.user;

public abstract class User {
    private int id;
    private String nome;
    private String email;
    private String senha;

    public User() {
        this.id = 0;
        this.nome = "";
        this.email = "";
        this.senha = "";
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return this.senha;
    }

    public boolean checkPassword(String senha) {
        return this.senha.equals(senha);
    }
}
