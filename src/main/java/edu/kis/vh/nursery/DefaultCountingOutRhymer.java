package edu.kis.vh.nursery;

/**
 * Klasa jest implementacja prostego stosu
 */
public class DefaultCountingOutRhymer {

    private static final int ARRAY_SIZE = 12;
    private static final int EMPTY = -1;
    private static final int CAPACITY = ARRAY_SIZE - 1;
    private static final int IF_EMPTY = -1;
    private final int[] numbers = new int[ARRAY_SIZE];

    private int total = EMPTY;


    /**
     * Dodaje liczbe do tablicy
     * @param in liczba do dodania
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Sprawdza czy lista jest pusta
     * @return true - jesli lista jest pusta, badz false - jesli nie jest
     */
    public boolean callCheck() {
        return total == EMPTY;
    }

    /**
     * Sprawdza czy lista jest pełna
     * @return true - jesli lista jest pelna, badz false - jesli nie jest
     */
    public boolean isFull() {
        return total == CAPACITY;
    }

    /**
     * Sprawdza ostatnio dodana liczbe
     * @return IF_EMPTY (-1) - jesli lista jest pusta, badz ostatnio dodana liczbe
     */
    protected int peekaboo() {
        if (callCheck())
            return IF_EMPTY;
        return numbers[total];
    }

    /**
     * Usuwa ostatnio dodana liczbe z listy
     * @return IF_EMPTY (-1) - jesli lista jest pusta, badz ostatnio dodana liczbe
     */
    public int countOut() {
        if (callCheck())
            return IF_EMPTY;
        return numbers[total--];
    }
}
