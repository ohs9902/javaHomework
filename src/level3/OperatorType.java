package level3;

public enum OperatorType {
    ADD('+'),SUBTRACT('-'),MULTIPLY('*'),DIVIDE('/'),MOD('%');

    char op;

    public char getOp() {
        return op;
    }

    OperatorType(char op) {
        this.op = op;
    }
}
