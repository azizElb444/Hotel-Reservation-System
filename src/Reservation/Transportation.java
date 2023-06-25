//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Reservation;

import java.util.Scanner;

public class Transportation extends Service {
    public Transportation() {
    }

    public void setDetails() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter type of transportation(1/2/3)");
        this.type = in.nextInt();
        System.out.println("Enter number of people(1/2)");
        this.quantity = in.nextInt();
        if (this.type == 1) {
            this.cost = 100;
        } else if (this.type == 2) {
            this.cost = 200;
        } else if (this.type == 3) {
            this.cost = 300;
        } else {
            this.cost = 0;
        }

    }

    public int getTotalCost() {
        return this.quantity * this.cost;
    }

    public boolean getStatus() {
        return this.status;
    }
}
