package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);

        int p[] = new int[20];					// to hold the process values
        int bt[] = new int[20];					// to hold the to burst time
        int wt[] = new int[20];					// to hold the to waiting time
        int tat[] = new int[20];				// to hold the turnaround time
        int i;									// loop counting variable
        int k;									// loop counting variable
        int n;									// to hold the number of processes
        int temp;								// to hold temporal value
        double wtavg;							// to hold the average waiting time
        double tatavg;							// to hold the average turnaround time

        System.out.println("This program demonstrate SJF Scheduling Algorithm.\n\n\n");
        System.out.printf("\nEnter the number of processes -- ");
        n = input.nextInt();

        // the loop initialize the process value with the loop counter values
        // it then trompt the users for burst time of the process and stores the in bt[] variable.
        for(i=0;i<n;i++)
        {
            p[i]=i;
            System.out.printf("Enter Burst Time for Process %d -- ", i);
            bt[i] = input.nextInt();
        }

        // the nexted loop iterates and rearranges the valus of bt[] and p[]
        // in ascending order.
        for(i=0;i<n;i++)
            for(k=i+1;k<n;k++)
                if(bt[i]>bt[k])
                {
                    temp=bt[i];
                    bt[i]=bt[k];
                    bt[k]=temp;
                    temp=p[i];
                    p[i]=p[k];
                    p[k]=temp;
                }



        // initializing the first elements of waiting time
        // and average waiting time to zero
        // wt[0] = wtavg = 0;
        wt[0] = (int) (wtavg = 0);

        // initializing the first elements of turnaround time
        // and average turnaround time to zero
        // tat[0] = tatavg = bt[0];
        tat[0] = (int) (tatavg = bt[0]);


        // the loop computes the waiting time, turnaround time
        // waiting time average, and turnaround time average
        for(i=1;i<n;i++)
        {
            wt[i] = wt[i-1] +bt[i-1];       // curren wt determine by adding the previous element of wt and bt
            tat[i] = tat[i-1] +bt[i];       // current atat determine by adding previous element of tat and current bt.
            wtavg = wtavg + wt[i];          // determine by the running total of wt[] elements.
            tatavg = tatavg + tat[i];       // determine by the running total of tat[] elements.
        }

        System.out.printf("\n\t PROCESS \tBURST TIME \t WAITING TIME\t TURNAROUND TIME\n");
        // loop to display the values onto the screen.
        for(i=0;i<n;i++)
            System.out.printf("\n\t P%d \t\t %d \t\t %d \t\t %d", p[i], bt[i], wt[i], tat[i]);

        System.out.printf("\nAverage Waiting Time -- %f", wtavg);
        System.out.printf("\nAverage Turnaround Time -- %f", tatavg);

        input.nextLine();           // clear the buffer.
    }
}
