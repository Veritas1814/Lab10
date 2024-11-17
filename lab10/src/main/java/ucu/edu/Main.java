package ucu.edu;
import ucu.edu.decorator.CachedDocument;
import ucu.edu.decorator.MockedDocument;
import ucu.edu.decorator.TimeDocument;

public class Main {
    public static void main(String[] args) {
        MockedDocument mockedDocument = new MockedDocument("path");
        TimeDocument timeDocument = new TimeDocument(mockedDocument);

        System.out.println(timeDocument.parse());
        CachedDocument cachedDocument = new CachedDocument (mockedDocument);
        System.out.println(cachedDocument.parse());
    }
}