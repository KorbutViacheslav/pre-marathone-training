# Task01: Builder Design Pattern


Suppose we have the next class:

```java
public class Pizza {
    private String cheese;
    private String meat;
    private String seafood;
    private String vegetable;
    private String mushroom;

    private Pizza() {
    }

    public static PizzaBuilder base() {
        return new PizzaBuilder();
    }
}
```

Create public static inner class named PizzaBuilder inside Pizza class that correspond the next class diagram:
![screenshot](https://github.com/KorbutViacheslav/pre-marathone-training/blob/main/pre-marathone-training/sprint03/screenshots-tasks-s3/screenS3T2.png?raw=true)

Inside the cook method create and return an instance of Pizza class with your at least three favorite ingredients.