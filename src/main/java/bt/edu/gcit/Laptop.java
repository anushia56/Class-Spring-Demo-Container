package bt.edu.gcit;

public class Laptop implements Computer{
    public Laptop(){
        System.out.println("Laptop object created");
    }
    public void compile(){
        System.out.println("Compiling from the laptop class..");
    }
}