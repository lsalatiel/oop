public class CartaoAmarelo extends Cartao {
    public CartaoAmarelo(int minuto, Jogador autor) {
        super(minuto, autor);
    }

    @Override
    public String toString() {
        return "CartaoAmarelo{" + "minuto=" + getMinuto() + ", autor=" + getAutor() + '}';
    }
}
