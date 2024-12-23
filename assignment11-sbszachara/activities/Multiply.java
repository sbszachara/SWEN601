package activities;

public class Multiply extends AbstractOperation {

    public Multiply() {
        super("*");
    }

    @Override
    public double operation(double[] operands) {
        double multiplied = 1;
        if(operands.length == 0) {
            System.out.println("here");
            return 0;
        }
        else if (operands.length == 1) {
            return operands[0];
        }
        else {
            for (double operand : operands) {
                multiplied = multiplied * operand;
            }
            return multiplied;
        }
    }

}
