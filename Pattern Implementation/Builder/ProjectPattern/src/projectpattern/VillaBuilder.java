
package projectpattern;


class VillaBuilder implements ListingBuilder {
    private Listing listing = new Listing();

    public void buildBasicInfo() {
        listing.title = "Luxury villa with garden";
        listing.type = "Royal villa";
    }

    public void buildPrice() { 
        listing.price = 5000.0; 
    }

    public void buildRooms() {
        listing.rooms = 6;
    }

    public Listing getResult() { 
        return listing; 
    }
}
