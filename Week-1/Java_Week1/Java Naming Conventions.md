# Java Naming Conventions

### Below are some naming conventions of java programming language. They must be followed while developing software in java for good maintenance and readability of code. Java uses CamelCase as a practice for writing names of methods, variables, classes, packages and constants.

**Camel case in Java Programming :**  It consists of compound words or phrases such that each word or abbreviation begins with a capital letter or first word with a lowercase letter, rest all with capital.

1. Classes and Interfaces :
* Class names should be nouns, in mixed case with the first letter of each internal word capitalised. Interfaces name should also be capitalised just like class names.
* Use whole words and must avoid acronyms and abbreviations.

#### Examples:
```python
interface  Bicycle
class MountainBike implements Bicyle

interface Sport
class Football implements Sport
```

2. Methods :
* Methods should be verbs, in mixed case with the first letter lowercase and with the first letter of each internal word capitalised.

#### Examples:
```python
void changeGear(int newValue);
void speedUp(int increment);
void applyBrakes(int decrement);
```

3. Variables : Variable names should be short yet meaningful.
* Variables can also start with either underscore(‘_’) or dollar sign characters.
* Should be mnemonic i.e, designed to indicate to the casual observer the intent of its use.
* **One-character variable names should be avoided** except for temporary variables.
* Common names for temporary variables are i, j, k, m, and n for integers; c, d, and e for characters.

#### Examples:
> variables for MountainBike class
```python
    int speed = 0;
    int gear = 1;
```

4. Constant Variables:
* Should be all uppercase with words separated by underscores (“_”).
* There are various constants used in predefined classes like Float, Long, String etc.

#### Examples:
`static final int MIN_WIDTH = 4;`
> // Some  Constant variables used in predefined Float class
```python
public static final float POSITIVE_INFINITY = 1.0f / 0.0f;
public static final float NEGATIVE_INFINITY = -1.0f / 0.0f;
public static final float NaN = 0.0f / 0.0f;
```
5. Packages:
* The prefix of a unique package name is always written in **all-lowercase ASCII letters** and should be one of the top-level domain names, like com, edu, gov, mil, net, org.
* Subsequent components of the package name vary according to an organisation’s own internal naming conventions.

#### Examples:
```python
com.sun.eng
com.apple.quicktime.v2
```

> java.lang packet in JDK
`java.lang`



```python

```
