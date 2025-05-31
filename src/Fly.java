public class Fly {
    //Instance Variables
    private double mass;
    private double speed;

    //Constructors
    public Fly(double mass, double speed) {
        this.mass = mass;
        this.speed = speed;
    }

    public Fly(double mass) {
        this(mass, 10);
    }

    public Fly() {
        this(5.0, 10.0);
    }

    public double getMass() {
        return this.mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getSpeed() {
        return this.speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void grow(int amount) {
        if (this.mass + amount <=20) {
            this.speed += amount;
        }
        else if (this.mass < 20) {
                this.speed += (20 - this.mass) - ((this.mass + amount -20) * 0.5);
        }
        else {
            this.speed -= amount * 0.5;
        }
        this.mass += amount;
    }

    public String toString () {
        if (mass == 0) {
            return "I’m dead, but I used to be a fly with a speed of " + String.format("%.2f", speed) + ".";
        } else {
            return "I’m a speedy fly with " + String.format("%.2f", speed) + " speed and " + String.format("%.2f", mass) + " mass.";
        }
    }

    public boolean isDead() {
        return (this.mass == 0.0);
    }

}





