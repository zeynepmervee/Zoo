import java.util.Random;

abstract class Animal implements Movable {
    protected String type;
    protected String gender;
    protected int x, y; // Konum bilgisi
    protected int moveUnit;

    public Animal(String type, String gender, int moveUnit) {
        this.type = type;
        this.gender = gender;
        this.moveUnit = moveUnit;
        this.x = new Random().nextInt(500);
        this.y = new Random().nextInt(500);
    }

    public String getType() {
        return type;
    }

    public String getGender() {
        return gender;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Hareket etme metodu
    @Override
    public void move() {
        Random random = new Random();
        x = Math.max(0, Math.min(500, x + random.nextInt(moveUnit * 2 + 1) - moveUnit));
        y = Math.max(0, Math.min(500, y + random.nextInt(moveUnit * 2 + 1) - moveUnit));
    }

    // İki hayvan arasındaki mesafeyi hesaplama
    public double distanceTo(Animal other) {
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }
}
