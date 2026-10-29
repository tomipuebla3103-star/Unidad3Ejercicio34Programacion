public class Investigador extends PersonalUniversitario{
    private int papersPublicados;
    private double subsidioAsignado;

    public Investigador(String nombre, int legajo, int antiguedadAnios, int papersPublicados, double subsidioAsignado) {
        super(nombre, legajo, antiguedadAnios);
        this.papersPublicados = papersPublicados;
        this.subsidioAsignado = subsidioAsignado;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + papersPublicados * 20000 + subsidioAsignado;
    }

    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Papers publicados: " + papersPublicados);
        System.out.println("Subsidio asignado: $" + subsidioAsignado);
    }
}
