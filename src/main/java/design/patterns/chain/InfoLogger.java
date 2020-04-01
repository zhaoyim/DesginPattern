package design.patterns.chain;

public class InfoLogger extends AbstractLogger {
    public InfoLogger(int level) {
        this.level = level;
    }

    void write(String message) {
        System.out.println("INFO : " + message);
    }
}
