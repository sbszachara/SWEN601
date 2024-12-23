package homework;

public class Telephone {
    private teletype type;
    private int number = 5550001;
    static int numbergiveout = 5550001;
    static int TOTALCALLS = 0;
    private boolean callinprogress = false;
    //stores LAST number called
    private int callnumber = 0;
    //stores ALL numbers called
    private int[] callarray = new int[10000];

    public Telephone(){
        this.number = numbergiveout;
        numbergiveout = numbergiveout + 1;
        type = teletype.MOBILE;
    }

    public Telephone(int n){
        this.number = n;
        type = teletype.MOBILE;
    }

    public void setNumber(int n) {
        this.number = n;
    }

    static int getTotalCalls(){
        return TOTALCALLS;
    }

    public void setSatellite() {
        this.type = teletype.SATELLITE;
    }

    public void setlandLine(){
        this.type = teletype.LANDLINE;
    }

    public void setMobile() {
        this.type = teletype.MOBILE;
    }


    public void dial(int n){
        System.out.println("Calling: " + n);
        if (callinprogress == true) {
            System.out.println("ERROR: Call in progress");
            //For the purposes of being honest, I included
            //calls that were attempted as calls made
            //since technically the phone did try calling
            //and it produced an error
            //but, if this were not needed, then for this if and next
            //else if statment, the this.number = n and TOTALCALLS
            //lines would be deleted
            //but again, technically, since they are making a call
            //I thought it would be valuable to include it wholistically

            //Stores this number as the last call attempted
            this.callnumber = n;
            //generates this as the total calls attempted up
            TOTALCALLS = TOTALCALLS + 1;
            //stores in call list
            for(int i = callarray.length-1; i >= 0; i--) {
                if(callarray[i] == 0){
                    callarray[i] = n;
                    break;
                }
            }
        }
        else if (n == this.number){
            System.out.println("ERROR: Cannot call own number");
            //For the purposes of being honest, I included
            //calls that were attempted as calls made
            //since technically the phone did try calling
            //and it produced an error
            //but, if this were not needed, then for this if and next
            //else if statment, the this.number = n and TOTALCALLS
            //lines would be deleted
            //but again, technically, since they are making a call
            //I thought it would be valuable to include it wholistically
            
            //Stores this number as the last call attempted
            this.callnumber = n;
            //generates this as the total calls attempted up
            TOTALCALLS = TOTALCALLS + 1;
            //stores in call list
            for(int i = callarray.length-1; i >= 0; i--) {
                if(callarray[i] == 0){
                    callarray[i] = n;
                    break;
                }
            }
        }
        else {
            System.out.println("Call Success");
            //sets call in progress to true
            this.callinprogress = true;
            //sets most recent called
            this.callnumber = n;
            //adds one to the total calls
            TOTALCALLS = TOTALCALLS + 1;
            //adds number to call list for this telephone
            //this starts from the back of the array
            for(int i = callarray.length-1; i >= 0; i--) {
                if(callarray[i] == 0){
                    callarray[i] = n;
                    break;
                }
            }
        }
    }

    public void disconnect() {
        //sets callinprogress to false if a call is active on objec
        //telephone
        System.out.println("Ending call with: " + callnumber);
        if(callinprogress == true){
            callinprogress = false;
            System.out.println("Success.");
        }
        else {
            System.out.println("ERROR: No call in progress ");
        }
    }

    public void redial() {
        //redials last number stored, this.callnumber
        System.out.println();
        System.out.println("Attemping redial...");
        if(this.callnumber == 0) {
            System.out.println();
            System.out.println("ERROR: No call has ever been made.");
        }
        else {
            System.out.println("Redialing: " + this.callnumber);
            //calls function to dial within redial making it easy
            dial(this.callnumber);
        }
    }

    public void recentDialed() {
        System.out.println();
        System.out.println("Getting recently dialed:");
        //this is just to make the output pretty
        String calllist = "\n";
        //this is to count to ten values only and then break the loop
        int tenonly = 0;
        //if no calls were made, the most recent call is 0
        //from the constructer of telephone above
        if (this.callnumber == 0){
            System.out.println("ERROR: No calls ever made");
        }

        else{
            //loop to go through call list
            for(int i = 0; i < callarray.length; i++) {
                //if we've reached 10, break the loop
                if (tenonly >= 10){
                    break;
                }
                //if callarry[i] != 0, add it to the call list
                else if (callarray[i] != 0) {
                    calllist = calllist + callarray[i] + "\n";
                    tenonly = tenonly + 1;
                }
            }
            //print the last 10 of the call list starting with most recent
            System.out.println("Call list for number " + this.number + ":");
            System.out.println(calllist);
        }
    }

    @Override
    public String toString(){
        String message = "";
        if (callnumber == 0)
        {
            System.out.println();
            message = "Phone Number: " + this.number + "\n";
            message = message + "Type: " + this.type + "\n";
            message = message + "No recent calls";
            return message;
        }
        else {
            System.out.println();
            message = "Phone Number: " + this.number + "\n";
            message = message + "Type: " + this.type + "\n";
            message = message + "Most recent call: " + this.callnumber;
            return message;
        }
    }


    @Override
    public boolean equals(Object t) {
        //declare object t as a telephone object to then be able to say
        //if the telephone that calls this number onto object t
        //matches t's telephone number, to say it is equal
        Telephone obj = (Telephone) t;
        return this.number == obj.number;
    }









}
