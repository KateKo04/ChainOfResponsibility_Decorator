package task1;

import task1.Handler;

public class Handler5 extends Handler {

    @Override
    public void handle(int price) {
        Handler next = getNext();
        if (price % 5 > 0 && next == null)
            throw new IllegalArgumentException();

        System.out.println(price/5 + " * 5");
        if (next != null) {
            next.handle(price%5);

        }

    }
}
