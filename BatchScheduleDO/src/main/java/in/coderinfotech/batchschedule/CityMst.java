package in.coderinfotech.batchschedule;
// Generated Jan 22, 2018 5:23:28 PM by Hibernate Tools 5.2.6.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * CityMst generated by hbm2java
 */
@Entity
@Table(name = "city_mst")
public class CityMst implements java.io.Serializable {

	private long cityId;
	private StateMst stateMst;
	private String cityCode;
	private String cityName;
	private Set<PersonDetails> personDetailses = new HashSet<PersonDetails>(0);

	public CityMst() {
	}

	public CityMst(long cityId) {
		this.cityId = cityId;
	}

	public CityMst(long cityId, StateMst stateMst, String cityCode, String cityName,
			Set<PersonDetails> personDetailses) {
		this.cityId = cityId;
		this.stateMst = stateMst;
		this.cityCode = cityCode;
		this.cityName = cityName;
		this.personDetailses = personDetailses;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "CITY_ID", unique = true, nullable = false)
	public long getCityId() {
		return this.cityId;
	}

	public void setCityId(long cityId) {
		this.cityId = cityId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "STATE_ID")
	public StateMst getStateMst() {
		return this.stateMst;
	}

	public void setStateMst(StateMst stateMst) {
		this.stateMst = stateMst;
	}

	@Column(name = "CITY_CODE", length = 35)
	public String getCityCode() {
		return this.cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	@Column(name = "CITY_NAME", length = 50)
	public String getCityName() {
		return this.cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cityMst")
	public Set<PersonDetails> getPersonDetailses() {
		return this.personDetailses;
	}

	public void setPersonDetailses(Set<PersonDetails> personDetailses) {
		this.personDetailses = personDetailses;
	}

	@Override
	public String toString() {
		return "CityMst [cityId=" + cityId + ", stateMst=" + stateMst + ", cityCode=" + cityCode + ", cityName="
				+ cityName + ", personDetailses=" + personDetailses + "]";
	}

}
