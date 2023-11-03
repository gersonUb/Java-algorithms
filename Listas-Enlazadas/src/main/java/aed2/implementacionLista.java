package aed2;

public class implementacionLista{
    public static void main(String[] args) {
        ListaDeInts miLista = new ListaDeInts();

        miLista.agregarAdelante(5);
        miLista.agregarAtras(10);
        miLista.agregarAdelante(3);

        miLista.eliminar(1);
    }
}