package money;

public class Dollar {
    public Dollar(int amount){
        this.amount = amount;
    }
    public boolean equals(Object object){
        Dollar dollar = (Dollar)object;
        return (amount == dollar.amount);
    }
    public Dollar times(int multiplier){
        return new Dollar(amount * multiplier);
    }
    private int amount;
}
