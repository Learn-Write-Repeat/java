# Getters and setters are used to protect your data, particularly when creating classes.

### For each instance variable, a getter method returns its value while a setter method sets or updates its value. Given this, getters and setters are also known as accessors and mutators, respectively.
### By convention, getters start with the word "get" and setters with the word "set", followed by a variable name. In both cases the first letter of the variable's name is capitalized:

```python
  public class Vehicle {
  private String color;
```  
  > Getter
```python
    public String getColor() {
    return color;
  }
```  
  > Setter
```python
    public void setColor(String c) {
    this.color = c;
  }
}
```
### The getter method returns the value of the attribute. The setter method takes a parameter and assigns it to the attribute.
### Once the getter and setter have been defined, we use it in our main:

```python
  public static void main(String[] args) {
  Vehicle v1 = new Vehicle();
  v1.setColor("Red");
  System.out.println(v1.getColor());
}
```
> Outputs "Red"
### Getters and setters allow control over the values. We may validate the given value in the setter before actually setting the value.

### Why use getters and setters?
### Getters and setters allow us to control how important variables are accessed and updated in our code. For example, consider this setter method:

```python
  public void setNumber(int number) {
  if (number < 1 || number > 10) {
    throw new IllegalArgumentException();
  }
  this.number = num;
}
```
### By using the setNumber method, we can be sure the value of number is always between 1 and 10. This is much better than updating the number variable directly:

`obj.number = 13;`

### If we update number directly, it's possible that we'll cause unintended side effects somewhere else in our code. Here, setting number to 13 violates the 1 to 10 constraint we want to establish.

### Making number a private variable and using the setNumber method would prevent this from happening.

### On the other hand, the only way to read the value of number is by using a getter method:

```python
  public int getNumber() {
  return this.number;
}
```


```python

```
