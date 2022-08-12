package com.example.demo.model;

import javax.annotation.sql.DataSourceDefinition;
import lombok.Data;

@Data
public class Driver {

	int driverId;
	String driverName;
	long mobileNumber;
	double rating;
}
