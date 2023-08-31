public class GolsContra extends Lance {
    Time timeSofreu;
    
    public GolsContra(int minuto, Jogador autor, Time timeSofreu) {
        super(minuto, autor);
        this.timeSofreu = timeSofreu;
    }

    public Time getTimeSofreu() {
        return timeSofreu;
    }
}
