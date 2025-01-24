package com.assessment.app;


public class RetailCompany
{
public static void main(String [] args)
{
	int [][] sales_data = {{12,10,17},{14,10,19},{7,14,7}};
	
	int total_sales1=0 ;
	int total_sales2=0 ;
	int total_sales3=0 ;
	int total_product1 = 0;
	int total_product2 = 0;
	int total_product3 = 0;
	
	for(int i=0;i<sales_data.length;i++)
	{
		for(int j=0 ; j<sales_data[i].length;j++)
		{
			if(i==0)
			{
				total_sales1 += sales_data[i][j];
			}
			else if(i==1)
			{
				total_sales2 += sales_data[i][j];
			}
			else if(i==2)
			{
				total_sales3 += sales_data[i][j];
			}
			if(j==0)
			{
				total_product1 += sales_data[i][j];
			}
			else if(j==1)
			{
				total_product2 += sales_data[i][j];
			}
			else if(j==2)
			{
				total_product3 += sales_data[i][j];
			}
			
		}
	}
	System.out.println("--------TOTAL SALES OF THE COMPANIES--------");
	System.out.println("The Total Sales Of Company1 : "+total_sales1);
	System.out.println("The Total Sales Of Company2 : "+total_sales2);
	System.out.println("The Total Sales Of Company3 : "+total_sales3);
	System.out.println("--------TOTAL SALES OF THE PRODUCTS--------");
	System.out.println("The Total Sales Of Product1 : "+total_product1);
	System.out.println("The Total Sales Of Product2 : "+total_product2);
	System.out.println("The Total Sales Of Product3 : "+total_product3);
	System.out.println("--------COMPANY WITH HIGHEST SALES--------");
	if(total_sales1 > total_sales2 && total_sales1 > total_sales3)
	{
		System.out.println("The Company with highest sales is Company 1 with Sales:"+total_sales1);
	}
	else if(total_sales2 > total_sales1 && total_sales2 > total_sales3)
	{
		System.out.println("The Company with highest sales is Company 2 with Sales:"+total_sales2);
	}
	else
	{
		System.out.println("The Company with highest sales is Company 3 with Sales:"+total_sales3);
	}
	
	System.out.println("        PRODUCT WITH HIGHEST SALES      ");
	if(total_product1 > total_product2 && total_product1 > total_product3)
	{
		System.out.println("The Product with highest sales is Product 1 with Sales:"+total_product1);
	}
	else if(total_product2 > total_product1 && total_product2 > total_product3)
	{
		System.out.println("The Product with highest sales is Product 2 with Sales:"+total_product2);
	}
	else
	{
		System.out.println("The Product with highest sales is Product 3 with Sales:"+total_product3);
	}
	int avg_sales1=total_sales1/3;
	int avg_sales2=total_sales2/3;
	int avg_sales3=total_sales3/3;
	System.out.println("           AVERAGE SALES OF COMPANY        ");
	System.out.println("The Average Sales Of Company 1 : "+avg_sales1);
	System.out.println("The Average Sales Of Company 2 : "+avg_sales2);
	System.out.println("The Average Sales Of Company 3 : "+avg_sales3);
	
	int avg_product1=total_product1/3;
	int avg_product2=total_product2/3;
	int avg_product3=total_product3/3;
	
	System.out.println("            AVERAGE SALES OF PRODUCTS       ");
	System.out.println("The Average Sales Of Product 1 : "+avg_product1);
	System.out.println("The Average Sales Of Product 2 : "+avg_product2);
	System.out.println("The Average Sales Of Product 3 : "+avg_product3);

}
}
