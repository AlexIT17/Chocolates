import java.util.concurrent.atomic.AtomicInteger;

//Класс, управляющий потоками
class InterferenceExample {
    private static final int price_chocolate = 100;
    private static final int budget = 1000;

    void example() {
        int bought = budget / price_chocolate;
        int total = bought;

        int free = bought / 5;
        total += free;

        int fantik = total;
        while (fantik >= 3) {
            int newchoco = fantik / 3;
            total += newchoco;
            fantik = fantik % 3 + newchoco;
        }

        System.out.println("Без добавки: " + bought);
        System.out.println("Всего: " + total);
    }
}
