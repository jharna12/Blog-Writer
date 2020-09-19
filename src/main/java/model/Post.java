package model;
import javax.persistence.*;
import java.time.Instant;
@Entity
@Table
public class Post {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
@Column
private String title;
@Lob
@Column
 private String content;
@Column
private Instant createdOn;
@Column
private Instant updatedOn;
@Column
private String username;
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}

}
