package userhjh;

public class UseStudent{
public static void main(String[] args){

//creating objects of both subclasses by passing the student name
FullTime ft = new FullTime("Jack");
PartTime pt = new PartTime("Jenny");
System.out.println("The full-time student "+ft.name+" paying a flat fee of $"+ft.tuitionFee());
System.out.println("The part-time student "+pt.name+" paying $"+pt.tuitionFee()+" per credit hour");
}
}