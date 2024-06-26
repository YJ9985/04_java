package afternoon.interfacee;

public class Spanish implements Human{
    @Override
    public void speak(){
        System.out.println("Hola");
    }

    @Override
    public void eat(){
        System.out.println("El espanol come paella");
    }

    @Override
    public void hello(){
        System.out.println("Hola. Actualmente es el ano " + thisyear);
    }
}
