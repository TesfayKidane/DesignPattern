            /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

import abstractfactory.abstractclasses.AbstractBoxPackaging;
import abstractfactory.abstractclasses.AbstractWrapPackaging;
import abstractfactory.abstractclasses.AbstractBagPackaging;

/**
 *
 * @author Tesfay
 */
public interface PackagingFactory {
    public abstract AbstractBagPackaging createBag();
    public abstract AbstractBoxPackaging creatBox();
    public abstract AbstractWrapPackaging creatWrap();
}
