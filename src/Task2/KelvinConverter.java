package Task2;

public class KelvinConverter implements BaseConverter{


    @Override
    public double getConverterDegreesCelsius(double convert) {
        return convert + 273.15;


    }

    @Override
    public void showResult(double convert) {
        System.out.println("Kelvins: " + convert);
    }
}
