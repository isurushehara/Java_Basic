package Encapsulation;

public class User {

    //CREATE PRIVATE VARIABLES
    private String name;
    private String username;

    //CREATE METHOD FOR SET THE NAME
    public void setName(String name){
        this.name = name;
    }
    //CREATE METHOD FOR GET THE NAME
    public String getName(){
        return name;
    }

    //CREATE METHOD FOR SET USERNAME
    public void setUsername(String username){
        this.username = username;
    }

    //DIDN'T CREATE FOR GET THE USERNAME
    //(SO VIEWER CAN'T GET THE USERNAME

}
