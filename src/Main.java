//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    ProfesorTitular profesor = new ProfesorTitular(
            "Juan Perez", 101, 10, 12, "Titular"
    );

    Investigador investigador = new Investigador(
            "Maria Lopez", 102, 5, 8, 150000
    );

    AyudanteCatedra ayudante = new AyudanteCatedra(
            "Pedro Gomez", 103, 2, 6
    );

    System.out.println("=== PROFESOR TITULAR ===");
    profesor.mostrarDatos();

    System.out.println("\n=== INVESTIGADOR ===");
    investigador.mostrarDatos();

    System.out.println("\n=== AYUDANTE DE CATEDRA ===");
    ayudante.mostrarDatos();
}
