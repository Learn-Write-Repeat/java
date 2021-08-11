# POJO vs Java Beans

## POJO classes

### POJO stands for Plain Old Java Object. It is an ordinary Java object, not bound by any special restriction other than those forced by the Java Language Specification and not requiring any classpath. POJOs are used for increasing the readability and re-usability of a program. POJOs have gained the most acceptance because they are easy to write and understand. They were introduced in EJB 3.0 by Sun microsystems.

### A POJO should not:
1. Extend prespecified classes, Ex: public class GFG extends javax.servlet.http.HttpServlet { … } is not a POJO class.
2. Implement prespecified interfaces, Ex: public class Bar implements javax.ejb.EntityBean { … } is not a POJO class.
3. Contain prespecified annotations, Ex: @javax.persistence.Entity public class Baz { … } is not a POJO class.
### POJOs basically defines an entity. Like in our program, if we want an Employee class, then we can create a POJO as follows:
// Employee POJO class to represent entity Employee
```python
public class Employee
{
    String name;
    public String id;
    private double salary;
    public Employee(String name, String id,
                             double salary)
    {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public String getName()
    {
        return name;
    }
    public String getId()
    {
        return id;
    }
    public Double getSalary()
    {
        return salary;
    }
}
```
#### In the above example, there is no restriction on access-modifiers of fields. They can be private, default, protected, or the public. It is also not necessary to include any constructor in it.

### POJO is an object which encapsulates Business Logic. Following image shows a working example of POJO class. Controllers interact with your business logic which in turn interact with POJO to access the database. In this example a database entity is represented by POJO. This POJO has the same members as database entity.

![Java Beans](https://media.geeksforgeeks.org/wp-content/uploads/pojo.jpg)

## Java Beans
### **Beans are special type of Pojos. There are some restrictions on POJO to be a bean.**

1. All JavaBeans are POJOs but not all POJOs are JavaBeans.
2. Serializable i.e. they should implement Serializable interface. Still, some POJOs who don’t implement Serializable interface are called POJOs because Serializable is a marker interface and therefore not of much burden.
3. Fields should be private. This is to provide the complete control on fields.
4. Fields should have getters or setters or both.
5. A no-arg constructor should be there in a bean.
6. Fields are accessed only by constructor or getter setters.

#### Getters and Setters have some special names depending on field name. For example, if field name is someProperty then its getter preferably will be:

```python
public "returnType" getSomeProperty()
{
   return someProperty;
}
```
#### and setter will be

```python
public void setSomePRoperty(someProperty)
{
   this.someProperty=someProperty;
}
```
#### Visibility of getters and setters in generally public. Getters and setters provide the complete restriction on fields. e.g. consider below the property,

`Integer age;`
#### If we set visibility of age to the public, then any object can use this. Suppose we want that age can’t be 0. In that case, we can’t have control. Any object can set it 0. But by using the setter method, we have control. We can have a condition in our setter method. Similarly, for getter method if we want that if our age is 0 then it should return null, we can achieve this by using the getter method as in the following example:

> // Java program to illustrate JavaBeans
```python
class Bean
{
```
> private field property
```python
   private Integer property;
    Bean()
    {
```
 > No-arg constructor
    `}`

 > setter method for property
```python
    public void setProperty(Integer property)
    {
        if (property == 0)
        {
```            
 > if property is 0 return
```python
            return;
        }
        this.property=property;
    }
```    

> getter method for property
```python
    public Integer getProperty()
    {
        if (property == 0)
        {
            return null;
        }
        return property;
    }
}
```  
>  Class to test above bean
```python
public class GFG
{
    public static void main(String[] args)
    {
        Bean bean = new Bean();

        bean.setProperty(0);
        System.out.println("After setting to 0: " +
                                 bean.getProperty());

        bean.setProperty(5);
        System.out.println("After setting to valid" +
                      " value: " + bean.getProperty());
    }
}
```
### Output:-

`After setting to 0: null`
`After setting to valid value: 5`

## POJO vs Java Bean
| **POJO**	                                            | **Java Bean**                                                      |
|-------------------------------------------------------|--------------------------------------------------------------------|
| It doesn’t have special restrictions other than those | It is a special POJO which have some restrictions.                 |
| forced by Java language.	                            |                                                                    |
| It doesn’t provide much control on members.	        | It provides complete control on members.                           |
| It can implement Serializable interface.	            | It should implement serializable interface.                        |
| Fields can be accessed by their names.	            | Fields are accessed only by getters and setters.                   |
| Fields can have any visiblity.	                    | Fields have only private visiblity.                                |
| There may/may-not be a no-arg constructor.	        | It must have a no-arg constructor.                                 |
| It is used when you don’t want to give restriction on | It is used when you want to provide user your entity but only some | | your members and give user complete access of your    | part of your entity.                                               |
| entity.                                               |                                                                    |

## Conclusion:
### POJO classes and Beans both are used to define java objects to increase their readability and reusability. POJOs don’t have other restrictions while beans are special POJOs with some restrictions.
