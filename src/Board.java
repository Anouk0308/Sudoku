import java.util.ArrayList;
import java.util.List;

//import org.apache.commons.lang3.tuple.MutablePair<L, R>;
//import org.apache.commons.lang3.tuple.ImmutablePair<L, R>



public class Board {
    public Square[] squares = new Square[81];

    public Board() {
        for(int i = 0; i<81; i++) {
            squares[i] = new Square();
        }
    }

    public SquareBoardCombi[]  getRow(int i) {
        int compare = Math.floorDiv(i, 9);
        List<SquareBoardCombi> rowtemp = new ArrayList<SquareBoardCombi>();
        SquareBoardCombi[] row = new SquareBoardCombi[9];


        for (int a = 0; a < squares.length; a++) {
            if (Math.floorDiv(a,9) == compare) {
                SquareBoardCombi s = new SquareBoardCombi(a, squares[a]);
                rowtemp.add(s);
            } else {
                continue;
            }
        }

        row = rowtemp.toArray(row);
        return row;
    }

    public SquareBoardCombi[] getColumn(int i) {
        int compare = i%9;
        List<SquareBoardCombi> columntemp = new ArrayList<SquareBoardCombi>();
        SquareBoardCombi[] column = new SquareBoardCombi[9];


        for(int a = 0; a < squares.length; a++) {
            if(a%9 == compare) {
                SquareBoardCombi s = new SquareBoardCombi(a, squares[a]);
                columntemp.add(s);
            } else {
                continue;
            }
        }

        column = columntemp.toArray(column);
        return column;
    }

    public SquareBoardCombi[] getGroup(int i) {//groot vierkantje
        SquareBoardCombi[] group = new SquareBoardCombi[9];
        List<SquareBoardCombi> grouptemp = new ArrayList<SquareBoardCombi>();
        if(i == 0 || i == 1 || i == 2 || i == 9 || i == 10 || i == 11 || i == 18 || i == 19 || i ==20){
            SquareBoardCombi s1 = new SquareBoardCombi(0, squares[0]);
            grouptemp.add(s1);
            SquareBoardCombi s2 = new SquareBoardCombi(1, squares[1]);
            grouptemp.add(s2);
            SquareBoardCombi s3 = new SquareBoardCombi(2, squares[2]);
            grouptemp.add(s3);
            SquareBoardCombi s4 = new SquareBoardCombi(9, squares[9]);
            grouptemp.add(s4);
            SquareBoardCombi s5 = new SquareBoardCombi(10, squares[10]);
            grouptemp.add(s5);
            SquareBoardCombi s6 = new SquareBoardCombi(11, squares[11]);
            grouptemp.add(s6);
            SquareBoardCombi s7 = new SquareBoardCombi(18, squares[18]);
            grouptemp.add(s7);
            SquareBoardCombi s8 = new SquareBoardCombi(19, squares[19]);
            grouptemp.add(s8);
            SquareBoardCombi s9 = new SquareBoardCombi(20, squares[20]);
            grouptemp.add(s9);
        } else if(i == 3 || i == 4 || i == 5 || i == 12 || i == 13 || i == 14 || i == 21 || i == 22 || i ==23){
            SquareBoardCombi s1 = new SquareBoardCombi(3, squares[3]);
            grouptemp.add(s1);
            SquareBoardCombi s2 = new SquareBoardCombi(4, squares[4]);
            grouptemp.add(s2);
            SquareBoardCombi s3 = new SquareBoardCombi(5, squares[5]);
            grouptemp.add(s3);
            SquareBoardCombi s4 = new SquareBoardCombi(12, squares[12]);
            grouptemp.add(s4);
            SquareBoardCombi s5 = new SquareBoardCombi(13, squares[13]);
            grouptemp.add(s5);
            SquareBoardCombi s6 = new SquareBoardCombi(14, squares[14]);
            grouptemp.add(s6);
            SquareBoardCombi s7 = new SquareBoardCombi(21, squares[21]);
            grouptemp.add(s7);
            SquareBoardCombi s8 = new SquareBoardCombi(22, squares[22]);
            grouptemp.add(s8);
            SquareBoardCombi s9 = new SquareBoardCombi(23, squares[23]);
            grouptemp.add(s9);
        } else if(i == 6 || i == 7 || i == 8 || i == 15 || i == 16 || i == 17 || i == 24 || i == 25 || i ==26){
            SquareBoardCombi s1 = new SquareBoardCombi(6, squares[6]);
            grouptemp.add(s1);
            SquareBoardCombi s2 = new SquareBoardCombi(7, squares[7]);
            grouptemp.add(s2);
            SquareBoardCombi s3 = new SquareBoardCombi(8, squares[8]);
            grouptemp.add(s3);
            SquareBoardCombi s4 = new SquareBoardCombi(15, squares[15]);
            grouptemp.add(s4);
            SquareBoardCombi s5 = new SquareBoardCombi(16, squares[16]);
            grouptemp.add(s5);
            SquareBoardCombi s6 = new SquareBoardCombi(17, squares[17]);
            grouptemp.add(s6);
            SquareBoardCombi s7 = new SquareBoardCombi(24, squares[24]);
            grouptemp.add(s7);
            SquareBoardCombi s8 = new SquareBoardCombi(25, squares[25]);
            grouptemp.add(s8);
            SquareBoardCombi s9 = new SquareBoardCombi(26, squares[26]);
            grouptemp.add(s9);
        } else if(i == 27 || i == 28 || i == 29 || i == 36 || i == 37 || i == 38 || i == 45 || i == 46 || i ==47){
            SquareBoardCombi s1 = new SquareBoardCombi(27, squares[27]);
            grouptemp.add(s1);
            SquareBoardCombi s2 = new SquareBoardCombi(28, squares[28]);
            grouptemp.add(s2);
            SquareBoardCombi s3 = new SquareBoardCombi(29, squares[29]);
            grouptemp.add(s3);
            SquareBoardCombi s4 = new SquareBoardCombi(36, squares[36]);
            grouptemp.add(s4);
            SquareBoardCombi s5 = new SquareBoardCombi(37, squares[37]);
            grouptemp.add(s5);
            SquareBoardCombi s6 = new SquareBoardCombi(38, squares[38]);
            grouptemp.add(s6);
            SquareBoardCombi s7 = new SquareBoardCombi(45, squares[45]);
            grouptemp.add(s7);
            SquareBoardCombi s8 = new SquareBoardCombi(46, squares[46]);
            grouptemp.add(s8);
            SquareBoardCombi s9 = new SquareBoardCombi(47, squares[47]);
            grouptemp.add(s9);
        }else if(i == 30 || i == 31 || i == 32 || i == 39 || i == 40 || i == 41 || i == 48 || i == 49 || i ==50){
            SquareBoardCombi s1 = new SquareBoardCombi(30, squares[30]);
            grouptemp.add(s1);
            SquareBoardCombi s2 = new SquareBoardCombi(31, squares[31]);
            grouptemp.add(s2);
            SquareBoardCombi s3 = new SquareBoardCombi(32, squares[32]);
            grouptemp.add(s3);
            SquareBoardCombi s4 = new SquareBoardCombi(39, squares[39]);
            grouptemp.add(s4);
            SquareBoardCombi s5 = new SquareBoardCombi(40, squares[40]);
            grouptemp.add(s5);
            SquareBoardCombi s6 = new SquareBoardCombi(41, squares[41]);
            grouptemp.add(s6);
            SquareBoardCombi s7 = new SquareBoardCombi(48, squares[48]);
            grouptemp.add(s7);
            SquareBoardCombi s8 = new SquareBoardCombi(49, squares[49]);
            grouptemp.add(s8);
            SquareBoardCombi s9 = new SquareBoardCombi(50, squares[50]);
            grouptemp.add(s9);
        } else if(i == 33 || i == 34 || i == 35 || i == 42 || i == 43 || i == 44 || i == 51 || i == 52 || i ==53){
            SquareBoardCombi s1 = new SquareBoardCombi(33, squares[33]);
            grouptemp.add(s1);
            SquareBoardCombi s2 = new SquareBoardCombi(34, squares[34]);
            grouptemp.add(s2);
            SquareBoardCombi s3 = new SquareBoardCombi(35, squares[35]);
            grouptemp.add(s3);
            SquareBoardCombi s4 = new SquareBoardCombi(42, squares[42]);
            grouptemp.add(s4);
            SquareBoardCombi s5 = new SquareBoardCombi(43, squares[43]);
            grouptemp.add(s5);
            SquareBoardCombi s6 = new SquareBoardCombi(44, squares[44]);
            grouptemp.add(s6);
            SquareBoardCombi s7 = new SquareBoardCombi(51, squares[51]);
            grouptemp.add(s7);
            SquareBoardCombi s8 = new SquareBoardCombi(52, squares[52]);
            grouptemp.add(s8);
            SquareBoardCombi s9 = new SquareBoardCombi(53, squares[53]);
            grouptemp.add(s9);
        }else if(i == 54 || i == 55 || i == 56 || i == 63 || i == 64 || i == 65 || i == 72 || i == 73 || i ==74) {
            SquareBoardCombi s1 = new SquareBoardCombi(54, squares[54]);
            grouptemp.add(s1);
            SquareBoardCombi s2 = new SquareBoardCombi(55, squares[55]);
            grouptemp.add(s2);
            SquareBoardCombi s3 = new SquareBoardCombi(56, squares[56]);
            grouptemp.add(s3);
            SquareBoardCombi s4 = new SquareBoardCombi(63, squares[63]);
            grouptemp.add(s4);
            SquareBoardCombi s5 = new SquareBoardCombi(64, squares[64]);
            grouptemp.add(s5);
            SquareBoardCombi s6 = new SquareBoardCombi(65, squares[65]);
            grouptemp.add(s6);
            SquareBoardCombi s7 = new SquareBoardCombi(72, squares[72]);
            grouptemp.add(s7);
            SquareBoardCombi s8 = new SquareBoardCombi(73, squares[73]);
            grouptemp.add(s8);
            SquareBoardCombi s9 = new SquareBoardCombi(74, squares[74]);
            grouptemp.add(s9);
        }else if(i == 57 || i == 58 || i == 59 || i == 66 || i == 67 || i == 68 || i == 75 || i == 76 || i ==77) {
            SquareBoardCombi s1 = new SquareBoardCombi(57, squares[57]);
            grouptemp.add(s1);
            SquareBoardCombi s2 = new SquareBoardCombi(58, squares[58]);
            grouptemp.add(s2);
            SquareBoardCombi s3 = new SquareBoardCombi(59, squares[59]);
            grouptemp.add(s3);
            SquareBoardCombi s4 = new SquareBoardCombi(66, squares[66]);
            grouptemp.add(s4);
            SquareBoardCombi s5 = new SquareBoardCombi(67, squares[67]);
            grouptemp.add(s5);
            SquareBoardCombi s6 = new SquareBoardCombi(68, squares[68]);
            grouptemp.add(s6);
            SquareBoardCombi s7 = new SquareBoardCombi(75, squares[75]);
            grouptemp.add(s7);
            SquareBoardCombi s8 = new SquareBoardCombi(76, squares[76]);
            grouptemp.add(s8);
            SquareBoardCombi s9 = new SquareBoardCombi(77, squares[77]);
            grouptemp.add(s9);
        }else if(i == 60 || i == 61 || i == 62 || i == 69 || i == 70 || i == 71 || i == 78 || i == 79 || i ==80) {
            SquareBoardCombi s1 = new SquareBoardCombi(60, squares[60]);
            grouptemp.add(s1);
            SquareBoardCombi s2 = new SquareBoardCombi(61, squares[61]);
            grouptemp.add(s2);
            SquareBoardCombi s3 = new SquareBoardCombi(62, squares[62]);
            grouptemp.add(s3);
            SquareBoardCombi s4 = new SquareBoardCombi(69, squares[69]);
            grouptemp.add(s4);
            SquareBoardCombi s5 = new SquareBoardCombi(70, squares[70]);
            grouptemp.add(s5);
            SquareBoardCombi s6 = new SquareBoardCombi(71, squares[71]);
            grouptemp.add(s6);
            SquareBoardCombi s7 = new SquareBoardCombi(78, squares[78]);
            grouptemp.add(s7);
            SquareBoardCombi s8 = new SquareBoardCombi(79, squares[79]);
            grouptemp.add(s8);
            SquareBoardCombi s9 = new SquareBoardCombi(80, squares[80]);
            grouptemp.add(s9);
        }
        group = grouptemp.toArray(group);
        return group;
    }

    public void remove(int i, EnumSquares e){
        Square s = squares[i];
        if(s.possibleNumbers.contains(e)){
            s.possibleNumbers.remove(e);
        }
    }



    public void set(int i, EnumSquares es) {
        Square s = squares[i];
        s.stateSquare = es;
        SquareBoardCombi[] row = getRow(i);
        SquareBoardCombi[] column = getColumn(i);
        SquareBoardCombi[] group = getGroup(i);

        for(int a = 0; a < row.length; a++){
            SquareBoardCombi sbc = row[a];
            int index = sbc.i;
            remove(index, es);
        }
        for(int b = 0; b < column.length; b++){
            SquareBoardCombi sbc = column[b];
            int index = sbc.i;
            remove(index, es);
        }
        for(int c = 0; c < group.length; c++) {
            SquareBoardCombi sbc = group[c];
            int index = sbc.i;
            remove(index, es);
        }
        checkSquares();
    }



    public void checkSquares(){
        checkOnePossibityInSquare();
        checkOneSquarepossible();
    }


    public boolean onePossibility(int i) {
        return(squares[i].possibleNumbers.size() == 1);
    }

    public void checkOnePossibityInSquare(){//kijkt of een vierkantje nog maar 1 mogelijkheid heeft
        for(int i = 0; i < squares.length; i++){
            Square s = squares[i];
            if(s.stateSquare == EnumSquares.EMPTY) {
                if (onePossibility(i)) {
                    set(i, s.possibleNumbers.get(0));
                } else {
                    continue;
                }
            } else{
                continue;
            }
        }
    }

    public void checkOneSquarepossible(){//kijkt per rij, kollom en groep of er maar 1 vierkantje is waar bv de 5 in kan
        SquareBoardCombi[][] sbcArrayArray = getAllSBC(); //krijg alle rijen, alle kollomen en alle groepen
        for(int a = 0; a < sbcArrayArray.length; a++){
            SquareBoardCombi[] sbca = sbcArrayArray[a]; //krijg een rij, kollom of groep

            for(int b = 1; b < 10; b++){ //doe dit per getal 1....9
                int counter = 0;
                EnumSquares es = getEnumFromInt(b);
                int index = -1;

                for(int c = 0; c<9; c++){ // kijk voor elke SquareBoardCombi in de rij(of kolom/groep)
                    SquareBoardCombi sbc = sbca[c];
                        Square s = sbc.s;
                        int i = sbc.i;

                    if(s.possibleNumbers.contains(es)){
                        counter = counter + 1;
                        index = i;
                    }
                    else{
                        continue;
                    }
                }

                if(counter == 1){
                    set(index,es);
                } else{
                    continue;
                }
            }

        }
    }

    public SquareBoardCombi[][] getAllSBC(){//kijkt per rij, kollom en groep of er maar 1 vierkantje is waar bv de 5 in kan
        SquareBoardCombi[][] sbcArrayArray = new SquareBoardCombi[27][9]; //krijg alle rijen, alle kollomen en alle groepen
        for (int i = 0; i < 9; i++){//alle rijen
            sbcArrayArray[i]= getRow(i);
        }
        for (int i = 0; i < 9; i++){//alle kollomen
            int arrayIndex = i+9;
            int columnGetter = i*9;
            sbcArrayArray[arrayIndex] = getColumn(columnGetter);
        }
        for (int i = 0; i < 9; i++){//alle groepen
            int arrayIndex = i+18;
            int groupGetter = 0;
            if(i <= 4) {
                groupGetter = i * 12;//fout//
            } else if (i == 5){
                groupGetter = i * 10+1;
            } else if(i == 6){
                groupGetter = i * 9;
            } else if(i == 7){
                groupGetter = i*11;
            } else {
                groupGetter = i*10;
            }
            sbcArrayArray[arrayIndex] = getGroup(groupGetter);
        }
        return sbcArrayArray;
    }

    public EnumSquares getEnumFromInt(int i){
        EnumSquares es;
        switch(i){
            case 0:         es = EnumSquares.EMPTY; break;
            case 1:         es = EnumSquares.ONE; break;
            case 2:         es = EnumSquares.TWO; break;
            case 3:         es = EnumSquares.THREE; break;
            case 4:         es = EnumSquares.FOUR; break;
            case 5:         es = EnumSquares.FIVE; break;
            case 6:         es = EnumSquares.SIX; break;
            case 7:         es = EnumSquares.SEVEN; break;
            case 8:         es = EnumSquares.EIGHT; break;
            case 9:         es = EnumSquares.NINE; break;
            default:        es = EnumSquares.EMPTY; break;

        }
        return es;
    }












    public boolean full(){
        int teller = 0;
        for(int i = 0; i< squares.length; i++){
            Square s = squares[i];
            if(s.stateSquare == EnumSquares.EMPTY){
                teller = teller + 1;
            } else{
                continue;
            }
        }

        return(teller == 0);
    }

    public String toBoardstring() {
        String newboardstring = "";
        int tempi = 0;
        String temps;
        for(int i = 0; 0 <= i && i < 81; i++) {
            if(squares[i].stateSquare == EnumSquares.EMPTY) {
                tempi = 0;
            } else if(squares[i].stateSquare == EnumSquares.ONE) {
                tempi = 1;
            } else if(squares[i].stateSquare == EnumSquares.TWO) {
                tempi = 2;
            } else if(squares[i].stateSquare == EnumSquares.THREE) {
                tempi = 3;
            } else if(squares[i].stateSquare == EnumSquares.FOUR) {
                tempi = 4;
            } else if(squares[i].stateSquare == EnumSquares.FIVE) {
                tempi = 5;
            } else if(squares[i].stateSquare == EnumSquares.SIX) {
                tempi = 6;
            } else if(squares[i].stateSquare == EnumSquares.SEVEN) {
                tempi = 7;
            } else if(squares[i].stateSquare == EnumSquares.EIGHT) {
                tempi = 8;
            } else if(squares[i].stateSquare == EnumSquares.NINE) {
                tempi = 9;
            }
            temps = Integer.toString(tempi);
            newboardstring = newboardstring + temps;
        }
        return newboardstring;
    }

    public SquareBoardCombi[] toSquaresArray(String boardstring) {
        String[] boardstringArray = boardstring.split("\\B");
        List<SquareBoardCombi> sbctemp = new ArrayList<SquareBoardCombi>();
        SquareBoardCombi[] sbcar = new SquareBoardCombi[81];
        SquareBoardCombi sbc;
        Square stemp = new Square();
        for(int i = 0; 0 <= i && i < 81; i++) {
            if(boardstringArray[i].equals("0")) {
                stemp.stateSquare = EnumSquares.EMPTY;
            } else if(boardstringArray[i].equals("1")) {
                stemp.stateSquare = EnumSquares.ONE;
            } else if(boardstringArray[i].equals("2")) {
                stemp.stateSquare = EnumSquares.TWO;
            } else if(boardstringArray[i].equals("3")) {
                stemp.stateSquare = EnumSquares.THREE;
            } else if(boardstringArray[i].equals("4")) {
                stemp.stateSquare = EnumSquares.FOUR;
            } else if(boardstringArray[i].equals("5")) {
                stemp.stateSquare = EnumSquares.FIVE;
            } else if(boardstringArray[i].equals("6")) {
                stemp.stateSquare = EnumSquares.SIX;
            } else if(boardstringArray[i].equals("7")) {
                stemp.stateSquare = EnumSquares.SEVEN;
            } else if(boardstringArray[i].equals("8")) {
                stemp.stateSquare = EnumSquares.EIGHT;
            } else if(boardstringArray[i].equals("9")) {
                stemp.stateSquare = EnumSquares.NINE;
            }
            sbc = new SquareBoardCombi(i, stemp);
            sbctemp.add(sbc);
        }
        sbcar = sbctemp.toArray(sbcar);
        return sbcar;
    }

}