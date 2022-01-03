package com.marticus.customers.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RestData {

	String name;
	String gender;
	double probability;
	int count;
}
