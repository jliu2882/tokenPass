package jliu2882;

public class Main {

    public static void main(String[] args) {
        tokenPass tpass = new tokenPass(4);
        System.out.println(tpass.toString());
        tpass.distributeCurrentPlayerToken();
        System.out.println(tpass.toString());
    }
}

