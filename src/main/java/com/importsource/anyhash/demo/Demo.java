/**
 * 
 */
package com.importsource.anyhash.demo;

import java.util.ArrayList;
import java.util.Collection;

import com.importsource.anyhash.ConsistentHash;
import com.importsource.anyhash.ConsistentHash.HashFunction;
import com.importsource.anyhash.Hashable;

/**
 * @author Hezf
 *
 */
public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Collection<String> c=new ArrayList<String>();
		c.add("125.0.2.5");
		c.add("125.0.2.6");
		c.add("125.0.2.7");
		c.add("125.0.2.8");
		c.add("125.0.2.9");
		c.add("125.0.2.10");
		Hashable<String> hash=new ConsistentHash<String>(new HashFunction(), 10, c);
		String result=hash.get("aorun").toString();
		
   
		System.out.println(result);
		hash.add("125.0.2.11");
		String result1=hash.get("aorun").toString();
		
		   
		System.out.println(result1);
		
	}

}
