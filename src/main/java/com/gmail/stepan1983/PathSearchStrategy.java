package com.gmail.stepan1983;

import java.util.List;

public interface PathSearchStrategy {

    List<List<GraphNode>> pathNodeList(GraphNode fromNode, GraphNode toNode, IGraph IGraph);



}
