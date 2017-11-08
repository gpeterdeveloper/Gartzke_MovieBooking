/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gartzke_moviebooking;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
/**
 *
 * @author Peter Foster Gartzke
 */
public class TheArrayList {
    private  ArrayList<String> MovieBookings = new ArrayList<String>();
   private   PrintWriter peter;
    
    public void addItem(String item){
        MovieBookings.add(item);
    }
    
    public void removeItem(String item){
        MovieBookings.remove(item);
    }
    
    
    
     public void ArrayListToTextFile() throws IOException{
        FileWriter fu = new FileWriter("MovieBookings.txt");
       peter = new PrintWriter(fu);
        for(int i =0; i< MovieBookings.size();i++){
            peter.println(MovieBookings.get(i));
        }
        peter.close();
    }
      public PrintWriter getFoodDeduction()
{
     
    return this.peter;
}
public void setFoodDeduction(PrintWriter value)
{
    
     this.peter = value;
}
    
    public void TextFileToArrayList() throws FileNotFoundException{
        Scanner input = new Scanner(new File("MovieBookings.txt"));
        while(input.hasNextLine())
            MovieBookings.add(input.nextLine());
    }
    
    public void DisplayMovieBooking(){
        
        for(int i =0; i< MovieBookings.size();i++){
            System.out.println(MovieBookings.get(i));
        }
    }
      
}
