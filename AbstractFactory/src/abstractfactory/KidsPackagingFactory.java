/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

import abstractfactory.abstractclasses.AbstractBagPackaging;
import abstractfactory.abstractclasses.AbstractBoxPackaging;
import abstractfactory.abstractclasses.AbstractWrapPackaging;
import abstractfactory.packagingproducts.KidsBag;
import abstractfactory.packagingproducts.KidsBox;
import abstractfactory.packagingproducts.KidsWrap;

/**
 *
 * @author Tesfay
 */
public class KidsPackagingFactory implements PackagingFactory{

    @Override
    public AbstractBagPackaging createBag() {
        return new KidsBag();
    }

    @Override
    public AbstractBoxPackaging creatBox() {
        return new KidsBox();
    }

    @Override
    public AbstractWrapPackaging creatWrap() {
        return new KidsWrap();
    }
}
