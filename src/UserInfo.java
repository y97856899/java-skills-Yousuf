

public class UserInfo  {
    String name;
    int age;
    String email;
    boolean isActive;


    UserInfo(String name, int age, String email,boolean isActive){
        this.name=name;
        this.age=age;
        this.email=email;
        this.isActive=isActive;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }


    public void displayInfo(){
        System.out.println("Name    :  "+ name);
        System.out.println("Age     :  "+ age  );
        System.out.println("email   :  "+ email);
        System.out.println("isActive:  "+ isActive);
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        UserInfo user1 = new UserInfo("Ahmed",99,"ahmed@gmail.com",true);
        UserInfo user2 = new UserInfo("salim",35,"salim@gmail.com",false);
        UserInfo user3 = new UserInfo("yousuf",33,"yousuf@gmail.com",true);

        user1.displayInfo();
        user2.displayInfo();
        user3.displayInfo();
    }
}