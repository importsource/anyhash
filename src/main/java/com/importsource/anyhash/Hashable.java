package com.importsource.anyhash;
/**
  * hash能力
  * 
  * @author Hezf
  *
  */
 public interface Hashable<T> {
 	public void add(T node);
 
 	public void remove(T node);
 
 	public T get(Object key);
 }