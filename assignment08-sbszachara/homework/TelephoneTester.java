package homework;

public class TelephoneTester {

    public static void main(String[] args) {
        //testing toString (3i) and setup
        System.out.println();
        Telephone tester1 = new Telephone();
        System.out.println(tester1.toString());

        //3c
        Telephone tester3 = new Telephone(4895962);
        System.out.println(tester3.toString());

        //testing static number incriment in 3b
        System.out.println();
        Telephone tester2 = new Telephone();
        System.out.println(tester2.toString());

        //3d AND 3e
        System.out.println();
        tester1.dial(4895962);
        tester1.dial(4895962);
        tester1.disconnect();
        tester1.dial(5550001);
        tester1.disconnect();
        tester1.dial(8287209);
        tester1.disconnect();
        tester1.dial(5550001);
        tester1.disconnect();
        tester1.dial(8287209);
        tester1.disconnect();
        tester1.dial(5550001);
        tester1.disconnect();
        tester1.dial(8287209);
        tester1.disconnect();
        tester1.dial(4895962);
        tester1.disconnect();
        tester1.dial(4895962);
        tester1.disconnect();
        tester1.dial(4895962);
        tester1.disconnect();
        tester1.dial(4895962);
        tester1.disconnect();
        tester1.dial(5550001);
        tester1.disconnect();

        //3f
        tester1.redial();
        tester1.dial(4895962);
        tester1.disconnect();

        //3g
        System.out.println();
        tester1.recentDialed();

        //3j
        tester2.dial(5550001);
        tester2.disconnect();
        tester2.dial(8287209);
        tester2.disconnect();
        tester2.dial(4895962);
        tester2.disconnect();
        tester1.dial(4895962);
        tester1.disconnect();
        tester2.dial(4895962);
        tester2.disconnect();
        tester2.dial(4895962);
        tester2.disconnect();
        tester1.dial(5550001);
        tester1.disconnect();

        System.out.println();
        System.out.println("Total Calls Test");
        System.out.println("Total calls: " + Telephone.getTotalCalls());
        System.out.println("Should be 22");

        //testing no call ever made
        System.out.println("Testing no call ever made call list:");
        tester3.recentDialed();
        System.out.println();
        System.out.println("Testing redial with no calls ever made:");
        tester3.redial();

        //testing types
        System.out.println();
        System.out.println();
        System.out.println("TESTING TYPES:");
        System.out.println();
        System.out.println("Setting satellite");
        tester3.setSatellite();
        System.out.println(tester3.toString());
        System.out.println();
        System.out.println("Setting landline");
        tester3.setlandLine();
        System.out.println(tester3.toString());
        System.out.println();
        System.out.println("Setting mobile");
        tester3.setMobile();
        System.out.println(tester3.toString());

        //testing incrimental 5550001
        Telephone tester4 = new Telephone();
        Telephone tester5 = new Telephone();
        Telephone tester6 = new Telephone();
        System.out.println();
        System.out.println("Testing Incriment After Everything:");
        System.out.println(tester4.toString());
        System.out.println(tester5.toString());
        System.out.println(tester6.toString());
        System.out.println();

        //testing equals
        Telephone testerequals = new Telephone(1234567);
        Telephone testerequals2 = new Telephone(1234567);
        System.out.println("Testing equals, should be true:");
        System.out.println(testerequals.equals(testerequals2));
        System.out.println("Testing equals, should be false:");
        System.out.println(testerequals.equals(tester4));
        System.out.println();

    }
    
}
