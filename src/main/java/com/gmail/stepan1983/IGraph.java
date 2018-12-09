package com.gmail.stepan1983;

import java.util.List;
import java.util.Map;

public interface IGraph {

    int[][] getAdjasentMatrix();

    Map<GraphNode,List<GraphNode>> getAdjasentMap();

    GraphNode searchNode(GraphNode nodeToSearch);

    List<List<GraphNode>> pathNodeList(GraphNode fromNode, GraphNode toNode);


}
