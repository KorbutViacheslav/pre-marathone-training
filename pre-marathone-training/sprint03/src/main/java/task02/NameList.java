package task02;

import java.util.NoSuchElementException;

public class NameList {
    private String[] names = {"Mike", "Emily", "Nick", "Patric", "Sara"};


    public NameIterator iterator() {
        return new NameIterator();
    }

    public class NameIterator {
        private int count = 0;

        public boolean hasNext() {
            return count < names.length;
        }

        public String next() {
            if (hasNext()) {
                String currentName = names[count];
                count++;
                return currentName;
            } else {
                throw new NoSuchElementException();
            }
        }
    }
}
