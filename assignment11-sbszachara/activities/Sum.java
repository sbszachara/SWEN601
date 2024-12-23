package activities;

public class Sum extends AbstractOperation {

    public Sum() {
        super("+");
    }

    @Override
    public double operation(double[] operands) {
        double sum = 0;
        for(double operand : operands) {
            sum += operand;
        }
        return sum;
    }

    
    
}
