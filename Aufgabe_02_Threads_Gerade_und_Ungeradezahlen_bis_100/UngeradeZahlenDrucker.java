package Aufgabe_02_Threads_Gerade_und_Ungeradezahlen_bis_100;

public class UngeradeZahlenDrucker extends AbstractZahlenDrucker {
    public UngeradeZahlenDrucker(int grenze){
        super(grenze);
    }
      protected boolean akzeptiereZahl(int zahl){
        return zahl % 2 == 0;
    }
}
