public class MacbookPro extends Laptop {

    public MacbookPro(Memory memory) {
        super(memory);
    }

    @Override
    public void work() {
        System.out.println("fulfills the needs of the pro user");
        memory.storage();
    }
}
