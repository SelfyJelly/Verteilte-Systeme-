package Aufgabe_01_Threads_erstellen;
public class MachAuchWas implements Runnable{
    @Override  
    public void run() {
        System.out.println("Ich mach auch was!");
    }
}
