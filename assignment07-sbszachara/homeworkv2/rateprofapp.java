package homeworkv2;

public class rateprofapp {
   //a
    private String fname;
    private String lname;
    private String uname;
    private String subject;
    private double quality;
    private double difficulity;

    //variables to track the ratings
    private int amountRatings;
    private double[] qualities = new double[10000];
    private double[] diffs = new double[10000];

    //b
    public rateprofapp(String f, String l, String u, String s, double q, double d) {
        this.fname = f;
        this.lname = l;
        this.uname = u;
        this.subject = s;

        //if and else statments to catch bad ratings
        if (q < 1.0){
            this.quality = 1.0;
            this.qualities[0] = 1.0;
        }
        else if (q > 5.0) {
            this.quality = 5.0;
            this.qualities[0] = 5.0;
        }
        else {
            this.quality = q;
            this.qualities[0] = q;
        }
        if (d < 1.0) {
            this.difficulity = 1.0;
            this.diffs[0] = 1.0;
        }
        else if (d > 5.0) {
            this.difficulity = 5.0;
            this.diffs[0] = 5.0;
        }
        else {
            this.difficulity = d;
            this.diffs[0] = d;
        }
        this.amountRatings = 1;
    }

    //general profile of prof without added ratings
    public rateprofapp(String f, String l, String u, String s){
        this.fname = f;
        this.lname = l;
        this.uname = u;
        this.subject = s;
        this.quality = 2.5;
        this.qualities[0] = 2.5;
        this.difficulity = 2.5;
        this.diffs[0] = 2.5;
        this.amountRatings = 1;
    }

    //c
    public void setFName(String f) {
        this.fname = f;
    }

    public void setLName(String l) {
        this.lname = l;
    }

    public void setUni(String u) {
        this.uname = u;
    }

    public void setSub(String s) {
        this.subject = s;
    }

    //when a new rating is added
    public void newRating(double r, double d){
        //check to make sure the rating is within 1 and 5
        if ((r >= 1.0 && r <= 5.0) && (d >= 1.0 && d <= 5.0)){
            //counter for ratings for this prof goes up
            System.out.println();
            System.out.println("New Rating for " + this.fname + " " + this.lname + " at " + uname + ":");
            System.out.println(" " + r + " " + d);
            this.amountRatings = this.amountRatings + 1;
            //calculates the total quality and diff total from
            //storage array
            double qualtotal = 0.0;
            double difftotal = 0.0;
            //goes through and sets the new quality in the qual array
            for (int k = 0; k < qualities.length; k++) {
                if (qualities[k] == 0) {
                    qualities[k] = r;
                    break;
                }
            }
            //gets the total qual amount
            for(int i = 0; i < qualities.length; i++) {
                qualtotal = qualtotal + qualities[i];
            }
            //goes through and sets the new deff in the diff array
            for(int m = 0; m < diffs.length; m++){
                if(diffs[m] == 0) {
                    diffs[m] = d;
                    break;
                }
            }
            //goes through and gets the diff total
            for(int j = 0; j < diffs.length; j++){
                difftotal = difftotal + diffs[j];
             }
            //updates the average quality rating
            this.quality = (qualtotal / this.amountRatings);
            //updates the average difficulty rating
            this.difficulity = (difftotal / this.amountRatings);
        }
        else {
            System.out.println("Your values need to be between 1 and 5 for newRating");
        }
    }

    public double getAvgQuality(){
        return this.quality;
    }

    public double getAvgDiff() {
        return this.difficulity;
    }

    @Override
    public String toString() {
        return "Professor " + this.fname + " " + this.lname + "\n" + this.uname + " Subject: " + this.subject + "\n" + "Quality: " + this.quality + "  Difficulity: " + this.difficulity;
    }

}
