class DiceRoller {

    DiceRoller() {
    }

    static int rollDice(int numberOfDice, int diceValue) {

        int rolls = 0;
        int result = 0;

        System.out.println("Rolling " + numberOfDice + "d" + diceValue);

        while(rolls < numberOfDice){
            int diceResult = (int) ((Math.random() * diceValue) + 1);
            result = diceResult + result;
            rolls ++;
        }

        return result;
    }
}
