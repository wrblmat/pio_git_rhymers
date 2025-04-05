package edu.kis.vh.nursery;

/**
 * Klasa HanoiRhymer dziedziczy z defaultCountingOutRhymer, implementuje zasady
 * dodawania elementów do stosu, polegające na tym, że elementy większe niż aktualny
 * wierzchołek stosu nie są dodawane, lecz odrzucane
 */
public class HanoiRhymer extends defaultCountingOutRhymer {

    private int totalRejected = 0;

    /**
     * Metoda zwracająca liczbę odrzuconych wartości
     *
     * @return totalRejected - liczba odrzuconych wartości
     */
    public int reportRejected() {
        return totalRejected;
    }

    /**
     * Dodaje nową wartość do stosu, jeśli są spełnione warunki
     * Jeżeli wartość jest większa od wartości na szczycie stosu, zwiększa się licznik odrzuconych elementów
     * @param in - wartość do dodania
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
