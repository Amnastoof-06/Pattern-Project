
package projectpattern;

public class RealEstateApp {
    public static void main(String[] args) {
        ListingDirector director = new ListingDirector();

        // Build apartment
        ListingBuilder aptBuilder = new ApartmentBuilder();
        director.construct(aptBuilder);
        Listing apartment = aptBuilder.getResult();
        apartment.display();

        // Build villa
        ListingBuilder villaBuilder = new VillaBuilder();
        director.construct(villaBuilder);
        Listing villa = villaBuilder.getResult();
        villa.display();
    }
}
