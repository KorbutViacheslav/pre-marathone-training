# Task02: Iterator Design Pattern

Suppose we have the next class:

```java
public class NameList {
    private String[] names = {"Mike", "Emily", "Nick", "Patric", "Sara"};

    public Iterator getIterator() {
        return new Iterator();
    }
}
```

Create public inner class named Iterator inside NameList class that correspond the next class diagram:
![screenshot](https://github.com/KorbutViacheslav/pre-marathone-training/blob/main/pre-marathone-training/sprint03/screenshots-tasks-s3/iterator.png?raw=true)