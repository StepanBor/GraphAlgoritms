package com.gmail.stepan1983;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class GraphImpl implements IGraph {

    private int[][] adjasentMatrix;

    private Map<GraphNode, List<GraphNode>> adjasentMap;

    PathSearchStrategy pathSearchStrategy;

    SearchStrategy searchStrategy;

    public GraphImpl(int[][] adjasentMatrix, Map<GraphNode, List<GraphNode>> adjasentMap,
                     PathSearchStrategy pathSearchStrategy, SearchStrategy searchStrategy) {

        this.adjasentMatrix = adjasentMatrix;
        this.adjasentMap = adjasentMap;
        this.pathSearchStrategy = pathSearchStrategy;
        this.searchStrategy = searchStrategy;
    }

    public GraphImpl() {
    }

    public void setAdjasentMatrix(int[][] adjasentMatrix) {
        this.adjasentMatrix = adjasentMatrix;
    }

    public void setAdjasentMap(Map<GraphNode, List<GraphNode>> adjasentMap) {
        this.adjasentMap = adjasentMap;
    }

    public int[][] getAdjasentMatrix() {
        return adjasentMatrix;
    }

    public PathSearchStrategy getPathSearchStrategy() {
        return pathSearchStrategy;
    }

    public void setPathSearchStrategy(PathSearchStrategy pathSearchStrategy) {
        this.pathSearchStrategy = pathSearchStrategy;
    }

    public SearchStrategy getSearchStrategy() {
        return searchStrategy;
    }

    public void setSearchStrategy(SearchStrategy searchStrategy) {
        this.searchStrategy = searchStrategy;
    }

    public Map<GraphNode, List<GraphNode>> getAdjasentMap() {
        return adjasentMap;
    }

    public GraphNode searchNode(GraphNode nodeToSearch) {

        return searchStrategy.searchNode(nodeToSearch, this);
    }

    public List<List<GraphNode>> pathNodeList(GraphNode fromNode, GraphNode toNode) {
        return pathSearchStrategy.pathNodeList(fromNode, toNode, this);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder();

        for (GraphNode graphNode : adjasentMap.keySet()) {
            stringBuilder.append(adjasentMap.get(graphNode).toString()+"\r\n");
        }
        return "GraphImpl{" +"\r\n"+
//                "adjasentMatrix=" + Arrays.toString(adjasentMatrix) +
                ", adjasentMap=" + stringBuilder.toString() +
                ", pathSearchStrategy=" + pathSearchStrategy +
                ", searchStrategy=" + searchStrategy +
                '}';
    }
}
