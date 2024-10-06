package Assignment2.Flyweight;

import Assignment2.Document;
import Assignment2.Proxy.ProxyDocument;
import Assignment2.RealDocument;

import java.util.HashMap;
import java.util.Map;

// Фабрика для создания и переиспользования документов
public class DocumentFactory {
    private static final Map<String, Document> documentMap = new HashMap<>();

    // Задача: Реализуйте фабрику, которая будет хранить и переиспользовать документы,
    // чтобы не создавать их повторно для одного и того же заголовка.
    public static Document getDocument(String docName) {
        if (documentMap.containsKey(docName)) {
            return documentMap.get(docName);
        } else {
            Document document = new ProxyDocument(docName);  // исправление
            documentMap.put(docName, document);
        }
        return documentMap.get(docName);
    }
}

