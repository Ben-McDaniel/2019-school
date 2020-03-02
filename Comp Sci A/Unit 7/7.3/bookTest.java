public class bookTest{
    public static void main(String[]args){
        book b = new book(756, "To Kill a Mockingbird", "Harper Lee", "Opperation Inc");
        techJournal tJ = new techJournal(144, "Computers Daily", "Jimmy McGill", false);
        tabloid t = new tabloid(27, "Celeb News", "Multiple Authors", "Fameous Actress Beaten to death with small blunt object, Says the family, 'I cant believe that Rece was killed With a Spoon'");
        
        
        System.out.println(b.bookInfo());
        System.out.println();
        System.out.println(tJ.techJournalInfo());
        System.out.println();
        t.tabloidCover();
    }
}