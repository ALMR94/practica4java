/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4;

/**
 *
 * @author hola
 */
public class Libro {

        /**
         * Atributos de la clase libro
         */
        public String titulo, autor, isbn;
        public int prestados, ejemplares;

        /**
         * Constructor, recibe tres variables de la clase String y dos de la clase int
         */
        public Libro(String tit, String aut, String id, int prest, int ejemp) {
            titulo = tit;
            autor = aut;
            isbn = id;
            prestados = prest;
            ejemplares = ejemp;
        }

        
        public String getTitulo() {
            return titulo;
        }

        public String getAutor() {
            return autor;
        }

        public String getIsbn() {
            return isbn;
        }
        
        public int getPrestados() {
            return prestados;
        }

        public int getEjemplares() {
            return ejemplares;
        }
    
}
