
package Reservation;

abstract class Room {
    int rate;
    boolean wifi;
    boolean status;

    Room() {
    }

    public abstract void statuschange();
}
