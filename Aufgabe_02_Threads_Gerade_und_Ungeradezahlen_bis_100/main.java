package Aufgabe_02_Threads_Gerade_und_Ungeradezahlen_bis_100;

public class main {
    public static void main(String[] args) {
        int grenze = 100;
        (new Thread(new GeradeZahlenDrucker(grenze))).start();
        (new Thread(new UngeradeZahlenDrucker(grenze))).start();
    }
}
