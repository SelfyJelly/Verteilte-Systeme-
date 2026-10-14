package Aufgabe_02_Threads_Gerade_und_Ungeradezahlen_bis_100;

public abstract class AbstractZahlenDrucker implements Runnable, Zahlendrucker {
        private int grenze;
        public AbstractZahlenDrucker (int grenze){
            this.grenze = grenze;
        }
        @Override 
        public void run(){
            for(int i = 0; i < this.grenze; i++){
                if(this.akzeptiereZahl(i)){
                    this.druckeZahl(i);

                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }
        protected abstract boolean akzeptiereZahl(int zahl);

            @Override 
            public void druckeZahl(int zahl){
                System.out.println(Thread.currentThread().getName() + ": " + zahl);
            
        }
    }
