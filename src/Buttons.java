import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;



public class Buttons extends JPanel implements ActionListener{
    
    private static final long serialVersionUID = 1L;

    boolean myTurn = true;
    JButton reset;
    JButton[] button = new JButton[9];
    int wynG = 0;
    int wynikW = 0;
    int wynikP = 0;
    int wynikR = 0;
    
    public Buttons(){
        //for(JButton b: button){
        /* for(int i = 0; i < button.length; i++){
            button[i] = new JButton("");
            button[i].addActionListener(this);
            add(button[i]);

        } */
        button[1] = new JButton("papier");
        button[1].addActionListener(this);
        add(button[1]);
        button[2] = new JButton("kamień");
        button[2].addActionListener(this);
        add(button[2]);
        button[3] = new JButton("nożyce");
        button[3].addActionListener(this);
        add(button[3]);
        
        
        
        button[4] = new JButton("<html>Kliknij na kamień, <br>papier lub nożyce żeby grać</html>");
        button[4].addActionListener(this);
        add(button[4]);
        button[5] = new JButton("<html>Wynik tej rundy:<br> <html>");
        button[5].addActionListener(this);
        add(button[5]);
        button[6] = new JButton("Ogólny wynik gry:");
        button[6].addActionListener(this);
        add(button[6]);


        setLayout(new GridLayout(0,3));
        



    }

    @Override
    
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        
        
            
        

        
        Random r = new Random();

        
            if(source.equals(button[1])){
                int zk = r.nextInt(3); // losuje
                if(zk == 0){
                    button[5].setText("<html>Wynik tej rundy:<br>Zremisowaliśmy</html>"); // String k = "Wylosowałem kamień, zremisowaliśmy";
                    wynikR += 1;
                    button[6].setText("<html>Gólny wynik gry:<br>Twoje wygrane: "+wynikW+"<br>Remisy: "+wynikR+"<br>Twoje przegrane: "+wynikP);
                }else if(zk == 1){
                    button[5].setText("<html>Wynik tej rundy:<br>Przegrałeś</html>"); // String k = "Wylosowałem papier, przegrałeś";
                    wynikP += 1;
                    button[6].setText("<html>Gólny wynik gry:<br>Twoje wygrane: "+wynikW+"<br>Remisy: "+wynikR+"<br>Twoje przegrane: "+wynikP);
                }else{
                    button[5].setText("<html>Wynik tej rundy:<br>Wygrałeś</html>"); // String k = "Wylosowałem nożyce, wygrałeś";
                    wynikW += 1;
                    button[6].setText("<html>Gólny wynik gry:<br>Twoje wygrane: "+wynikW+"<br>Remisy: "+wynikR+"<br>Twoje przegrane: "+wynikP);
                }
            }else if(source.equals(button[2])){
                int zp = r.nextInt(3); // losuje
                if(zp == 0){
                    button[5].setText("<html>Wynik tej rundy:<br>Wygrałeś</html>"); // String p = "Wylosowałem kamień, wygrałeś";
                    wynikW += 1;
                    button[6].setText("<html>Gólny wynik gry:<br>Twoje wygrane: "+wynikW+"<br>Remisy: "+wynikR+"<br>Twoje przegrane: "+wynikP);
                }else if(zp == 1){
                    button[5].setText("<html>Wynik tej rundy:<br>Zremisowaliśmy</html>"); // String p = "Wylosowałem papier, zremisowaliśmy";
                    wynikR += 1;
                    button[6].setText("<html>Gólny wynik gry:<br>Twoje wygrane: "+wynikW+"<br>Remisy: "+wynikR+"<br>Twoje przegrane: "+wynikP);
                }else{
                    button[5].setText("<html>Wynik tej rundy:<br>Przegrałeś</html>"); // String p = "Wylosowałem nożyce, przegrałeś";
                    wynikP += 1;
                    button[6].setText("<html>Gólny wynik gry:<br>Twoje wygrane: "+wynikW+"<br>Remisy: "+wynikR+"<br>Twoje przegrane: "+wynikP);
                 }
            }else if(source.equals(button[3])){
                int zn = r.nextInt(3); // losuje
                if(zn == 0){
                    button[5].setText("<html>Wynik tej rundy:<br>Przegrałe</html>ś"); // String n = "Wylosowałem kamień, przegrałeś";
                    wynikP += 1;
                    button[6].setText("<html>Gólny wynik gry:<br>Twoje wygrane: "+wynikW+"<br>Remisy: "+wynikR+"<br>Twoje przegrane: "+wynikP);
                }else if(zn == 1){
                    button[5].setText("<html>Wynik tej rundy:<br>Wygrałeś</html>"); // String n = "Wylosowałem papier, wygrałeś";
                    wynikW += 1;
                    button[6].setText("<html>Gólny wynik gry:<br>Twoje wygrane: "+wynikW+"<br>Remisy: "+wynikR+"<br>Twoje przegrane: "+wynikP);
                }else{
                    button[5].setText("<html>Wynik tej rundy:<br>Zremisowaliśmy</html>"); // String n = "Wylosowałem nożyce, zremisowaliśmy";
                    wynikR += 1;
                    button[6].setText("<html>Gólny wynik gry:<br>Twoje wygrane: "+wynikW+"<br>Remisy: "+wynikR+"<br>Twoje przegrane: "+wynikP);
                }
                    
                
            }
            // button[6].setText(gra(1));
        
        


    }
}
