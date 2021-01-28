package academy.LearnProgramming;





public abstract class Main {




    public static void main(String[] args) {
        System.out.println("Clock starting");

        boolean clockrunning = true;
        int seconds = 0;
        int minutes = 0;
        int hours = 0;

            while(clockrunning == true){
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println(hours + " : " + minutes  + " : "  + seconds);
                seconds ++;
                if(seconds == 60){
                    minutes ++;
                    seconds = 0;
                }if (minutes == 60){
                    hours++;
                    minutes = 0;
                }



                    }
                }
            }










