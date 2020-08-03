

import twitter4j.TwitterException;
import java.io.IOException;
import java.util.Scanner;



public class OMHSTwitterAPI {
    public static void main (String[]args) throws TwitterException, IOException{
        Scanner input = new Scanner(System.in);
        Twitterer send = new Twitterer();
        int choice = 0;
        int numtweets = 1;

        do{
            System.out.println("1) Send a tweet");
            System.out.println("2) Get your most recent tweets");
            System.out.println("3) Get the most recent tweets from all HCPSS high schools");
            System.out.println("4) Quit");

            choice = input.nextInt();

            if(choice == 1){
                send.tweet(sendTweet());
                System.out.println("\033[2J");
                System.out.println("Tweet Sucessfully Sent");
            } else if(choice == 2){
                String twitter_handle = "BenOMHS1";
                send.fetchTweets(twitter_handle);
            }else if(choice == 3){
                System.out.println("Which would you like:");
                System.out.println("1) 20 most Recent tweets from all HCPSS High Schools (Note this may take a while and will contain 240 tweets)");
                System.out.println("2) 20 most Recent tweets from specific High Schools");
                int hsChoice = input.nextInt();

                if(hsChoice == 1){
                    send.fetchTweets("hcpss_ahs");
                    System.out.println("--------------------------------------------------------------------------------------------------");
                    send.fetchTweets("hcpss_chs");
                    System.out.println("--------------------------------------------------------------------------------------------------");
                    send.fetchTweets("hcpss_ghs");
                    System.out.println("--------------------------------------------------------------------------------------------------");
                    send.fetchTweets("hcpss_hahs");
                    System.out.println("--------------------------------------------------------------------------------------------------");
                    send.fetchTweets("hcpss_hohs");
                    System.out.println("--------------------------------------------------------------------------------------------------");
                    send.fetchTweets("hcpss_lrhs");
                    System.out.println("--------------------------------------------------------------------------------------------------");
                    send.fetchTweets("hcpss_mrhs");
                    System.out.println("--------------------------------------------------------------------------------------------------");
                    send.fetchTweets("hcpss_mhhs");
                    System.out.println("--------------------------------------------------------------------------------------------------");
                    send.fetchTweets("hcpss_omhs");
                    System.out.println("--------------------------------------------------------------------------------------------------");
                    send.fetchTweets("hcpss_rhs");
                    System.out.println("--------------------------------------------------------------------------------------------------");
                    send.fetchTweets("hcpss_rhhs");
                    System.out.println("--------------------------------------------------------------------------------------------------");
                    send.fetchTweets("hcpss_wlhs");
                    System.out.println("--------------------------------------------------------------------------------------------------");
                } else if(hsChoice == 2){
                    System.out.println("Would you like Atholton High School Y/N");
                    String yn = input.next();
                    if (yn.toLowerCase().equals("y")){
                        send.fetchTweets("hcpss_ahs");
                        System.out.println("--------------------------------------------------------------------------------------------------");
                    }

                    System.out.println("Would you like Centennial High School Y/N");
                    yn = input.next();
                    if (yn.toLowerCase().equals("y")){
                        send.fetchTweets("hcpss_chs");
                        System.out.println("--------------------------------------------------------------------------------------------------");
                    }

                    System.out.println("Would you like Glenelg High School Y/N");
                    yn = input.next();
                    if (yn.toLowerCase().equals("y")){
                        send.fetchTweets("hcpss_ghs");
                        System.out.println("--------------------------------------------------------------------------------------------------");
                    }

                    System.out.println("Would you like Hammond High School Y/N");
                    yn = input.next();
                    if (yn.toLowerCase().equals("y")){
                        send.fetchTweets("hcpss_hahs");
                        System.out.println("--------------------------------------------------------------------------------------------------");
                    }

                    System.out.println("Would you like Howard High School Y/N");
                    yn = input.next();
                    if (yn.toLowerCase().equals("y")){
                        send.fetchTweets("hcpss_hohs");
                        System.out.println("--------------------------------------------------------------------------------------------------");
                    }

                    System.out.println("Would you like Long Reach High School Y/N");
                    yn = input.next();
                    if (yn.toLowerCase().equals("y")){
                        send.fetchTweets("hcpss_lrhs");
                        System.out.println("--------------------------------------------------------------------------------------------------");
                    }

                    System.out.println("Would you like Marriotts Ridge High School Y/N");
                    yn = input.next();
                    if (yn.toLowerCase().equals("y")){
                        send.fetchTweets("hcpss_mrhs");
                        System.out.println("--------------------------------------------------------------------------------------------------");
                    }

                    System.out.println("Would you like Mt. Hebron High School Y/N");
                    yn = input.next();
                    if (yn.toLowerCase().equals("y")){
                        send.fetchTweets("hcpss_mhhs");
                        System.out.println("--------------------------------------------------------------------------------------------------");
                    }

                    System.out.println("Would you like Oakland Mills High School Y/N");
                    yn = input.next();
                    if (yn.toLowerCase().equals("y")){
                        send.fetchTweets("hcpss_omhs");
                        System.out.println("--------------------------------------------------------------------------------------------------");
                    }

                    System.out.println("Would you like Reservoir High School Y/N");
                    yn = input.next();
                    if (yn.toLowerCase().equals("y")){
                        send.fetchTweets("hcpss_rhs");
                        System.out.println("--------------------------------------------------------------------------------------------------");
                    }

                    System.out.println("Would you like River Hill High School Y/N");
                    yn = input.next();
                    if (yn.toLowerCase().equals("y")){
                        send.fetchTweets("hcpss_rhhs");
                        System.out.println("--------------------------------------------------------------------------------------------------");
                    }

                    System.out.println("Would you like Wilde Lake High School Y/N");
                    yn = input.next();
                    if (yn.toLowerCase().equals("y")){
                        send.fetchTweets("hcpss_wlhs");
                        System.out.println("--------------------------------------------------------------------------------------------------");
                    }
                }
            }       
        }while(choice != 4);
    }




    public static String sendTweet(){
        String tweet;
        String yn;
        Scanner input = new Scanner(System.in);
        boolean correct = true;

        do{
            System.out.println("Enter the tweet you want to send:");
            tweet = input.nextLine();

            if(tweet.length() > 280){
                System.out.println("Tweet too long, enter a new tweet");
                correct = false;
            }

            System.out.println("Is this correct: " + tweet + " Y/N");
            yn = input.next();

            if (yn.toLowerCase().equals("n")){
                System.out.println("OK, tweet canceled");
                correct = false;
            }

        } while (!correct);

        return tweet;
    }
}