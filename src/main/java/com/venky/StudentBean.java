package com.venky;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class StudentBean {
	private List<String> StudentName;
	private Set<Integer> StudentId;
	private Map<String, Integer> branchDetails;
	private Properties branchInfo;

	public List<String> getStudentName() {
		return StudentName;
	}

	public void setStudentName(List<String> studentName) {
		StudentName = studentName;
	}

	public Set<Integer> getStudentId() {
		return StudentId;
	}

	public void setStudentId(Set<Integer> studentId) {
		StudentId = studentId;
	}

	public Map<String, Integer> getBranchDetails() {
		return branchDetails;
	}

	public void setBranchDetails(Map<String, Integer> branchDetails) {
		this.branchDetails = branchDetails;
	}

	public Properties getBranchInfo() {
		return branchInfo;
	}

	public void setBranchInfo(Properties branchInfo) {
		this.branchInfo = branchInfo;
	}

	public void printStudentNames() {

		System.out.println("------------Student Names----------");
		for (String sname : StudentName) {
			System.out.println(sname);

		}
	}

	public void printStudentId() {

		System.out.println("------------Student IDS----------");
		for (Integer sid : StudentId) {
			System.out.println(sid);

		}
	}

	public void printStudentBranchDetails() {

		System.out.println("------------Student BranchDetails----------");
		for (Map.Entry<String, Integer> branchd : branchDetails.entrySet()) {
			System.out.println(branchd.getKey() + "\t" + branchd.getValue());

		}
	}

	public void printStudentBranchInfo() {

		System.out.println("------------Student BranchInfo----------");
		Set<String> keys = branchInfo.stringPropertyNames();
		for (String key : keys) {
			System.out.println(key + "-->" + branchInfo.getProperty(key));
		}

	}

}
