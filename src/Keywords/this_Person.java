package Keywords;

public class this_Person {

    //CREATE VARIABLES
    String name;
    int age;

    //ASSIGN THE OBJECT VALUES TO CLASS VARIABLES WITHOUT USING 'this' KEYWORD
//    this_Student(String x, int y){
//        name = x;
//        age = y;
//    }

    //ASSIGN THE OBJECT VALUES TO CLASS VARIABLES WITH USING 'this' KEYWORD
    this_Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //CREATE METHOD FOR SHOW OBJECT VARIABLES
    void show_Detail(){
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {

        //CREATE 'Keywords.this_Person' CLASS OBJECT
        this_Person person_1 = new this_Person("Alex", 22);
        person_1.show_Detail();
    }
}

