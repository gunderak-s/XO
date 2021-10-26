package com.company;

import java.util.ArrayList;

public class Node {
    GameStatus statusNode=GameStatus.Game;
    Move thisMove;
    Node ancestor;
    ArrayList<Node> posterity;
}
