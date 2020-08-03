//This class was one of the classes that I wrote for this project

import twitter4j.*;

import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Twitterer{
      private Twitter twitter;
      private List<Status> statuses;

     //creates an object to interact with twitter
      public Twitterer(){
         // Connects to Twitter and performs authorizations.
         twitter = TwitterFactory.getSingleton(); 
      }
   
     //sends a tweet 
     public void tweet(String message) throws TwitterException {
         Status status = twitter.updateStatus(message);
      }
   
      

      public void fetchTweets(String handle) throws TwitterException, IOException{

         statuses = twitter.getUserTimeline(handle);
         for (Status status : statuses){
            
            System.out.println(status.getUser().getName() + ": " + status.getText());
            System.out.println();
         }
      }
   	


   
   }  
