class Dog {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}

class Main {
    public static void main(String[] args) {
        // Create two Dog instances and set their attributes using the constructor
        Dog dog1 = new Dog("Buddy", "Labrador");
        Dog dog2 = new Dog("Max", "German Shepherd");

        // Print initial values
        System.out.println("Initial Values:");
        System.out.println("Dog 1 - Name: " + dog1.getName() + ", Breed: " + dog1.getBreed());
        System.out.println("Dog 2 - Name: " + dog2.getName() + ", Breed: " + dog2.getBreed());

        // Modify the attributes using setter methods
        dog1.setName("Charlie");
        dog1.setBreed("Golden Retriever");

        dog2.setName("Rocky");
        dog2.setBreed("Bulldog");

        // Print updated values
        System.out.println("\nUpdated Values:");
        System.out.println("Dog 1 - Name: " + dog1.getName() + ", Breed: " + dog1.getBreed());
        System.out.println("Dog 2 - Name: " + dog2.getName() + ", Breed: " + dog2.getBreed());
    }
}