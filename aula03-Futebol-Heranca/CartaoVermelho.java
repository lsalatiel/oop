public class CartaoVermelho extends Cartao {
    public CartaoVermelho(int minuto, Jogador autor) {
        super(minuto, autor);
    }

    @Override
    public String toString() {
        return "CartaoVermelho{" + "minuto=" + getMinuto() + ", autor=" + getAutor() + '}';
    }
}
