package com.clustering;

public class Utilities {
	public static Double[] getArrayMinimum(Double[] array) {
		Double[] minValueDetails = new Double[2];
				minValueDetails[0] = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < minValueDetails[0]) {
				minValueDetails[0] = array[i];
			}
		}
		for (int i = 1; i < array.length; i++) {
			if (array[i] == minValueDetails[0]) {
				minValueDetails[1] = (double) i;
			}
		}
		return minValueDetails;
	}

	public static Double[] getArrayMaximum(Double[] array) {
		Double[] maxValueDetails = new Double[2];
		maxValueDetails[0] = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > maxValueDetails[0]) {
				maxValueDetails[0] = array[i];
			}
		}
		for (int i = 1; i < array.length; i++) {
			if (array[i] == maxValueDetails[0]) {
				maxValueDetails[1] = (double) i;
			}
		}
		return maxValueDetails;
	}
}
