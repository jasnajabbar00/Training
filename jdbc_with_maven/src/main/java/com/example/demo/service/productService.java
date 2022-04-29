package com.example.demo.service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.entity.Invoice;
import com.example.entity.Product;
public class productService {

private Connection con;

public productService(Connection con) {
	super();
	this.con=con;
}
public int addProduct(Product product) {
	int rowAdded=0;
	String sql="insert into jasna_product values(?,?,?)";
	try(PreparedStatement pstmt=con.prepareStatement(sql)) {
		
		pstmt.setInt(1,product.getProductId());
		pstmt.setString(2, product.getProductName());
		pstmt.setDouble(3,product.getPrice());
		
		rowAdded=pstmt.executeUpdate();
		}
	catch(Exception e) {
		e.printStackTrace();
	}	
	return rowAdded;
	}

public List<Product> findAll() {
	List<Product> productList=new ArrayList<Product>();
	
	String sql="select * from jasna_product";
	try(PreparedStatement pstmt=con.prepareStatement(sql)) {
		
	ResultSet rs=pstmt.executeQuery();
		while(rs.next()) {
			int productId=rs.getInt("product_Id");
			String productName=rs.getString("product_Name");
			double price=rs.getDouble("price");
			
			Product prod=new Product(productId,productName,price);
			productList.add(prod);
		}
		
	}catch(SQLException e) {
		e.printStackTrace();
	}
	return productList;
	} 
public int deleteById(int id) {
		int rowsDeleted=0;
		String sql="delete from jasna_product where product_id=?";
        try(PreparedStatement pstmt=con.prepareStatement(sql)) {

		pstmt.setInt(1,id);
		rowsDeleted=pstmt.executeUpdate();

		}
		catch(SQLException e) {
			e.printStackTrace();
		}	
		
	return rowsDeleted;
		
}
public Optional<Product>findById(int id) {
	
	Optional<Product> obj=Optional.empty();
	String sql="Select * from jasna_product where product_id=?";
	try(PreparedStatement pstmt=con.prepareStatement(sql)) {
		pstmt.setInt(1,id);
	ResultSet rs=pstmt.executeQuery();
	if(rs.next()) {
		int productId=rs.getInt("product_Id");
		String productName=rs.getString("product_name");
		double price=rs.getDouble("price");
		
		Product prod=new Product(productId,productName,price);
       obj=Optional.of(prod);
	}
	}catch(SQLException e) {
		e.printStackTrace();
	}	
	
	return obj;
 }
   public int updatePriceByName(String productName,double newPrice) {
	
	  int rowsUpdated=0;
	  String sql="update jasna_product set price=? where product_name=?";
	     try(PreparedStatement pstmt=con.prepareStatement(sql)) {
	    	pstmt.setDouble(1,newPrice);
	    	pstmt.setString(2,productName);

	
		rowsUpdated=pstmt.executeUpdate();


    }  catch(Exception e) {
	   e.printStackTrace();
	}
     return rowsUpdated;
  }
   public void usingTxn(Product prd1,Product prd2) 
   {
	  String sql="insert into jasna_product values(?,?,?)";
	
	  try(PreparedStatement pstmt=con.prepareCall(sql)) {
          con.setAutoCommit(false);
			  		
			   pstmt.setInt(1,prd1.getProductId());
			   pstmt.setString(2,prd1.getProductName());
			   pstmt.setDouble(3,prd1.getPrice());
			   
				int rowAdded1=pstmt.executeUpdate();
				
				pstmt.setInt(1,prd2.getProductId());
		    	 pstmt.setString(2,prd2.getProductName());
		        pstmt.setDouble(3,prd2.getPrice());
				
				   int rowAdded2=pstmt.executeUpdate();
				   
			if(prd2.getPrice()>prd1.getPrice()) {
				con.commit();
			}else {
				con.rollback();
			}
					
			
		   System.out.println("Row Added:"+rowAdded1+","+rowAdded2);
     } catch (SQLException e) {
    	 e.printStackTrace();
     }
             
    }
   
   public void usingTxnWithCatchBlock(Product prd1,Invoice invoice) 
   {
	  String addprodsql="insert into jasna_product values(?,?,?)";
	  String addinvoiceSql="insert into jasna_invoice values(?,?,?,?)";
	
	  try(
			  PreparedStatement prodtmt=con.prepareCall(addprodsql);
		      PreparedStatement invStmt=con.prepareStatement(addinvoiceSql)
			  ) {
          con.setAutoCommit(false);
			  		  
			   prodtmt.setInt(1,prd1.getProductId());
			   prodtmt.setString(2,prd1.getProductName());
			   prodtmt.setDouble(3,prd1.getPrice());
			   
				int productAddCount=prodtmt.executeUpdate();
				
				invStmt.setInt(1,invoice.getInvoiceNumber());
		    	invStmt.setString(2,invoice.getCustomerName());
		        invStmt.setDouble(3,invoice.getQuantity());
		        invStmt.setInt(4,invoice.getProductRef());
				
				   con.commit();
				   int invoiceAddCount=invStmt.executeUpdate();
				   
				   System.out.println("Row Added:"+productAddCount);

     } catch (SQLException e) {
    	 e.printStackTrace();
    	 
    	 try {
			con.rollback();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
     }
             
    }
}