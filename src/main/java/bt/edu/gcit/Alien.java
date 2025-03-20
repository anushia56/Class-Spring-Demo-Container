package bt.edu.gcit;
public class Alien {

    // Alien (which depends on Laptop)
    // Laptop (a dependency for Alien)
    // public int age;
    // public int salary;
    // // public Laptop lap;
    private Computer comp;

//DI Setters Injection
    // public int getAge(){
    //     return age;
    // }
    // public void setAge(int age){
    //     System.out.println("Set Alien called");

    //     this.age = age;
    // }

    // public Alien(){
    //     System.out.println("Alien object created");
    // }

    // public void code(){
    //     System.out.println("I am coding");
    //     lap.compile();
    // }

    // public Laptop getLaptop(){
    //     return lap;
    // }

    // public void setlap(Laptop lap){
    //     System.out.println("From setLap");
    //     this.lap = lap;
    // }

//DI Constructor Injection
    // public Alien(int age, Computer computer, int salary){
    //     System.out.println("Alien object created");
    //     // this.age = age;
    //     // // // this.lap = lap;
    //     // this.computer = computer;
    //     // this.salary = salary;
    // }

    // public void code(){
    //     System.out.println("I am coding");
    //     // lap.compile();
    //     comp.compile();
    // }

    public void setComp(Computer comp){
        this.comp = comp;
    }
    public Computer getComp(){
        return comp;
    }

    public Alien(){
        System.out.println("Alien object created");
    }

    public void code(){
        System.out.println("I am coding");
        comp.compile();
    }
}
