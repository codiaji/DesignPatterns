package io.motassadderoon;

public class NullCustomer extends AbstractCustomer {
    @Override
    public String getName() {
        return "Customer Not Found";
    }

    @Override
    public boolean isNull() {
        return true;
    }
}
