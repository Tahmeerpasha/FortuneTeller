
package FortuneTeller;

public class Translator {
    String[] adjectives = {"prosperous", "good", "difficult", "Weak", "Soft", "Hard", "cool", "Beautiful", "bright", "Dark"};
    String[] nouns = {"get a new smartphone", "receive a big surprise", "score highest marks in ur upcoming exams", "get a new job", "acquire a pet", "buy a House", "find your passion", "get married", "meet your old friends", "find love"};
    String[] verbs = {"procrastination", "lying", "getting demotivated", "bullied", "regretting your past decision", "eating unhealthy food", "criticizing yourself", "giving up", "moving away from family", "having negative thoughts"};

    public String getFortune(int a, int b, int c, int d, int e){
        String fortune = "Your future is " + adjectives[a]+". \nYou should stop " + verbs[b] + ". "
                + "\nWe see that you will soon  " + nouns[c] + "."
                + "\nSoon you will be " + verbs[d];
        //+ ", but then it is important that you are " +adjectives[e] +".";
        return fortune;
    }

}