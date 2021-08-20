package Recap;

public class Dog {

    private String name;
    private int age;

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
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

}
