package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    private static final int EMPTY = -1;
    private static final int DEFAULT = -1;
    private static final int MAX_ARRAY_SIZE = 12;
    private final int[] numbers = new int[MAX_ARRAY_SIZE];

    public int getTotal() {
        return total;
    }

    private int total = EMPTY;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY;
    }

    public boolean isFull() {
        return total == MAX_ARRAY_SIZE - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return DEFAULT;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return DEFAULT;
        return numbers[total--];
    }

}