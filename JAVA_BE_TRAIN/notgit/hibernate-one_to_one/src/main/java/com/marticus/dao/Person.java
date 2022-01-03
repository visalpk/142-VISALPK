package com.marticus.dao;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

 
	
	@Entity
	@Table(name = "PERSON")
	public class Person {

		private long Id;
		private String Name;
		private Aadhar Aadhar;

		public Person() {
		}

		public Person(String Name, Aadhar Aadhar) {
			this.Name = Name;
			this.Aadhar = Aadhar;
		}

		
		@Id
		@GeneratedValue
		@Column(name = "ID")
		public long getId() {
			return Id;
		}

		public void setId(long id) {
			Id = id;
		}
		@Column(name = "NAME", nullable = false, length = 100)
		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}

		@OneToOne(cascade = CascadeType.ALL)
		public Aadhar getAadhar() {
			return Aadhar;
		}

		public void setAadhar(Aadhar aadhar) {
			Aadhar = aadhar;
		}
	

		

		

		

	}
 
