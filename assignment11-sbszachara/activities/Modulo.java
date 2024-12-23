package activities;

public class Modulo extends AbstractOperation {

    public Modulo() {
        super("%");
    }

    public double operation(double[] operands) {
        double modulo;
        double modulo1;
        double modulo2;
        if(operands.length == 0) {
            return 0;
        }
        else if(operands.length == 1) {
            return operands[0];
        }
        else if (operands.length == 2) {
            if (operands[0] == 0 || operands[1] == 0) {
                System.out.println("Error, cannot modulo by 0.");
                return 0;
            }
            else {
                modulo = operands[0] % operands[1];
                return modulo;
            }
        }
        else {
            modulo1 = operands[0];
            modulo2 = operands[1];
            if(modulo1 == 0 || modulo2== 0) {
                System.out.println("Error, cannot modulo by 0.");
                return 0;
            }
            else {
                modulo = modulo1 % modulo2;
            }
            for (int i = 2; i < operands.length; i++) {
                if(operands[i] == 0) {
                    System.out.println("Error, cannot modulo by 0.");
                    return 0;
                }
                else {
                    modulo = modulo % operands[i];
                }
            }
            return modulo;
        }
    }
    
}
