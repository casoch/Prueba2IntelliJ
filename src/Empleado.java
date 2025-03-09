public class Empleado {
    private String nombre;
    private double sueldo;
    private int medallitas;
    
    public Empleado()
    {
        medallitas = 1;
    }
    
    public Empleado(String nombre, double sueldo)
    {
        this();
    	this.nombre = nombre;
    	this.sueldo = sueldo;
    }

}
