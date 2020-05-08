package pack1;
import pack2.Student;

public class Example {
    public static void main(String [] args){
        Student s = new Student();
        s.setRoll(123);
        s.setName("Vikash Singh");
        System.out.println("Roll no : "+ s.getRoll());
        System.out.println("Nmae :" + s.getName());
    }

}