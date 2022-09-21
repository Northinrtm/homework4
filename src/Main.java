public class Main {
    public static void main(String[] args) {
        Human h1 = new Human(35, "Максим", "Mинск", "бренд-менеджер");
        Human h2 = new Human(29, "Аня", "Москва", "методист образовательных программ");
        Human h3 = new Human(28, "Катя", "Калининград", "продакт-менеджер");
        Human h4 = new Human(27, "Артем", "Москва", null);
        h1.sayHello();
        h2.sayHello();
        h3.sayHello();
        h4.sayHello();
    }
}
