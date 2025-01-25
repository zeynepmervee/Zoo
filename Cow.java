import java.util.Random;

class Cow extends Animal implements Reproducible {
    public Cow(String gender) {
        super("Cow", gender, 2);
    }

    @Override
    public boolean canReproduceWith(Animal other) {
        return other instanceof Cow && !this.gender.equals(other.getGender()) && this.distanceTo(other) <= 3;
    }

    @Override
    public Animal reproduce() {
        return new Cow(new Random().nextBoolean() ? "Male" : "Female");
    }
}
