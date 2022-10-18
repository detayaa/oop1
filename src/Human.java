public class Human {
    int dateOfBirth;
    String name;
    String city;
    String post;

    Human(String name, String city, int dateOfBirth, String post) {
        this.name = name;
        this.city = city;
        this.dateOfBirth = dateOfBirth;
        this.post = post;
    }

    void human() {
        System.out.println("Привет! Меня зовут " + name + "! Я из города " + city + ", я родился в " + dateOfBirth + " году. И я работаю на должности " + post + ". Будем знакомы!");
    }




}
