package com.clustering;

import java.util.ArrayList;
import java.util.List;

public class Cluster {
	private List<Double[]> clusteritems;

	public List<Double[]> getClusteritems() {
		return clusteritems;
	}

	public Cluster() {
		super();
		this.clusteritems = new ArrayList<Double[]>();
	}

	public void setClusteritems(List<Double[]> clusteritems) {
		this.clusteritems = clusteritems;
	}
	
	public void addClusterItem(Double[] clusteritem){
		if(this.clusteritems!=null)
		this.clusteritems.add(clusteritem);
		
	}
	
}
