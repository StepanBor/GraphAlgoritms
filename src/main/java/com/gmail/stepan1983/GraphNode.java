package com.gmail.stepan1983;

import java.util.List;

public class GraphNode {

    private String name;

    private List<GraphNode> adjasentNodeList;

    public GraphNode(String name, List<GraphNode> adjasentNodeList) {
        this.name = name;
        this.adjasentNodeList = adjasentNodeList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<GraphNode> getAdjasentNodeList() {
        return adjasentNodeList;
    }

    public void setAdjasentNodeList(List<GraphNode> adjasentNodeList) {
        this.adjasentNodeList = adjasentNodeList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GraphNode graphNode = (GraphNode) o;

        return name.equals(graphNode.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "GraphNode{" +
                "name='" + name + '\'' +
                '}';
    }
}
