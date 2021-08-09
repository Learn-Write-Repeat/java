class Person{       // parent class
private String name;
private int id;

public Person(String name,int id)       // constructor of parent class
{
this.name=name;
this.id=id;

}
public void show()
{
System.out.println("Name : " +name);
System.out.println("Id : " +id);
}
}

class Teacher extends Person        // child class extending properties of parent class
{
private double salary;

public Teacher(String name,int id,double salary)
{
super(name,id);         // takes properties of super class
this.salary=salary;
}

public void show()
{
super.show();
System.out.println("Salary: " +salary);
}}

class Inheritance{              // main class
public static void main(String args[])
{
Teacher t=new Teacher("Amit",10,40000); // object of the child class which extends parent class
t.show();
System.out.println("");

}
} 