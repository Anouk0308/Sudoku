import javax.swing.*;

public class GUI {
    public JPanel panel1;
    public JTextField t0;
    public JTextField t9;
    public JTextField t18;
    public JTextField t1;
    public JTextField t2;
    public JTextField t3;
    public JTextField t4;
    public JTextField t5;
    public JTextField t10;
    public JTextField t11;
    public JTextField t6;
    public JTextField t7;
    public JTextField t8;
    public JTextField t19;
    public JTextField t20;
    public JTextField t12;
    public JTextField t13;
    public JTextField t14;
    public JTextField t21;
    public JTextField t22;
    public JTextField t23;
    public JTextField t27;
    public JTextField t36;
    public JTextField t45;
    public JTextField t54;
    public JTextField t63;
    public JTextField t72;
    public JTextField t73;
    public JTextField t74;
    public JTextField t75;
    public JTextField t76;
    public JTextField t77;
    public JTextField t78;
    public JTextField t79;
    public JTextField t80;
    public JTextField t15;
    public JTextField t16;
    public JTextField t24;
    public JTextField t25;
    public JTextField t17;
    public JTextField t26;
    public JTextField t33;
    public JTextField t34;
    public JTextField t43;
    public JTextField t52;
    public JTextField t42;
    public JTextField t51;
    public JTextField t35;
    public JTextField t44;
    public JTextField t53;
    public JTextField t61;
    public JTextField t70;
    public JTextField t60;
    public JTextField t69;
    public JTextField t62;
    public JTextField t71;
    public JTextField t32;
    public JTextField t41;
    public JTextField t50;
    public JTextField t59;
    public JTextField t68;
    public JTextField t31;
    public JTextField t40;
    public JTextField t49;
    public JTextField t30;
    public JTextField t39;
    public JTextField t48;
    public JTextField t28;
    public JTextField t29;
    public JTextField t37;
    public JTextField t38;
    public JTextField t46;
    public JTextField t47;
    public JTextField t58;
    public JTextField t67;
    public JTextField t57;
    public JTextField t66;
    public JTextField t55;
    public JTextField t56;
    public JTextField t64;
    public JTextField t65;

    public GUI(){

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("SudokuGUI");
        GUI gui = new GUI();
        for(int i = 0; i<81; i++){
            String numberString = args[i];
            String textFieldName = "t"+i;
            JTextField t = gui.getTextField(textFieldName);
            if(!numberString.equals("0")){
                t.setText(numberString);
            }
        }

        frame.setContentPane(gui.panel1);
        frame.setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public JTextField getTextField(String textFieldName){
        JTextField t = null;
        try {
            if (GUI.class.getField(textFieldName) != null) {
                 java.lang.reflect.Field f = GUI.class.getField(textFieldName);
                 if(f.getType().isAssignableFrom(JTextField.class));{
                     t = (JTextField) f;//hier gaat het dus fout
                 }
            } else {
                t = null;
            }
        } catch(NoSuchFieldException e){
            System.out.println(e.getMessage());
        }

        return t;
    }








}
