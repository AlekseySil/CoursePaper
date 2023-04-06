public class Id {
    private int id;
    static int counter = 1000;

    Id() {
        id = counter++;
    }

    @Override
    public String toString() {
        return " id = " + id ;
    }
}
