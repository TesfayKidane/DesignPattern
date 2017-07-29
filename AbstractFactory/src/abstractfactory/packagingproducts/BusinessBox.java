/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory.packagingproducts;

import abstractfactory.abstractclasses.AbstractBoxPackaging;

/**
 *
 * @author Tesfay
 */
public class BusinessBox extends AbstractBoxPackaging {

    @Override
    public float getCost() {
        return 1.00f;
    }

    @Override
    public String getGiftWrapName() {
        return "Hard  Plastic";
    }
    
}
