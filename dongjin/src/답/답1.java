package ´ä;

class InterruptTest extends Thread {

    public void run() {

        for( int i = 0; i < 3; i++ )

            System.out.println( i+1 + ". before sleep..." );

 

        try {

            sleep(1000);

        } catch( InterruptedException e ) {

            System.out.println( "InterruptedException ¹ß»ý" );

        }

    }
}
