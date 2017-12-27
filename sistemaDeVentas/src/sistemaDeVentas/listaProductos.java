package sistemaDeVentas;
import java.util.ArrayList;
/**
 *
 * @author Luis Bastias
 */
public class listaProductos {
    
  private ArrayList<Producto> Productos;
    
     public void AgregarProd(Producto p) { 
         Productos.add(p);
     }
       public listaProductos() { Productos = new ArrayList(); }
    
     public int largo(){ 
         return Productos.size();
     }
              
    public Producto RegresaObje(int pos){
        
        return Productos.get(pos);
    }
    
     public int BuscaPosProducto(String Codigo) {
	// Busca La posicion en una lista de objetos
       String existe ="N";
       int posicion = -1;
       int i=0;
       
       while((i<Productos.size()) && (existe.equals("N"))){
            
           if(Productos.get(i).getCodigo().equals(Codigo))
           { 
               posicion = i;
               existe = "S";
           }     
        i=i+1; 
       }   
         System.out.println(posicion);
         
       return posicion;
     }    
    
    public Producto BuscaProducto(String Codigo) {
       String existe ="N";
       int posicion = 0;
       int i=0;
       
       while((i<Productos.size()) && (existe.equals("N"))){
            
           if(Productos.get(i).getCodigo().equals(Codigo))
           { 
               posicion = i;
               existe = "S";
           }     
        }   
         return Productos.get(posicion);
       }        

 public int SumaVenta(){
         int valor=0;
         int i=0;
         
         
         while(i<Productos.size() ){
            
             valor = valor + Productos.get(i).getPrecioVenta();
          
            i=i+1;    
         }
         
         return valor;
     }



}
 
  

