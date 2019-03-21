package bnb;

import java.time.LocalDate;
import java.util.function.Predicate;

public class InputCheckers {

    public static Predicate<LocalDate> isDateInFuture(){
        return dateToCheck -> dateToCheck.isAfter(LocalDate.now());
    }

}
