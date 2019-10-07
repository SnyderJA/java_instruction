import java.time.LocalDate;
import java.time.LocalDateTime;

public class PurchaseRequest {

	
	private int id;
	private int userId;
	private String description;
	private String justification;
	private LocalDate dateNeeded;
	private String deliverMode;
	private String status;
	private double total;
	private LocalDateTime submittedDate;
	private String reasonForRejection;
	
	
	
	public PurchaseRequest(int id, int userId, String description, String justification, LocalDate dateNeeded,
			String deliverMode, String status, double total, LocalDateTime submittedDate, String reasonForRejection) {
		super();
		this.id = id;
		this.userId = userId;
		this.description = description;
		this.justification = justification;
		this.dateNeeded = dateNeeded;
		this.deliverMode = deliverMode;
		this.status = status;
		this.total = total;
		this.submittedDate = submittedDate;
		this.reasonForRejection = reasonForRejection;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public int getUserId() {
		return userId;
	}



	public void setUserId(int userId) {
		this.userId = userId;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String getJustification() {
		return justification;
	}



	public void setJustification(String justification) {
		this.justification = justification;
	}



	public LocalDate getDateNeeded() {
		return dateNeeded;
	}



	public void setDateNeeded(LocalDate dateNeeded) {
		this.dateNeeded = dateNeeded;
	}



	public String getDeliverMode() {
		return deliverMode;
	}



	public void setDeliverMode(String deliverMode) {
		this.deliverMode = deliverMode;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public double getTotal() {
		return total;
	}



	public void setTotal(double total) {
		this.total = total;
	}



	public LocalDateTime getSubmittedDate() {
		return submittedDate;
	}



	public void setSubmittedDate(LocalDateTime submittedDate) {
		this.submittedDate = submittedDate;
	}



	public String getReasonForRejection() {
		return reasonForRejection;
	}



	public void setReasonForRejection(String reasonForRejection) {
		this.reasonForRejection = reasonForRejection;
	}



	@Override
	public String toString() {
		return "PurchaseRequest [id=" + id + ", userId=" + userId + ", description=" + description + ", justification="
				+ justification + ", dateNeeded=" + dateNeeded + ", deliverMode=" + deliverMode + ", status=" + status
				+ ", total=" + total + ", submittedDate=" + submittedDate + ", reasonForRejection=" + reasonForRejection
				+ "]";
	}

	
	
}


