package hw;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BirthdayFormatEx {
    
    //дата _ рождения - строка формата dd.mm.yyyy, если формат не соотвествует - бросам исключение
     public static void tryBirthday(String birthday){
        
        DateFormat df=new SimpleDateFormat("dd.mm.yyyy");
        Date birthDate=null;

        try {
            df.setLenient(false);
            birthDate=df.parse(birthday);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            throw new RuntimeException("Pls enter birthday date in format dd.mm.yyyy");
        }
        
        
    }
}
