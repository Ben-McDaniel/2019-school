public class book extends readingMaterials{
    private String publisher;

    public book(int pages, String bookTitle, String name, String pub){
        super(pages, bookTitle, name);
        publisher = pub;
    }

    public String bookInfo(){
        return(title + ", written by " + author + " and published by " + publisher + " is " + numPages + " pages long");
    }
}