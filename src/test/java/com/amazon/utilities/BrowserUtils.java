package com.amazon.utilities;

public class BrowserUtils {

        public static void wait(int sec){
            try {
                Thread.sleep(1000 * sec);
            } catch (InterruptedException e) {
                System.out.println("Interrupted exception caught");
            }
        }

}
