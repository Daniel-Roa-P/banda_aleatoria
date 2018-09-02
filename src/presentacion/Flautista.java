package presentacion;

class Flautista extends Persona implements Accion {

    public Flautista(){
        contador++;
        integrantes=new int [contador];
        papel=new String [contador];
    }
    
    public String agrego_Flauta(){
        Flauta ins_F=new Flauta();
        return ins_F.afinar();
    }
    
    @Override
    public void reportarse() {
       
        rol="Flautista ";
        papel[j]=rol;
        j++;
        
        if(n>0){
        
        System.out.println("iran "+n+" flautas de las cuales:");
        
        }
        
        for(int j=1;j<(n+1);j++){
        
            System.out.println("el: "+rol+" "+j+" "+agrego_Flauta());
            
    }
        
        
    }
    
}
