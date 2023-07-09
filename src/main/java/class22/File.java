package class22;

public abstract class File {

    String name;
    int size;
    abstract void open ();
    void edit() {
        System.out.println("Editing....");
    };

    void close() {
        System.out.println("Closing....");
    }

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }
}

class JavaFile extends File {

    public JavaFile(String name, int size) {
        super(name, size);
    }

    @Override
    void open() {
        System.out.println("to open we need notepad++");
    }
}

class WordFile extends File {
    public WordFile(String name, int size) {
        super(name, size);
    }

    @Override
    void open() {
        System.out.println("to open we need Microsoft Word");
    }
}

class PdfFile extends File {
    public PdfFile(String name, int size) {
        super(name, size);
    }

    @Override
    void open() {
        System.out.println("to open we need Adobe Reader");
    }
}



 class FileTester {
    public static void main(String[] args) {

        File [] files ={new JavaFile("filename1", 5),
                new WordFile("filename2", 7),
                new PdfFile("filename3", 2)};

        for (File file : files) {
            file.open();
            file.edit();
            file.close();

        }
    }
}
