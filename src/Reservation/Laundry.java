

package Reservation;

import java.util.Scanner;

public class Laundry extends Service {
    public Laundry() {
    }

    public void setDetails() {
        this.status = true;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter type of wash(1/2/3)");
        this.type = in.nextInt();
        System.out.println("Enter quantity of clothes");
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
