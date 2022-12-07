package task2;

public class TimedDocument {
    TimedDocument(Document document){
        final long startTime = System.currentTimeMillis();
//        Document document = new SmartDocument("gs://oop-course/Geico-2021.png");
        final long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime - startTime) + " milliseconds");
    }
}
