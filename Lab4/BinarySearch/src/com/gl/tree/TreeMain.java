package com.gl.tree;

import java.util.Scanner;
import java.util.Set;


public class TreeMain {  
		  
	   
	    public static class Node{  
	        int data;  
	        Node left;  
	        Node right;  
	  
	        public Node(int data){  
	            
	            this.data = data;  
	            this.left = null;  
	            this.right = null;  
	        }

			public int getData() {
				
				return 0;
			}

			public Node getLeft() {
				
				return null;
			}

			public Node getRight() {
				
				return null;
			}  
	      }  
	  
	      
	      public static Node root;  
	  
	      public TreeMain(){  
	          root = null;  
	      }  
	  
	     
	      public void insert(int data) {  
	            
	          Node newNode = new Node(data);  
	  
	           
	          if(root == null){  
	              root = newNode;  
	              return;  
	            }  
	          else {  
	              
	              Node current = root, parent = null;  
	  
	              while(true) {  
	                   
	                  parent = current;  
	  
	                  
	                  if(data < current.data) {  
	                      current = current.left;  
	                      if(current == null) {  
	                          parent.left = newNode;  
	                          return;  
	                      }  
	                  }  
	                  else {  
	                      current = current.right;  
	                      if(current == null) {  
	                          parent.right = newNode;  
	                          return;  
	                      }  
	                  }  
	              }  
	          }  
	      }  
	  
	      public Node minNode(Node root) {  
	          if (root.left != null)  
	              return minNode(root.left);  
	          else  
	              return root;  
	      }  
	  
	         public void inorderTraversal(Node node) {  
	  
	          
	          if(root == null){  
	              System.out.println("Tree is empty");  
	              return;  
	           }  
	          else {  
	  
	              if(node.left!= null)  
	                  inorderTraversal(node.left);  
	              System.out.print(node.data + " ");  
	              if(node.right!= null)  
	                  inorderTraversal(node.right);  
	  
	          }  
	      }  
	  
	      public static void main(String[] args) {  
	  
	          TreeMain bt = new TreeMain();  
	          
	          bt.insert(40);  
	          bt.insert(20);  
	          bt.insert(10);  
	          bt.insert(30);  
	          bt.insert(60);  
	          bt.insert(50);  
	          bt.insert(70);  
	  
	          System.out.println("Binary search tree:");  
	          
	          bt.inorderTraversal(bt.root);  
	  
	          System.out.println("\n Enter the target :");  
	          Scanner sc = new Scanner(System.in);
	          int target = sc.nextInt();
	          boolean isPair = pairSum (null, target, null);
	          if (!isPair)
	        	  System.out.println("Nodes are not found"); 
	          else
	          System.out.println("Nodes are found");
	        	  
	          
	      }
	            
	            private static boolean pairSum(Node root, int target, Set<Integer> dataSet) {
	      		if (root==null) return false;
	            	 
	      		
	      		int setVal = target - root.getData();
	      		System.out.println(setVal);
	      		if (dataSet.contains(setVal)) {
	      			System.out.println("Pair is :" + root.getData() + "," + setVal);
	      			return true;
	      			
	      		}
	      		dataSet.add(root.getData());
	      		boolean isPairExist = pairSum(root.getLeft(), target, dataSet);
	      		if(isPairExist)
	      			return true;
	      		isPairExist = pairSum(root.getRight(), target, dataSet);
	      		return isPairExist;
	      
	}  
}


	

