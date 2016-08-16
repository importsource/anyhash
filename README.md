# anyhash
hash utils! make hash easier


##Demo
```java
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
		Hashable hash=new ConsistentHash(new HashFunction(), 10, c);
		String result=hash.get("aorun").toString();
   
		System.out.println(result);
	}

}
```

##result
```log
125.0.2.7
```
