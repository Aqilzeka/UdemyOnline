package UdemyTasks;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(int age) {
        if (0>age || age>100){
            age = 0;
        } else {
            this.age = age;
        }
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isTeen(){
        if (12<age && 20>age){
            return true;
        }
        return false;
    }
    public String getFullName(){
        if (firstName.isEmpty() && lastName.isEmpty()){
            return " ";
        } else if (firstName.isEmpty() && !lastName.isEmpty()){
            return lastName;
        } else if (!firstName.isEmpty() && lastName.isEmpty()){
            return firstName;
        } else {
            return firstName + " " + lastName;
        }
    }
}
