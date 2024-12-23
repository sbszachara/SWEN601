package homeworkv2;

public class PE {
    private String name;
    private String symbol;
    private int atomNumber;
    private double atomWeight;

    public PE(String n, String s, int an, double aw) {
        this.name = n;
        this.symbol = s;
        this.atomNumber = an;
        this.atomWeight = aw;
    }

    //I honestly don't think it's appropriate to be able to
    //change elements, they are pretty much set in stone right?
    //BUT
    //if there is incorrectly put in information, THEN it would
    //be appropriate, so providing all the setters below

    public void setName(String n) {
        this.name = n;
    }

    public void setSymbol(String n) {
        this.symbol = s;
    }

    public void setatomNum(int n) {
        this.atomNumber = n;
    }

    public void setatomWeight(int w) {
        this.atomWeight = w;
    }

    public String getName() {
        return this.name;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public int getatomNum() {
        return this.atomNumber;
    }

    public double getatomWeight() {
        return this.atomWeight;
    }

    @Override
    public String toString() {
        return name + " " + symbol + " " + atomNumber + " " + atomWeight;
    }
    
}
