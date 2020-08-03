public class asdf{

    public Animal createNewAnimal(String name, String type, double age){
        int cost = 0;
        int numtype = 0;

        for(int i = 0; i < Animal.size(); i++){
            if (Animal[i].getType == type){
                numtype++;
            }
        }

        if(numtype < 5 && age < 1){
            cost = 25;
        } else if(numtype < 5 && age >= 1){
            cost = 20;
        } else{
            cost = 15;
        }

        Animal a = new Animal(name, type, age, cost);

        return a;
    }

    public void addAnimal(String name, String type, double age){
        Animal.add(createNewAnimal(this.name, this.type, this.age));




        //sort list
        
        for (int i = 0; i < Animal.size(); i++){
            if(Animal[i].getAge() > Animal[i + 1].getAge()){
                Animal temp = new Animal[i];
                Animal[i].remove();
                Animal.add(temp);
            }
        }
    }


    public Animal getAnimalWithMostInterest(){
        /** you would need to add an int vaible to represent the interest level.  It could be instantiated as 0 when an animal object is created, using the existing constructor
         * since the animal is new and has no interest yet, and you would need 2 new methods in the animal class, one to add, and one to remove interest
         * the interest  would need to be private as it is different for each animal object, and all the methods associated with it would be public
         */
    }

}