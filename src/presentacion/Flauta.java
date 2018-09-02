
package presentacion;

class Flauta extends Instrumento implements Afinacion {

    @Override
    public String afinar() {
      
        return "no afina su flauta.";
        
    }
    
}
