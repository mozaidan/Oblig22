package oblig2;

import static javax.swing.JOptionPane.*;

class Tallspill {

    public int nyttTall() {
        return (int) (Math.random() * 201);
    }

    public void visMelding(String melding) {
        showMessageDialog(null, melding);
    }

    private void forLite(int tall) {
        visMelding(tall + " er for lite! Prøv igjen");
    }

    private void forStort(int tall) {
        visMelding(tall + " " +
                "er for stor! Prøv å gjett igjen");
    }

    public void avsluttRunde(int antall, int gjetning) {
        visMelding(gjetning + " er riktig!" + "\n" + "Du har gjettet riktig på " + antall + " forsøk");
    }

    public void kjørSpill() {
        int nyttTall = nyttTall();
        // System.out.println(nyttTall);


        int gjetningen = Integer.parseInt(showInputDialog("Jeg tenker på et tall mellom 0 og 200. \n Prøv å gjette på tallet:"));
        int antall = 0;

        while (nyttTall != gjetningen) {
            try {
                if (gjetningen < nyttTall) {
                    forLite(gjetningen);
                    antall++;
                }
                else if (gjetningen > nyttTall) {
                    forStort(gjetningen);
                    antall++;
                }
                gjetningen = Integer.parseInt(showInputDialog("Jeg tenker på et tall mellom 0 og 200. \n Prøv å gjette på tallet:"));
            }
            catch (Exception e){
                visMelding("Du har skrevet feil input!");
                gjetningen = Integer.parseInt(showInputDialog("Jeg tenker på et tall mellom 0 og 200. \n Prøv å gjette på tallet:"));
            }
        }
        avsluttRunde(antall, gjetningen);

    }

    public static void main(String[] args) {
        Tallspill spill = new Tallspill();
        spill.kjørSpill();
    }
}
