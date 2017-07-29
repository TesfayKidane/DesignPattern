/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

import abstractfactory.abstractclasses.AbstractBoxPackaging;
import abstractfactory.abstractclasses.AbstractWrapPackaging;
import abstractfactory.abstractclasses.AbstractBagPackaging;
import abstractfactory.packagingproducts.AdultsBag;
import abstractfactory.packagingproducts.AdultsBox;
import abstractfactory.packagingproducts.AdultsWrap;

/**
 *
 * @author Tesfay
 */
public class AdultsPackagingFactory implements PackagingFactory{

    @Override
    public AbstractBagPackaging createBag() {
        return new AdultsBag(); 
    }

    @Override
    public AbstractBoxPackaging creatBox() {
        return new AdultsBox();
    }

    @Override
    public AbstractWrapPackaging creatWrap() {
        return new AdultsWrap();
    }
    
}
