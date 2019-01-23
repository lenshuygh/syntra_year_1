package p209opdracht1;

public enum Day {
    MONDAY(true), TUESDAY(true), WEDNESDAY(true), THURSDAY(true), FRIDAY(true), SATURDAY(false), SUNDAY(false);
    private boolean weekday;

    Day(boolean weekday) {
        this.weekday = weekday;
    }

    @Override
    public String toString() {
        return name() + "{" +
                "weekday? ->" + weekday +
                '}';
    }
}
