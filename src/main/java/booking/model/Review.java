package booking.model;

import java.io.Serializable;
import java.util.Date;

public class Review implements Serializable {
    private int id;
    private String content;
    private int rating;
    private Date createAt;

    public Review(){
        super();
    }

    public Review(int id, String content, int rating, Date createAt) {
        this.id = id;
        this.content = content;
        this.rating = rating;
        this.createAt = createAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}
