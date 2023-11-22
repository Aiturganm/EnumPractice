package secondpanckage;

public interface PhoneInterface {
    void turnOn(String password);
    void call(long number);
    void call(String name);
    void searchContact(String name);
    void contactUpdate(String oldName, String newName);
    void getAllContacts(Contact[] contacts);

}
