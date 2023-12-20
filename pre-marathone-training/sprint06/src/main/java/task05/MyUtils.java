package task05;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class MyUtils {
    public static void main(String[] args) {


    }

    public static Stream<String> nameList(Map<String, Stream<String>> map) {
        Stream<String> result ;
        List<String> l =new ArrayList<>();
        for (Map.Entry<String, Stream<String>> stream : map.entrySet()) {

            l.add(List.of(stream.getValue().toList()).toString());
        }
        result = l.stream();
        return result;
    }
}
