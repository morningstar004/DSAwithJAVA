package Collection;

import java.util.HashMap;
import java.util.Map;

public class MapBasics {
    static void main() {
        Map<String,String> pin = new HashMap<>();

        //put
        pin.put("us","United States");
        pin.put("in","India");
        pin.put("en","England");
        pin.put("ch","China");
        pin.put("ja","Japan");
        pin.put("ru","russia");
        System.out.println(pin);

        pin.putIfAbsent("br","Bihar");
        System.out.println(pin);
        pin.putIfAbsent("in","India");
        System.out.println(pin);

        //get
        System.out.println(pin.get("br"));
        System.out.println(pin.get("ch"));

        System.out.println(
                pin.getOrDefault("ng","No Value for this pin.")
        );
        System.out.println(
                pin.getOrDefault("ja","No value for this pin.")
        );

        //contains
        System.out.println(pin.containsKey("br"));
        System.out.println(pin.containsValue("England"));

        //replace
        System.out.println(pin);
        pin.replace("br","brazil");
        System.out.println(pin);
        pin.replace("ch","China","Chili");
        System.out.println(pin);

        //remove
        pin.remove("us");
        System.out.println(pin);
        pin.remove("en","England");
        System.out.println(pin);

        //set outputs
        System.out.println(pin.keySet());
        System.out.println(pin.values());

        System.out.println(pin.entrySet());



    }
}
