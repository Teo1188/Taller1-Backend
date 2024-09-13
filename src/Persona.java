public abstract class Persona {
    //Atributos encapsulados (encapsulacion)
    protected String nombre;
    protected String apellido;
    //constructor
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    //Metodo abstracto
    public abstract void mostrarDatos();
}


