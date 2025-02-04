package c.ebbeding.object;

import javax.persistence.Embeddable;

@Embeddable
public class Certiicate {

	private int ceryId;
	private String ceryName;
	
	public int getCeryId() {
		return ceryId;
	}
	public void setCeryId(int ceryId) {
		this.ceryId = ceryId;
	}
	public String getCeryName() {
		return ceryName;
	}
	public void setCeryName(String ceryName) {
		this.ceryName = ceryName;
	}
	@Override
	public String toString() {
		return "Certiicate [ceryId=" + ceryId + ", ceryName=" + ceryName + "]";
	}
}
