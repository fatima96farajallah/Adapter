

import org.json.JSONObject;
import org.json.XML;

import static com.sun.org.apache.xml.internal.security.c14n.implementations.CanonicalizerBase.XML;

public class converter {
    // Converting XML to JSON
    public static JSONObject convert(String xml) {

        if(xml == null || xml.isEmpty()) {

            return null;
        }

        return XML.toJSONObject(xml);
}
}
