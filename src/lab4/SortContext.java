package lab4;

public class SortContext {
    private SortStrategy strategy;

    public SortContext(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(byte[] array){
        if (this.strategy == null){
            throw new IllegalStateException("Стратегію не встановлено!");
        }
        this.strategy.sort(array);
    }
}
