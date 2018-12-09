package com.gmail.stepan1983;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSPathSearch implements PathSearchStrategy {

   /* create a queue which will store path(s) of type vector
    initialise the queue with first path starting from src

    Now run a loop till queue is not empty
    get the frontmost path from queue
    check if the lastnode of this path is destination
       if true then print the path
    run a loop for all the vertices connected to the
    current vertex i.e. lastnode extracted from path
      if the vertex is not visited in current path
    a) create a new path from earlier path and
    append this vertex
    b) insert this new path to queue*/

   List<GraphNode> checkedNodes=new ArrayList<GraphNode>();

   Queue<List<GraphNode>> pathQueue=new LinkedList<List<GraphNode>>();

    public List<List<GraphNode>> pathNodeList(GraphNode fromNode, GraphNode toNode, IGraph IGraph) {
        List<List<GraphNode>> result=new ArrayList<List<GraphNode>>();
        List<GraphNode> tempPath=new ArrayList<GraphNode>();
        tempPath.add(fromNode);
        pathQueue.add(tempPath);
        while (!pathQueue.isEmpty()){
//            System.out.println(pathQueue);
            tempPath=pathQueue.poll();
            GraphNode tempNode=tempPath.get(tempPath.size()-1);
//            System.out.println(tempNode);

            if(toNode.equals(tempNode)){
                System.out.println(tempPath);
                result.add(tempPath);
            }
            checkedNodes.add(tempNode);
            List<GraphNode> tempAdjasentNodes=IGraph.getAdjasentMap().get(tempNode);
            for (GraphNode tempAdjasentNode : tempAdjasentNodes) {
                if(!checkedNodes.contains(tempAdjasentNode)){
                    List<GraphNode> newPath=new ArrayList<GraphNode>(tempPath);
                    newPath.add(tempAdjasentNode);
                    pathQueue.add(newPath);
                }
            }

        }
        return result;
    }
}
