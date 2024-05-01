package level3;

import java.util.ArrayList;
import java.util.List;

public class CircleCalculator extends Calculator {
    public CircleCalculator(List<Double> results) {
        super(results);
    }

    public double calculate(double radius){
        results.add(radius*radius*3.14);
        return radius*radius*3.14;
    }
    public void listLook2(){ //static List 참조를 위해 static 선언
        results.stream().forEach(System.out::println);
    }

    public void removeResult2(){ //static List 참조를 위해 static 선언
        results.remove(results.size()-1);
    }
}
