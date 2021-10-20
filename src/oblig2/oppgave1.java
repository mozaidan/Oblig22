package oblig2;

import static javax.swing.JOptionPane.*;

public class oppgave1 {

    public static void main(String[] args) {

        int nedreGrense = Integer.parseInt(showInputDialog("Skriv inn tall nedre grense"));
        int ovreGrense = Integer.parseInt(showInputDialog("Skriv inn tall øvre grense"));

        while (nedreGrense >= ovreGrense) {
            showMessageDialog(null, "feil tall");
            String nedreGrense1 = showInputDialog("Skriv inn tall 1");
            String ovregr2 = showInputDialog("tall2");

            ovreGrense = Integer.parseInt(nedreGrense1);
            nedreGrense= Integer.parseInt(ovregr2);
        }
        int sum = 0;
        int antall = 0;
        for (int i = nedreGrense; i < ovreGrense; i++) {
            sum += i;

            System.out.print(i + " + ");
            antall++;
            if (antall % 10 == 0){
                System.out.println();
            }

        }
        sum += ovreGrense;

        showMessageDialog(null, "Summer er " + sum);
        System.out.println(ovreGrense+" = " + sum);

    }
}
