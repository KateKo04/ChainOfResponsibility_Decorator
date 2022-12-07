package task1;

public class Handler20 extends Handler{

    @Override
    public void handle(int price) {
        Handler next = getNext();
        if (price % 20 > 0 && next == null)
            throw new IllegalArgumentException();
        else if (next != null) {
            getNext().handle(price % 20);
            System.out.println(price/20 + " * 20");
        }
    }
}
