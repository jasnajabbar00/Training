package com.training.ifaces;

public class Student implements Conditional {
	private int markScored;
	
		public Student() {
		super();
		
	}
		public Student(int markScored) {
			super();
			this.markScored = markScored;
		}

		public int getMarkScored() {
			return markScored;
		}

		public void setMarkScored(int markScored) {
			this.markScored = markScored;
		}

		@Override
	public boolean test(Object value) {
			
			String strBranch=(String)value;
			
			boolean result=false;
			
			if(this.markScored>80 && strBranch.equalsIgnoreCase("ECE"));
			{
		       result= true;
		}
		return result;
	}

}
