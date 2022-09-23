package adapter;

public class FishingBoatAdapter implements Rowing {
    private final FishingBoat boat = new FishingBoat();

    public final void row() {
        boat.sail();
    }
}