/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

import abstractfactory.abstractclasses.AbstractBagPackaging;
import abstractfactory.abstractclasses.AbstractBoxPackaging;
import abstractfactory.abstractclasses.AbstractWrapPackaging;
import abstractfactory.packagingproducts.BusinessBag;
import abstractfactory.packagingproducts.BusinessBox;
import abstractfactory.packagingproducts.BusinessWrap;

/**
 *
 * @author Tesfay
 */
public class BusinessPackagingFactory implements PackagingFactory{

    @Override
    public AbstractBagPackaging createBag() {
        return new BusinessBag();
    }

    @Override
    public AbstractBoxPackaging creatBox() {
        return new BusinessBox();
    }

    @Override
    public AbstractWrapPackaging creatWrap() {
        return new BusinessWrap();
    }
    
}
