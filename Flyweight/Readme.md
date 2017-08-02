Suppose you are working for a health center that provides medical aid services to
residents in neighboring cities and towns. In the original design, a core class ‘Customer’
looked like this –
public class Customer {
private int customerId;
private String firstName;
private String lastName;
private Address residenceAddress;
private HealthProfile profile;
//city map with a red dot representing residence location
private Image locationMap;
}
One issue with it is when a large number of customers get online during the same period
of time, customers experience longer response times. One reason, among others, was
because of the huge memory consumption caused by the large number of concurrent
users. Your job is to roll out a fix to the issue. Use the Flyweight pattern to reduce the
space need of concurrent customers.
