package ace.jobFinder.Model;

public class CvForm {
Integer id;
String userId;
String jobId;
Byte[] data;

public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
public String getJobId() {
	return jobId;
}
public void setJobId(String jobId) {
	this.jobId = jobId;
}
public Byte[] getData() {
	return data;
}
public void setData(Byte[] data) {
	this.data = data;
}
}
