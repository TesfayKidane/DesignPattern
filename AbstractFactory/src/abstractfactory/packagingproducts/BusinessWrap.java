/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory.packagingproducts;

import abstractfactory.abstractclasses.AbstractWrapPackaging;

/**
 *
 * @author Tesfay
 */
public class BusinessWrap extends AbstractWrapPackaging{

    @Override
    public float getCost() {
        return 0.25f;
    }

    @Override
    public String getGiftWrapName() {
        return "Holiday Surprise";
    }
    
}
