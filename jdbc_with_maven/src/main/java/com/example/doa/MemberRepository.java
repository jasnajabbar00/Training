package com.example.doa;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.example.entity.Member;
import com.example.ifaces.CrudRepository;

public class MemberRepository implements CrudRepository<Member> {
	
	private Connection con;

	public MemberRepository(Connection con) {
		super();
		this.con = con;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	public int add(Member obj) {
		int rowAdded=0;
		String sql="insert into jasna_member values(?,?,?,?,?,?,?,?)";
		try(PreparedStatement pstmt=con.prepareStatement(sql)) {
			
			pstmt.setInt(1,obj.getMemberId());
			pstmt.setString(2,obj.getMeberName());
			pstmt.setDate(3,Date.valueOf(obj.getAccountOpenDate()));
			pstmt.setString(4,obj.getMembershipType());
			pstmt.setDouble(5,obj.getFeesPaid());
			pstmt.setInt(6,obj.getMaxBookAllowed());
			pstmt.setDouble(7,obj.getPenaltyAmount());
			pstmt.setString(8,obj.getMemberAddress());

			rowAdded=pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return rowAdded;
	}

	public List<Member> findAll() {
		List<Member> memberlist=new ArrayList<Member>();
		String sql="select * from jasna_member";
		try(PreparedStatement pstmt=con.prepareStatement(sql)) {
			ResultSet rs=pstmt.executeQuery();
			
			while(rs.next()) {
				int memberId=rs.getInt("member_id");
				String memberName=rs.getString("member_name");
				String memberAddress=rs.getString("meber_address");
				 Date accountOpenDate=rs.getDate("acc_open_date");
				LocalDate accdate=accountOpenDate.toLocalDate();
				String membershipType=rs.getString("membership_type");
				double feesPaid=rs.getDouble("fees_paid");
				int maxBookAllowed=rs.getInt("max_books_allowed");
				double panaltyAmount=rs.getDouble("penalty_amount");
				
Member member=new Member(memberId,memberName,memberAddress,accdate,membershipType,feesPaid,maxBookAllowed,panaltyAmount);
memberlist.add(member);

			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return memberlist;
	}

	public int remove(int id) {

		int rowDelete=0;
		String sql="delete from jasna_member where member_id=?";
		try(PreparedStatement pstmt=con.prepareStatement(sql)) {
			pstmt.setInt(1,id);
			rowDelete=pstmt.executeUpdate();
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return rowDelete;
	}

	public Member findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int update(int Id, Member member) {
		// TODO Auto-generated method stub
		return 0;
	}

}
