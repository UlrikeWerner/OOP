public class Person {
    String name;
    int age;
    String gender;
    String nationality;

    public Person(String name){
        this.name = name;
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person(String name, int age, String gender, String nationality){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.nationality = nationality;
    }

    public void greeting(){
        if(this.age > 0){
            System.out.println("Hallo, ich bin " + this.name + " und bin " + this.age + " Jahre alt.");
        } else {
            System.out.println("Hallo, ich bin " + this.name + ".");
        }

        if(this.gender != null){
            if(this.nationality != null){
                System.out.println("Ich bin " + this.gender +  " und komme aus " + this.nationality);
            } else {
                System.out.println("Ich bin " + this.gender + ".");
            }
        } else {
            if(this.nationality != null){
                System.out.println("Ich komme aus " + this.nationality + ".");
            }
        }
        System.out.println();
    }
}
