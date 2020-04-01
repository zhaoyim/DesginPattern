package design.patterns.chain;

public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level) {
        this.level = level;
    }

    void write(String message) {
        System.out.println("ERROR : " + message);
    }
}
