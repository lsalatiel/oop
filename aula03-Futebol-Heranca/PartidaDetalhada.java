import java.util.List;
import java.util.LinkedList;

public class PartidaDetalhada extends Partida {
    private List<Lance> lances = new LinkedList<Lance>();

    public PartidaDetalhada(Time timeA, Time timeB) {
        super(timeA, timeB);
    }

    public void addLance(Lance l) {
        lances.add(l);
    }

    public List<Lance> getLances() {
        return new LinkedList<Lance>(lances);
    }
}
