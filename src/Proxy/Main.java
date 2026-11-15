package Proxy;

public class Main {
    public static void main(String[] args) {
        FileLoader loader = new MyFileLoaderCached();
        loader.printFileContents();

    }
}
