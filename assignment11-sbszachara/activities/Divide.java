package activities;

public class Divide extends AbstractOperation {

    public Divide() {
        super("/");
    }

    @Override
    public double operation(double[] operands) {
        double divided;
        double initialdivided;
        if (operands.length == 0) {
            return 0;
        }
        else if (operands.length == 1) {
            return operands[0];
        }
        else if (operands.length == 2) {
            if (operands[0] == 0 || operands[1] == 0) {
                System.out.println("Error, cannot divide by 0.");
                return 0;
            }
            else {
                divided = operands[0]/operands[1];
                return divided;
            }
        }
        else {
            divided = operands[0];
            initialdivided = operands[1];
            if(divided == 0 || initialdivided == 0) {
                System.out.println("Error, cannot divide by 0.");
                return 0;
            }
            else {
                initialdivided = divided / initialdivided;
            }
            for (int i = 2; i < operands.length; i++) {
                if(operands[i] == 0) {
                    System.out.println("Error, cannot divide by 0.");
                    return 0;
                }
                else {
                    initialdivided = initialdivided / operands[i];
                }
            }
            return initialdivided;
        }
    }
}
