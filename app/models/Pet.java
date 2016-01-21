package models;

import play.db.jpa.GenericModel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import java.util.Date;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
public class Pet extends GenericModel {
  @Id
  @SequenceGenerator(name="jug.ru", allocationSize=1)
  @GeneratedValue(strategy= SEQUENCE, generator="jug.ru")
  public Long id;
  
  public String name;
  public Date birthDate;
  public Date infectedAt;

  public Pet(String name) {
    this.name = name;
  }
}
