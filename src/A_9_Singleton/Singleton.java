package A_9_Singleton;

// Опишите класс синглтон с отложенной инициализацией. Используйте synchronized
public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // Приватный конструктор для предотвращения прямого создания экземпляра
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
