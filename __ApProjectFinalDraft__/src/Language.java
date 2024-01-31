public interface Language {
    void choseLanguage();
    default void method() {
        System.out.println("");
    }
}
