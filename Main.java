import java.util.ArrayList;

class Person {
    private String name;
    private int age;

    public Person(String x,
                   int y){
        this.name = x;
        this.age = y;
    }

    public Person(){
        this.name = "-";
        this.age = 0;
    }

    public String toString(){
        return "Name: " + this.name + "\nAge: " + this.age + "\n";
    }

    int getAge(){
        return age;
    }

    String getName(){
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
	    Person persons [] = new Person[10];
	    persons[0] = new Person("Jim", 20);
        persons[1] = new Person("Kate", 18);
        persons[2] = new Person("Alice", 43);
        persons[3] = new Person("Paul", 13);
        persons[4] = new Person("John", 15);
        persons[5] = new Person("Peter", 32);
        persons[6] = new Person("Kim", 11);
        persons[7] = new Person("Lee", 42);
        persons[8] = new Person("Ann", 17);
        persons[9] = new Person("Nick", 25);

        for(Person a : persons)
            System.out.println(a);

        ArrayList<String> adults = new ArrayList<>();
        for (int i=0; i < 10; i++){
            if (persons[i].getAge() >= 18)
                adults.add(persons[i].getName());
        }

        System.out.println("Adults in ArrayList:");
        for(String x : adults){
            System.out.println(x);
        }
    }
}
