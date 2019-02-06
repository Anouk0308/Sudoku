import java.util.ArrayList;
import java.util.List;

public class Square {
    public List<EnumSquares> possibleNumbers = new ArrayList<EnumSquares>();
    public EnumSquares stateSquare;

    public Square() {
        stateSquare = EnumSquares.EMPTY;
        possibleNumbers.add(EnumSquares.ONE);
        possibleNumbers.add(EnumSquares.TWO);
        possibleNumbers.add(EnumSquares.THREE);
        possibleNumbers.add(EnumSquares.FOUR);
        possibleNumbers.add(EnumSquares.FIVE);
        possibleNumbers.add(EnumSquares.SIX);
        possibleNumbers.add(EnumSquares.SEVEN);
        possibleNumbers.add(EnumSquares.EIGHT);
        possibleNumbers.add(EnumSquares.NINE);
    }

}
