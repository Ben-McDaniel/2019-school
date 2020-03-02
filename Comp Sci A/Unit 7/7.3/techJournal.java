public class techJournal extends readingMaterials{
    public boolean isCurrentInfo;

    public techJournal(int num, String title, String name, boolean current) {
		super(num, title, name);
        isCurrentInfo = current;
    }
    
    public String canIUseThis(){
        if(isCurrentInfo){
            return("is current");
        } else{
            return("isnt current info");
        }
    }

    public String techJournalInfo(){
        return(title + ", written by " + author + " " + this.canIUseThis() + ", and is " + numPages + " pages long");
    }
}