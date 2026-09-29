public class PetrolEngine implements Engine{
    Engine engine = new PetrolEngine();
    @Override
    public void start() {
        engine.start();
        System.out.println("Engine started............");
    }
}
