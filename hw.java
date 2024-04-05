package hw;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class hw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pls add data in format: Фамилия Имя Отчество дата_рождения номер_телефона пол : ");
        String data=scanner.nextLine();
        String[] input = data.split(" ");
        
        //проверяем что введено не более шести блоков данных, каждый без пробелов, если нет - боросам исключение
        if(input.length>6)  throw new RuntimeException("No extra fields allowed except suggested 6!");
        
        
        MySurnameEx.trySurename(input[0]); 
        MySurnameEx.trySurename(input[1]);
        MySurnameEx.trySurename(input[2]);
        BirthdayFormatEx.tryBirthday(input[3]);
        PhoneFormatEx.tryPhone(input[4]);

        if(!input[5].equals("m") && !input[5].equals("f")) {
            throw new IllegalArgumentException("Expected gender shall be 'm' or 'f'!");
        }

        Person p=new Person(input[0], input[1], input[2], input[3], input[4], input[5]);

        String fileName=input[0]+".txt";
        try (FileWriter fw = new FileWriter(fileName,true)){
            ContentDupEx.tryDuplicates(p, fileName);
            fw.write(p.toString()+"\n");
            fw.flush();
        } catch (IOException e){
            e.printStackTrace();
        }
    
    
    }
}
