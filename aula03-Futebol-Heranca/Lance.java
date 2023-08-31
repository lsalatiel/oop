public abstract class Lance {
    private int minuto;
    private Jogador autor;

    public Lance(int minuto, Jogador autor) {
        this.minuto = minuto;
        this.autor = autor;
    }

    public int getMinuto() {
        return minuto;
    }

    public Jogador getAutor() {
        return autor;
    }
}
