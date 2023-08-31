public class Gols extends Lance {
    private Time timeSofreu;
    private Time timeMarcou;

    public Gols(int minuto, Jogador autor, Time timeMarcou, Time timeSofreu) {
        super(minuto, autor);
        this.timeSofreu = timeSofreu;
        this.timeMarcou = timeMarcou;
    }

    public Time getTimeMarcou() {
        return timeMarcou;
    }

    public Time getTimeSofreu() {
        return timeSofreu;
    }
}
