public class ItensPedido extends Produto, Pedido {
    // Atributo que representa o ID do itens pedido (gerado pelo banco de dados)
    private int idItensPedido;
    //Quantidade de Pedido
    private int qtdPedido;

public ItensPedido(int idItensPedido, int qtdPedido){

super(idProduto);
super(idPedido);

this.idItensPedido = idItensPedido;
this.qtdPedido = qtdPedido;

}

    public int getIdItensPedido(){
        return idItensPedido;
    }
    
    public void setIdItensPedido(int idItensPedido) {
        this.idItensPedido = idItensPedido;
    }
      public int getQtdPedido() { 
        return QtdPedido; 
    }
    public void setQtdPedido(int qtdPedido) {
        this.qtdPedido = qtdPedido;
    }
 