public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        for(EstadoBrasileiro e: EstadoBrasileiro.values())
        {
            System.out.println(e.getSigla());
        }
    }
}
