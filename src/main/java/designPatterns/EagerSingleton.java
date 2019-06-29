package designPatterns;

public class EagerSingleton {
    /*
    Singleton w którym wykorzystywana jest wczesna inicjalizacja.
    Wykorzystywane są w przypadku gdy utworzenie Singletona nie
    jest kosztowną operacją
     */
    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton(){
    }

    public static EagerSingleton getInstance(){
        return instance;
    }
}
