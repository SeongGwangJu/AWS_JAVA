package ch16_lombok;


public class SlaveMain {
    public static void main(String[] args) {
        Slave slave = new Slave("주성광", 28);
        Slave slave2 = new Slave("주성광", 28);
        new Slave("주성광");

        System.out.println(slave.equals(slave2));


    }

}
