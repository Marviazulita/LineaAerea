/**
 * Created by karim on 11/05/2016.
 */
public class Threades implements Runnable{
    String strTName;
    Thread objThread;
    int hilos;
    Threades(String strThreadNm,int h){
        strTName = strThreadNm;
        this.hilos=h;
        objThread = new Thread(this,strTName);
        System.out.println("New thread is : " + objThread);
        objThread.start();
    }//end of constructor

    public void run(){
        try{
            for(int i=5;i>0;i--){
                System.out.println(strTName + " is : " + i);
                Thread.sleep(1000);
            }//end of for loop
        }catch(InterruptedException objIE){
            System.out.println(strTName + " Interrupted");
        }//end of catch
        System.out.println(strTName + " exiting.");
    }//end of run method.
}

//Threades t2=new Threades("Hilo1");
// PrimeRun p = new PrimeRun(143);
//new Thread(p).start();
