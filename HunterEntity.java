class HunterEntity extends Animal implements Hunter {
    public HunterEntity() {
        super("Hunter", "N/A", 1);
    }

    @Override
    public boolean canHunt(Animal target) {
        return this.distanceTo(target) <= 8;
    }

    @Override
    public void hunt(Animal target) {
        System.out.println(this.type + " avladi: " + target.getType());
    }
}
