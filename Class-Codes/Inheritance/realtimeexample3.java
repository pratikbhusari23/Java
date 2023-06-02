class Document {

    Document() {
        System.out.println("A Document");
    }

    void read() {
        System.out.println("Reading the document");
    }
}

class PDF extends Document {

    PDF() {
        System.out.println("PDF Document");
    }
}

class Word extends Document {

    Word() {
        System.out.println("Word Document");
    }
}

class Spreadsheet extends Document {

    Spreadsheet() {
        System.out.println("Spreadsheet Document");
    }
}

class Presentation extends Document {

    Presentation() {
        System.out.println("Presentation Document");
    }
}

class User {

    public static void main(String[] args) {

        Document doc1 = new Document();
        doc1.read();

        PDF doc2 = new PDF();
        doc2.read();

        Document doc3 = new PDF();
        doc3.read();

        Word doc4 = new Word();
        doc4.read();

        Spreadsheet doc5 = new Spreadsheet();
        doc5.read();

        Presentation doc6 = new Presentation();
        doc6.read();
    }
}
/*
A Document
Reading the document
A Document
PDF Document
Reading the document
A Document
PDF Document
Reading the document
A Document
Word Document
Reading the document
A Document
Spreadsheet Document
Reading the document
A Document
Presentation Document
Reading the document
 */
