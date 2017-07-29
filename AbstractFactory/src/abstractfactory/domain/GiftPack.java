/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory.domain;

import java.util.List;

/**
 *
 * @author Tesfay
 */
public class GiftPack {
    
    private List<GiftItem> giftItems;
    private Address shippingAddress;
    private String packType; //"Business", "Adults", or "Kids"

    public GiftPack(List<GiftItem> giftItems, Address shippingAddress, String packType) {
        this.giftItems = giftItems;
        this.shippingAddress = shippingAddress;
        this.packType = packType;
    }

    public List<GiftItem> getGiftItems() {
        return giftItems;
    }

    public void setGiftItems(List<GiftItem> giftItems) {
        this.giftItems = giftItems;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getPackType() {
        return packType;
    }

    public void setPackType(String packType) {
        this.packType = packType;
    }

    @Override
    public String toString() {
        return "GiftPack{" + "giftItems=" + giftItems + ", shippingAddress=" + shippingAddress + ", packType=" + packType + '}';
    }
}
