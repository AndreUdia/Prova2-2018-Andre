package professorangoti.com.interaocomousuario.activities;

public class Preco {

    private String produto;
    private String valor;

    public Preco(){

    }

    public Preco(String valor){
        this.valor = valor;
    }

    public Preco (String produto, String valor){
        this.produto = produto;
        this.valor = valor;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
