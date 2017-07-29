/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

import abstractfactory.abstractclasses.AbstractBagPackaging;
import abstractfactory.abstractclasses.AbstractBoxPackaging;
import abstractfactory.abstractclasses.AbstractWrapPackaging;
import abstractfactory.domain.Address;
import abstractfactory.domain.GiftItem;
import abstractfactory.domain.GiftPack;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Tesfay
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // each orders is treated as gift pack which may contain one or more gift items.
        GiftItem gi1 = new GiftItem("1", "A", "gift 1", "bag", null);
        GiftItem gi2 = new GiftItem("2", "B", "gift 2", "box", null);
        GiftItem gi3 = new GiftItem("3", "C", "gift 3", "wrap", null);
        List<GiftItem> order1Items = new ArrayList<>(Arrays.asList(gi1, gi2, gi3));
        Address address = new Address("1000 N 4th Street", "", "FairField", "Iowa", "52557");
        GiftPack gp = new GiftPack(order1Items, address, "adults");
        
        PackagingFactory pf = AbstractFactory.getPackagingFactory(gp);
        
        AbstractBagPackaging bagP = pf.createBag();
        AbstractBoxPackaging boxP = pf.creatBox();
        AbstractWrapPackaging wrapP = pf.creatWrap();
        
        gp.getGiftItems().stream().map((gi) -> {
            if(gi.getPackagingType().equalsIgnoreCase("bag"))
                gi.setPackaging(bagP);
            else if(gi.getPackagingType().equalsIgnoreCase("box"))
                gi.setPackaging(boxP);
            else if(gi.getPackagingType().equalsIgnoreCase("wrap"))
                gi.setPackaging(wrapP);
            else
                throw new UnsupportedOperationException("Unsuported packaging type");
            return gi;            
        }).forEachOrdered((gi) -> {
            System.out.println(gi.toString());
        });
        
        
    }
    
}
