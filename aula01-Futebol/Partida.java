public class Partida {
    private Time time1;
    private Time time2;
    private int[] gols = new int[2];

    public Partida(Time time1, Time time2) {
        this.time1 = time1;
        this.time2 = time2;
    }

    public Time getTime1() {
        return time1;
    }
    public Time getTime2() {
        return time2;
    }

    public int getGolsTime1() {
        return gols[0];
    }
    public int getGolsTime2() {
        return gols[1];
    }

    public void addGolsTime1() {
        gols[0]++;
    }
    public void addGolsTime2() {
        gols[1]++;
    }

    public void printPlacar() {
        System.out.println(time1.getNome() + " " + gols[0] + "X" + gols[1] + " " + time2.getNome());
    }
}
