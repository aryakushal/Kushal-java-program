package p11.com;

import java.util.Scanner;

   class Parent {
private int sal; //data accessed with in class , scope is with in class
public String name;
protected int age;
int accno;

public void input() {
Scanner sc=new Scanner(System.in);

System.out.println("Enter age");
age=sc.nextInt();
System.out.println("Enter salary");
sal=sc.nextInt();
System.out.println("Enter Accno");
accno=sc.nextInt();
System.out.println("Enter name");
name=sc.next();
}
public void printSal() {
System.out.println("Salary="+sal);
}
}
class Child extends Parent{ //dependent class

void display() {
//System.out.println("sal ="+sal); //private not accesseble
System.out.println("Name="+name);
System.out.println("age="+age);
System.out.println("accno="+accno);
}
}
public class EX6Inheritence {  //indepent class

public static void main(String[] args) {

Child ob=new Child();
ob.input();
ob.display();
ob.printSal();


Parent ob1=new Parent();
System.out.println("name="+ob1.name);
System.out.println("age="+ob1.age);
System.out.println("accno"+ob1.accno);

}

}
