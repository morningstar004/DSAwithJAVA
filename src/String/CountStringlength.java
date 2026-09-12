package String;
public class CountStringlength {
    static void main() {
        String name = "Pranjal Kumar";
        int count = 0;
        String [] alphabets = name.split("");
        for(String ch : alphabets){
            count++;
        }

        System.out.println(count);

    }
}
