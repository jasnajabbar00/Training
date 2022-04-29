package com.example.doa;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.naming.spi.DirStateFactory.Result;

import com.example.entity.Customer;
import com.example.entity.loanApplication;
import com.example.ifaces.CrudRepository;

public class CustomerService implements CrudRepository<loanApplication>{
     private Connection con;	
   
     public CustomerService(Connection con) {
		super();
		this.con=con;
	}

	public int add(loanApplication obj) {
		
		int rowAdded=0;
		String sql="insert into jasna_customer values(?,?,?,?)";
		String sql1="insert into jasna_loanApplication values(?,?,?)";

		
		
		try(PreparedStatement pstmt=con.prepareStatement(sql)) {
				try(PreparedStatement pstmt1=con.prepareStatement(sql1)) {
						
						pstmt.setInt(1,obj.getCustomer().getCustomerId());
						pstmt.setString(2,obj.getCustomer().getCustomerName());
						pstmt.setLong(3,obj.getCustomer().getPhoneNumber());
						pstmt.setDouble(4,obj.getCustomer().getCreditScore());
						
					pstmt.executeUpdate();
						
						pstmt1.setInt(1,obj.getApplicationNumber());
						pstmt1.setInt(2,obj.getCustomer().getCustomerId());
						pstmt1.setDouble(3,obj.getLoanAmount());
					
						rowAdded=pstmt1.executeUpdate();
						System.out.println("row Added"+rowAdded);
				}}catch(Exception e) {
					e.printStackTrace();
				}
	
						return rowAdded;
	}

	public List<loanApplication> findAll() {
		
		List<loanApplication> loanList=new ArrayList<loanApplication>();
		String sql="select * from jasna_customer jc  LEFT OUTER JOIN jasna_loanapplication ja on  jc.customer_id= ja.customerref ";
		try(PreparedStatement pstmt=con.prepareStatement(sql)) {
            
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				
				int applicationNumber=rs.getInt("application_number");
				double loanAmount=rs.getDouble("loan_amount");
                int customerId=rs.getInt("customer_id");
                String customerName=rs.getString("customer_name");
                long phoneNumber=rs.getLong("phone_number");
                double creditScore=rs.getDouble("credit_score");
               	Customer customerDetails=new Customer(customerId,customerName,phoneNumber,creditScore);
                  loanApplication loan=new loanApplication(applicationNumber,customerDetails,loanAmount);
                loanList.add(loan);
                
			}
		}catch(SQLException e){
				e.printStackTrace();
			}
		return loanList ;
	}

	public int remove(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Optional<loanApplication> findById(int id) {
		
	 Optional<loanApplication> obj=Optional.empty();
	String sql="select * from jasna_loanApplication where application_number=?";
		try(PreparedStatement pstmt=con.prepareStatement(sql)) {
			pstmt.setInt(1,id);
			
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) {
				int applicationNumber=rs.getInt("application_number");
				double loanAmount=rs.getDouble("loan_amount");
                int customerId=rs.getInt("customer_id");
                String customerName=rs.getString("customer_name");
                long phoneNumber=rs.getLong("phone_number");
                double creditScore=rs.getDouble("credit_score");
            	Customer customer1=new Customer(customerId,customerName,phoneNumber,creditScore);
                loanApplication loan1=new loanApplication(applicationNumber,customer1,loanAmount);
                obj=Optional.of(loan1);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return obj;
	}

	public int update(int Id, loanApplication customer) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
