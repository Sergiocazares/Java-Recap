package Recap;

public class Cat extends Dog {

    private int food;

    public Cat(String name, int age, int food){
        super(name, age);
    }

    public void speak (){
        System.out.println("Meow my name is " + this.name + " and I fed" + this.food);
    }

}
