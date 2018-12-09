package com.gmail.stepan1983;

import java.util.*;

public class BroadFirstSearch implements SearchStrategy {

    Queue<GraphNode> nodeQueue = new LinkedList<GraphNode>();

    public GraphNode searchNode(GraphNode nodeToSearch, IGraph graph) {

        GraphNode graphNode = (GraphNode) graph.getAdjasentMap().keySet().toArray()[0];
        nodeQueue.add(graphNode);
//        System.out.println(graphNode+"KKKK");
        List<GraphNode> checkedNodes = new ArrayList<GraphNode>();

        do {
            graphNode = nodeQueue.poll();
            if (graphNode.equals(nodeToSearch)) {
                return graphNode;
            } else {
                System.out.println("temp node "+graphNode);
                checkedNodes.add(graphNode);
//                System.out.println(checkedNodes);
                List<GraphNode> graphNodeAdjasents = graph.getAdjasentMap().get(graphNode);

//                System.out.println(graphNodeAdjasents);

                for (GraphNode graphNodeAdjasent : graphNodeAdjasents) {
//                    System.out.println(graphNodeAdjasent);
//                    System.out.println(checkedNodes);
                    if (!checkedNodes.contains(graphNodeAdjasent) & !nodeQueue.contains(graphNodeAdjasent)) {
                        nodeQueue.add(graphNodeAdjasent);

                    }

                }
//                System.out.println("checked nodes= "+checkedNodes);
//                System.out.println(nodeQueue + "!!!!!!");

            }


        } while (!nodeQueue.isEmpty());

        return null;
    }
}
