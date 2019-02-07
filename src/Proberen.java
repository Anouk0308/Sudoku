import java.util.List;

public class Proberen {

    public Board board = new Board();

    public Proberen() {

    }

    public static void main(String[] args) {
        Proberen p = new Proberen();
        //p.testTUI();//werkt
        //p.testBoardGetColumn(44);//werkt
       // System.out.println("that was column of 44");
       // p.testBoardGetRow(30);//werkt
       // System.out.println("that was row of 30");
      //  p.testBoardGetGroup(80);//werkt
      //  System.out.println("that was group of 80");
       // p.testSet(40, EnumSquares.FIVE);//werkt
        //p.testFullBoolean();
       // p.testGUI();


    }

    public void testTUI() {
        TUI t = new TUI(board);
    }

    public void testBoardGetColumn(int i) {
        SquareBoardCombi[] sbc = board.getColumn(i);

        for(int a = 0; a < sbc.length; a++) {
            System.out.print(sbc[a].i);
            System.out.print(sbc[a].s.stateSquare);
            System.out.println("");
        }
    }

    public void testBoardGetRow(int i) {
        SquareBoardCombi[] sbc = board.getRow(i);

        for(int a = 0; a < sbc.length; a++) {
            System.out.print(sbc[a].i);
            System.out.print(sbc[a].s.stateSquare);
            System.out.println("");
        }
    }

    public void testBoardGetGroup(int i) {
        SquareBoardCombi[] sbc = board.getGroup(i);

        for(int a = 0; a < sbc.length; a++) {
            System.out.print(sbc[a].i);
            System.out.print(sbc[a].s.stateSquare);
            System.out.println("");
        }
    }

    public void testSet(int i, EnumSquares es){
        board.set(i, es);
        System.out.println("set:" + i);
        Square s = board.squares[i];
        System.out.println("give enum:" + i + s.stateSquare);

        System.out.println("row of "+i);
        SquareBoardCombi[] row = board.getRow(40);
        for(int a = 0; a < row.length; a++){
            SquareBoardCombi sbc = row[a];
            int index = sbc.i;
            Square stemp = sbc.s;
            List<EnumSquares> possible = stemp.possibleNumbers;
            System.out.println(index + ":" + possible);
        }

        System.out.println("column of "+i);
        SquareBoardCombi[] column = board.getColumn(40);
        for(int a = 0; a < column.length; a++){
            SquareBoardCombi sbc = column[a];
            int index = sbc.i;
            Square stemp = sbc.s;
            List<EnumSquares> possible = stemp.possibleNumbers;
            System.out.println(index + ":" + possible);
        }

        System.out.println("group of "+i);
        SquareBoardCombi[] group = board.getGroup(40);
        for(int a = 0; a < group.length; a++){
            SquareBoardCombi sbc = group[a];
            int index = sbc.i;
            Square stemp = sbc.s;
            List<EnumSquares> possible = stemp.possibleNumbers;
            System.out.println(index + ":" + possible);
        }
    }

    public void testFullBoolean(){
        if(board.full()){
            System.out.println("ja vol");
        } else{
            System.out.println("niet vol");
        }
    }

    public void testGUI(){
        GUI gui = new GUI();
        String[] args = new String[0];
        gui.main(args);
    }



}

