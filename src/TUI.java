public class TUI {
    public int DIM = 9;
    public Square[] squares = new Square[81];
    public static final String LINE = "-";
    public static final String COLUMN = "|";
    public static final String COLUMNTHICK = "||";
    public static final String ONE = " 1";
    public static final String TWO = " 2";
    public static final String THREE = " 3";
    public static final String FOUR = " 4";
    public static final String FIVE = " 5";
    public static final String SIX = " 6";
    public static final String SEVEN = " 7";
    public static final String EIGHT = " 8";
    public static final String NINE = " 9";
    public static final String GREEN = "\033[0;32m";       // GREEN
    public static final String RESET = "\033[0m";          // Text Reset
    public static final String BLACK = "\033[0;30m";       // BLACK
    public String[] stringSquares = new String[81];
    public String row;

    //print het board uit met getallen voor lege intersecties, letters voor de andere intersecties en | en - om ruimte te creeeren tussen de intersecties
    public TUI(Board board) {
        this.squares = board.squares;
        for(int i = 0; 0 <= i && i < squares.length; i++) {
            Square thisSquare = squares[i];
            EnumSquares e = thisSquare.stateSquare;

            if(e == EnumSquares.EMPTY) {
                String ZERO = String.format("%02d", i);
                stringSquares[i]= ZERO;
            } else if(e == EnumSquares.ONE) {
                stringSquares[i]= ONE;
            } else if(e == EnumSquares.TWO) {
                stringSquares[i]= TWO;
            }else if(e == EnumSquares.THREE) {
                stringSquares[i]= THREE;
            }else if(e == EnumSquares.FOUR) {
                stringSquares[i]= FOUR;
            }else if(e == EnumSquares.FIVE) {
                stringSquares[i]= FIVE;
            }else if(e == EnumSquares.SIX) {
                stringSquares[i]= SIX;
            }else if(e == EnumSquares.SEVEN) {
                stringSquares[i]= SEVEN;
            }else if(e == EnumSquares.EIGHT) {
                stringSquares[i]= EIGHT;
            }else if(e == EnumSquares.NINE) {
                stringSquares[i]= NINE;
            } else {
                System.out.println("Square[] is wrong");
            }
        }
        //print het board uit
        //eerste drie rijen
        for(int i = 0; i<27; i+=9) {
            //rij aan horizontale 3 vierkantjes
            for(int b = i; b < (i+3); b++) {
                System.out.print(stringSquares[b]+ COLUMN);
            }
            System.out.print(COLUMNTHICK);
            //rij aan horizontale 3 vierkantjes
            for(int b = i+3; b < (i+6); b++) {
                System.out.print(stringSquares[b]+ COLUMN);
            }
            System.out.print(COLUMNTHICK);
            //rij aan horizontale 3 vierkantjes
            for(int b = i+6; b < (i+9); b++) {
                System.out.print(stringSquares[b]+ COLUMN);
            }
            System.out.println("");
        }
        //rij aan ---
        row = "";
        for(int a = 0; a<31; a++) {
            row = row + LINE;
        }
        System.out.println(row);
        System.out.println(row);

        for(int i = 27; i<54; i+=9) {
            //rij aan horizontale 3 vierkantjes
            for(int b = i; b < (i+3); b++) {
                System.out.print(stringSquares[b]+ COLUMN);
            }
            System.out.print(COLUMNTHICK);
            //rij aan horizontale 3 vierkantjes
            for(int b = i+3; b < (i+6); b++) {
                System.out.print(stringSquares[b]+ COLUMN);
            }
            System.out.print(COLUMNTHICK);
            //rij aan horizontale 3 vierkantjes
            for(int b = i+6; b < (i+9); b++) {
                System.out.print(stringSquares[b]+ COLUMN);
            }
            System.out.println("");
        }
        //rij aan ---
        row = "";
        for(int a = 0; a<31; a++) {
            row = row + LINE;
        }
        System.out.println(row);
        System.out.println(row);

        for(int i = 54; i<81; i+=9) {
            //rij aan horizontale 3 vierkantjes
            for(int b = i; b < (i+3); b++) {
                System.out.print(stringSquares[b]+ COLUMN);
            }
            System.out.print(COLUMNTHICK);
            //rij aan horizontale 3 vierkantjes
            for(int b = i+3; b < (i+6); b++) {
                System.out.print(stringSquares[b]+ COLUMN);
            }
            System.out.print(COLUMNTHICK);
            //rij aan horizontale 3 vierkantjes
            for(int b = i+6; b < (i+9); b++) {
                System.out.print(stringSquares[b]+ COLUMN);
            }
            System.out.println("");

        }
    }




    }
