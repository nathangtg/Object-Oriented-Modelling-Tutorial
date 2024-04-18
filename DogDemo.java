public class DogDemo {
    public static void main(String[] Args) {

        int humanYears;

        Dog balto = new Dog();
        balto.name = "Balto";
        balto.age = 8;
        balto.breed = "Siberian Husky";
        balto.WriteOutput();

        Dog scooby = new Dog();
        scooby.name = "Scooby";
        scooby.age = 42;
        scooby.breed = "Great Dane";
        scooby.WriteOutput();

        // Scooby output
        System.out.println(scooby.name + " is a " + scooby.breed + ".");
        System.out.println("He is " + scooby.age + " years old, or ");

        humanYears = scooby.getAgeInHumanYears();
        System.out.println(humanYears + "in human years");
    }
}
