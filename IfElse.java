package ChapterTwo.if_else;
public class IfElse {
    public static void main(String[] args) {
        String givenString = "Yes";
        if (givenString == "Yes"){
            System.out.println("The given string is 'Yes'.");
        }
        else if (givenString == "No") {
            System.out.println("The given string is 'No'.");
        }
        else{
            System.out.println("The given string is 'None'.");
        }
    }
}
