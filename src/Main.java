import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
    public Board board;
    public boolean fullBoard = false;

    public Main(){
        board = new Board();
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.loop();
        //m.userRead();
    }

    public void loop(){
        while(fullBoard == false) {
            userRead();
        }
    }
    public void userRead(){
        if(board.full()){
            System.out.println("Yeey, you are done");
            fullBoard = true;
        } else{
            EnumSquares es =  EnumSquares.EMPTY;
            int position;
            TUI tui = new TUI(board);
            System.out.println("what number do you want to enter on which position?");
            System.out.println("type the position");
            try {
                if (userInput != null) {
                    int positiontemp = Integer.parseInt(userInput.readLine());
                    if(positiontemp > -1 && positiontemp < 81){
                        if(board.squares[positiontemp].stateSquare == EnumSquares.EMPTY) {
                            position = positiontemp;

                            System.out.println("type the number");
                            if (userInput != null) {
                                int number = Integer.parseInt(userInput.readLine());
                                if (number == 1) {
                                    es = EnumSquares.ONE;
                                } else if (number == 2) {
                                    es = EnumSquares.TWO;
                                } else if (number == 3) {
                                    es = EnumSquares.THREE;
                                } else if (number == 4) {
                                    es = EnumSquares.FOUR;
                                } else if (number == 5) {
                                    es = EnumSquares.FIVE;
                                } else if (number == 6) {
                                    es = EnumSquares.SIX;
                                } else if (number == 7) {
                                    es = EnumSquares.SEVEN;
                                } else if (number == 8) {
                                    es = EnumSquares.EIGHT;
                                } else if (number == 9) {
                                    es = EnumSquares.NINE;
                                } else {
                                    System.out.println("that is not between 0 and 10, try again");
                                    userRead();
                                }
                                board.set(position, es);
                            } else {
                                System.out.println("type something, try it!");
                                userRead();
                            }
                        } else {
                            System.out.println("That position already has a number, try again");
                            userRead();
                        }
                    } else{
                        System.out.println("that is not between -1 and 80, try again");
                        userRead();
                    }

                } else {
                    System.out.println("that is not correct, try again");
                    userRead();
                }

            } catch (IOException e){
                System.out.println("error:"+e.getMessage());
            }
        }
    }

    public void GUI(Board b){
        GUI gui = new GUI();
        String boardstring = b.toBoardstring();
        String [] stringArray = boardstring.split("\\B");
        gui.main(stringArray);
    }
}