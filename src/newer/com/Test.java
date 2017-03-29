package newer.com;

import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		
		String ip="192.168.10.34 127.0.0.1 3.3.3.3 105.70.11.55";
		
		ip=ip.replaceAll("(\\d+)","00$1");
		
		ip=ip.replaceAll("0*(\\d{3})", "$1");
		
		String []s=ip.split(" +");
		
		TreeSet<String >ts=new TreeSet<>();
		
		for(String a:s){
			
			ts.add(a);
		}
    
	//println
		
		for(String p:ts){
			System.out.println(p.replaceAll("0*(\\d+)", "$1"));
		}
		
	}

}
