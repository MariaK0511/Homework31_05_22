package Task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
        Создайте класс, который описывает вектор (в трёхмерном пространстве).
У него должны быть:
конструктор с параметрами в виде списка координат x, y, z +
метод, вычисляющий длину вектора. ++
метод, вычисляющий скалярное произведение двух векторов ++
метод, вычисляющий векторное произведение с другим вектором ++
метод, вычисляющий угол между векторами (или косинус угла): косинус угла между векторами равен скалярному
произведению векторов, деленному на произведение модулей (длин) векторов +
методы для суммы и разности +
статический метод, который принимает целое число N, и возвращает массив случайных векторов размером N
         */
        Vector vector = new Vector(Math.random(), Math.random(), Math.random());
        Vector vector2 = new Vector(Math.random(), Math.random(), Math.random());
        System.out.println("Длина вектора: " + vector.getVectorLength());
        System.out.println("Cкалярное произведение двух векторов: " + vector.getScalarMultiplicationTwoVectors(vector2));
        System.out.println("Векторное произведение с другим вектором " + vector.getVectorMultiplWithAnotherVector(vector2));
        System.out.println("Угол между векторами (или косинус угла)" + vector.getAngle(vector2));
        System.out.println("Сумма векторов: " + vector.getSumVectors(vector2));
        System.out.println("Разность векторов: " + vector.getDifferenceVectors(vector2));
        System.out.println("Массив случайных векторов: " + Arrays.toString(Vector.getVectors(10)));
    }
}
