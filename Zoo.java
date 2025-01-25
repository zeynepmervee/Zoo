import java.util.*;

class Zoo {
    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void simulate(int moves) {
        for (int i = 0; i < moves; i++) {
            System.out.println("--- Hareket " + (i + 1) + " ---");
            List<Animal> newAnimals = new ArrayList<>();
            Iterator<Animal> iterator = animals.iterator();

            while (iterator.hasNext()) {
                Animal animal = iterator.next();
                animal.move();

                // Avlanma kontrolü
                if (animal instanceof Hunter hunter) {
                    for (Animal target : animals) {
                        if (hunter.canHunt(target)) {
                            hunter.hunt(target);
                            iterator.remove();
                            break;
                        }
                    }
                }

                // Üreme kontrolü
                if (animal instanceof Reproducible reproducible) {
                    for (Animal other : animals) {
                        if (reproducible.canReproduceWith(other)) {
                            newAnimals.add(reproducible.reproduce());
                            break;
                        }
                    }
                }
            }

            animals.addAll(newAnimals);
            System.out.println("Toplam hayvan sayisi: " + animals.size());
        }
    }
}
