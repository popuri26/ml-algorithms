package com.clustering;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Algorithms {
	public static String hac(Double[][] dataSet, Double[] tester) {
		Double[][] distanceMatrix = Distance.generateDistancematrix(dataSet);
		Double[][] minValues=new Double[distanceMatrix.length][distanceMatrix.length];
		System.out.println(distanceMatrix.length);
		for (int i=0;i<distanceMatrix.length;i++) {
			minValues[i]=Utilities.getArrayMinimum(distanceMatrix[i]);
		}
		return null;
	}

	public static List<Cluster> kMeans(List<Double[]> dataSet, Double[] tester, Integer k) {
		List<Cluster> clusterList = new ArrayList<Cluster>();
		Double[][] centroidList = new Double[k][dataSet.get(0).length];
		// Initial Centroid
		for (int i = 0; i < k; i++) {

			clusterList.add(i, new Cluster());
			centroidList[i] = dataSet.get(i);

		}
		boolean flag = true;
		do {
			// Identifying cluster of each value using minimum distance
			Double[] distanceVector;
			for (int i = 0; i < dataSet.size(); i++) {
				distanceVector = new Double[k];
				// identifying distance of data Vector
				for (int j = 0; j < k; j++) {
					distanceVector[j] = Distance.computeDistance(centroidList[j], dataSet.get(i));
				}
				// get Minimum Distance
				Double minimumDistance = Utilities.getArrayMinimum(distanceVector)[0];
						// Assign object to cluster having minimum distance
				clusterList.get(Arrays.asList(distanceVector).indexOf(minimumDistance)).addClusterItem(dataSet.get(i));
			}
			Double[][] currCentroidList = centroidList;
			// compute Centroid
			for (Cluster cluster : clusterList) {
				centroidList[clusterList.indexOf(cluster)] = Distance.computecentroid(cluster.getClusteritems());
			}
			flag = !Arrays.equals(currCentroidList, centroidList);
		} while (flag);
		// final clusters list
		return clusterList;


	}
}
