import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Exercice1 {
    static JTextArea sortie = new JTextArea(20,40);
    public static int hanoi(int n, String depart, String intermediare, String arrivee) {
        int nbre_de_fois =0;
        if(n>0){
            nbre_de_fois +=  hanoi(n-1, depart, arrivee, intermediare);
            sortie.append("     Deplacer le disque no " + n + " de position " + depart + " vers position " + arrivee + "\n");
            nbre_de_fois++;
            nbre_de_fois +=  hanoi(n-1, intermediare, depart, arrivee);
            
        }
        return nbre_de_fois;
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JTextArea res = new JTextArea(30,40);
        JPanel panePrincipal = new JPanel(new GridBagLayout());
        JPanel pane = new JPanel();
        JLabel lbl = new JLabel("Entrez le nombre de disque pour tours de Hanoï");
        JTextField jtxt = new JTextField();
        jtxt.addActionListener(new ActionListener() {     

            @Override
            public void actionPerformed(ActionEvent e) {
                String  nbr = jtxt.getText();
               sortie = new JTextArea(); 
               sortie.append("\t le nomdre de fois pour tours de Hanoï à " + nbr + " est : " + hanoi(Integer.parseInt(nbr)  ,"A","B","C") + "\n\n");
               res.setText(sortie.getText());
                        
            }
          });
        lbl.setPreferredSize(new Dimension(350,20));
        jtxt.setPreferredSize(new Dimension(150,20));
        lbl.setLabelFor(jtxt);
        pane.add(lbl);
        pane.add(jtxt);

        GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(0, 5, 10, 5);
		gbc.anchor = GridBagConstraints.NORTHWEST;
		gbc.gridx = 0;
		gbc.gridy = 0;
		panePrincipal.add(pane, gbc);

        gbc.gridwidth = 2;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 0;
		gbc.gridy = 1;
        JScrollPane scroll = new JScrollPane(res);
		panePrincipal.add(scroll, gbc);

        frame.add(panePrincipal);
        frame.setBounds(500,100,800,600);
        frame.setTitle("Gestion de la bibliotheque");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }

    
}