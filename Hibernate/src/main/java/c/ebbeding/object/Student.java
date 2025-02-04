package c.ebbeding.object;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Student {

	@Id
	private int id;
	private String name;
	private Certiicate cery;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Certiicate getCery() {
		return cery;
	}
	public void setCery(Certiicate cery) {
		this.cery = cery;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", cery=" + cery + "]";
	}
	
}
