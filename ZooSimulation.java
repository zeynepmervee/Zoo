public class ZooSimulation {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        // Hayvanları ekleme
        for (int i = 0; i < 15; i++) zoo.addAnimal(new Sheep(i < 8 ? "Male" : "Female"));
        for (int i = 0; i < 5; i++) zoo.addAnimal(new Cow("Male"));
        for (int i = 0; i < 5; i++) zoo.addAnimal(new Cow("Female"));
        for (int i = 0; i < 10; i++) zoo.addAnimal(new Chicken());
        for (int i = 0; i < 10; i++) zoo.addAnimal(new Rooster());
        for (int i = 0; i < 5; i++) zoo.addAnimal(new Wolf("Male"));
        for (int i = 0; i < 5; i++) zoo.addAnimal(new Wolf("Female"));
        for (int i = 0; i < 4; i++) zoo.addAnimal(new Lion("Male"));
        for (int i = 0; i < 4; i++) zoo.addAnimal(new Lion("Female"));
        zoo.addAnimal(new HunterEntity());

        // Simülasyonu başlat
        zoo.simulate(1000);
    }
}

