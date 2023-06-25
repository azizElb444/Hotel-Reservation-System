

package Reservation;

public class Fare {
    public Fare() {
    }

    public int farecalculator(int days, int rate, int s) {
        if (s == 1) {
            return days * rate;
        } else {
            return s == 2 ? days * rate * 2 : 0;
        }
    }
}
