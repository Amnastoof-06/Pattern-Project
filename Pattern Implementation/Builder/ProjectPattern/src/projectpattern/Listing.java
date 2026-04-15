
package projectpattern;

class Listing {
    public String title;
    public String type;
    public double price;
    public int rooms;

    public void display() {
        System.out.println("\n===== Property Listing =====");
        System.out.println("Title: " + title);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price + "$");
        if (rooms > 0) System.out.println("Rooms: " + rooms);
    }
}
