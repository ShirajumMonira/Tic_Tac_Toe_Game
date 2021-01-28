package ticc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class My_Tic_Tac_Toe extends JFrame{

    private JFrame f;
  
    private JPanel p1, p2;

    private JButton newB, quitB, b[];

    private boolean isXturn, isGameFinished, isAITurn;
    
    private int numberOfBoxesLeft, playerMode;
   
    private boolean cpuMovesFirst;
     
    private myAction action;


    public My_Tic_Tac_Toe(){
       
        f = new JFrame("Tic-Tac-Toe");

        p1 = new JPanel();
        p2 = new JPanel();

        newB = new JButton("New");
        newB.setForeground(Color.RED);
        
        quitB = new JButton("Quit");
        quitB.setForeground(Color.RED);
        
        Font font = new Font("Arial", Font.BOLD, 25);
        b = new JButton[10];
        for (int i = 0; i < 10; i++) {
            
            b[i] = new JButton("");           
            b[i].setFont(font);
            b[i].setForeground(Color.BLACK);
        }
        
        isXturn = true;
        isGameFinished = false;
        numberOfBoxesLeft = 9;
    }

    public void launchFrame() {
      
        action = new myAction(this);

        f.setLayout(new BorderLayout());
        f.add(p1, BorderLayout.CENTER);
        f.add(p2, BorderLayout.SOUTH);
        
        p1.setLayout(new GridLayout(3, 3));
        for (int i = 1; i < 10; i++) {
            p1.add(b[i]);
            b[i].setForeground(Color.BLACK);
            b[i].addActionListener(action);          
            b[i].setEnabled(false);     
        }

        p2.setLayout(new FlowLayout());
        p2.setBackground(Color.LIGHT_GRAY);
        p2.add(newB);
        p2.add(b[0]);
        p2.add(quitB);

        b[0].setText("X Turn");
        b[0].setBackground(Color.WHITE);
        b[0].setForeground(Color.BLUE);
      //  b[0].setEnabled(false);

        f.setSize(400, 450);    
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
        newB.addActionListener(action);
        quitB.addActionListener(action);
    }

    public JButton getButton(int i) {
        return b[i];
    }

    public JButton[] getButtonA() {
        return b;
    }

    public boolean getXTurn() {
        return isXturn;
    }

    public void setXTurn(boolean i) {
        isXturn = i;
    }

    public boolean getComplete() {
        return isGameFinished;
    }

    public void setComplete(boolean i) {
        isGameFinished = i;
    }

    public int getLeftBoxes() {
        return numberOfBoxesLeft;
    }

    public void setLeftBoxes(int i) {
        numberOfBoxesLeft = i;
    }

    public void reduceLeftBoxes() {
        numberOfBoxesLeft--;
    }

    public int getPlayerMode() {
        return playerMode;
    }

    public void setPlayerMode(int i) {
        playerMode = i;
    }

    public boolean getIsAITurn() {
        return isAITurn;
    }

    public void setIsAITurn(boolean turn) {
        isAITurn = turn;
    }
    
    public static void main(String[] args) {
        
        My_Tic_Tac_Toe g = new My_Tic_Tac_Toe();
       
        g.launchFrame();
    }
    
   // FOR PC MOVE ....................................
 
    public int moveAI() {
        
        int a;

            // FOR FIRST MOVE
                    
        if( getButton(1).getText().equalsIgnoreCase("") && getButton(2).getText().equalsIgnoreCase("") && getButton(3).getText().equalsIgnoreCase("") && getButton(4).getText().equalsIgnoreCase("") &&
             getButton(5).getText().equalsIgnoreCase("") && getButton(6).getText().equalsIgnoreCase("") && getButton(7).getText().equalsIgnoreCase("") &&
             getButton(8).getText().equalsIgnoreCase("") && getButton(9).getText().equalsIgnoreCase("") )
            return 5;
                    
        if( getButton(1).getText().equalsIgnoreCase("X") && getButton(2).getText().equalsIgnoreCase("") && getButton(3).getText().equalsIgnoreCase("") && getButton(4).getText().equalsIgnoreCase("") &&
            getButton(5).getText().equalsIgnoreCase("") && getButton(6).getText().equalsIgnoreCase("") && getButton(7).getText().equalsIgnoreCase("") &&
             getButton(8).getText().equalsIgnoreCase("") && getButton(9).getText().equalsIgnoreCase("")
             || getButton(1).getText().equalsIgnoreCase("") && getButton(2).getText().equalsIgnoreCase("") && getButton(3).getText().equalsIgnoreCase("X") && getButton(4).getText().equalsIgnoreCase("") &&
             getButton(5).getText().equalsIgnoreCase("") && getButton(6).getText().equalsIgnoreCase("") && getButton(7).getText().equalsIgnoreCase("") &&
             getButton(8).getText().equalsIgnoreCase("") && getButton(9).getText().equalsIgnoreCase("")
             ||getButton(1).getText().equalsIgnoreCase("") && getButton(2).getText().equalsIgnoreCase("") && getButton(3).getText().equalsIgnoreCase("") && getButton(4).getText().equalsIgnoreCase("") &&
             getButton(5).getText().equalsIgnoreCase("") && getButton(6).getText().equalsIgnoreCase("") && getButton(7).getText().equalsIgnoreCase("X") &&
             getButton(8).getText().equalsIgnoreCase("") && getButton(9).getText().equalsIgnoreCase("")
             ||getButton(1).getText().equalsIgnoreCase("") && getButton(2).getText().equalsIgnoreCase("") && getButton(3).getText().equalsIgnoreCase("") && getButton(4).getText().equalsIgnoreCase("") &&
             getButton(5).getText().equalsIgnoreCase("") && getButton(6).getText().equalsIgnoreCase("") && getButton(7).getText().equalsIgnoreCase("") &&
             getButton(8).getText().equalsIgnoreCase("") && getButton(9).getText().equalsIgnoreCase("X"))
            return 5;
                    
        if( getButton(1).getText().equalsIgnoreCase("") && getButton(2).getText().equalsIgnoreCase("") && getButton(3).getText().equalsIgnoreCase("") && getButton(4).getText().equalsIgnoreCase("X") &&
            getButton(5).getText().equalsIgnoreCase("") && getButton(6).getText().equalsIgnoreCase("") && getButton(7).getText().equalsIgnoreCase("") &&
            getButton(8).getText().equalsIgnoreCase("") && getButton(9).getText().equalsIgnoreCase(""))
            return 1;
                    
        if( getButton(1).getText().equalsIgnoreCase("") && getButton(2).getText().equalsIgnoreCase("") && getButton(3).getText().equalsIgnoreCase("") && getButton(4).getText().equalsIgnoreCase("") &&
            getButton(5).getText().equalsIgnoreCase("") && getButton(6).getText().equalsIgnoreCase("X") && getButton(7).getText().equalsIgnoreCase("") &&
            getButton(8).getText().equalsIgnoreCase("") && getButton(9).getText().equalsIgnoreCase(""))
            return 3;
                    
        if( getButton(1).getText().equalsIgnoreCase("") && getButton(2).getText().equalsIgnoreCase("") && getButton(3).getText().equalsIgnoreCase("") && getButton(4).getText().equalsIgnoreCase("") &&
            getButton(5).getText().equalsIgnoreCase("X") && getButton(6).getText().equalsIgnoreCase("") && getButton(7).getText().equalsIgnoreCase("") &&
            getButton(8).getText().equalsIgnoreCase("") && getButton(9).getText().equalsIgnoreCase(""))
            return 1;
                    
        if( getButton(1).getText().equalsIgnoreCase("") && getButton(2).getText().equalsIgnoreCase("X") && getButton(3).getText().equalsIgnoreCase("") && getButton(4).getText().equalsIgnoreCase("") &&
            getButton(5).getText().equalsIgnoreCase("") && getButton(6).getText().equalsIgnoreCase("") && getButton(7).getText().equalsIgnoreCase("") &&
            getButton(8).getText().equalsIgnoreCase("") && getButton(9).getText().equalsIgnoreCase(""))
            return 1;
                    
        if( getButton(1).getText().equalsIgnoreCase("") && getButton(2).getText().equalsIgnoreCase("") && getButton(3).getText().equalsIgnoreCase("") && getButton(4).getText().equalsIgnoreCase("") &&
            getButton(5).getText().equalsIgnoreCase("") && getButton(6).getText().equalsIgnoreCase("") && getButton(7).getText().equalsIgnoreCase("") &&
            getButton(8).getText().equalsIgnoreCase("X") && getButton(9).getText().equalsIgnoreCase(""))
            return 2;
        
        if( getButton(1).getText().equalsIgnoreCase("") && getButton(2).getText().equalsIgnoreCase("") && getButton(3).getText().equalsIgnoreCase("") && getButton(4).getText().equalsIgnoreCase("") &&
            getButton(5).getText().equalsIgnoreCase("O") && getButton(6).getText().equalsIgnoreCase("X") && getButton(7).getText().equalsIgnoreCase("X") &&
            getButton(8).getText().equalsIgnoreCase("") && getButton(9).getText().equalsIgnoreCase(""))
            return 2;
                
                
                    
        // FOR COMPUTER WIN
                    
        if( getButton(1).getText().equalsIgnoreCase("O") &&
            getButton(2).getText().equalsIgnoreCase("O") && getButton(3).getText().equalsIgnoreCase(""))
            return 3;
                    
        if( getButton(2).getText().equalsIgnoreCase("O") &&
            getButton(3).getText().equalsIgnoreCase("O") && getButton(1).getText().equalsIgnoreCase(""))
            return 1;
                    
        if( getButton(1).getText().equalsIgnoreCase("O") &&
            getButton(3).getText().equalsIgnoreCase("O") && getButton(2).getText().equalsIgnoreCase(""))
            return 2;
                    
        if( getButton(1).getText().equalsIgnoreCase("O") &&
            getButton(4).getText().equalsIgnoreCase("O") && getButton(7).getText().equalsIgnoreCase(""))
            return 7;
                    
        if( getButton(4).getText().equalsIgnoreCase("O") &&
            getButton(7).getText().equalsIgnoreCase("O") && getButton(1).getText().equalsIgnoreCase(""))
            return 1; 
                    
        if( getButton(1).getText().equalsIgnoreCase("O") &&
            getButton(7).getText().equalsIgnoreCase("O") && getButton(4).getText().equalsIgnoreCase(""))
            return 4; 
                    
        if( getButton(1).getText().equalsIgnoreCase("O") &&
            getButton(5).getText().equalsIgnoreCase("O") && getButton(9).getText().equalsIgnoreCase(""))
            return 9;
                    
        if( getButton(5).getText().equalsIgnoreCase("O") &&
            getButton(9).getText().equalsIgnoreCase("O") && getButton(1).getText().equalsIgnoreCase(""))
            return 1; 
                    
        if( getButton(1).getText().equalsIgnoreCase("O") &&
            getButton(9).getText().equalsIgnoreCase("O") && getButton(5).getText().equalsIgnoreCase(""))
            return 5;   
                
        if( getButton(4).getText().equalsIgnoreCase("O") &&
            getButton(5).getText().equalsIgnoreCase("O") && getButton(6).getText().equalsIgnoreCase(""))
            return 6;
                
        if( getButton(7).getText().equalsIgnoreCase("O") &&
            getButton(8).getText().equalsIgnoreCase("O") && getButton(9).getText().equalsIgnoreCase(""))
            return 9;
                
        if( getButton(5).getText().equalsIgnoreCase("O") &&
            getButton(6).getText().equalsIgnoreCase("O") && getButton(4).getText().equalsIgnoreCase(""))
            return 4;
                
        if( getButton(8).getText().equalsIgnoreCase("O") &&
            getButton(9).getText().equalsIgnoreCase("O") && getButton(7).getText().equalsIgnoreCase(""))
            return 7;
                
        if( getButton(4).getText().equalsIgnoreCase("O") &&
            getButton(6).getText().equalsIgnoreCase("O") && getButton(5).getText().equalsIgnoreCase(""))
            return 5;
                
        if( getButton(7).getText().equalsIgnoreCase("O") &&
            getButton(9).getText().equalsIgnoreCase("O") && getButton(8).getText().equalsIgnoreCase(""))
            return 8;
                
        if( getButton(2).getText().equalsIgnoreCase("O") &&
            getButton(5).getText().equalsIgnoreCase("O") && getButton(8).getText().equalsIgnoreCase(""))
            return 8;
              
        if( getButton(5).getText().equalsIgnoreCase("O") &&
            getButton(8).getText().equalsIgnoreCase("O") && getButton(2).getText().equalsIgnoreCase(""))
            return 2;
                
        if( getButton(2).getText().equalsIgnoreCase("O") &&
            getButton(8).getText().equalsIgnoreCase("O") && getButton(5).getText().equalsIgnoreCase(""))
            return 5;
                
        if( getButton(3).getText().equalsIgnoreCase("O") &&
            getButton(7).getText().equalsIgnoreCase("O") && getButton(5).getText().equalsIgnoreCase(""))
            return 5;
 
        if( getButton(3).getText().equalsIgnoreCase("O") &&
            getButton(6).getText().equalsIgnoreCase("O") && getButton(9).getText().equalsIgnoreCase(""))
            return 9;
                    
        if( getButton(6).getText().equalsIgnoreCase("O") &&
            getButton(9).getText().equalsIgnoreCase("O") && getButton(3).getText().equalsIgnoreCase(""))
            return 3;
                    
        if( getButton(3).getText().equalsIgnoreCase("O") &&
            getButton(9).getText().equalsIgnoreCase("O") && getButton(6).getText().equalsIgnoreCase(""))
            return 6;
                    
        if( getButton(3).getText().equalsIgnoreCase("O") &&
            getButton(5).getText().equalsIgnoreCase("O") && getButton(7).getText().equalsIgnoreCase(""))
            return 7;
                    
        if( getButton(5).getText().equalsIgnoreCase("O") &&
            getButton(7).getText().equalsIgnoreCase("O") && getButton(3).getText().equalsIgnoreCase(""))
            return 3;
                    
        if( getButton(3).getText().equalsIgnoreCase("O") &&
            getButton(7).getText().equalsIgnoreCase("O") && getButton(5).getText().equalsIgnoreCase(""))
            return 5;       
                
            //FOR COMPUTER BLOCK
                    
                    
        if( getButton(1).getText().equalsIgnoreCase("X") &&
            getButton(2).getText().equalsIgnoreCase("X") && getButton(3).getText().equalsIgnoreCase(""))
            return 3; 
                
        if( getButton(2).getText().equalsIgnoreCase("X") &&
            getButton(3).getText().equalsIgnoreCase("X") && getButton(1).getText().equalsIgnoreCase(""))
            return 1; 
                    
        if( getButton(1).getText().equalsIgnoreCase("X") &&
            getButton(3).getText().equalsIgnoreCase("X") && getButton(2).getText().equalsIgnoreCase(""))
            return 2; 
                    
        if( getButton(1).getText().equalsIgnoreCase("X") &&
            getButton(4).getText().equalsIgnoreCase("X") && getButton(7).getText().equalsIgnoreCase(""))
            return 7; 
                    
                    if( getButton(4).getText().equalsIgnoreCase("X") &&
                          getButton(7).getText().equalsIgnoreCase("X") && getButton(1).getText().equalsIgnoreCase(""))
                        return 1; 
                    
                    if( getButton(1).getText().equalsIgnoreCase("X") &&
                          getButton(7).getText().equalsIgnoreCase("X") && getButton(4).getText().equalsIgnoreCase(""))
                        return 4; 
                    
                    if( getButton(1).getText().equalsIgnoreCase("X") &&
                          getButton(5).getText().equalsIgnoreCase("X") && getButton(9).getText().equalsIgnoreCase(""))
                        return 9;
                    
                    if( getButton(5).getText().equalsIgnoreCase("X") &&
                          getButton(9).getText().equalsIgnoreCase("X") && getButton(1).getText().equalsIgnoreCase(""))
                        return 1; 
                    
                    if( getButton(1).getText().equalsIgnoreCase("X") &&
                          getButton(9).getText().equalsIgnoreCase("X") && getButton(5).getText().equalsIgnoreCase(""))
                        return 5;
                    
                    
                    
                    if( getButton(3).getText().equalsIgnoreCase("X") &&
                          getButton(6).getText().equalsIgnoreCase("X") && getButton(9).getText().equalsIgnoreCase(""))
                        return 9;
                    
                    if( getButton(6).getText().equalsIgnoreCase("X") &&
                          getButton(9).getText().equalsIgnoreCase("X") && getButton(3).getText().equalsIgnoreCase(""))
                        return 3;
                    
                    if( getButton(3).getText().equalsIgnoreCase("X") &&
                          getButton(9).getText().equalsIgnoreCase("X") && getButton(6).getText().equalsIgnoreCase(""))
                        return 6;
                    
                    if( getButton(3).getText().equalsIgnoreCase("X") &&
                          getButton(5).getText().equalsIgnoreCase("X") && getButton(7).getText().equalsIgnoreCase(""))
                        return 7;
                    
                    if( getButton(5).getText().equalsIgnoreCase("X") &&
                          getButton(7).getText().equalsIgnoreCase("X") && getButton(3).getText().equalsIgnoreCase(""))
                        return 3;
                    
                    if( getButton(3).getText().equalsIgnoreCase("X") &&
                          getButton(7).getText().equalsIgnoreCase("X") && getButton(5).getText().equalsIgnoreCase(""))
                        return 5;
                    
                    if( getButton(4).getText().equalsIgnoreCase("X") &&
                          getButton(5).getText().equalsIgnoreCase("X") && getButton(6).getText().equalsIgnoreCase(""))
                        return 6;
                
                    if( getButton(7).getText().equalsIgnoreCase("X") &&
                          getButton(8).getText().equalsIgnoreCase("X") && getButton(9).getText().equalsIgnoreCase(""))
                        return 9;
                
                    if( getButton(5).getText().equalsIgnoreCase("X") &&
                          getButton(6).getText().equalsIgnoreCase("X") && getButton(4).getText().equalsIgnoreCase(""))
                        return 4;
                
                    if( getButton(8).getText().equalsIgnoreCase("X") &&
                          getButton(9).getText().equalsIgnoreCase("X") && getButton(7).getText().equalsIgnoreCase(""))
                        return 7;
                
                    if( getButton(4).getText().equalsIgnoreCase("X") &&
                          getButton(6).getText().equalsIgnoreCase("X") && getButton(5).getText().equalsIgnoreCase(""))
                        return 5;
                
                    if( getButton(7).getText().equalsIgnoreCase("X") &&
                          getButton(9).getText().equalsIgnoreCase("X") && getButton(8).getText().equalsIgnoreCase(""))
                        return 8;
                
                    if( getButton(2).getText().equalsIgnoreCase("X") &&
                          getButton(5).getText().equalsIgnoreCase("X") && getButton(8).getText().equalsIgnoreCase(""))
                        return 8;
                
                     if( getButton(5).getText().equalsIgnoreCase("X") &&
                          getButton(8).getText().equalsIgnoreCase("X") && getButton(2).getText().equalsIgnoreCase(""))
                        return 2;
                
                    if( getButton(2).getText().equalsIgnoreCase("X") &&
                          getButton(8).getText().equalsIgnoreCase("X") && getButton(5).getText().equalsIgnoreCase(""))
                        return 5;
      
        a = (int) (Math.random() * 10);
            if (a > 0 && a < 10) {
           
              return a;
            }
           
        return a;
    }

    public boolean ifCPUMovesFirst() {
        
        int a = (int) (Math.random() * 10);
        
        if (a % 2 == 0) {
            cpuMovesFirst = true;
        } else {
            cpuMovesFirst = false;
        }
        return cpuMovesFirst;
    }
    
    
}

class myAction implements ActionListener {
    
    private My_Tic_Tac_Toe myGAME;

    public myAction(My_Tic_Tac_Toe play) {
        
        myGAME = play;
    }
    
    public void actionPerformed(ActionEvent e) {

        result a = new result(myGAME.getComplete(), myGAME.getButtonA());
      
        
        if (e.getActionCommand() == "Quit") {
            System.exit(0);

        }
        if (e.getActionCommand() == "New") {
            
             myGAME.setXTurn(true);
             myGAME.getButton(0).setText("X Turn");
             
            myGAME.setPlayerMode(a.selectMode());
            
            if (myGAME.getPlayerMode() < 3) {
                
                myGAME.getButton(0).setBackground(Color.WHITE);
                myGAME.getButton(0).setForeground(Color.BLUE);
                for (int i = 1; i < 10; i++) {
                   // myGAME.getButton(i).colorText.setForeground(c);
                    myGAME.getButton(i).setBackground(Color.WHITE);
                    myGAME.getButton(i).setForeground(Color.BLUE);
                    myGAME.getButton(i).setText("");
                    
                    myGAME.getButton(i).setEnabled(true);
                
                }
                myGAME.setComplete(false);
                myGAME.setLeftBoxes(9);
            }
            
                // 2 GAME MODE by 1 Player vs Artificial inti..
                
                if (myGAME.getPlayerMode() == 1) {
                 //   myGAME.getButton(0).setBackground(Color.LIGHT_GRAY);
                  //  myGAME.getButton(0).setForeground(Color.LIGHT_GRAY);
                    myGAME.setIsAITurn(myGAME.ifCPUMovesFirst());

                    
                    if (myGAME.getIsAITurn()) {
                        int m = myGAME.moveAI();
                                                   // AL MOVE                   
                        myGAME.getButton(m).setText("O");
                    //    myGAME.getButton(m).setEnabled(false);
                        myGAME.reduceLeftBoxes();

                    }
                }
            }
        else {
            myGAME.reduceLeftBoxes(); 
           
            if (myGAME.getPlayerMode() == 1) { // 2 GAME MODE by 1 Player vs Artificial inti..
                
                for (int i = 1; i < 10; i++) { // Players Move
                    
                    if (e.getSource().equals(myGAME.getButton(i))) {
                        myGAME.getButton(i).setText("X");
                        myGAME.getButton(i).setForeground(Color.RED);
                    //    myGAME.getButton(i).setEnabled(false);
                       // myGAME.getButton(i).setForeground(Color.RED);
                        myGAME.setXTurn(false);
                    }
                }
                myGAME.setComplete(a.preWin()); 
                
                // AI response
                if (myGAME.getLeftBoxes() != 0 && myGAME.getComplete() == false) {
                    int m;
                    for (;;) {
                        m = myGAME.moveAI();
                        if (myGAME.getButton(m).getText().equals("")) {
                            break;
                        }
                    }
                    myGAME.getButton(m).setText("O");
                 //   myGAME.getButton(m).setEnabled(false);
                    myGAME.reduceLeftBoxes();
                }

            }

            if (myGAME.getPlayerMode() == 0) {    // 1 GAME MODE by 2 Player ( HUMAN )
               
                for (int i = 1; i < 10; i++) {
                    
                    if (e.getSource().equals(myGAME.getButton(i))) {
                            
                        if (myGAME.getXTurn()) {
                                
                                myGAME.getButton(i).setText("X");
                                myGAME.getButton(i).setForeground(Color.RED);
                        //        myGAME.getButton(i).setEnabled(false);
                                myGAME.getButton(0).setText("O Turn");
                                myGAME.setXTurn(false);
                                
                        }
                        else if (myGAME.getXTurn() == false) {
                                
                                myGAME.getButton(i).setText("O");
                            //   myGAME.getButton(i).setEnabled(false);
                                myGAME.setXTurn(true);
                                myGAME.getButton(0).setText("X Turn");
                                
                        }
                    }                                       
                }
            }
            
            myGAME.setComplete(a.preWin()); // checking for win

            if (myGAME.getLeftBoxes() == 0 && myGAME.getComplete() == false) { // conditions
                // for draw
                a.declareDraw();
                
            }
        }

    }
}

class result {
    private boolean resultGameFinished;
    private JButton resultB[];

    public result(boolean getIsGameFinished, JButton getB[]) {
        resultB = getB;
        resultGameFinished = getIsGameFinished;
    }
    
    public int selectMode() {
        Object[] options = {  "Player VS Player", "Player VS Artificial Intelligence", "Play by Networking ",
                "Cancel" };
        int n = JOptionPane.showOptionDialog(null,
                "Please select a game mode:", "Game Mode",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE, null, options, options[3]);
        return n;
    }

    public boolean preWin() {
        for (int i = 1; i <= 7; i++) {
            if (resultGameFinished == false) {
                if (i == 1) {
                    
                    checkWin(i, i + 4, i + 8);
                }
                if (i <= 3) {
                    
                    checkWin(i, i + 3, i + 6);
                }
                if (i == 1 || i == 4 || i == 7) {
                    
                    checkWin(i, i + 1, i + 2);
                }
                if (i == 3) {
                   
                    checkWin(i, i + 2, i + 4);
                }
            }
        }
        return resultGameFinished;
    }

    public void checkWin(int x, int y, int z) {
        
        // checking if X wins
        if ((resultB[x].getText().equals("X")) && (resultB[y].getText().equals("X")) && 
                (resultB[z].getText().equals("X"))) {
                    resultB[x].setBackground(Color.YELLOW);
                    resultB[y].setBackground(Color.YELLOW);
                    resultB[z].setBackground(Color.YELLOW);
                    declareResult("X");
        }       
            
        
        // checking if O wins
        if ((resultB[x].getText().equals("O")) && (resultB[y].getText().equals("O")) && 
                (resultB[z].getText().equals("O"))) {
                    resultB[x].setBackground(Color.CYAN);
                    resultB[y].setBackground(Color.CYAN);
                    resultB[z].setBackground(Color.CYAN);
                    declareResult("O");
                
            
        }
    }

    public void declareResult(String i) {
        if (resultGameFinished == false) {
            JOptionPane.showMessageDialog(null,"Player " + i + " Win The GAME");
            for (int j = 1; j < 10; j++) {
                resultB[j].setEnabled(false);
            }
            resultGameFinished = true;
        }
    }

  
    public void declareDraw() {
        JOptionPane.showMessageDialog(null, "Oops It's a TIE ");
        for (int j = 1; j < 10; j++) {
                resultB[j].setEnabled(false);
            }
        resultGameFinished = true;
    }

}
