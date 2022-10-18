public class Human {
    int dateOfBirth;
    String name;
    String city;

    Human(String name, String city, int dateOfBirth) {
        this.name = name;
        this.city = city;
        this.dateOfBirth = dateOfBirth;
    }

    void human() {
        System.out.println("Меня зовут " + name + "! Я из " + city + " и я родился в  " + dateOfBirth + " году.");
    }




}
