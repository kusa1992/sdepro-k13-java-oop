package lab_08;

import java.security.SecureRandom;

public class AnimalWithBuilder {

    private String name;
    private boolean flyable;
    final int MAX_SPEED = 75;
    protected int randomSpeed;

    public AnimalWithBuilder() {
    }

    protected AnimalWithBuilder(Builder builder){
       name = builder.name;
       flyable = builder.flyable;
       randomSpeed = builder.randomSpeed;
    }

    public String getName() {
        return name;
    }

    public boolean isFlyable() {
        return flyable;
    }

    public int getRandomSpeed() {
        return randomSpeed;
    }

    @Override
    public String toString() {
        return "AnimalWithBuilder{" +
                "name='" + name + '\'' +
                ", flyable=" + flyable +
                ", randomSpeed=" + randomSpeed +
                '}';
    }

    public static class Builder {
        private String name;
        private boolean flyable;
        protected int randomSpeed;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder withWings(boolean flyable) {
            this.flyable = flyable;
            return this;
        }

        public Builder setRandomSpeed(int randomSpeed) {
            this.randomSpeed = randomSpeed;
            return this;
        }

        public AnimalWithBuilder build(){
            return new AnimalWithBuilder(this);
        }
    }

    public int getSpeed() {
        return randomSpeed = new SecureRandom().nextInt(MAX_SPEED) ;
    }

}
