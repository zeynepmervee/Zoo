import java.util.Random;

class Sheep extends Animal implements Reproducible {
    public Sheep(String gender) {
        super("Sheep", gender, 2);
    }

    @Override
    public boolean canReproduceWith(Animal other) {
        return other instanceof Sheep && !this.gender.equals(other.getGender()) && this.distanceTo(other) <= 3;
    }

    @Override
    public Animal reproduce() {
        return new Sheep(new Random().nextBoolean() ? "Male" : "Female");
    }
}

