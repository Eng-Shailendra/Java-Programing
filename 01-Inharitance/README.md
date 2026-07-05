# Inheritance

**Inheritance** is machanisum to represent parent and child realtion ship in classes where the child class iharite the ferature of from their parent class.
inharitance is unidirectional where child can access the detials of parent but perent can't access the details of the child class.

- it is achived by **extends** keyword.
  The child class is always extend the parent class to inharit the feature of parent class.

## **Feature**

- it use IS-A relationship
- Object class is the supper most parent class in java, every class in java has 11 method which is by default avliable to every calss

## Object loading process with Inharitance

- With Inheritance the different type of member loading from parent to child class
- Metaspace will be loade from parent to child, static block will be executed.
- A+ object creation parent to child execution will take palce were non staic block and constructor of the class will be constrant of class will be loaded and execute in sicquence.

## Supper call statement

- Super call is a constructor call which is used to call parent class constructor from child class constructor

- explicit super call

```
supre(val1, val2, val3) //explicit call

```

- Implicit super call

```
supper()
super.barnd = barnd
super.price = price

```

# Types of inharitance

1. Single lavel inharitance
2. Multilavel lavel inharitance
3. hierarchical lavel inharitance
4. Multi lavel inheritance
5. Hybrid inheritance

**Note** -- any private type of parent class member not inharitated
