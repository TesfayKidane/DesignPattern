/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweight;
import flyweight.domain.LocationImage;
import flyweight.domain.LocationMap;
import java.util.HashMap;

/**
 *
 * @author Tesfay
 */
public class ServiceFactory {

    private static final HashMap<String, LocationMap> imageHashMap = new HashMap<String, LocationMap>();
    
    // creating the map image is very expensive, therefore flieghtweight is used to used to reuse prevoiously created images.
    public static final LocationMap getLocationImage(String city, String url, int x,  int y){
        if(imageHashMap.containsKey(city)){
            LocationMap l = imageHashMap.get(city);
            l.setxPos(x);
            l.setyPos(y);
            return l;
        }
        else{
            LocationMap l = new LocationMap();
            LocationImage li = new LocationImage();
            l.setCityMap(li);
            l.setCity(city);
            l.setUrl(url);
            l.setxPos(x);
            l.setyPos(y);
            return l;
        }
    }
}
