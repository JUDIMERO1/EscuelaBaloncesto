package model;

/**
 *
 * @author JUAN DIEGO
 */
public class Principal {

    public static void main(String[] args) {

        Profesor profesor = new Profesor("Mathias", "Perez", "123456789", "calle 1", "310", 8000000, Genero.MASCULINO, "Entrenador", 15, 6, 1980);
        Auxiliar auxiliar = new Auxiliar("Sergio", "Riveros", "123", "calle 6", "320", 2000000, Genero.MASCULINO, 24);
        Administrador administrador= new Administrador("Moises", "Torrado", "143", "calle 27", "315", 1000000, Genero.MASCULINO, 20, 2, 2023);
        
        System.out.println(profesor.toString());
        System.out.println(auxiliar.toString());
        System.out.println(administrador.toString());
        
        
        
        
        
    }

}
