package lab4.task3.sensors;

public class Main {
    // todo додайте демонстраційний код
}

interface TemperatureSensor {
    double getTemperature();
}

class CelsiusSensor implements TemperatureSensor {
    private double temperature;

    public CelsiusSensor(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public double getTemperature() {
        System.out.println("Temperature in Celsius: " + temperature);
        return temperature;
    }
}

class FahrenheitSensor {
    private double temperatureFahrenheit;

    public FahrenheitSensor(double temperatureFahrenheit) {
        this.temperatureFahrenheit = temperatureFahrenheit;
    }

    public double getTemperatureFahrenheit() {
        return temperatureFahrenheit;
    }
}

//class TemperatureAdapter implements TemperatureSensor {
//    // todo реалізуйте цей клас
//}
