package hw;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MySurnameEx  {


    // проверка имени на содержание цифр, если в имени есть цифра - бросаем исключение
  public static void trySurename(String sureName){
        Pattern pat=Pattern.compile("\\d+");
        Matcher match=pat.matcher(sureName);
        if(match.find()) throw new RuntimeException("Name cannot contain digits!");
    }
}
