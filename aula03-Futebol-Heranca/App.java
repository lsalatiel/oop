public class App {
    public static void main(String[] args) {
        Time fla = new Time("Flamengo");
        Time flu = new Time("Fluminense");

        PartidaDetalhada pd = new PartidaDetalhada(fla, flu);

        pd.incGolsTimeA();
        pd.incGolsTimeA();

        Campeonato c = new Campeonato();
        c.adicionaPartida(pd);

        Jogador j1 = new Jogador("Jogador1");

        Gols gol1 = new Gols(20, j1, fla, flu);
        pd.addLance(gol1);

        Gols gol2 = new Gols(45, j1, fla, flu);
        pd.addLance(gol2);

        for(Partida p : c.getPartidas()) {
            p.getTimeB().incNumeroTitulosMundiais();
            p.imprimePartida();
        }
    }
}
