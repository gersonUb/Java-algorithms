package aed2;

class ListaDeInts implements SecuenciaDeInts{
    private Nodo primero;

    private class Nodo{
        Nodo siguiente;
        int valor;
        public Nodo (int v){
            v = valor; 
        }       
    }
    // Necesito un iniciador (CONSTRUCTOR)
    public ListaDeInts(){
        primero = null;
    }

    public void agregarAdelante(int e){
        Nodo nuevo = new Nodo(e);
        nuevo.siguiente = primero;
        primero = nuevo;
    }
    
    public void agregarAtras(int e){
        Nodo nuevo = new Nodo(e);
        if (primero == null) {
            primero = nuevo;
        } else {

            Nodo actual = primero;
            while (actual.siguiente != null){
                actual = actual.siguiente;
        }   
        actual.siguiente = nuevo;              
        }
    }

    public void eliminar(int i){
        Nodo actual = primero;
        Nodo previo = primero;
        for (int j = 0; j < i; j++) {
            previo = actual;
            actual = actual.siguiente;
        }
        if(i == 0){
            primero = actual.siguiente;
        }
        else{
            previo.siguiente = actual.siguiente;
        }
    }
}