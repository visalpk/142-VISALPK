package com.javatpoint.mypackage;  
import javax.persistence.*;  
  
@Entity  
@Table(name = "Account")  
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)  
@DiscriminatorColumn(name="type",discriminatorType=DiscriminatorType.STRING)  
@DiscriminatorValue(value="account")  
  
public class Account {  
@Id  
@GeneratedValue(strategy=GenerationType.AUTO)  
      
@Column(name = "id")  
private int id;  
  
@Column(name = "AccountID")  
private String AccountID;


@Column(name = "AccountHoldername")  
private String AcccountHoldername;


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getAccountID() {
	return AccountID;
}


public void setAccountID(String accountID) {
	AccountID = accountID;
}


public String getAcccountHoldername() {
	return AcccountHoldername;
}


public void setAcccountHoldername(String acccountHoldername) {
	AcccountHoldername = acccountHoldername;
}


}  