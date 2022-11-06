package advanced.tasks.phone;

public class Contact {

    //fields
    private String name;
    private String phoneNumber;

    //constructor
    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    //methods
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contact createContact(String name , String phoneNumber){
        return new Contact(name,phoneNumber);
    }

}
