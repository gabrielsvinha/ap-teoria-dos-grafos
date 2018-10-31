package br.ufcg.mbta_graph.builder;

import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.Multigraph;

public interface Builder {
	
	/**
	 * Build graph, with edge weights
	 * @return Graph containing all edges and vertexes
	 */
	public Multigraph<String, DefaultWeightedEdge> build();	
}
