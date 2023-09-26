package trichy;

import java.util.Scanner;

public class ArrayLearning {

	public static void main(String[] args) {
		ArrayLearning ar= new ArrayLearning();
	//	ar.lesson1();
	//	char[] name = {'h','a','r','i','s','h'};
	//    ar.lesson2(name);
	//	char[] name= {'a','b','c','d'};
	//	ar.Print_Reverse(name);
	//	ar.find_total();
	//	ar.find_expence();
	//	ar.concatenate_array();
	//	ar.add_array();
	//	ar.add_array1();
		
		
		
		
	}

	private void add_array1() {
		  int[] q = {90, 87, 100};    //3
		    int[] h = {89, 67};         //2

		    int small = q.length < h.length ? q.length:h.length;
		    int big = q.length > h.length ? q.length:h.length;

		    int[] result = new int[big];
//		    result ==> {90+89, 87+67, 100}; 
//		    result[0] = q[0] + h[0]; 
//		    result[1] = q[1] + h[1]; 
//		    result[2] = q[2]; 

		    for(int i=0; i<result.length; i++)
		    {
		        if(i<small)
		         {
		        result[i] = q[i] + h[i];
		        System.out.println(result[i]); 
		        }
		       else
		            {
		            result[i] = q[i]; 
		            System.out.println(result[i]); 
		            }
		    }
	}

	private void add_array() {
		int[] first =  {90, 76, 87}; 
		int[] second = {56, 98, 45}; 
		int[] total = new int[first.length];

		for(int i=0; i<total.length;i++)
		    {
		    total[i] = first[i] + second[i];
		    System.out.println(total[i]);
		    }
	}

	private void find_value() {
		int[] first = {90, 76, 87}; 
		int[] second = {56, 98, 45}; 
	//	int j=0;

		int[] total = new int[first.length + second.length];
		for(int i=0; i<total.length; i++)
		{
		    if(i<first.length)
		    {
		    total[i] = first[i]; 
		    System.out.println(total[i]); 
		    }
		    else
		    {
		    total[i] = second[i-first.length]; 
		 //   j++;
		     System.out.println(total[i]); 
		    }
		}
	}

	private void find_expence() {
		int[] tour = {1000, 1500, 300, 450}; 

		int[] trip = {343, 400};
		int total = 0; 

		for(int i=0; i<tour.length; i++)
		    total = total + tour[i];

		for(int i=0; i<trip.length; i++)
		    total = total + trip[i];  

		System.out.println("Total Expenditure is "+ total);
	}

	private void find_total() {
		 {
			 Scanner sc = new Scanner(System.in);
			    System.out.println("Enter no. of subjects: ");
			    int subjects = sc.nextInt();
			    int[] marks = new int[subjects]; 
			    int big = 0; int small = 101; 
			    int total = 0; 
			      int count = 0; 
			    for(int i=0; i<marks.length;i++)
			    {
			        System.out.println("Enter Mark ");     
			        marks[i] = sc.nextInt(); 
			        if(marks[i]>big)
			        {
			          big = marks[i];
			        }
			        if(marks[i]<small)
			        {
			          small = marks[i];
			        }
			        total = total +  marks[i]; 
			        System.out.println(marks[i]); 
			    }
			    System.out.println("Total " + total); 
			    System.out.println("Highest Mark is "+ big);
			    System.out.println("Lowest Mark is "+ small);
		 }
	}
	

	private void Print_Reverse(char[] name) {
	    char[] name2 = new char[name.length];
	    
//	    name2[0] = name[3]; 
//	    name2[1] = name[2];
//	    name2[2] = name[1]; 
//	    name2[3] = name[0]; 
	    int i =0, j = name.length - 1; 
	    while(i<name.length)
	    {
	      name2[i] = name[j];
	      i++; 
	      j--; 
	    }
	    System.out.println(name2);
	    
	  }
	

	private void lesson2(char[] name) {
		for(int i=name.length-1;i>=0;i--)
		{
			System.out.println(name[i]);
		}
	}

	private void lesson1() {
	    char name[] = new char[6]; 
	    name[0] = 'h'; 
	    name[1] = 'a';
	    name[2] = 'r';
	    name[3] = 'i';
	    name[4] = 's';
	    name[5] = 'h'; 
//	    System.out.println(name[0]);
//	    System.out.println(name[1]);
//	    System.out.println(name[2]);
//	    System.out.println(name[3]);
//	    System.out.println(name[4]);
//	    System.out.println(name[5]);
	    int i = 0; 
	    while(i<name.length){
	    System.out.println(name[i]);
	    i++;
	    }
	    char first = name[0]; 
	    int len = name.length;
	    char last = name[len-1];
	    if(first == last)
	    {
	      System.out.println("Same");
	    }
	    else
	    {
	      System.out.println("Not Same");
	    }

	    
	    
	  }
	}


