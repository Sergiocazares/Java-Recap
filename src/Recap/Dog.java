package Recap;

public class Dog {


    protected static int count = 0;

    protected String name;
    protected int age;

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
        add2();
        speak();
        Dog.count += 1;
        Dog.display();
    }

    public void speak(){
        System.out.println("I am " + this.name + " and I am " + this.age + " year");
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int add2 (){
        return this.age + 2;
    }

    public static void display(){
        System.out.println("I am a dog!");
    }
}
