package task1;

public class Vector {
    double x, y, z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getVectorLength() {
        return Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2);
    }

    public double getScalarMultiplicationTwoVectors(Vector vector) {
        return x * vector.x + y * vector.y + z * vector.z;
    }

    public Vector getVectorMultiplWithAnotherVector(Vector vector) {
        return new Vector(y * vector.z - z * vector.y, z * vector.x - x * vector.z, x * vector.y - y * vector.x);
    }


    public double getAngle(Vector vector) {
        double multiplicationTwoVectors = getScalarMultiplicationTwoVectors(vector);
        double lengthVector = Math.abs(getVectorLength() * vector.getVectorLength());
        return multiplicationTwoVectors / lengthVector;
    }
    public Vector getSumVectors(Vector vector) {
        return new Vector(x + vector.x, y + vector.y, z + vector.z);
    }
    public Vector getDifferenceVectors(Vector vector) {
        return new Vector(x - vector.x, y - vector.y, z - vector.z);
    }
    public static Vector[] getVectors(int num) {
        Vector[] vector = new Vector[num];
        for (int index = 0; index < vector.length; index++) {
            vector[index] = new Vector(Math.random(), Math.random(), Math.random());
        }
        return vector;
    }
    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
