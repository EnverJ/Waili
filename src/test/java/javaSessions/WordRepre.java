package javaSessions;

public class WordRepre {
    public static void wordRep(int num){
        //print word rep number
        String Rep;
        switch(num){
            case 1:
                System.out.println(Rep="one");
                break;
            case 2:
                System.out.println(Rep="two");
                break;
            case 3:
                System.out.println(Rep="three");
                break;
            default:
                System.out.println(Rep="invalid");
                break;
        }
    }
    public static void main(String [] args){
        wordRep(3);
    }
}
