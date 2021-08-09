package alishev.beginner2;

public class ClassesAndMethods {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Алексей";
        person1.age = 50;
        person1.sayHello();
        person1.speak();

        Person person2 = new Person();
        person2.name = "John";
        person2.age = 51;
        person2.sayHello();
        person2.speak();

    }
}

class Person {
    int age;
    String name;

    void speak() {
        for(int i = 0; i<3; i++){
            System.out.println("Меня зовут " + name + "," + "мне " + age + " лет.");
        }
    }

    void sayHello() {
        System.out.println("Привет!");
    }
}
