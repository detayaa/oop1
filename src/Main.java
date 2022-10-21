public class Main {
    public static void main(String[] args) {
        Human maksim = new Human("Максим", "Минск", 1987, "бренд-менеджер");
        maksim.human();
        Human anya = new Human("Аня", "Москва", 1993,"методист образовательных программ");
        anya.human();
        Human katya = new Human("Катя", "Калиниград", 1992, "продакт-менеджер");
        katya.human();
        Human artem = new Human("Артем", "Москва", 1991, "директор по развитию бизнеса");
        artem.human();
        Human vladimir = new Human("Владимир", "Казань", 2001, "сейчас нигде не работаю");
        vladimir.human();


        Flower rose = new Flower("Роза обыкновенная", "Голландии", 35.59,0);
        rose.flower();
        Flower chrysanthemum = new Flower("Хризантема", "", 15.00,5);
        chrysanthemum.flower();
        Flower peony = new Flower("Пион", "Англии", 69.90,1);
        peony.flower();
        Flower gypsophila = new Flower("Гипсофила", "Турции", 19.50,10);
        gypsophila.flower();

    }

}
