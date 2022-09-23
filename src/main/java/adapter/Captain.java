package adapter;

public final class Captain {

    private Rowing row;

    public Captain(Rowing row) {
        this.row = row;
    }

    void row() {
        row.row();
    }

}