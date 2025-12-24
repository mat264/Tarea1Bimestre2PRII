package quimica;

public class MoleculaAgua {
    private String formula;
    private Atomo[] atomos; // Composición: los átomos son parte de la molécula

    public MoleculaAgua() {
        this.formula = "H2O";
        // Composición: creamos los átomos dentro del constructor
        this.atomos = new Atomo[3];
        this.atomos[0] = new Atomo("H", 1);
        this.atomos[1] = new Atomo("H", 1);
        this.atomos[2] = new Atomo("O", 8);
    }

    public String getFormula() {
        return formula;
    }
}
