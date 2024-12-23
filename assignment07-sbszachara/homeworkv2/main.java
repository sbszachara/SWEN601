package homeworkv2;

public class main {

    public static void main(String[] args) {

        //Q2
        PE hydrogen = new PE("Hydrogen", "H", 1, 1.008);
        PE helium = new PE("Helium", "He", 2, 4.0026);
        PE carbon = new PE("Carbon", "C", 6, 12.011);
        PE nitrogen = new PE("Nitrogen", "N", 7, 14.007);
        PE oxygen = new PE("Oxygen", "O", 8, 15.999);
        PE sodium = new PE("Sodium", "Na", 11, 22.989);
        PE magnesium = new PE("Magnesium", "Mg", 12, 24.305);
        PE aluminum = new PE("Aluminum", "Al", 13, 26.982);
        PE silicon = new PE("Silicon", "Si", 14, 28.085);
        PE chlorine = new PE("Chlorine", "Cl", 17, 35.45);
        System.out.println(chlorine.toString());
        System.out.println(silicon.toString());
        System.out.println(aluminum.toString());
        System.out.println(magnesium.toString());
        System.out.println(sodium.toString());
        System.out.println(oxygen.toString());
        System.out.println(nitrogen.toString());
        System.out.println(carbon.toString());
        System.out.println(helium.toString());
        System.out.println(hydrogen.toString());

        //Q3
        System.out.println();
        System.out.println("Initial Thermostat:");
        thermometer thermotest = new thermometer();
        System.out.println(thermotest.toString());
        System.out.println();
        System.out.println("Setting temp to 55F");
        thermotest.setTempFahrenheit(55);
        System.out.println(thermotest.toString());
        System.out.println();
        System.out.println("Setting temp to 234K");
        thermotest.setTempKelvin(234);
        System.out.println("Temp in Celsius: " + thermotest.getTempCelsius());
        System.out.println("Temp in Fahrenheit: " + thermotest.getTempFahrenheit());
        System.out.println("Temp in Kelvin: " + thermotest.getTempKelvin());
        System.out.println();

        //Q4
        rateprofapp prof1 = new rateprofapp("Steven", "Szachara", "Rochester Institute of Technology", "Software Construction");
        rateprofapp prof2 = new rateprofapp("Rodger", "Banks", "School of Hard Knocks", "How to be Cool", 5.0, 3.0);
       
        System.out.println(prof1.toString());
        prof1.newRating(3.9, 5);
        System.out.println();

        System.out.println(prof1.toString());
        prof1.newRating(4.5, 5);
        System.out.println();

        System.out.println(prof1.toString());
        prof1.newRating(4.7, 4.9);
        System.out.println();
        System.out.println(prof1.toString());

        //SECOND PROFESSOR

        System.out.println();
        System.out.println(prof2.toString());
        prof2.newRating(2, 1);
        System.out.println();

        System.out.println(prof2.toString());
        prof2.newRating(3, 3);
        System.out.println();

        System.out.println(prof2.toString());
        prof2.newRating(1.5, 1.5);
        System.out.println();
        System.out.println(prof2.toString());

    }
    
}
