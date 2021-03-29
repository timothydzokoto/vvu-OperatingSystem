package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] tracks = new int[20], d = new int[20], atr = new int[20];
        int posHead, i, j = 0, noTracks, temp, k = 0,tot, p, sum=0;
        Scanner input = new Scanner(System.in);

        System.out.println("enter the no of tracks to be traveresed");
        noTracks = input.nextInt();

        System.out.println("enter the position of head");
        posHead = input.nextInt();

        tracks[0]=0;
        tracks[1]=posHead;

        System.out.println("enter the tracks");
        for(i=2; i<noTracks+2; i++)
            tracks[i] = input.nextInt();

        for(i=0; i<noTracks +2; i++)
        {
            for(j=0; j<(noTracks+2)-i-1 ;j++)
            {
                if(tracks[j]>tracks[j+1])
                {
                    temp=tracks[j];
                    tracks[j]=tracks[j+1];
                    tracks[j+1]=temp;
                }
            }
        }
        for(i=0; i<noTracks+2;i++)
        {
            if (tracks[i] == posHead)
            {
                j = i;
                k = i;
            }
        }
        p=0;

        while(tracks[j]!=0)
        {
            atr[p]=tracks[j];
            j--;
            p++;
        }
        atr[p]=tracks[j];
        for(p=k+1;p<noTracks+2;p++,k++)
            atr[p]=tracks[k+1];

        for(j=0;j<noTracks+1;j++)
        {
            if(atr[j]>atr[j+1])
                d[j]=atr[j]-atr[j+1];
            else
                d[j]=atr[j+1]-atr[j];
            sum+=d[j];
        }
        System.out.println("\nAverage header movements: "+ (float)sum/noTracks);
    }
}
