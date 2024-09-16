import java.util.*;
import java.util.stream.Collectors;

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

//        Задача 6
//        BankAccount account = new BankAccount(838995, 10000.0);
//
//        System.out.println("Номер счёта: " + account.getAccountNumber());
//        System.out.println("Текущий баланс: " + account.getBalance());
//
//        account.refill(1200.0);
//        System.out.println("Текущий баланс: " + account.getBalance());
//
//        account.withdrawal(5000.0);
//        System.out.println("Текущий баланс: " + account.getBalance());

//        Задача 7
//        Counter x1 = new Counter();
//        Counter x2 = new Counter();
//        Counter x3 = new Counter();
//        Counter x4 = new Counter();
//
//        System.out.println("Количество созданных объектов: " + Counter.getCount());

//        Задача 8
//        Circle circle = new Circle(10.0);
//        Rectangle rectangle = new Rectangle(12.0, 15.0);
//
//        System.out.println("Площадь круга: " + circle.getArea());
//        System.out.println("Площадь прямоугольника: " + rectangle.getArea());

//        Задача 9
//        Animal fish = new Fish();
//        Animal bird = new Bird();
//        Animal dog = new Dog();
//
//        fish.move();
//        bird.move();
//        dog.move();

//        Задача 10
//        University university = new University();
//
//        university.addStudent(new Student("Игорь", 2 , 4));
//        university.addStudent(new Student("Сергей", 4, 5));
//        university.addStudent(new Student("Олег", 4, 3));
//
//        System.out.println("Сортировка по имени:");
//        List<Student> sortedByName = university.sortByName();
//        university.printStudents(sortedByName);
//
//        System.out.println("Фильтрация по успеваемости (минимальная оценка 4):");
//        List<Student> filteredByGrade = university.filterStudentsByGrade(4);
//        university.printStudents(filteredByGrade);

//        Задача 11
//        Store store = new Store();
//
//        store.addProduct(new Product("Молоко", 80.0, 15));
//        store.addProduct(new Product("Хлеб", 45.0, 50));
//        store.addProduct(new Product("Сыр", 220.0, 30));
//
//        System.out.println("Список продуктов:");
//        store.printProducts();
//
//        String searchName = "Хлеб";
//        Product foundProduct = store.findProduct(searchName);
//        if (foundProduct != null) {
//            System.out.println("Найден продукт: " + foundProduct);
//        } else {
//            System.out.println("Продукт с именем '" + searchName + "' не найден.");
//        }
//
//        String removeName = "Молоко";
//        boolean removed = store.removeProduct(removeName);
//        if (removed) {
//            System.out.println("Продукт с именем '" + removeName + "' удален.");
//        } else {
//            System.out.println("Продукт с именем '" + removeName + "' не найден.");
//        }
//
//        System.out.println("Обновленный список продуктов:");
//        store.printProducts();

//        Задача 12
//        PaymentSystem creditCard = new CreditCard("1234 5678 9123 4567");
//        PaymentSystem payPal = new PayPal("qwerty@gmail.com");
//
//        creditCard.pay(250.0);
//        creditCard.refund(20.0);
//
//        payPal.pay(300.0);
//        payPal.refund(37.0);

//        Задача 13
//        ExampleClass object1 = new ExampleClass("объект1");
//        ExampleClass object2 = new ExampleClass("объект2");
//        ExampleClass object3 = new ExampleClass("объект3");
//
//        System.out.println(object1);
//        System.out.println(object2);
//        System.out.println(object3);

//        Задача 14
//        Point topLeft = new Point(1, 5);
//        Point bottomRight = new Point(6, 2);
//
//        Rectangle rectangle = new Rectangle(topLeft, bottomRight);
//
//        System.out.println("Прямоугольник: " + rectangle);
//        System.out.println("Площадь прямоугольника: " + rectangle.getArea());

//        Задача 15
//        ComplexNumber c1 = new ComplexNumber(3, 4);
//        ComplexNumber c2 = new ComplexNumber(1, -2);
//
//        System.out.println("c1: " + c1);
//        System.out.println("c2: " + c2);
//
//        ComplexNumber sum = c1.add(c2);
//        System.out.println("Сумма c1 и c2: " + sum);
//
//        ComplexNumber difference = c1.subtract(c2);
//        System.out.println("Разность c1 и c2: " + difference);
//
//        ComplexNumber product = c1.multiply(c2);
//        System.out.println("Произведение c1 и c2: " + product);
//
//        ComplexNumber quotient = c1.divide(c2);
//        System.out.println("Частное c1 и c2: " + quotient);

//        Задача 16
//        Matrix m1 = new Matrix(new int[][]{{1, 2}, {3, 4}});
//        Matrix m2 = new Matrix(new int[][]{{5, 6}, {7, 8}});
//
//        System.out.println("Матрица m1:");
//        System.out.println(m1);
//        System.out.println("Матрица m2:");
//        System.out.println(m2);
//
//        Matrix sum = m1.add(m2);
//        System.out.println("Сумма m1 и m2:");
//        System.out.println(sum);
//
//        Matrix product = m1.multiply(m2);
//        System.out.println("Произведение m1 и m2:");
//        System.out.println(product);

//        Задача 17
//        Weapon sword = new Weapon("Меч", 10);
//        Weapon bow = new Weapon("Лук", 8);
//        Player player = new Player("Герой", 100, sword);
//        Enemy enemy = new Enemy("Злодей", 50, bow);
//        System.out.println("Игрок: " + player);
//        System.out.println("Враг: " + enemy);
//
//        player.attack(enemy);
//        enemy.attack(player);
//        player.attack(enemy);
//        enemy.attack(player);
//
//        System.out.println("Игрок: " + player);
//        System.out.println("Враг: " + enemy);

//        Задача 18
//        Product phone = new Product("Телефон", 80000.0);
//        Product computer = new Product("Компьютер", 120000.0);
//        Product headphones = new Product("Наушники", 5000.0);
//
//        Order order1 = new Order();
//        order1.addProduct(phone);
//        order1.addProduct(computer);
//
//        Order order2 = new Order();
//        order2.addProduct(headphones);
//        order2.addProduct(phone);
//
//        Customer customer = new Customer("Олег");
//        customer.addOrder(order1);
//        customer.addOrder(order2);
//
//        customer.displayOrderHistory();

//        Задача 19
//        Smartphone smartphone = new Smartphone("Apple");
//        Laptop laptop = new Laptop("Huawei");
//
//        System.out.println(smartphone);
//        System.out.println(laptop);
//
//        smartphone.turnOn();
//        laptop.turnOn();
//
//        smartphone.takePhoto();
//        laptop.runApplication("Telegram");
//
//        smartphone.turnOff();
//        laptop.turnOff();

//        Задача 20
        Player player1 = new Player("Игрок 1", 'X');
        Player player2 = new Player("Игрок 2", 'O');

        Game game = new Game(player1, player2);
        game.startGame();
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
//class BankAccount {
//    int accountNumber;
//    double balance;
//
//    public BankAccount(int accountNumber, double intialBalance) {
//        this.accountNumber = accountNumber;
//        this.balance = intialBalance;
//    }
//
//    void refill (double amount) {
//        if (amount > 0) {
//            balance += amount;
//            System.out.println("Счёт пополнен на " + amount);
//        }
//        else {
//            System.out.println("Сумма пополнения не может быть отрицательной");
//        }
//    }
//
//    void withdrawal (double amount) {
//        if (amount > 0 && amount <= balance) {
//            balance -= amount;
//            System.out.println("Со счёта снято " + amount);
//        }
//        else if (amount <= 0) {
//            System.out.println("Сумма пополнения не может быть отрицательной");
//        }
//        else {
//            System.out.println("На счёте недостаточно средств");
//        }
//    }
//
//    double getBalance() {
//        return balance;
//    }
//
//    int getAccountNumber() {
//        return accountNumber;
//    }
//}

// Задача 7
//class Counter {
//    static int count = 0;
//
//    Counter() {
//        count++;
//    }
//
//    static int getCount() {
//        return count;
//    }
//}

// Задача 8
//abstract class Shape {
//    abstract double getArea();
//}
//
//class Circle extends Shape {
//    double radius;
//
//    Circle(double radius) {
//        this.radius = radius;
//    }
//
//    @Override
//    double getArea() {
//        return Math.PI * radius * radius;
//    }
//}
//
//class Rectangle extends Shape {
//    double a, b;
//
//    Rectangle(double a, double b) {
//        this.a = a;
//        this.b = b;
//    }
//
//    @Override
//    double getArea() {
//        return a * b;
//    }
//}

// Задача 9
//class Animal {
//    void move() {
//        System.out.println("Животное двигается");
//    }
//}
//
//class Fish extends Animal {
//    @Override
//    void move() {
//        System.out.println("Рыба плавает");
//    }
//}
//
//class Bird extends Animal {
//    @Override
//    void move() {
//        System.out.println("Птица летает");
//    }
//}
//
//class Dog extends Animal {
//    @Override
//    void move() {
//        System.out.println("Собака бегает");
//    }
//}

// Задача 10
//class Student {
//    String name;
//    int group;
//    int grade;
//
//    Student(String name, int group, int grade) {
//        this.name = name;
//        this.group = group;
//        this.grade = grade;
//    }
//
//    String getName() {
//        return name;
//    }
//
//    void setName(String name) {
//        this.name = name;
//    }
//
//    int getGroup() {
//        return group;
//    }
//
//    void setGroup(int group) {
//        this.group = group;
//    }
//
//    int getGrade() {
//        return grade;
//    }
//
//    void setGrade(int grade) {
//        this.grade = grade;
//    }
//
//    @Override
//    String toString() {
//        return "Имя: " + name + ", группа: " + group + ", оценка: " + grade;
//    }
//}
//
//class University {
//    List<Student> students;
//
//    University() {
//        this.students = new ArrayList<>();
//    }
//
//    void addStudent(Student student) {
//        students.add(student);
//    }
//
//    List<Student> sortByName() {
//        List<Student> sortedStudents = new ArrayList<>(students);
//        Collections.sort(sortedStudents, Comparator.comparing(Student::getName));
//        return sortedStudents;
//    }
//
//    List<Student> filterStudentsByGrade(int minGrade) {
//        return students.stream()
//                .filter(student -> student.getGrade() >= minGrade)
//                .collect(Collectors.toList());
//    }
//
//    void printStudents(List<Student> studentList) {
//        for (Student student : studentList) {
//            System.out.println(student);
//        }
//    }
//}

// Задача 11
//class Product {
//    String name;
//    double price;
//    int quantity;
//
//    Product(String name, double price, int quantity) {
//        this.name = name;
//        this.price = price;
//        this.quantity = quantity;
//    }
//
//    String getName() {
//        return name;
//    }
//
//    void setName(String name) {
//        this.name = name;
//    }
//
//    double getPrice() {
//        return price;
//    }
//
//    void setPrice(double price) {
//        this.price = price;
//    }
//
//    int getQuantity() {
//        return quantity;
//    }
//
//    void setQuantity(int quantity) {
//        this.quantity = quantity;
//    }
//
//    @Override
//    public String toString() {
//        return "Название: " + name + ", цена: " + price + ", количество: " + quantity;
//    }
//}
//
//class Store {
//    List<Product> products;
//
//    Store() {
//        this.products = new ArrayList<>();
//    }
//
//    void addProduct(Product product) {
//        products.add(product);
//    }
//
//    public boolean removeProduct(String name) {
//        return products.removeIf(product -> product.getName().equals(name));
//    }
//
//    // Метод для поиска продукта по имени
//    public Product findProduct(String name) {
//        for (Product product : products) {
//            if (product.getName().equals(name)) {
//                return product;
//            }
//        }
//        return null;
//    }
//
//    public void printProducts() {
//        for (Product product : products) {
//            System.out.println(product);
//        }
//    }
//}

// Задача 12
//interface PaymentSystem {
//    void pay(double amount);
//    void refund(double amount);
//}
//
//class CreditCard implements PaymentSystem {
//    String cardNumber;
//
//    CreditCard(String cardNumber) {
//        this.cardNumber = cardNumber;
//    }
//
//    @Override
//    public void pay(double amount) {
//        System.out.println("Оплата " + amount + " с помощью карты " + cardNumber);
//    }
//
//    @Override
//    public void refund(double amount) {
//        System.out.println("Возврат " + amount + " на карту " + cardNumber);
//    }
//}
//
//class PayPal implements PaymentSystem {
//    String email;
//
//    PayPal(String email) {
//        this.email = email;
//    }
//
//    @Override
//    public void pay(double amount) {
//        System.out.println("Оплата " + amount + " через PayPal с аккаунта " + email);
//    }
//
//    @Override
//    public void refund(double amount) {
//        System.out.println("Возврат " + amount + " на аккаунт PayPal " + email);
//    }
//}

// Задача 13
//class UniqueID {
//    static int lastID = 0;
//
//    static int generateID() {
//        return ++lastID;
//    }
//}
//
//class ExampleClass {
//    int id;
//    String name;
//
//    ExampleClass(String name) {
//        this.name = name;
//        this.id = UniqueID.generateID();
//    }
//
//    int getId() {
//        return id;
//    }
//
//    String getName() {
//        return name;
//    }
//
//    @Override
//    public String toString() {
//        return "id: " + id + ", объект: " + name;
//    }
//}

// Задача 14
//class Point {
//    int x, y;
//
//    Point(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    int getX() {
//        return x;
//    }
//
//    int getY() {
//        return y;
//    }
//
//    @Override
//    public String toString() {
//        return "x: " + x + ", y:" + y;
//    }
//}
//
//class Rectangle {
//    Point topLeft;
//    Point bottomRight;
//
//    Rectangle(Point topLeft, Point bottomRight) {
//        this.topLeft = topLeft;
//        this.bottomRight = bottomRight;
//    }
//
//    int getArea() {
//        int width = bottomRight.getX() - topLeft.getX();
//        int height = topLeft.getY() - bottomRight.getY();
//        return width * height;
//    }
//
//    @Override
//    public String toString() {
//        return "Левая верхняя точка: " + topLeft + ", правая нижняя точка: " + bottomRight;
//    }
//}

// Задача 15
//class ComplexNumber {
//    double real;
//    double imaginary;
//
//    ComplexNumber(double real, double imaginary) {
//        this.real = real;
//        this.imaginary = imaginary;
//    }
//
//    double getReal() {
//        return real;
//    }
//
//    void setReal(double real) {
//        this.real = real;
//    }
//
//    double getImaginary() {
//        return imaginary;
//    }
//
//    void setImaginary(double imaginary) {
//        this.imaginary = imaginary;
//    }
//
//    ComplexNumber add(ComplexNumber other) {
//        double realPart = this.real + other.real;
//        double imaginaryPart = this.imaginary + other.imaginary;
//        return new ComplexNumber(realPart, imaginaryPart);
//    }
//
//    ComplexNumber subtract(ComplexNumber other) {
//        double realPart = this.real - other.real;
//        double imaginaryPart = this.imaginary - other.imaginary;
//        return new ComplexNumber(realPart, imaginaryPart);
//    }
//
//    ComplexNumber multiply(ComplexNumber other) {
//        double realPart = this.real * other.real - this.imaginary * other.imaginary;
//        double imaginaryPart = this.real * other.imaginary + this.imaginary * other.real;
//        return new ComplexNumber(realPart, imaginaryPart);
//    }
//
//    ComplexNumber divide(ComplexNumber other) {
//        double denominator = other.real * other.real + other.imaginary * other.imaginary;
//        double realPart = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
//        double imaginaryPart = (this.imaginary * other.real - this.real * other.imaginary) / denominator;
//        return new ComplexNumber(realPart, imaginaryPart);
//    }
//
//    @Override
//    public String toString() {
//        if (imaginary >= 0) {
//            return real + " + " + imaginary + "i";
//        } else {
//            return real + " - " + (-imaginary) + "i";
//        }
//    }
//}

// Задача 16
//class Matrix {
//    int rows;
//    int cols;
//    int[][] data;
//
//    Matrix(int rows, int cols) {
//        this.rows = rows;
//        this.cols = cols;
//        this.data = new int[rows][cols];
//    }
//
//    Matrix(int[][] data) {
//        this.rows = data.length;
//        this.cols = data[0].length;
//        this.data = new int[rows][cols];
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                this.data[i][j] = data[i][j];
//            }
//        }
//    }
//
//    Matrix add(Matrix other) {
//        if (this.rows != other.rows || this.cols != other.cols) {
//            throw new IllegalArgumentException("Матрицы должны иметь одинаковые размеры для сложения.");
//        }
//
//        Matrix result = new Matrix(rows, cols);
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                result.data[i][j] = this.data[i][j] + other.data[i][j];
//            }
//        }
//        return result;
//    }
//
//    Matrix multiply(Matrix other) {
//        if (this.cols != other.rows) {
//            throw new IllegalArgumentException("Количество столбцов первой матрицы должно быть равно количеству строк второй матрицы.");
//        }
//
//        Matrix result = new Matrix(this.rows, other.cols);
//        for (int i = 0; i < this.rows; i++) {
//            for (int j = 0; j < other.cols; j++) {
//                for (int k = 0; k < this.cols; k++) {
//                    result.data[i][j] += this.data[i][k] * other.data[k][j];
//                }
//            }
//        }
//        return result;
//    }
//
//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                sb.append(data[i][j]).append(" ");
//            }
//            sb.append("\n");
//        }
//        return sb.toString();
//    }
//}

// Задача 17
//class Weapon {
//    String name;
//    int damage;
//
//    Weapon(String name, int damage) {
//        this.name = name;
//        this.damage = damage;
//    }
//
//    String getName() {
//        return name;
//    }
//
//    int getDamage() {
//        return damage;
//    }
//
//    @Override
//    public String toString() {
//        return name + " (урон: " + damage + ")";
//    }
//}
//
//class Enemy {
//    String name;
//    int health;
//    Weapon weapon;
//
//    Enemy(String name, int health, Weapon weapon) {
//        this.name = name;
//        this.health = health;
//        this.weapon = weapon;
//    }
//
//    String getName() {
//        return name;
//    }
//
//    int getHealth() {
//        return health;
//    }
//
//    void setHealth(int health) {
//        this.health = health;
//    }
//
//    Weapon getWeapon() {
//        return weapon;
//    }
//
//    void attack(Player player) {
//        int damage = weapon.getDamage();
//        player.takeDamage(damage);
//        System.out.println(name + " атакует " + player.getName() + " с помощью " + weapon.getName() + " и наносит " + damage + " урона.");
//    }
//
//    @Override
//    public String toString() {
//        return name + " (здоровье: " + health + ", оружие: " + weapon + ")";
//    }
//}
//
//class Player {
//    String name;
//    int health;
//    Weapon weapon;
//
//    Player(String name, int health, Weapon weapon) {
//        this.name = name;
//        this.health = health;
//        this.weapon = weapon;
//    }
//
//    String getName() {
//        return name;
//    }
//
//    int getHealth() {
//        return health;
//    }
//
//    void setHealth(int health) {
//        this.health = health;
//    }
//
//    Weapon getWeapon() {
//        return weapon;
//    }
//
//    void takeDamage(int damage) {
//        health -= damage;
//        if (health < 0) {
//            health = 0;
//        }
//        System.out.println(name + " получает " + damage + " урона. Текущее здоровье: " + health);
//    }
//
//    void attack(Enemy enemy) {
//        int damage = weapon.getDamage();
//        enemy.setHealth(enemy.getHealth() - damage);
//        System.out.println(name + " атакует " + enemy.getName() + " с помощью " + weapon.getName() + " и наносит " + damage + " урона.");
//    }
//
//    @Override
//    public String toString() {
//        return name + " (здоровье: " + health + ", оружие: " + weapon + ")";
//    }
//}

// Задача 18
//class Product {
//    String name;
//    double price;
//
//    Product(String name, double price) {
//        this.name = name;
//        this.price = price;
//    }
//
//    String getName() {
//        return name;
//    }
//
//    double getPrice() {
//        return price;
//    }
//
//    @Override
//    public String toString() {
//        return name + " (цена: " + price + ")";
//    }
//}
//
//class Order {
//    static int orderCounter = 0;
//    int orderId;
//    List<Product> products;
//
//    Order() {
//        this.orderId = ++orderCounter;
//        this.products = new ArrayList<>();
//    }
//
//    void addProduct(Product product) {
//        products.add(product);
//    }
//
//    double getTotalCost() {
//        double totalCost = 0;
//        for (Product product : products) {
//            totalCost += product.getPrice();
//        }
//        return totalCost;
//    }
//
//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("Заказ #").append(orderId).append(":\n");
//        for (Product product : products) {
//            sb.append("- ").append(product).append("\n");
//        }
//        sb.append("Общая стоимость: ").append(getTotalCost()).append("\n");
//        return sb.toString();
//    }
//}
//
//class Customer {
//    String name;
//    List<Order> orders;
//
//    Customer(String name) {
//        this.name = name;
//        this.orders = new ArrayList<>();
//    }
//
//    void addOrder(Order order) {
//        orders.add(order);
//    }
//
//    void displayOrderHistory() {
//        System.out.println("История заказов покупателя " + name + ":");
//        for (Order order : orders) {
//            System.out.println(order);
//        }
//    }
//
//    @Override
//    public String toString() {
//        return name;
//    }
//}

// Задача 19
//class Device {
//    protected String brand;
//
//    Device(String brand) {
//        this.brand = brand;
//    }
//
//    void turnOn() {
//        System.out.println(brand + " устройство включено.");
//    }
//
//    void turnOff() {
//        System.out.println(brand + " устройство выключено.");
//    }
//
//    @Override
//    public String toString() {
//        return "Устройство бренда " + brand;
//    }
//}
//
//class Smartphone extends Device {
//    Smartphone(String brand) {
//        super(brand);
//    }
//
//    void takePhoto() {
//        System.out.println(brand + " смартфон делает фото.");
//    }
//
//    @Override
//    public String toString() {
//        return "Смартфон бренда " + brand;
//    }
//}
//
//class Laptop extends Device {
//    public Laptop(String brand) {
//        super(brand);
//    }
//
//    void runApplication(String appName) {
//        System.out.println(brand + " ноутбук запускает приложение " + appName + ".");
//    }
//
//    @Override
//    public String toString() {
//        return "Ноутбук бренда " + brand;
//    }
//}

// Задача 20
class Player {
    String name;
    char symbol;

    Player(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    String getName() {
        return name;
    }

    char getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return name + " (" + symbol + ")";
    }
}

class Game {
    char[][] board;
    Player player1;
    Player player2;
    Player currentPlayer;
    Scanner scanner;

    Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = player1;
        this.board = new char[3][3];
        this.scanner = new Scanner(System.in);
        initializeBoard();
    }

    void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    void displayBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    boolean checkWin(Player player) {
        char symbol = player.getSymbol();
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) {
                return true;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol) {
                return true;
            }
        }
        if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) {
            return true;
        }
        if (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol) {
            return true;
        }
        return false;
    }

    boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    void makeMove(Player player) {
        int row, col;
        do {
            System.out.println(player.getName() + ", введите номер строки (0-2):");
            row = scanner.nextInt();
            System.out.println(player.getName() + ", введите номер столбца (0-2):");
            col = scanner.nextInt();
        } while (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != '-');

        board[row][col] = player.getSymbol();
    }

    void startGame() {
        System.out.println("Игра началась!");
        while (true) {
            displayBoard();
            makeMove(currentPlayer);
            if (checkWin(currentPlayer)) {
                displayBoard();
                System.out.println(currentPlayer.getName() + " выиграл!");
                break;
            }
            if (isBoardFull()) {
                displayBoard();
                System.out.println("Ничья!");
                break;
            }
            currentPlayer = (currentPlayer == player1) ? player2 : player1;
        }
        scanner.close();
    }
}


