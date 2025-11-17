public class Dynamic {
public static void main(String[] args) {
Animal a= new Animal(); // reference of parent class
a.sound();
a = new Dog(); // object of child class Dog
a.sound(); // Output: Bark
a = new Cat(); // object of child class Cat
a.sound(); // Output: Meow
}
}
class Animal {
void sound() {
System.out.println("Animal makes a sound");
}
}
class Dog extends Animal {
void sound() {
System.out.println("Bark");
}
}
class Cat extends Animal {
void sound() {
System.out.println("Meow");
}
}
