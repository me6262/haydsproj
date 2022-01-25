/**
 * sumthin
 */
public class sumthin {
    String boredom;
    
    
    public sumthin() {// constructor
        
        
    }
    public void uBored(boolean isBored) {//made this while i was bored to check if im bored
        
        if (isBored == true) {
            System.out.println("well that sucks");
        } else {
            System.out.println("kool");
        }
    }



    public static void main(String[] args) {
        sumthin amBored = new sumthin();
        amBored.uBored(true);
        
    }
}
