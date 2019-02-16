package year1.javafoundations.solutions.chapter11.exercise1;

public enum Planet {
    MERCURY(0.33e24, 57.9e6),
    VENUS(4.87e24, 108.2e6),
    EARTH(0.073e24, 149.6e6),
    MARS(0.642e24, 227.9e6),
    JUPITER(1898e24, 778.6e6),
    SATURN(568e24, 1433.5e6),
    URANUS(86.8e24, 2872.5e6),
    NEPTUNE(102e24, 4495.1e6),
    PLUTO(0.0146e24, 5906.4e6);

    private double massa;
    private double distanceToTheSun;

    Planet(double massa, double distanceToTheSun) {
        this.massa = massa;
        this.distanceToTheSun = distanceToTheSun;
    }

    public double getMassa() {
        return massa;
    }

    public double getDistanceToTheSun() {
        return distanceToTheSun;
    }

    @Override
    public String toString() {
        return name() + "{" +
                "massa=" + massa +
                ", distanceToTheSun=" + distanceToTheSun +
                '}';
    }
}
