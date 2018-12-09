package com.gmail.stepan1983;

public class Main {
    public static void main(String[] args) {
        SimpleGraphFactory simpleGraphFactory=new SimpleGraphFactory();
        IGraph graph= simpleGraphFactory.getSimpleGraph();

        GraphNode nodeToSearch=new GraphNode("F",null);

        GraphNode searchResult=graph.searchNode(nodeToSearch);

        System.out.println(searchResult);

        System.out.println("path list form A to F");
        graph.pathNodeList(new GraphNode("A", null), new GraphNode("F",null));
//        System.out.println();
    }
}
