public class SampleThread extends Thread{

    @Override
    public void run() {
        super.run();
        for(int i=0;i<10;i++){
            System.out.println("Thread count"+i);
            try{
                Thread.sleep(1000);

            }
            catch (InterruptedException e){
                e.printStackTrace();
            }

        }
    }
}

public class Hello {
   public static void main(String[] args) {
       SampleThread st=new SampleThread();
       st.start();


       SampleThread st1=new SampleThread();
       st1.start();
       SampleThread st2=new SampleThread();
       st2.start();
       SampleThread st3=new SampleThread();
       st3.start();
       SampleThread st4=new SampleThread();
       st4.start();
       SampleThread st5=new SampleThread();
       st5.start();


    }
}
