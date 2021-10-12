package basesetup;

import java.util.HashMap;

public interface customise_report 
{
HashMap <String,String> resultmap=new HashMap<>();
public default void generatereport()
{
	
}
public abstract void convertreport(String formattype);
}
