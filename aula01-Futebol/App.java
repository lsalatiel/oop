public class App {
    public static void main(String[] args) {
        Time fla = new Time("Flamengo");
        Time flu = new Time("Fluminense");

        fla.addTitulo();

        Partida p = new Partida(fla, flu);

        p.addGolsTime1();
        p.addGolsTime1();
        p.addGolsTime2();

        System.out.println("Time 1: " + p.getTime1().getNome());
        System.out.println("Time 2: " + p.getTime2().getNome());
        System.out.println("Titulos Time 1: " + p.getTime1().getTitulosMundiais());
        System.out.println("Titulos Time 2: " + p.getTime2().getTitulosMundiais());

        System.out.println(p.getGolsTime1());
        System.out.println(p.getGolsTime2());

        p.printPlacar();

        Campeonato c = new Campeonato();
        c.addPartida(p);

        Time vasco = new Time("Vasco");
        c.addPartida(new Partida(fla, vasco));

        c.getPartida(0).printPlacar();

        for(Partida partida : c.getPartidas()) {
            partida.printPlacar();
        }
    }
}
