public class ProfesorTitular extends PersonalUniversitario{
    private int horasDocencia;
    private String categoriaDocencia;

    public ProfesorTitular(String nombre, int legajo, int antiguedadAnios, int horasDocencia, String categoriaDocencia) {
        super(nombre, legajo, antiguedadAnios);
        this.horasDocencia = horasDocencia;
        this.categoriaDocencia = categoriaDocencia;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + horasDocencia * 15000;
    }

    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Horas de docencia: " + horasDocencia);
        System.out.println("Categoria: " + categoriaDocencia);
    }
}
