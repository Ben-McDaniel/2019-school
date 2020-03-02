public class tabloid extends readingMaterials{
    public String story; 
    public String l1;
    public String l2;


    public tabloid(int num, String title, String name, String news) {
        super(num, title, name);
        story = news;
        if (story.length() > 35){
            l1 = story.substring(0, 25);
            l2 = story.substring(25, story.length());
        } else{
            l1 = story;
            l2 = " ";
        }
    }

    public void tabloidCover(){
        System.out.printf("%24s %n", title);
        System.out.printf("%27s %n", author);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.printf("%22s %n", "TOP STORY");
        System.out.println();

        for (int i = 0; i < story.length(); i+=25){
            if ( i < story.length() && story.length() >= i + 25){
                System.out.printf("%30s %n", story.substring(i, i + 25));
            } else {
                System.out.printf("%30s", story.substring(i, story.length() - 1));
            }
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.printf("%40s", numPages);
    }
}