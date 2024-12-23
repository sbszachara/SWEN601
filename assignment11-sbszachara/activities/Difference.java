package activities;

public class Difference extends AbstractOperation{

    public Difference() {
        super("-");
    }

    @Override
    public double operation(double[] operands) {
        if(operands.length == 0){
            return 0;
        }
        else {
            double difference = operands[0];
            for(int i = 1; i< operands.length; i++) {
                difference -= operands[i];
             }
            return difference;
        }
    }
    
}
