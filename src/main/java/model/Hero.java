package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "heroes")
public class Hero implements Serializable {

	private static final long serialVersionUID = 1L;

	public Hero(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	@Id
	@Column
	private Integer id;
	@Column
	private String name;
	@Column
	private String power;
	@Column
	private Integer age;

}