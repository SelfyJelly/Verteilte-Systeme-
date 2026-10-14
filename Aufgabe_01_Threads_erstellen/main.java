package Aufgabe_01_Threads_erstellen;
public class main {
    public static void main(String[] args) {

      /*new MachWas().start();
      (new Thread(new MachAuchWas())).start();*/

      /* Methode mit anonymer innerer Klasse
      new Thread(){
        @Override 
        public void run(){
          System.out.println("MachWas wird ausgeführt");
        }
      }.start();
       new Thread(new Runnable(){
        @Override 
        public void run(){
          System.out.println("MachAuchWas wird ausgeführt");
        }
      }).start();*/

      // Methode mit Lambda ausdrücken 
      new Thread(() -> System.out.println("MachWas wird ausgeführt")).start();
      new Thread(() -> System.out.println("MachAuchWas wird ausgeführt")).start();
    }
}
