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
		c.add("1");
		c.add("2");
		c.add("3");
		c.add("4");
		c.add("5");
		c.add("6");
		Hashable hash=new ConsistentHash(new HashFunction(), 10, c);
		String result=hash.get("name1").toString();
   
		System.out.println(result);
	}

}
