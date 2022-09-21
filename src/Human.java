public class Human {
    Human(int yearOfBirth, String name, String town, String job) {
        if (yearOfBirth <= 0) {
            System.out.println("неверно указан год рождения");
        }
        this.yearOfBirth = yearOfBirth;
        if (name == null) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (town == null) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
        if (job == null) {
            this.job = "Информация не указана";
        } else {
            this.job = job;
        }
    }

    private int yearOfBirth;
    private String name;
    private String town;
    private String job;

    void sayHello() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth +
                " году. Я работаю на должности " + job + ".  Будем знакомы!");
    }
}
