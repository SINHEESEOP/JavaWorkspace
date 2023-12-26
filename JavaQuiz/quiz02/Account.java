package quiz02;

public class Account {
    String name;
    String password;
    int balance;

    public Account() {}
    Account(String name1, String password1, int balance1) {
        name = name1;
        password = password1;
        balance = balance1;
    }

    void deposit (int balance1) {
         balance += balance1;
    }
    void withDraw(int balance1) {
        balance -= balance1;
    }
    int getBalance() {
        return balance;
    }
}
