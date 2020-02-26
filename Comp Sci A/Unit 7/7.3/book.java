public class book extends readingMaterials{
    private String publisher;

    public book(int pages, String title, String name, String pub){
        super(pages, title, name);
        publisher = pub;
    }

    public String bookInfo(){
        return(bookTitle + ", written by " + author + " and published by " + publisher + " is " + numPages + " pages long");
    }
}