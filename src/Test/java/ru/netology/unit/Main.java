package ru.netology.unit;

public class Main {
    public static void main(String[] args) {
        ru.netology.service.CashbackHackService service  = new ru.netology.service.CashbackHackService();
        {
            System.out.println("It should return 100 for 900");
            int result = service.remain(900);
            System.out.println(100 == result);
        }
    }
}