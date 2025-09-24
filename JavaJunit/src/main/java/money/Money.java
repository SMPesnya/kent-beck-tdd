package money;

abstract public class Money {
    public boolean equals(Object object){
        Money money = (Money)object;
        return (amount == money.amount && getClass().equals(money.getClass()));
    }
    abstract Money times(int multilpier);
    static Money dollar(int amount){ return new Dollar(amount);}
    static Money franc(int amount){ return new Franc(amount);}
    protected int amount;
}
