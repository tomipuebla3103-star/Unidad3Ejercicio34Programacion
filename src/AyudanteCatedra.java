public class AyudanteCatedra extends PersonalUniversitario{
    private int asignacionPracticas;

    public AyudanteCatedra(String nombre, int legajo, int antiguedadAnios, int asignacionPracticas) {
        super(nombre, legajo, antiguedadAnios);
        this.asignacionPracticas = asignacionPracticas;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + asignacionPracticas * 10000;
    }

    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Practicas asignadas: " + asignacionPracticas);
    }
}
