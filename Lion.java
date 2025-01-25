import java.util.Random;

class Lion extends Animal implements Hunter, Reproducible {
    public Lion(String gender) {
        super("Lion", gender, 4);
    }

    @Override
    public boolean canHunt(Animal target) {
        return (target instanceof Sheep || target instanceof Cow) && this.distanceTo(target) <= 5;
    }

    @Override
    public void hunt(Animal target) {
        System.out.println(this.type + " avladi: " + target.getType());
    }

    @Override
    public boolean canReproduceWith(Animal other) {
        return other instanceof Lion && !this.gender.equals(other.getGender()) && this.distanceTo(other) <= 3;
    }

    @Override
    public Animal reproduce() {
        return new Lion(new Random().nextBoolean() ? "Male" : "Female");
    }
}

