package com.example.parisroutefinder;

public class ConnectDestination {
    public GraphNode<?> destNode; // represents the node that the edge is directed towards
    public int cost;

    public ConnectDestination(GraphNode<?> destNode, int cost) {
        this.destNode =destNode;
        this.cost=cost;
    }
}

