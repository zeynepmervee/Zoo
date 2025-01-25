
import java.util.Random;

class Wolf extends Animal implements Hunter, Reproducible {
    public Wolf(String gender) {
        super("Wolf", gender, 3);
    }

    @Override
    public boolean canHunt(Animal target) {
        return (target instanceof Sheep || target instanceof Chicken || target instanceof Rooster) && this.distanceTo(target) <= 4;
    }

    @Override
    public void hunt(Animal target) {
        System.out.println(this.type + " avladi: " + target.getType());
    }

    @Override
    public boolean canReproduceWith(Animal other) {
        return other instanceof Wolf && !this.gender.equals(other.getGender()) && this.distanceTo(other) <= 3;
    }

    @Override
    public Animal reproduce() {
        return new Wolf(new Random().nextBoolean() ? "Male" : "Female");
    }
}
