An online business sells gift items to both individuals and businesses.
 Each order is treated as a gift pack that may contain 1 or more gift items. 
When a customer places an order, the type of the gift pack has to be specified as 
one of the 3 - Business, Adults, or Kids. Depending on the gift pack type, each
 individual gift item needs to be packaged accordingly. For example, a gift item
 for a kid can be packaged with a „Micky Gift Bag‟, or a „Cartoon Box‟ or the
 „Happy Kid‟ gift wrap which has a different cost associated with each option 
(selected by the person placing the order). For now, there are only 3 available
 options – gift bag, gift box or gift wrap. For the Business type, the options are
 „Merchant Collection‟ bag, „Hard Plastic‟ box and „Holiday Surprise‟ wrap. 
For the Adults, they „Reusable Shopper‟ bag, 
„Plain Paper‟ box, and „Everyday Value‟ wrap. Prices as listed below.

Suppose you are going to create a model and implement it with the Abstract Factory Pattern 
for the business to easily get packaging instructions and calculate the packaging cost from
each of the orders. Also provide a client program that prints the packing instructions and 
the total packaging cost for each gift pack.
Use the following skeleton code for your implementation.
public class GiftItem {
private String giftId;
private String giftName;
private String description;
private String packagingType; //"bag", "box", or "wrap".
Private Packaging packaging;
//…
}
public class GiftPack {
private List<GiftItem> giftItems;
private Address shippingAddress;
private String packType; //"Business", "Adults", or "Kids"
//…
}
public interface Packaging {
public float getCost();
//...
}
public class Address {
private String street1;
private String street2;
private String city;
private String state;
private String zipcode;
}