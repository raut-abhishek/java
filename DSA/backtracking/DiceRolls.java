// Print All Dice Roll Combinations to Reach a Target Sum


public class DiceRolls {

    public static void rollDice(int target, String result) {
        if (target == 0) {
            System.out.println(result);
            return;
        }

        for (int i = 1; i <= 6; i++) {
            if (i <= target) {
                rollDice(target - i, result + i);
            }
        }
    }

    public static void main(String[] args) {
        int target = 4;
        rollDice(target, "");
    }
}
