package Proxy;

import java.util.List;

public class MyFileLoaderCached implements FileLoader {

    private final MyFileLoader loader = new MyFileLoader();

    private List<String> cache = null;

    @Override
    public List<String> getFileContents() {
        if (cache == null) {
            cache = loader.getFileContents();
        }

        return cache;
    }

    @Override
    public void printFileContents() {
        if (cache == null) {
            cache = getFileContents();
        }

        for (String line : cache) {
            System.out.println(line);
        }
    }

}
