// Classe modelo que representa os dados de um aluno
public class Categoria{
    // Atributo que representa o ID da categoria (gerado pelo banco de dados)
    private int idCategoria;
    // Nome da categoria
    private String nomeCategoria;
 
    // Construtor completo - usado quando todos os dados já estão disponíveis
    public Categoria(int idCategoria, String nomeCategoria) {
        this.idCategoria = idCategoria;
        this.nomeCategoria = nomeCategoria;
      
    }

     // Construtor sem ID - usado para novos cadastros (ID será gerado pelo banco)
    public Categoria(String nomeCategoria){
       this.nomeCategoria = nomeCategoria;
    }

    // Métodos getters - usados para acessar os valores dos atributos

    public int getIdCategoria() {
        return idCategoria;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    // Métodos setters - usados para modificar os valores dos atributos

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }
}