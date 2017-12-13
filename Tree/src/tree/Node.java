/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

/**
 *
 * @author Administrator
 */
public class Node {
    char value;
    Node left,right;
    Node(char val){
        value = val;
        left = null;
        right = null;
    }
    Node(char val,Node left1,Node right1){
        value = val;
        left = left1;
        right = right1;
    }
}
