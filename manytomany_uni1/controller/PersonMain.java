package com.ty.manytomany_uni.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import manytomany_uni1.Language;
import manytomany_uni1.Person;

public class PersonMain {
public static void main(String[] args) {
	
	Person person1=new Person();
	person1.setId(1);
	person1.setName("gagan");
	person1.setAddress("blr");
	person1.setPhone(684563);
	
	Person person2=new Person();
	person2.setId(2);
	person2.setName("karan");
	person2.setAddress("delhi");
	person2.setPhone(98745);
	
	Person person3=new Person();
	person3.setId(3);
	person3.setName("bhoom");
	person3.setAddress("blr");
	person3.setPhone(89759);
	
	Language l1=new Language();
	l1.setId(10);
	l1.setName("kannada");
	l1.setOrigin("karnataka");
	l1.setCountry("India");
	
	Language l2=new Language();
	l2.setId(20);
	l2.setName("hindi");
	l2.setOrigin("delhi");
	l2.setCountry("India");
	
	Language l3=new Language();
	l3.setId(30);
	l3.setName("telugu");
	l3.setOrigin("andhra");
	l3.setCountry("India");
	
	List<Language> list1=new ArrayList<Language>();
	list1.add(l1);
	list1.add(l2);
	
	List<Language> list2=new ArrayList<Language>();
	list2.add(l1);
	list2.add(l3);
	
	List<Language> list3=new ArrayList<Language>();
	list3.add(l2);
	list3.add(l3);
	
	person1.setList(list1);
	person2.setList(list2);
	person3.setList(list3);
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	entityTransaction.begin();
	entityManager.persist(person1);
	entityManager.persist(person2);
	entityManager.persist(person3);
	entityManager.persist(l1);
	entityManager.persist(l2);
	entityManager.persist(l3);
	
	entityTransaction.commit();
	
	
	
	
	
}
}
