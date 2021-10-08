package webServer.tongueTwister;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "twister")
public class TongueTwisters {
   @Id
   @GeneratedValue
   @Column(name = "id")
   private Integer id;
   @Column(name = "content")
   private String content;
//   @Column(name = "author")
//   private String author;
//   @Column(name = "title")
//   private String title;

   public TongueTwisters() {
   }

//   public String getAuthor() {
//      return author;
//   }
//
//   public void setAuthor(String author) {
//      this.author = author;
//   }

//   public String getTitle() {
//      return title;
//   }
//
//   public void setTitle(String title) {
//      this.title = title;
//   }

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getContent() {
      return content;
   }

   public void setContent(String content) {
      this.content = content;
   }
}
