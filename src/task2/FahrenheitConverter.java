package task2;

public class FahrenheitConverter implements BaseConverter {

    @Override
    public double getConverterDegreesCelsius(double convert) {
        return convert * 1.8000 + 32.00;
    }

    @Override
    public void showResult(double convert) {
        System.out.println("Fahrenheit: " + convert);
    }
}
