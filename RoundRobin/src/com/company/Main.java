package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);

        int i;									// loop counting variable
        int j;									// loop counting variable
        int n;									// to hold number of process.
        int bu[] = new int[10];					// to hold the burst time
        int wa[] = new int[10];					// to hold the waiting time
        int tat[] = new int[10];				// to hold the turnaround time
        int t;									// to hold the size of time slice.
        int ct[] = new int[10];					// to hold the burst time
        int max;								// to hold the max value.
        double awt=0;							// to hold the average waiting time
        double att=0;							// to hold the average turnaround time
        double temp=0;							// to hold a temporal value.


        System.out.println("ROUND ROBIN CPU SCHEDULING ALGORITHM\n\n\n\n");
        System.out.printf("Enter the no of processes -- ");
        n = input.nextInt();


        // loop to prompt user and stores user's burst time of the processes.
        for(i=0;i<n;i++)
        {
            System.out.printf("\nEnter Burst Time for process %d -- ", i+1);
            bu[i] = input.nextInt();
            ct[i]=bu[i];
        }

        System.out.printf("\nEnter the size of time slice -- ");
        t = input.nextInt();
        max=bu[0];


        // the loop iterate to assign the variable max the least value in burst time
        // variable bu[]
        for(i=1;i<n;i++)
            if(max<bu[i])
                max=bu[i];


        //
        for(j=0;j<(max/t)+1;j++)
        {
            for(i=0;i<n;i++)
            {
                if(bu[i]!=0)
                {
                    if(bu[i]<=t)
                    {
                        tat[i]=(int) (temp+bu[i]);
                        temp=temp+bu[i];
                        bu[i]=0;
                    }
                    else
                    {
                        bu[i]=bu[i]-t;
                        temp=temp+t;
                    }
                }

            }
        }


        // the loop computes the waiting time
        // the accumulated total of the average turnaround time
        // and the accumulated total of the average waiting time
        for(i=0;i<n;i++)
        {
            wa[i]=tat[i]-ct[i];
            att+=tat[i];
            awt+=wa[i];
        }

        System.out.printf("\nThe Average Turnaround time is -- %f",att);
        System.out.printf("\nThe Average Waiting time is -- %f ",awt);

        System.out.printf("\n\tPROCESS\t BURST TIME \t WAITING TIME\tTURNAROUND TIME\n");

        // the loop to display the values onto the screen.
        for(i=0;i<n;i++)
            System.out.printf("\t%d \t %d \t\t %d \t\t %d \n",i+1,ct[i],wa[i],tat[i]);
        input.nextLine();
    }
}
