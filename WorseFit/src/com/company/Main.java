package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);

        // Variables
        final int max = 25;                 // the size of the arrays
        int frag[] = new int[max];          // to hold the fragments
        int b[] = new int[max];             // to hold the block size
        int f[] = new int[max];             // to hold the size of the files
        int i;                              // loop counter
        int j;                              // loop counter
        int nb;                             // to hold number of block
        int nf;                             // to hold number of files
        int temp = 0;                       // to temporally hold fragment value
        int bf[] = new int[max];            //
        int ff[]= new int[max];             //

        System.out.println("This program is demonstrate the worse fit memory managment technique\n "
                + "Job is allocated the largest memory available.\n\n\n");

        System.out.printf("\n\tMemory Management Scheme - First Fit");
        System.out.printf("\nEnter the number of blocks:");
        nb = input.nextInt();
        System.out.printf("Enter the number of files:");
        nf = input.nextInt();

        // Prompting user for an input
        System.out.printf("\nEnter the size of the blocks:-\n");

        // looping to store users inputs ( block size ) into b[] array variable.
        for(i=1;i<=nb;i++)
        {
            System.out.printf("Block %d:",i);
            b[i] = input.nextInt();
        }
        System.out.printf("Enter the size of the files :-\n");

        // looping to store users inputs ( file size ).
        for(i=1;i<=nf;i++)
        {
            System.out.printf("File %d:",i);
            f[i] = input.nextInt();
        }

        for(i = 1; i <= nf; i++){
            for(j=1;j<=nb;j++)
            {
                if(bf[j]!=1)
                {
                    temp=b[j]-f[i];
                    if(temp>=0)
                    {
                        ff[i]=j;
                        break;
                    }
                }
            }
            frag[i]=temp;
            bf[ff[i]]=1;

        }
        System.out.printf("\nFile_no:\tFile_size :\tBlock_no:\tBlock_size:\tFragement");

        // Display values onto the screen
        for(i=1;i<=nf;i++)
            System.out.printf("\n%d\t\t%d\t\t%d\t\t%d\t\t%d",i,f[i],ff[i],b[ff[i]],frag[i]);

        input.nextLine();
    }
}
