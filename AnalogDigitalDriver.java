/*
 * Project: AnlogDigitalDriver.java
 * Description: Creates BWTVs and HDTVs
 * Name: Jaehyung Lim
 * Date: Nov 6, 2015
 */

import java.util.ArrayList;

public class AnalogDigitalDriver {
  
  public static void main( String[] args ) {
    
    BWTV bw = new BWTV();
    HDTV hd = new HDTV();
    
    //ArrayList tvs = new ArrayList();
    //tvs.push( bw );
    //tvs.push( hd );
    
    System.out.println( bw.tvTYPE() );
    System.out.println( bw.rotateRabbitEars() );
    System.out.println();
    System.out.println( hd.tvTYPE() );
    System.out.println( hd.connectHDMI() );
  } // end main method
} // end class AnalogDigitalDriver