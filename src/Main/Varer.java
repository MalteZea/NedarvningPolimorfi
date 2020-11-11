package Main;

import java.util.Date;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 09/11/2020
 */

public class Varer {

   public double stykpris;
   public Date holdbarhed;
   public boolean kanSælges = true;

  public void smidUd() {
        kanSælges = false;
    }

}
