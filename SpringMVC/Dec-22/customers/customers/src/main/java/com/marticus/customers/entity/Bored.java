package com.marticus.customers.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Bored {

	String activity;
	double accessibility;
	String type;
	int participants;
	double price;
	String link;
	int key;
}
