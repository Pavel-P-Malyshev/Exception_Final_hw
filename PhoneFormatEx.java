package hw;

public class PhoneFormatEx {
    
    public static void tryPhone(String phone){
        
        
        int pphone=0;

        try {
            pphone=Integer.parseInt(phone);
        } catch (IllegalArgumentException e) {
            // TODO Auto-generated catch block
            throw new RuntimeException("pls enter correct phone number (w/o plus,hypen or indents): ");
        }
        
        
    }
}
