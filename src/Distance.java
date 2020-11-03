package com.clustering;

import java.util.List;

public class Distance {

	public static Double computeDistance(Double[] trainer, Double[] tester) {
		Double distance = 0D;
		for (int i = 0; i < trainer.length; i++) {
			distance += Math.pow(trainer[i] - tester[i], 2);

		}
		return Math.round(Math.sqrt(distance) * 100.0) / 100.0;
	}

	public static Double[][] generateDistancematrix(Double[][] data) {
		Double[][] distancematrix = new Double[data.length][data.length];
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j <= i; j++) {
				if (i == j)
					distancematrix[i][j] = 0.0;
				else {
					distancematrix[i][j] = distancematrix[j][i] = computeDistance(data[i], data[j]);
				}
			}
		}
		return distancematrix;
	}

	public static Double[] computecentroid(List<Double[]> dataSet) {
		Double[] centriod = new Double[dataSet.get(0).length];
		for (int i = 0; i < centriod.length; i++) {
			centriod[i] = 0.0;
			for (Double[] data : dataSet) {
				centriod[i] += data[i];
			}
			centriod[i] = centriod[i] / dataSet.size();
		}
		return centriod;
	}
}
