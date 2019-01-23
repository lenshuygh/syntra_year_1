package p209opdracht1;

public enum Planets {
    MERCURY(3.3e23,5.9e6),
    VENUS(4.87e24,7.23e5),
    EARTH(5.98e24,149.6e6),
    MARS(6.42e23,227.9e6),
    JUPITER(1.90e27,778.33e6),
    SATURN(5.69e26,1.503e9),
    URANUS(8.68e25,3.003e9),
    NEPTUNE(1.02e26,4.456e9);

    private double mass;
    private double distanceToSun;

    Planets(double mass,double distanceToSun){
        this.mass = mass;
        this.distanceToSun = distanceToSun;
    }
}
