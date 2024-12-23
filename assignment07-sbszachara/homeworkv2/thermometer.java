package homeworkv2;

public class thermometer {
    private double temp = 37.0;

    public thermometer() {
        this.temp = 37.0;
    }

    public void setTempCelsius(double t) {
        this.temp = t;
    }

    public void setTempFahrenheit(double t) {
        this.temp = (t-32)*5/9;
    }

    public void setTempKelvin(double t) {
        this.temp = t - 273.15;
    }

    public double getTempCelsius() {
        return this.temp;
    }

    public double getTempFahrenheit() {
        return (this.temp*9/5) + 32;
    }

    public double getTempKelvin() {
        return this.temp + 273.15;
    }

    @Override
    public String toString() {
        return "Celsius: " + getTempCelsius() + "\n" + "Fahrenheit: " + getTempFahrenheit() + "\n" + "Kelvin: " + getTempKelvin();
    }


    
}
