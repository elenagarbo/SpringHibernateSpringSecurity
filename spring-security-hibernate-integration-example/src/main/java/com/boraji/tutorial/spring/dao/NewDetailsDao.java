package com.boraji.tutorial.spring.dao;

import java.util.List;

import com.boraji.tutorial.spring.model.New;

public interface NewDetailsDao {
	
	public void addNew(New n);
	public void updateNew(New n);
	public List<New> listNews();
	public New getNewById(int id);
	public void removeNew(int id);

}
