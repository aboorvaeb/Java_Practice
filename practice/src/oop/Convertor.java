package oop;

class Converter {
    // write your code here
    double kilometersperHour;

    public long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0)
            return -1;
        long conv = (long) (kilometersPerHour / 1.609);
        conv = Math.round(conv);
        return conv;

    }

    public void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0)
            System.out.println("Invalid value");
        else {
            long conv = (long) (kilometersPerHour / 1.609);
            conv = Math.round(conv);
            System.out.println(kilometersPerHour + "km/h = " + conv + "mi/h");
        }
    }

    public static void main(String[] args) {
    Converter obj = new Converter();
    long conv = obj.toMilesPerHour(-5.6);
        System.out.println(conv);
    }
}