import org.junit.Test;

class diceRollerTest {

    private DiceRoller diceRoller = new DiceRoller();

    @Test
    public void whenGiven1d4DiceRollsAbove0AndLessThan5() throws Exception {
        //given
        int numberOfDice = 1;
        int diceValue = 1;

        //when
        int diceResult = DiceRoller.rollDice(numberOfDice, diceValue);
        //then
        assert(diceResult <= 4 &&
                diceResult > 0);
    }

    @Test
    public void whenGiven2d6DiceRollsAbove1AndLessThan13() throws Exception {
        //given
        int diceValue = 6;
        int numberOfDice = 2;

        //when
        int diceResult = DiceRoller.rollDice(numberOfDice, diceValue);

        //then
        assert(diceResult <= 13 &&
                diceResult > 1);
    }

}
