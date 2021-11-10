public abstract class Laptop {
    protected Memory memory;

    public Laptop(Memory memory){
        this.memory = memory;
    }

    public abstract void work();
}
