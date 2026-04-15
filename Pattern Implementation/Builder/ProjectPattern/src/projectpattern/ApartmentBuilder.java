
package projectpattern;

class ApartmentBuilder implements ListingBuilder {
    private Listing listing = new Listing();

    public void buildBasicInfo() {
        listing.title = "Modern apartment in city center";
        listing.type = "Residential apartment";
    }

    public void buildPrice() { 
        listing.price = 1500.0; 
    }

    public void buildRooms() {
        listing.rooms = 3;
    }

    public Listing getResult() { 
        return listing; 
    }
}
