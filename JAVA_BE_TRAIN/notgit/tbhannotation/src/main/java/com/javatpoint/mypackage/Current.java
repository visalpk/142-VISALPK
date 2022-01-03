package com.javatpoint.mypackage;  
  
import javax.persistence.Column;  
import javax.persistence.DiscriminatorValue;  
import javax.persistence.Entity;  
  
@Entity  
@DiscriminatorValue("Current")  
public class Current extends Account{  
      
    @Column(name="over_draft_amount")  
    private float over_draft_amount;

	public float getOver_draft_amount() {
		return over_draft_amount;
	}

	public void setOver_draft_amount(float over_draft_amount) {
		this.over_draft_amount = over_draft_amount;
	}  
      
   
}  