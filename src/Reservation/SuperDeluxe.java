//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Reservation;

public class SuperDeluxe extends Room {
    public SuperDeluxe() {
    }

    public void set(int r, boolean w, boolean s) {
        this.rate = r;
        this.wifi = w;
        this.status = s;
    }

    public boolean getStatus() {
        return this.status;
    }

    public boolean getWifi() {
        return this.wifi;
    }

    public int getRate() {
        return this.rate;
    }

    public void statuschange() {
        if (this.status) {
            this.status = false;
        } else {
            this.status = true;
        }

    }
}
