package in.coderinfotech.batchschedule;
// Generated Jan 22, 2018 5:23:28 PM by Hibernate Tools 5.2.6.Final

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * FeesDetails generated by hbm2java
 */
@Entity
@Table(name = "fees_details")
public class FeesDetails implements java.io.Serializable {

	private long feesDetailsId;
	private StudentDetails studentDetails;
	private Date feesPaidDate;
	private String feesReceiptNo;
	private String amount;
	private String tuitionFeesRemaining;

	public FeesDetails() {
	}

	public FeesDetails(long feesDetailsId) {
		this.feesDetailsId = feesDetailsId;
	}

	public FeesDetails(long feesDetailsId, StudentDetails studentDetails, Date feesPaidDate, String feesReceiptNo,
			String amount, String tuitionFeesRemaining) {
		this.feesDetailsId = feesDetailsId;
		this.studentDetails = studentDetails;
		this.feesPaidDate = feesPaidDate;
		this.feesReceiptNo = feesReceiptNo;
		this.amount = amount;
		this.tuitionFeesRemaining = tuitionFeesRemaining;
	}

	@Id

	@Column(name = "FEES_DETAILS_ID", unique = true, nullable = false)
	public long getFeesDetailsId() {
		return this.feesDetailsId;
	}

	public void setFeesDetailsId(long feesDetailsId) {
		this.feesDetailsId = feesDetailsId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "STUDENT_ID")
	public StudentDetails getStudentDetails() {
		return this.studentDetails;
	}

	public void setStudentDetails(StudentDetails studentDetails) {
		this.studentDetails = studentDetails;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "FEES_PAID_DATE", length = 10)
	public Date getFeesPaidDate() {
		return this.feesPaidDate;
	}

	public void setFeesPaidDate(Date feesPaidDate) {
		this.feesPaidDate = feesPaidDate;
	}

	@Column(name = "FEES_RECEIPT_NO", length = 50)
	public String getFeesReceiptNo() {
		return this.feesReceiptNo;
	}

	public void setFeesReceiptNo(String feesReceiptNo) {
		this.feesReceiptNo = feesReceiptNo;
	}

	@Column(name = "AMOUNT", length = 50)
	public String getAmount() {
		return this.amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	@Column(name = "TUITION_FEES_REMAINING", length = 50)
	public String getTuitionFeesRemaining() {
		return this.tuitionFeesRemaining;
	}

	public void setTuitionFeesRemaining(String tuitionFeesRemaining) {
		this.tuitionFeesRemaining = tuitionFeesRemaining;
	}

}
