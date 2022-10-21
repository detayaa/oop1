public class Human {
    private int dateOfBirth;
    String name;
    private String city;
    String post;

    Human(String name, String city, int dateOfBirth, String post) {
        if (name == null || name.isEmpty()) {
            this.name = "Информация не указана";
        } else { this.name = name;}

        if (city == null || city.isEmpty()) {
            this.city = "Информация не указана";
        } else { this.city = city;}


        if (dateOfBirth < 0 ) {
            this.dateOfBirth = 0;
        } else { this.dateOfBirth = dateOfBirth;}

        if (post == null || post.isEmpty()) {
            this.post = "Информация не указана";
        } else { this.post = post;}
    }

    void human() {
        System.out.println("Привет! Меня зовут " + name + "! Я из города " + city + ", я родился в " + dateOfBirth + " году. И я работаю на должности " + post + ". Будем знакомы!");
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        if (dateOfBirth > 0) {
            this.dateOfBirth = dateOfBirth;
        } else {
            this.dateOfBirth = 0;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (city != null && !city.isEmpty() && !city.isBlank()) {
            this.city = city;
        } else {
            System.out.println("Информация не указана");
        }
    }
}
