package ace.jobFinder.Model;

import java.sql.Timestamp;

public class Job {
String jobId;
String title;
Byte[] logo;
String location;
String type;
Double salary;
String description;
String responsibility;
String qualification;
Integer vacancy;
Timestamp dateLine;

public String getJobId() {
	return jobId;
}
public void setJobId(String jobId) {
	this.jobId = jobId;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public Byte[] getLogo() {
	return logo;
}
public void setLogo(Byte[] logo) {
	this.logo = logo;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public Double getSalary() {
	return salary;
}
public void setSalary(Double salary) {
	this.salary = salary;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getResponsibility() {
	return responsibility;
}
public void setResponsibility(String responsibility) {
	this.responsibility = responsibility;
}
public String getQualification() {
	return qualification;
}
public void setQualification(String qualification) {
	this.qualification = qualification;
}
public Integer getVacancy() {
	return vacancy;
}
public void setVacancy(Integer vacancy) {
	this.vacancy = vacancy;
}
public Timestamp getDateLine() {
	return dateLine;
}
public void setDateLine(Timestamp dateLine) {
	this.dateLine = dateLine;
}

}
