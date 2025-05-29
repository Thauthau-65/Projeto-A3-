public class Usuario{
    // Atributo que representa o ID único do aluno (gerado pelo banco de dados)
    private int idUsuario;
    // Nome do aluno
    private String nome;
    // RA (Registro Acadêmico) do aluno, usado como identificador acadêmico
    private String email;
    // Nota do aluno (tipo double)
    private String senha;
    //Administrador
    private boolean administrador;

    // Construtor completo - usado quando todos os dados já estão disponíveis
    public Usuario(int idUsuario, String nome, String email, String senha, boolean administrador) {
        this.idAluno = idUsuario;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.administrador = administrador;
    }

    // Construtor sem ID - usado para novos cadastros (ID será gerado pelo banco)
    public Usuario(String nome, String email, String senha, boolean administrador) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public Usuario(String email, String senha) {
    this.email = email;
    this.senha = senha;

    }

 // Métodos getters - usados para acessar os valores dos atributos

    public int getIdAluno() {
        return idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public double getAdministrador() {
        return administrador;
    }

    
    // Métodos setters - usados para modificar os valores dos atributos

    public void setusuario(int idUsuario) {
        this.idUsuario = idUsuario;

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRa(String email) {
        this.email = email;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }

   
}

