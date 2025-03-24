package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    public static final int arraySize = 12;
    public static final int minusOne = -1;
    private final int[] numbers = new int[arraySize];

    public int total = minusOne;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == -1;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

}
