package quiz06;

public class MainCalss {
    public static void main(String[] args) {

//        Computer computer = new Computer();
        KeyBoard a = new KeyBoard();
        Mouse b = new Mouse();
        Monitor c = new Monitor();

        Computer computer = new Computer(a,b,c);
        computer.computerInfo();

        computer.getMonitor().info();



        System.out.println(a == computer.getKeyBoard());
    }
}
