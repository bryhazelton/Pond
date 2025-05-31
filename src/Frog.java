public class Frog {
    //instance variables of object of class Frog
    private String name;
    private int age;
    private double tongueSpeed;
    private boolean isFroglet;
    private double ageInYears;

    //class variable
    private static String species = "Rare Pepe";

    //Constructors
    public Frog(String name, int age, double tongueSpeed) {
        this(name);
        this.age = age;
        this.tongueSpeed = tongueSpeed;
    }

    public Frog(String name, double ageInYears, double tongueSpeed) {
        this(name);
        this.age = (int)ageInYears * 12;
        this.tongueSpeed = tongueSpeed;
    }

    public Frog(String name, String species) {
        this(name);
        Frog.species = species;
    }

    public Frog(String name) {
        this.name = name;
        this.age = 5;
        this.tongueSpeed = 5;
        this.isFroglet = true;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public static String getSpecies() {
        return species;
    }
    public static void setSpecies(String species) {
        Frog.species = species;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public double getTongueSpeed(){
        return this.tongueSpeed;
    }

    public void grow(int months) {
        if (age + months <= 12) {
            tongueSpeed += months;
        } else if (age <= 12 && age + months > 12) {
            tongueSpeed += 12 - age;
            }

        if (age < 30 && age + months > 30) {
            tongueSpeed -= (age + months) - 30;
            }
        if (age >= 30){
            tongueSpeed -= months;
            }

        age += months;

        if (age < 1 || age > 7) {
            isFroglet = false;
            }
        if (tongueSpeed < 5) {
            tongueSpeed = 5;
            }
    }

    public void grow(){
        grow(1);
    }

    public void eat(Fly fly) {
        if (!fly.isDead()){
            if (this.getTongueSpeed() > fly.getSpeed()){
                if ((fly.getMass() * 0.5) >= this.getAge()){
                    this.grow(1);
                    fly.setMass(0);
                }
            }else{
                fly.grow(1);
            }
        }
    }

    public String toString() {
        if (isFroglet) {
            return "My name is " + name + " and I’m a rare froglet! I’m " + age + " months old and my tongue has a speed of " + String.format("%.2f.",tongueSpeed);
        }
        else {
            return "My name is " + name + " and I’m a rare frog. I’m " + age + " months old and my tongue has a speed of " + String.format("%.2f.",tongueSpeed);
        }
    }
}
