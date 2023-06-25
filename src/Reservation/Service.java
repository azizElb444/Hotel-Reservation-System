
package Reservation;

public abstract class Service {
    int type = 0;
    int cost = 0;
    int quantity = 0;
    String bno = null;
    boolean status = false;

    Service() {
    }

    public abstract void setDetails();

    public abstract int getTotalCost();

    public abstract boolean getStatus();
}
