package UdemyTasks;

public class Test {
    public static void main(String[] args) {
        SimpleCalculater calculater = new SimpleCalculater();
        calculater.setFirstNumber(5.0);
        calculater.setSecondNumber(4);
        System.out.println("add=" + calculater.getAdditionResult());
        System.out.println("subtract=" + calculater.getSubtractionResult());
        calculater.setFirstNumber(5.25);
        calculater.setSecondNumber(0);
        System.out.println("multiply= " + calculater.getMultiplicationResult());
        System.out.println("divide= " + calculater.getDivisionResult());

        Person person = new Person();
        person.setAge(-5);
        System.out.println("age : " + person.getAge());
    }
}
