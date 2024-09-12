import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Задача 1
//        Person person = new Person("Марко", 33, "Мужской");
//        person.displayInfo();
//        person.newAge();
//        person.changeName("Роберт");

//        Задача 2
//        Manager manager = new Manager("Кевин", 44, "Мужской", 100000);
//        Worker worker1 = new Worker("Себастьян", 26, "Мужской", 70000);
//        Worker worker2 = new Worker("Джереми", 56, "Мужской", 70000);
//
//        manager.addSubordinate(worker1);
//        manager.addSubordinate(worker2);
//
//        manager.displayInfo();

//        Задача 3
//        Animal[] animals = new Animal[3];
//        animals[0] = (Animal) new Dog();
//        animals[1] = (Animal) new Cat();
//        animals[2] = (Animal) new Cow();
//
//        for (Animal animal : animals) {
//            animal.makeSound();
//        }

//        Задача 4
//        Transport[] transports = new Transport[2];
//        transports[0] = new Car();
//        transports[1] = new Bike();
//
//        for (Transport transport : transports) {
//            transport.move();
//        }

//        Задача 5
//        Library library = new Library();
//        library.addBook(new Book("Гамлет", "Уильям Шекспир", 1603));
//        library.addBook(new Book("Гордость и предубеждение", "Джейн Остин", 1813 ));
//        library.addBook(new Book("Маленькие женщины", "Луиза Мэй Олкотт", 1868 ));
//
//        System.out.println("Книги Шекспира:");
//        for (Book book : library.searchByAuthor("Уильям Шекспир")) {
//            System.out.println(book);
//        }
//
//        System.out.println("\nКниги, вышевшие в 1813:");
//        for (Book book : library.searchByYear(1813)) {
//            System.out.println(book);
//        }

    }
}


// Задача 1
//class Person {
//    String name;
//    int age;
//    String gender;
//
//    Person(String name, int age, String gender) {
//        this.name = name;
//        this.age = age;
//        this.gender = gender;
//    }
//
//    void displayInfo() {
//        System.out.printf("Имя: %s, возраст: %d, пол: %s", name, age, gender);
//    }
//
//    void newAge() {
//        age++;
//        System.out.printf("\nНовый возраст: %s", age);
//    }
//
//    void changeName(String newName) {
//        this.name = newName;
//        System.out.printf("\nНовое имя: %s", newName);
//    }
//}

// Задача 2
//class Worker extends Person{
//    double salary;
//
//    Worker(String name, int age, String gender, double salary) {
//        super(name, age, gender);
//        this.salary = salary;
//    }
//
//    void displayInfo() {
//        super.displayInfo();
//        System.out.printf(" Зарплата: %f", salary);
//    }
//}
//
//class Manager extends Worker  {
//    List<Worker> subordinates;
//
//    Manager(String name, int age, String gender, double salary) {
//        super(name, age, gender, salary);
//        this.subordinates = new ArrayList<>();
//    }
//
//    void addSubordinate(Worker worker) {
//        subordinates.add(worker);
//    }
//
//    void displayInfo() {
//        super.displayInfo();
//        System.out.print("\nПодчинённые: ");
//        for (Worker worker : subordinates) {
//            System.out.print(worker.name + " ");
//        }
//    }
//}

// Задача 3
//interface Animal {
//    void makeSound();
//}
//
//class Dog implements Animal {
//    @Override
//    public void makeSound() {
//        System.out.println("Гав!");
//    }
//}
//
//class Cat implements Animal {
//    @Override
//    public void makeSound() {
//        System.out.println("Мяу!");
//    }
//}
//
//class Cow implements Animal {
//    @Override
//    public void makeSound() {
//        System.out.println("Му!");
//    }
//}

// Задача 4
//abstract class Transport {
//    abstract void move();
//}
//
//class Car extends Transport {
//    @Override
//    void move() {
//        System.out.println("Машина движется по автомобильной дороге");
//    }
//}
//
//class Bike extends Transport {
//    @Override
//    void move() {
//        System.out.println("Велосипед движется по велодорожке");
//    }
//}

// Задача 5
//class Book {
//    String title;
//    String author;
//    int year;
//
//    // Конструктор
//    Book(String title, String author, int year) {
//        this.title = title;
//        this.author = author;
//        this.year = year;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public int getYear() {
//        return year;
//    }
//
//    @Override
//    public String toString() {
//        return title + " Автор: " + author + " Год: " + year;
//    }
//}
//
//class Library {
//    List<Book> books;
//
//    Library() {
//        books = new ArrayList<>();
//    }
//
//    void addBook(Book book) {
//        books.add(book);
//    }
//
//    List<Book> searchByAuthor(String author) {
//        List<Book> result = new ArrayList<>();
//        for (Book book : books) {
//            if (book.getAuthor().equalsIgnoreCase(author)) {
//                result.add(book);
//            }
//        }
//        return result;
//    }
//
//    List<Book> searchByYear(int year) {
//        List<Book> result = new ArrayList<>();
//        for (Book book : books) {
//            if (book.getYear() == year) {
//                result.add(book);
//            }
//        }
//        return result;
//    }
//}

// Задача 6




// Задача 7



// Задача 8




// Задача 9



// Задача 10



// Задача 11



// Задача 12



// Задача 13



// Задача 14



// Задача 15



// Задача 16



// Задача 17



// Задача 18



// Задача 19



// Задача 20



