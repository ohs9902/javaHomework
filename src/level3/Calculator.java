package level3;

import java.util.List;

public abstract class Calculator {

    final List<Double> results; //사칙연산과 원의넓이 게산결과 저장

    public Calculator( List<Double> results){ //사칙연산을 위한 생성자
        this.results = results;
    }

}
