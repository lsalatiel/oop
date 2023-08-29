import java.util.LinkedList;

public class Campeonato {
    private LinkedList<Partida> partidas = new LinkedList<Partida>();

    public void addPartida(Partida p) {
        partidas.add(p);
    }
    public Partida getPartida(int i) {
        return partidas.get(i);
    }
    public LinkedList<Partida> getPartidas() {
        return new LinkedList<Partida>(partidas);
    }
    public static void printPartida(Partida p) {
        p.printPlacar();
    }
}