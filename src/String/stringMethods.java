package String;
public class stringMethods {
    static void main() {
        String name = "Pranjal";
        String word = "I am good and fun.";
        String hollw = "  ";
        String trimIt = "   SHAAN.      ";
        int num = 2546;

        //1
        System.out.println(name.length());;
        System.out.println(word.length());;

        //2
        System.out.println(name.charAt(3));;
        System.out.println(word.charAt(8));;

        //3
        System.out.println(name.isEmpty());;
        System.out.println(hollw.isEmpty());;

        //4
        System.out.println(name.isBlank());;
        System.out.println(hollw.isBlank());;

        //5
        trimIt = trimIt.trim();
        String wordnew = word.trim();
        System.out.println(trimIt);
        System.out.println(wordnew);

        //6
        name = name.toLowerCase();
        System.out.println(name);
        name = name.toUpperCase();
        System.out.println(name);

        //7
        String part = name.substring(3,7);
        System.out.println(part);
        String partWord = word.substring(5,18);
        System.out.println(partWord);

        //8
        System.out.println(word.contains("good and"));;

        //9
        System.out.println(num+12);
        String Number = String.valueOf(num);
        System.out.println(Number+45);

        //10
        String [] words = word.split(" ");
        for(String str: words){
            System.out.println("--> "+str);
        }

        //11
        String newWord = word.replace("o","w");
        System.out.println(newWord);

    }
}
