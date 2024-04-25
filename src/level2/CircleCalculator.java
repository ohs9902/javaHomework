package level2;

import java.util.ArrayList;
import java.util.List;

public class CircleCalculator {
    private static List<Double> results2 = new ArrayList<>();  //객체를 새로 생성해도 적용되도록 static으로 선언

    public double calulateCircle(double radius){
        results2.add(radius*radius*3.14);
        return radius*radius*3.14;
    }
    public static void listLook2(){ //static List 참조를 위해 static 선언
        results2.stream().forEach(System.out::println);
    }

    public static void removeResult2(){ //static List 참조를 위해 static 선언
        results2.remove(results2.size()-1);
    }
}
