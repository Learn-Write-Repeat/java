# Abstraction in Java
> Data Abstraction is the property by virtue of which only the essential details are displayed to the user.
> The trivial or the non-essentials units are not displayed to the user.
> Data Abstraction may also be defined as the process of identifying only the required characteristics of an object ignoring the irrelevant details. The properties and behaviors of an object differentiate it from other objects of similar type and also help in classifying/grouping the objects.
> Consider a real-life example of a man driving a car. The man only knows that pressing the accelerators will increase the speed of car or applying brakes will stop the car, but he does not know about how on pressing the accelerator the speed is actually increasing, he does not know about the inner mechanism of the car or the implementation of the accelerator, brakes, etc in the car. This is how data abstraction works.
#### Note: 
* An abstract class is a class that is declared with abstract keyword.
* An abstract method is a method that is declared without implementation.
* An abstract class may or may not have all abstract methods. Some of them can be concrete methods
* A method defined abstract must always be redefined in the subclass, thus making overriding compulsory OR either make subclass itself abstract.
* Any class that contains one or more abstract methods must also be declared with abstract keyword.
* There can be no object of an abstract class. That is, an abstract class can not be directly instantiated with the new operator.
* An abstract class can have parameterized constructors and default constructor is always present in an abstract class.
## When to use abstract classes and abstract methods
> There are situations in which we will want to define a superclass that declares the structure of a given abstraction without providing a complete implementation of every method.
> That is, sometimes we will want to create a superclass that only defines a generalization form that will be shared by all of its subclasses, leaving it to each subclass to fill in the details.
## Example:
> Consider a classic “shape” example, perhaps used in a computer-aided design system or game simulation. The base type is “shape” and each shape has a color, size and so on. From this, specific types of shapes are derived(inherited)-circle, square, triangle and so on — each of which may have additional characteristics and behaviors. For example, certain shapes can be flipped. Some behaviors may be different, such as when you want to calculate the area of a shape. The type hierarchy embodies both the similarities and differences between the shapes.
![](https://media.geeksforgeeks.org/wp-content/uploads/Abstract-classes-and-methods-Page-1.png)

## Advantages of Abstraction
1. It reduces the complexity of viewing the things.
2. Avoids code duplication and increases reusability.
3. Helps to increase security of an application or program as only important details are provided to the user.
