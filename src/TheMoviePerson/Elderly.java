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
public class Elderly extends MoviePerson{
    int TicketPrice = 4;
       public static    double FoodDeduction= 0.03;
   File awesome= new File("crash.WAV");
   
      @Override
   public void speak()
    {
        PlaySound(awesome);
    }

    /**
     *
     * @param Sound
     */
    @Override
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