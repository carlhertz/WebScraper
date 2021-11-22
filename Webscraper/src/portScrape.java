import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class portScrape {
	    public String extract(String url) throws MalformedURLException {
	    	String data= "";
	    	URL aURL = new URL(url);
	    	data+= url + "\n" + "--protocol = " + aURL.getProtocol() + "\n" + "--authority = "
	    	+ aURL.getAuthority()+ "\n" +"--host = " + aURL.getHost()+ "\n" +"--port = "
	    	+ aURL.getPort() + "\n" +"--path = " + aURL.getPath() + "\n" +"--query = "
	    	+ aURL.getQuery()+ "\n" +"--filename = " + aURL.getFile()+ "\n" +"--ref = " 
	    	+ aURL.getRef()+ "\n";
			return data;
	    }
	}
