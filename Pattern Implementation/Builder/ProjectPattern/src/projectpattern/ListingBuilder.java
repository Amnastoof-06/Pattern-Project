
package projectpattern;

interface ListingBuilder {
    void buildBasicInfo();
    void buildPrice();
    void buildRooms();
    Listing getResult();
}
