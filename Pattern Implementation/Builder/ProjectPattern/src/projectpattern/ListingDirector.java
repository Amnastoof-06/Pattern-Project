
package projectpattern;


class ListingDirector {
    public void construct(ListingBuilder builder) {
        builder.buildBasicInfo();
        builder.buildPrice();
        builder.buildRooms();
    }
}
