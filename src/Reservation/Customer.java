

package Reservation;

import java.util.Scanner;

public class Customer {
    int no = -1;
    public String name = null;
    String bookingno = null;
    int nod;
    int type;
    int ld;
    int d;
    boolean status;

    public Customer() {
        this.nod = this.type = this.ld = this.d = -1;
        this.status = false;
    }

    public void setInitialDetails(int c) {
        this.no = c;
        System.out.println("------------------------------------------------------------------");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name");
        this.name = in.nextLine();
        System.out.println("Enter room type?1 for Luxury,2 for Deluxe,3 for superdeluxe");
        this.type = in.nextInt();
        System.out.println("Enter occupancy? 1/2");
        this.ld = in.nextInt();
        System.out.println("Enter number of days?");
        this.d = in.nextInt();
    }

    public void setBookingNo(String b) {
        this.bookingno = b;
    }
}
