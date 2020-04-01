package design.patterns.chain;

public class DebugLogger extends AbstractLogger {
    public DebugLogger(int level) {
        this.level = level;
    }

    void write(String message) {
        System.out.println("DEBUG : " + message);
    }
}
