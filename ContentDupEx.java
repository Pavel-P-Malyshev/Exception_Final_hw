package hw;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ContentDupEx {
     public static void tryDuplicates(Person p, String fileName){
        
      String newPerson=p.toString(); 
      try {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line=reader.readLine();
        while(line!=null){
            line=reader.readLine();
            System.out.println("this is line: "+line);
            if(line!=null){
            if(line.equals(newPerson)) throw new RuntimeException("Record for this person already exists!");
            }
        }
        reader.close();
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
 
    }
}
