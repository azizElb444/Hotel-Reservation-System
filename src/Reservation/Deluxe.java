
package Reservation;

public class Deluxe extends Room {
    public Deluxe() {
    }

    public void set(int r, boolean w, boolean s) {
        this.rate = r;
        this.wifi = w;
        this.status = s;
    }

    public int getRate() {
        return this.rate;
    }

    public boolean getStatus() {
        return this.status;
    }

    public boolean getWifi() {
        return this.wifi;
    }

    public void statuschange() {
        if (this.status) {
            this.status = false;
        } else {
            this.status = true;
        }

    }
}
