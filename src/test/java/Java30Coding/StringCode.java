package Java30Coding;

public class StringCode {
    public static void main(String[] args) {
        // remove special characters in string
        String s = "abcd$ddf";
        String result = s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(result);
 //remove whitespaces in string
        String b = "Auto  Matio  n";
        String results1 = b.replaceAll("\\s", "");
        System.out.println(results1);

        //count occurances character in a string
        String c="tomITLisaTomJob";
        int count=0;
        char target='T';
        for(int i=0; i<c.length(); i++){
            if(c.charAt(i)==target) {
                count++;
            }
            System.out.println("The charater "  +target +  " occurs "+count+ " times ");
            }
        //count the word in a string
        String d="Hello My Lovely Son";
        String[] words= d.trim().split("\\s+");
        System.out.println("number of words "+words.length);


        }

    }

