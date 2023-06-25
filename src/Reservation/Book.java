

package Reservation;

import java.io.Serializable;
import java.util.Scanner;

public class Book implements Serializable {
    String bookno;
    Transportation[][][] t;
    Laundry[][][] l;
    public int ff;
    Customer cust;
    public int s1 = 0;
    public int s2 = 0;

    public Book() {
    }

    public String getBookingNumber() {
        return this.bookno;
    }

    public void BookNew(Customer c, Luxury ly, Deluxe dx, SuperDeluxe sdx, Transportation[][][] tr, Laundry[][][] lr, int ily, int flag1, int idx, int flag2, int isdx, int flag3) {
        this.cust = c;
        new Fare();
        this.t = tr;
        this.l = lr;
        Scanner in5;
        int g;
        if (c.type == 1) {
            if (flag1 == 0) {
                System.out.println("No Luxury Rooms Available");
                in5 = new Scanner(System.in);
                System.out.println("Do you want any other room? Deluxe(2) or SuperDeluxe(3) ");
                g = in5.nextInt();
                if (g == 2) {
                    this.BookDeluxe(c, dx, g, idx, c.ld, c.d);
                }

                if (g == 3) {
                    this.BookSuperDeluxe(c, sdx, g, isdx, c.ld, c.d);
                }
            }

            if (flag1 == 1) {
                this.BookLuxury(c, ly, c.type, ily, c.ld, c.d);
            }
        }

        if (c.type == 2) {
            if (flag2 == 0) {
                System.out.println("No Deluxe Room Available");
                in5 = new Scanner(System.in);
                System.out.println("Do you want any other room? Luxury(1) or SuperDeluxe(3) ");
                g = in5.nextInt();
                if (g == 2) {
                    this.BookLuxury(c, ly, g, ily, c.ld, c.d);
                }

                if (g == 3) {
                    this.BookSuperDeluxe(c, sdx, g, isdx, c.ld, c.d);
                }
            }

            if (flag2 == 1) {
                this.BookDeluxe(c, dx, c.type, idx, c.ld, c.d);
            }
        }

        if (c.type == 3) {
            if (flag3 == 0) {
                System.out.println("No SuperDeluxe Room Available");
                in5 = new Scanner(System.in);
                System.out.println("Do you want any other room? Deluxe(2) or Luxury(3) ");
                g = in5.nextInt();
                if (g == 2) {
                    this.BookDeluxe(c, dx, g, idx, c.ld, c.d);
                }

                if (g == 1) {
                    this.BookLuxury(c, ly, g, ily, c.ld, c.d);
                }
            }

            if (flag3 == 1) {
                this.BookSuperDeluxe(c, sdx, c.type, isdx, c.ld, c.d);
            }
        }

    }

    public void BookLuxury(Customer c, Luxury ly, int type, int ily, int ld, int d) {
        Fare f = new Fare();
        ly.statuschange();
        if (ld == 1) {
            System.out.println("Single Luxury Room is booked");
            this.ff = f.farecalculator(d, ly.rate, ld);
            this.bookno = ily + "lx1";
            this.BookDisplay(this.ff, c.name, this.t[ily][0][0].getTotalCost(), this.l[ily][0][1].getTotalCost(), this.bookno);
        }

        if (ld == 2) {
            System.out.println("Double Luxury Room is booked");
            this.ff = f.farecalculator(d, ly.rate, ld);
            this.bookno = ily + "lx2";
            this.BookDisplay(this.ff, c.name, this.t[ily][1][0].getTotalCost(), this.l[ily][1][1].getTotalCost(), this.bookno);
        }

    }

    public void BookDeluxe(Customer c, Deluxe dx, int type, int idx, int ld, int d) {
        dx.statuschange();
        Fare f = new Fare();
        if (ld == 1) {
            System.out.println("Single Deluxe Room is booked");
            this.ff = f.farecalculator(d, dx.rate, ld);
            this.bookno = idx + "dx1";
            this.BookDisplay(this.ff, c.name, this.t[idx][0][0].getTotalCost(), this.l[idx][0][1].getTotalCost(), this.bookno);
        }

        if (ld == 2) {
            System.out.println("Double Deluxe Room is booked");
            this.ff = f.farecalculator(d, dx.rate, ld);
            this.bookno = idx + "dx2";
            this.BookDisplay(this.ff, c.name, this.t[idx][1][0].getTotalCost(), this.l[idx][1][1].getTotalCost(), this.bookno);
        }

    }

    public void BookSuperDeluxe(Customer c, SuperDeluxe sdx, int type, int isdx, int ld, int d) {
        Fare f = new Fare();
        sdx.statuschange();
        if (ld == 1) {
            System.out.println("Single Super Deluxe Room is booked");
            this.ff = f.farecalculator(d, sdx.rate, ld);
            this.bookno = isdx + "sdx1";
            this.BookDisplay(this.ff, c.name, this.t[isdx][0][0].getTotalCost(), this.l[isdx][0][1].getTotalCost(), this.bookno);
        }

        if (ld == 2) {
            System.out.println("Double Super Deluxe Room is booked");
            this.ff = f.farecalculator(d, sdx.rate, ld);
            this.bookno = isdx + "sdx2";
            this.BookDisplay(this.ff, c.name, this.t[isdx][1][0].getTotalCost(), this.l[isdx][1][1].getTotalCost(), this.bookno);
        }

    }

    public void BookDisplay(int ff, String name, int tr, int lr, String b) {
        System.out.println("Booking number " + this.bookno);
        System.out.println("Customer number " + this.cust.no);
        System.out.println("Booking Name " + name);
        System.out.println("Fare is " + ff);
        System.out.println("Total cost of transportation is" + tr);
        System.out.println("Total cost of laundry is" + lr);
    }

    public int getFare() {
        return this.ff;
    }

    public String getName() {
        return this.cust.name;
    }
}
