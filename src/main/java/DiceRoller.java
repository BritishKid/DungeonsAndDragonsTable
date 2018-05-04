import org.apache.log4j.Logger;

class DiceRoller {

    private static org.apache.log4j.Logger log = Logger.getLogger(DiceRoller.class);

    DiceRoller() {
    }

    static int rollDice(int numberOfDice, int diceValue) {

        int rolls = 0;
        int result = 0;

        log.debug("Rolling " + numberOfDice + "d" + diceValue);

        while(rolls < numberOfDice){
            int diceResult = (int) ((Math.random() * diceValue) + 1);
            result = diceResult + result;
            rolls ++;
        }

        return result;
    }

    //common dice rolls

    static int rollD20(){
        log.debug("Rolling 1d20");

        return (int) ((Math.random() * 20) + 1);
    }
}
