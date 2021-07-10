package ma.emsi.cinema.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Film implements Serializable {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
private String titre,realisateur,description,photo;
private double duree;
private Date dateStortie;

@OneToMany(mappedBy = "film")
private Collection<Projection> projections;
@ManyToOne
private Category categorie;
}
