package year1.javafoundations.solutions.chapter11.exercise1;

/**
 * Created by JonathanSyntra on 22/01/2017.
 */
public enum Day {
    MONDAY(true),TUESDAY(true),WEDNESDAY(true),THURSDAY(true),FRIDAY(true),SATURDAY(false),SUNDAY(false);

    private boolean weekday;

    Day(boolean weekday){
        this.weekday = weekday;
    }

    public boolean isWeekday() {
        return weekday;
    }

    @Override
    public String toString() {
        return name() + "{" +
                "weekday=" + weekday +
                '}';
    }
}
