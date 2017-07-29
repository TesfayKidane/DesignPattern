/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

import abstractfactory.domain.GiftPack;

/**
 *
 * @author Tesfay
 */
public class AbstractFactory {
    
    private AbstractFactory(){}
    
    public final static PackagingFactory getPackagingFactory(GiftPack gf){
       if(gf.getPackType().equalsIgnoreCase("business"))
       {
           return new BusinessPackagingFactory();
       }
       else if(gf.getPackType().equalsIgnoreCase("adults"))
       {
           return new AdultsPackagingFactory();
       }
       else if(gf.getPackType().equalsIgnoreCase("kids"))
       {
           return new KidsPackagingFactory();
       }
       else{
           throw new UnsupportedOperationException("No implementation for this pack type");
       }
    }
}
