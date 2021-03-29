package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);

        int p[] = new int[20];
        int bt[] = new int[20];
        int pri[] = new int[20];
        int  wt[] = new int[20];
        int tat[] = new int[20];
        int i;
        int k;
        int n;
        int temp;
        double wtavg;
        double tatavg;


        System.out.println("PRIORITY CPU SCHEDULING ALGORITHM\n\n\n");
        System.out.printf("Enter the number of processes --- ");
        n = input.nextInt();

        for(i=0;i<n;i++)
        {
            p[i] = i;
            System.out.printf("Enter the Burst Time & Priority of Process %d --- ",i);
            bt[i] = input.nextInt();
            System.out.printf("Enter the Priority of Process %d --- ",i);
            pri[i] = input.nextInt();
        }

        for(i=0;i<n;i++)
            for(k=i+1;k<n;k++)
                if(pri[i] > pri[k])
                {
                    temp=p[i];
                    p[i]=p[k];
                    p[k]=temp;
                    temp=bt[i];
                    bt[i]=bt[k];
                    bt[k]=temp;
                    temp=pri[i];
                    pri[i]=pri[k];
                    pri[k]=temp;
                }


        wtavg = wt[0] = 0;
        tatavg = tat[0] = bt[0];

        for(i=1;i<n;i++)
        {
            wt[i] = wt[i-1] + bt[i-1];
            tat[i] = tat[i-1] + bt[i];
            wtavg = wtavg + wt[i];
            tatavg = tatavg + tat[i];
        }
        System.out.printf("\nPROCESS\t\tPRIORITY\tBURST TIME\tWAITING TIME\tTURNAROUND TIME");

        for(i=0;i<n;i++)
            System.out.printf("\n%d \t\t %d \t\t %d \t\t %d \t\t %d ",p[i],pri[i],bt[i],wt[i],tat[i]);

        System.out.printf("\nAverage Waiting Time is --- %f",wtavg/n);
        System.out.printf("\nAverage Turnaround Time is --- %f",tatavg/n);
        input.nextLine();
    }
}
