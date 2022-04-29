package com.training.ifaces;

public interface AgeCondition {
	default boolean negate(double value) {
		return value<58;
	}

}