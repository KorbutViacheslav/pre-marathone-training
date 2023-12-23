package task06;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class MyUtils {
    public static void main(String[] args) {
        List<Stream<String>> givenList = Arrays.asList(
                Stream.of("093 987 65 43", "(050)1234567", "12-345"),
                Stream.of("067-21-436-57", "050-2345678", "0939182736", "224-19-28"),
                Stream.of("(093)-11-22-334", "044 435-62-18", "721-73-45"));
/*        Map<String, Stream<String>> result = phoneNumbers(givenList);
        result.forEach((key, value) -> {
            System.out.print(key + " : ");
            System.out.println(value.collect(Collectors.joining(" , ")));
        });*/
        Map<String,String> r = phoneNumbers(givenList);
        System.out.println(r);
    }
    public static Map<String,String> phoneNumbers(List<Stream<String>> list){
        Map<String, Stream<String>> mapS = new HashMap<>();
        mapS.put("1",list.stream().flatMap(stringStream -> stringStream));
        Map<String, String> map2 = new HashMap<>();
        List<String> s = list.stream().flatMap(stringStream -> stringStream).map(item ->item.replaceAll("[^\\d]","")).distinct().toList();
        for(String l :s){
            map2.put(l.substring(0,3),l.substring(3));
        }


        return map2;
    }
}
