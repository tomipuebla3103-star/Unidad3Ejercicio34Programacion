public class PersonalUniversitario {
    protected String nombre;
    protected int legajo;
    protected int antiguedadAnios;

    public PersonalUniversitario(String nombre, int legajo, int antiguedadAnios) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.antiguedadAnios = antiguedadAnios;
    }

    public double calcularSalario() {
        return 500000 + antiguedadAnios * 10000;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Legajo: " + legajo);
        System.out.println("Antiguedad: " + antiguedadAnios + " años");
        System.out.println("Salario mensual: $" + calcularSalario());
    }
}
