package com.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;

import com.example.demo.service.productService;
import com.example.doa.*;
import com.example.entity.Invoice;
import com.example.entity.Member;
import com.example.entity.Product;
import com.example.util.ConnectionFactory;

public class App 
{
	 public static void main( String[] args )
	    {
	 //  public static void product() {
	     	try {
		   Connection con=ConnectionFactory.getPostgressConnection();
	     	productService prod=new productService(con);
            
	//     	Product toAdd=new Product(9498,"REFRIGERATOR",60000.00);
	     	
	  //   	int rowsAdded=prod.addProduct(toAdd);
	    // 	System.out.println("Row Added:"+rowsAdded);
	     	
	     	prod.findAll().forEach(System.out::println);
//
//	     	}catch(Exception e)
//	     	{
//	     		e.printStackTrace();
//	     	}
//	   }
//	     	
//	     public static void memberService() {
//        Connection con ;
//        	try {
//    			con=DriverManager.getConnection("jdbc:oracle:thin:@10.90.1.105:1521/DEV","HR","HR");

                // 	con=ConnectionFactory.getOracleConnection();
                 	//con=ConnectionFactory.getPostgressConnection();

        		//System.out.println(con);
//
//    		MemberRepository memrep=new MemberRepository(con);
//    		memrep.findAll().forEach(System.out::println);
//    	    		
//    	int rowDelete=memrep.remove(4);
//    	System.out.println("Row deleted:"+rowDelete);
//    	//memrep.findAll().forEach(System.out::println);
//    	
//		Member rowsAdded=new Member(901,"dora","kochi",LocalDate.of(15,5,01),"annual",600.00,5,100.00);
//	
//		int rowAdded=memrep.add(rowsAdded);
//		System.out.println("Row Added:"+rowAdded);
//    	memrep.findAll().forEach(System.out::println);
//    	
//            
//        }catch(Exception e) {
//    		e.printStackTrace();
//    	}	
   // }
	  
        //     product();
          //   Connection con = ConnectionFactory.getPostgressConnection();
     		
//     		productService service = new productService(con);
//     		
//     		Product kathli=new Product(2200, "kaju kathli", 500.00);
//     		
//     		Product jamun=new Product(2201,"gulab jamun",450.00);
//         	 
//             service.usingTxn(kathli, jamun);   
            
             Product product=new Product(111,"tom",101);
             Invoice voice=new Invoice(101,"tonny",4,111);

            prod.usingTxnWithCatchBlock(product,voice);
	    }catch(Exception e){
	    	e.printStackTrace();
	    }
             
     }

    
}
