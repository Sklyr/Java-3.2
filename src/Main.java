public class Main {
    public static void main(String[] args) {
        int money = 2499;
        int countInbefore = 300;
        int bonus;
        boolean d = (money < 1100);
        int countInafter;
        if (d) {
            bonus = 0;
        } else {
            bonus = money / 100;
        }
        countInafter = countInbefore + money + bonus;
        System.out.println("Count:" + countInafter);
        System.out.println("Bonus: " + bonus);
    }
}
