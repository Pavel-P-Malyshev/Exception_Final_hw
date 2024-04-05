package hw;

public class Person {
    String SecName;
    String FirstName;
    String Patronimic;
    String bithdate;
    String phone;
    String gender;

    public Person(String s, String f, String P, String b, String p, String g) {
        this.SecName=s;
        this.FirstName=f;
        this.Patronimic=P;
        this.bithdate=b;
        this.phone=p;
        this.gender=g;
    }

    @Override
    public String toString(){
        return String.format("<%s><%s><%s><%s><%s><%s>", SecName, FirstName,Patronimic,bithdate,phone,gender);
    }
}
