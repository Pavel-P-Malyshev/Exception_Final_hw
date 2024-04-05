package hw;

public class PhoneFormatEx {
    

    //проверка формата телефона, проверяем что нет плюсов, дефисов. Если есть - бросаем исключение
    public static void tryPhone(String phone){
        
        
        int pphone=0;

        try {
            pphone=Integer.parseInt(phone);
        } catch (IllegalArgumentException e) {
            // TODO Auto-generated catch block
            throw new RuntimeException("pls enter correct phone number (w/o plus or hypen): ");
        }
        
        
    }
}
