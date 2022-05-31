package Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Напишите класс BaseConverter для конвертации из градусов по Цельсию в
Кельвины ,  Фаренгейты , и так далее. У класса должен быть метод convert, который и делает конвертацию.
         */
        System.out.print("Введите градусы: ");
        int degreesCelsius = new Scanner(System.in).nextInt();

        KelvinConverter kelvinConverter = new KelvinConverter();
        double convertedKelvin = kelvinConverter.getConverterDegreesCelsius(degreesCelsius);
        kelvinConverter.showResult(convertedKelvin);

        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        double convertedFahrenheit = fahrenheitConverter.getConverterDegreesCelsius(degreesCelsius);

        fahrenheitConverter.showResult(convertedFahrenheit);
    }
}
