Suppose you are writing a simple debug tool for your
colleagues. To start with, you are going to provide 2
implementations - one writes the messages out to the
command line (ConsoleTrace), while another writes them
to a file (FileTrace). All you want your colleagues to know
about the tool is
1) The interface (or what my tool can do for you)
```
public interface Trace {
// turn on and off debugging
public void setDebug( boolean debug );
// write out a debug message
public void debug( String message );
// write out an error message
public void error( String message );
}
```
2) How to choose a certain debugger by giving an argument
to your main(String args[]) method. (for example, use
“trace.log” to choose the FileTrace implementation or
“console” for the ConsoleTrace debugger.
You may want to add more implementations later as they
need it. But they won't have to change any code to switch
from one implementation to another. Design/write your
debugging tool in Java.
