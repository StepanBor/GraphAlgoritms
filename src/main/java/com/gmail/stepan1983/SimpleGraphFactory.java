package com.gmail.stepan1983;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleGraphFactory implements IGraphFactory {

    public IGraph getSimpleGraph() {

        IGraph graph=new GraphImpl();

        GraphNode nodeA=new GraphNode("A",null);
        GraphNode nodeB=new GraphNode("B",null);
        GraphNode nodeC=new GraphNode("C",null);
        GraphNode nodeD=new GraphNode("D",null);
        GraphNode nodeE=new GraphNode("E",null);
        GraphNode nodeF=new GraphNode("F",null);

        Map<GraphNode, List<GraphNode>> adjasentMap=new HashMap<GraphNode, List<GraphNode>>();

        List<GraphNode> tempList=new ArrayList<GraphNode>();
        tempList.add(nodeC);
        tempList.add(nodeD);
        adjasentMap.put(nodeA,tempList);

        List<GraphNode> tempList1=new ArrayList<GraphNode>();
        tempList1.add(nodeC);
        tempList1.add(nodeF);
        adjasentMap.put(nodeB,tempList1);

        List<GraphNode> tempList2=new ArrayList<GraphNode>();
        tempList2.add(nodeA);
        tempList2.add(nodeB);
        tempList2.add(nodeE);
        adjasentMap.put(nodeC,tempList2);

        List<GraphNode> tempList3=new ArrayList<GraphNode>();
        tempList3.add(nodeA);
        tempList3.add(nodeE);
        adjasentMap.put(nodeD,tempList3);

        List<GraphNode> tempList4=new ArrayList<GraphNode>();
        tempList4.add(nodeC);
        tempList4.add(nodeF);
        tempList4.add(nodeD);
        adjasentMap.put(nodeE,tempList4);

        List<GraphNode> tempList5=new ArrayList<GraphNode>();
        tempList5.add(nodeB);
        tempList5.add(nodeE);
        adjasentMap.put(nodeF,tempList5);

        ((GraphImpl) graph).setAdjasentMap(adjasentMap);

        ((GraphImpl) graph).setSearchStrategy(new BroadFirstSearch());

        ((GraphImpl) graph).setPathSearchStrategy(new BFSPathSearch());

        System.out.println(graph.toString());

        return graph;

    }
}
