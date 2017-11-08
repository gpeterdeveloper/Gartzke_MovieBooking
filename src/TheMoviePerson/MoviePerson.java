/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheMoviePerson;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author Peter Foster Gartzke
 */
public class MoviePerson {
public   static int TicketPrice = 4;
          double FoodDeduction= 0;
   File alive= new File("computer_blow.WAV");
    
      public double getFoodDeduction()
{
     //include validation, logic, logging or whatever you like here
    return this.FoodDeduction;
}
public void setFoodDeduction(double value)
{
     //include more logic
     this.FoodDeduction = value;
}
    
      public int getTicketPrice()
{
     //include validation, logic, logging or whatever you like here
    return this.TicketPrice;
}
public void setTicketPrice(int value)
{
     //include more logic
     this.TicketPrice = value;
}
  public void speak()
    {
        PlaySound(alive);
    }
            public void PlaySound(File Sound)
    {
             try
         {
             Clip clip= AudioSystem.getClip();
             clip.open(AudioSystem.getAudioInputStream(Sound));
             clip.start();
             Thread.sleep(10);
         }
             catch(Exception e)
         {
             
         }
         
    }
}

