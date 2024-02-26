package Object_Class;

//ALWAYS 'Level_2' INHERIT WITH 'Object Class' (Level_1)
//('Level_2' HAS 'Object Class''S METHODS + OWN METHODS)
class Level_2{}

//'Level_3' CLASS INHERIT WITH 'Level_2' CLASS
//('Level_3' HAS 'Object Class''S METHODS + 'Level_2' CLASS'S METHODS + OWN METHODS)
public class Level_3 extends Level_2{
    public static void main(String[] args) {

        //CREATE OBJECTS FOR EACH CLASS
        Level_3 level_3_object = new Level_3();
        Level_2 level_2_object = new Level_2();
        Object level_1_object = new Object();

        //FEW OBJECT CLASS METHODS
        level_1_object.equals(level_2_object);
        level_1_object.hashCode();
        level_1_object.toString();
        level_1_object.getClass();
    }
}
