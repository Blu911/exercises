package designPatterns;

public class LazySingleton {
    /*
    Singleton inicializowany w sposób leniwy.
    W przypadku kiedy chcemy mieć pewność, że Singleton
    zostanie utworzony dopiero w momencie, w którym będziemy
    go potrzebować.
     */

    private static LazySingleton INSTANCE = null;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }
}
