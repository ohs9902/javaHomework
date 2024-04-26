package level3;

public class BadInputException extends Exception{
    public BadInputException(String problem){
        super("["+problem + "] "+ "해당 문제로 인한 예외 발생");
    }
}
