public class Hero extends Human {
    
    private int energy = 100;
    private String name;
    private int age;

    public Hero (String name, int age) {
        this.name = name;
        this.age = age;
    }

    void player() {
        System.out.println("========== Player ========");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Energy: " + this.energy);
        System.out.println("=========================");

    }

    void checkEnergy() {
        if (energy <= 0){
            System.out.println("Energy Anda Telah Habis!" + this.name + "tama!");
            System.exit(0);
        }
    }

    void walks() {
        checkEnergy();
        System.out.println(this.name + " sedang berjalan...");
    }

    void run() {
        checkEnergy();
        System.out.println(this.name + " sedang berlari...");

    }

    void eat() {
        checkEnergy();
        System.out.println(this.name + "sedang makan...");
        energy += 20;
    }

    void drink() {
        checkEnergy();
        System.out.println(this.name + " sedang minum...");
        energy +=20;
    }

    void jump() {
        checkEnergy();
        System.out.println(this.name + " sedang melompat");
        energy -= 20;

    }

    void sit() {
        checkEnergy();
        System.out.println(this.name + " sedang berlari...");
        energy -=30;
    }

    public void attack() {
    }

    public void walk() {
    }

}


