//Introduction to graph
//create a directed graph using ArrayList

import java.util.*;

public class DirectedGraphUsingList
{
    public static void main( String args[] )
    {
        Scanner Sc=new Scanner(System.in);

        //taking the row & col val for matrix
        System.out.print("Enter the no of node : ");
        int countNode=Sc.nextInt();

        ArrayList<ArrayList<Integer>>graph=new ArrayList<ArrayList<Integer>>();

        //row formation in the list
        for( int i=0 ; i<=countNode ; i++ )
            graph.add( new ArrayList<Integer>() );

        //total no of edge or simply node connection
        System.out.print("Enter the no of connection : ");
        int connect=Sc.nextInt();

        for( int i=0 ; i<connect ; i++ )
        {
            System.out.print("Enter the Index no : ");
            int x=Sc.nextInt();
            int y=Sc.nextInt();

            graph.get(x).add(y); //we assume the edge weight is 1 
        }

        //print all the edge
        for( int i=0 ; i<=countNode ; i++ )
        {
            for( int j=0 ; j<graph.get(i).size() ; j++ )
                System.out.print( graph.get(i).get(j)+" ");

            System.out.println();
        }
    }
}