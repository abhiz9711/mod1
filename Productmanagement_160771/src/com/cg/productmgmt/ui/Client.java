package com.cg.productmgmt.ui;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.cg.productmgmt.exception.ProductException;
import com.cg.productmgmt.service.IProductService;
import com.cg.productmgmt.service.ProductService;



public class Client {
	static Scanner sc=null;
	static IProductService prdSer=null;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		prdSer=new ProductService();
		int choice=0;
		/*do
		{	
			System.out.println("enter choice");
			choice=sc.nextInt();
			if(choice==1||choice==2){
			switch(choice)
			{
			case 1:
				try
				{
				System.out.println("Enter the Product Category");
				String ctgry=sc.next();
				if(prdSer.validateCategory(ctgry)){
				
				prdSer.updateProducts(ctgry, 0);
				
				
				System.out.println("Enter hike Rate");
				int hike=sc.nextInt();
				
				if(prdSer.validateHike(hike))
				{
				
					if(prdSer.updateProducts(ctgry, hike)==1)
					{
						Map<String,Integer> m=prdSer.getProductDetails();
						Set<String> s=m.keySet();
						Iterator<String> i=s.iterator();
						while(i.hasNext())
						{
							String tem=i.next();
							System.out.println("Product Name: "+tem+" Price \t: "+m.get(tem));
							
						}
					}
					else throw new ProductException("not updated");
				}
				
				}}
				catch (ProductException e) {
					System.out.println(e.getMessage());

				}
				catch(InputMismatchException e)
				{
					System.out.println(e);
				}
				break;
			case 2:
				System.out.println("Exit Thank you");
				break;
			}
			}
			else
				System.out.println("Enter correct choice 1 or 2");

		}while(choice!=2);*/

	


	/*while(true){
			System.out.println("1) Update Product Price");
			System.out.println("2) Exit");
			System.out.println("Select Option");
			choice= sc.nextInt();
			switch(choice){
			case 1: updateProductPrice(); break;
			case 2: System.exit(0); break;
		    default:

			}
		}


	}

	private static void updateProductPrice() {
		System.out.println("Enter the Product Category");
       
        String ctgry=sc.next();
				if(prdSer.validateCategory(ctgry)){
				
				prdSer.updateProducts(ctgry, 0);
				
				
				System.out.println("Enter hike Rate");
				int hike=sc.nextInt();
        System.out.println("Enter hike");
        int hike=sc.nextInt();
       
				if(prdSer.validateHike(hike))
				{
				
					if(prdSer.updateProducts(ctgry, hike)==1)
					{
						Map<String,Integer> m=prdSer.getProductDetails();
						Set<String> s=m.keySet();
						Iterator<String> i=s.iterator();
						while(i.hasNext())
						{
							String tem=i.next();
							System.out.println("Product Name: "+tem+" Price \t: "+m.get(tem));
							
						}
					}
					else throw new ProductException("not updated");
				}
				
				}}
				catch (ProductException e) {
					System.out.println(e.getMessage());

				}
				catch(InputMismatchException e)
				{
					System.out.println(e);
				}
				break;
        }


    case 2:
        System.out.println("Exit Thank you");
        break;
    }

	}
	 */
	}
}
