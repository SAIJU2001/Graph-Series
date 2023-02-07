//Introduction to graph
//create a undirected graph using matrix

import java.util.*;

public class UndirectedGraphUsingMatrix
{
    public static void main( String args[] )
    {
        Scanner Sc=new Scanner(System.in);

        //taking the row & col val for matrix
        System.out.print("Enter the row : ");
        int row=Sc.nextInt();

        System.out.print("Enter the col : ");
        int col=Sc.nextInt();

        //create the matrix
        int graph[][]=new int[row+1][col+1];

        //total no of edge or simply node connection
        System.out.print("Enter the no of connection : ");
        int connect=Sc.nextInt();

        for( int i=0 ; i<connect ; i++ )
        {
            System.out.print("Enter the Index no : ");
            int x=Sc.nextInt();
            int y=Sc.nextInt();

            //connected both direction cause it is undirected graph 
            graph[x][y]=1; //we assume the edge weight is 1 
            graph[y][x]=1;
        }

        //print all the edge
        for( int i=0 ; i<graph.length ; i++ )
            for( int j=0 ; j<graph[0].length ; j++ )
                System.out.print( graph[i][j]+" ");
    }
}