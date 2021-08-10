# Strict Typing

### **Strictly typed languages require that all data that is interacted with be typed.**

```java
int i = 3
string s = "4"
```

> From now on, whenever you use I you will only be able to interact with it as an integer type. That means you can only use it with methods that work with integers.

> Strings can only be interacted with as string types. It can be concatenated with other strings, printed, and so on. Despite the fact that it contains the character "4", you cannot add to an integer without first converting the string to an integer type.

### F**lexibility in a dynamically typed language**

```java
i = 3
s = "4"
```

> Types are inferred, which means they are determined based on the data they are set to. Based on how they were set, I is a number type and s is a string type. However, when you have I + s; type inference is used, and depending on your environment, you may get the result I + s = 7; because the programming environment implicitly converted s to an int. However, if the environment believes that an int + string should be interpreted as a concatenation operation rather than an addition operation, this operation could produce the string "34."

### **Present Scenario**

Loosely typed languages have become very popular because of their flexibility. This can lead to more bugs if you aren't careful because these type inferences can produce unexpected results. When performing I + s in a typed language, the compiler forces me to convert s to an explicit int first, so I know that by adding I to s, I will get 7 because s had to be converted first. Any string, number, or even an object can be in I or s in a dynamic language, but the results may not be what you expected. Until you run your code and see what happens, you won't know.