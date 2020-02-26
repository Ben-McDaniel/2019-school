public class techJournal extends readingMaterials{
    public boolean isCurrentInfo;

    public techJournal(int num, String title, String name, boolean current) {
		super(num, title, name);
        isCurrentInfo = current;
    }
    
    public String canIUseThis(){
        if(isCurrentInfo){
            return("Its current, go ahead");
        } else{
            return("This isnt current info, do not use");
        }
    }
}