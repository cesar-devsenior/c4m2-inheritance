public class Fish extends Animal implements CanSwim {
    private String color;
    private Boolean formSea;

    public Fish(String name, Integer age, String genre, String color, Boolean formSea) {
        super(name, age, genre);
        this.color = color;
        this.formSea = formSea;
    }

    public String getColor() {
        return color;
    }

    public Boolean isFormSea() {
        return formSea;
    }

    @Override
    public void swim() {
        System.out.printf("%s esta nadando%n", getName());
    }

    public boolean canPutEggs() {
        return getGenre().equalsIgnoreCase("hembra");
    }

    @Override
    public void hunt() {
        System.out.printf("%s esta nadando, se cruza con objetivo, abre la boca y se lo come%n", getName());
    }

    @Override
    public void makeNoise() {
        System.out.printf("%s dice GLOB GLOB%n", getName());
    }
}
