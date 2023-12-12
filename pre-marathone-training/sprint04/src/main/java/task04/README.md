# Task04

In the class **ArrayUtil** write a **public static** generic method named "**setAndReturn(...)**" to modify and return
the element in an array from the given position.

Examples of usage:
````java
//Print to dis[lay: 52
        Integer[] numbers = new Integer[3];
        int numberFromSecondPosition = ArrayUtil.<Integer>setAndReturn(numbers, 52, 1);
        System.out.println(numberFromSecondPosition);

        //Print to display: Hello
        String[] words = new String[3];
        String wordFromSecondPosition = ArrayUtil.<String>setAndReturn(words, "Hello", 1);
        System.out.println(wordFromSecondPosition);
````

> For correct passing of all tests don't use **print** and **println** methods in your code.