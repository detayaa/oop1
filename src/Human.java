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
        System.out.println("Привет! Меня зовут " + name + "! Я из города " + city + " и я родился в " + dateOfBirth + " году. Будем знакомы!");
    }




}
