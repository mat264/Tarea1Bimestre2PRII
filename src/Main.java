import quimica.MoleculaAgua;
import animales.Araña;
import animales.TelaAraña;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Creación de Objetos ===\n");

        // Creación de MoleculaAgua (con composición de Átomos)
        MoleculaAgua agua = new MoleculaAgua();
        System.out.println("1. Molécula de agua creada: " + agua.getFormula());
        System.out.println("   (Composición: contiene 2 átomos de H y 1 de O)\n");

        // Creación de Araña (con composición de CuerpoAraña)
        Araña tarantula = new Araña("Tarántula", true);
        System.out.println("2. Araña creada: " + tarantula.getEspecie());
        System.out.println("   (Composición: tiene un CuerpoAraña)\n");

        // Agregación: creamos una tela independientemente
        TelaAraña tela = new TelaAraña("Orbicular");
        System.out.println("3. Tela de araña creada: " + tela.getTipo());

        // Agregación: la araña usa la tela
        tarantula.tejerTela(tela);
        System.out.println("   (Agregación: la araña teje la tela)\n");

        System.out.println("=== Objetos creados exitosamente ===");
    }
}
