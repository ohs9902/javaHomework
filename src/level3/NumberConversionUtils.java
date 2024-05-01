package level3;

public class NumberConversionUtils {
    public NumberConversionUtils(){
    }

    public static <T extends Number> Number convertNumberToType(Number result,Class<T> type){
        if(type == Integer.class){
            return result.intValue();
        }else if (type == Double.class){
            return result.doubleValue();
        }else if (type == Long.class){
            return result.longValue();
        }else{
            throw new IllegalArgumentException("지원하지 않는 타입: " +type);
        }
    }
}
