
Scenario 3: A class library provides a Table class, but does not provide a capability to allow clients to lock individual table rows. We do not have 
the source code for this class library, but we have complete documentation and know the interface of the Table class. How can we provide a row locking 
capability for the Table class?
Solution: A Synchronization Proxy, which uses a locking mechanism to control the number of clients that simultaneously access the server or the real object.
Scenario 4: A Java applet has some very large classes which take a long time for a browser to download from a web server. How can we delay the downloading of
these classes so that the applet starts as quickly as possible?

Choice 1: Implement a synchronization proxy discussed in Scenario 3. Suppose the Table class implements the ITable interface
```
public interface ITable {
public int numOfRows();
public IRow getRow(int rowNum);
public void addRow(IRow row, int rowNum); //add row at the end public void modifyRow(int rowNum, IRow row);
public void deleteRow(int rowNum);
}
public interface IRow {
//the interface a concrete Row class implements ...
}
```