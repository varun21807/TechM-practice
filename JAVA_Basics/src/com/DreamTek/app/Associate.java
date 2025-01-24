package com.DreamTek.app;

import java.util.Scanner;

public class Associate {
	
	private int associateId;
	private String associateName;
	private String workStatus;
	
	/**
	 * 
	 * @param associateId
	 * @param associateName
	 * @param workStatus
	 */
	
	/**
	 * 
	 * @param associateId
	 * @return
	 */
	
	public void setAssociateId(int associate_id) {
		this.associateId = associate_id;
	}
	
	public int getAssociateId() {
		return associateId;
	}
	
	/**
	 * 
	 * @param associateName
	 * @return
	 */
	
	public void setAssociateName(String associate_name) {
		this.associateName = associate_name;
	}
	
	public String getAssociateName() {
		return associateName;
	}
	
	/**
	 * 
	 * @param workStatus
	 * @return
	 */
	
	public void setWorkStatus(String work_status) {
		this.workStatus = work_status;
	}
	
	public String getWorkStatus() {
		return workStatus;
	}
	
	/**
	 * 
	 * @param workStatus
	 */
	
	public void trackAssociateStatus(int day) {
		if(day <= 20 && day > 0) {
			setWorkStatus("Core Skill");
			getWorkStatus();
		} else if (day > 20 && day <= 40) {
			setWorkStatus("Advanced Modules");
			getWorkStatus();
		} else if (day > 40 && day <= 60) {
			setWorkStatus("Project Phase");
			getWorkStatus();
		} else {
			setWorkStatus("Deployed in Project");
			getWorkStatus();
		}
	}
	
	/**
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Associate Id:");
		int id = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Enter the Associate Name:");
		String name = scan.nextLine();
		
		System.out.println("Enter the day of training:");
		int day = scan.nextInt();
		
		/**
		 * @author varun
		 * @methods calling
		 */
		
		Associate associate = new Associate();
		
		associate.setAssociateId(id);
		associate.setAssociateName(name);
		associate.trackAssociateStatus(day);
		
		System.out.println("Associate Work Status :"+associate.getWorkStatus());
		
		
	scan.close();
	}

}
