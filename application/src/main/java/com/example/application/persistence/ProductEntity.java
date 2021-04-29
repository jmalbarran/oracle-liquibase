package com.example.application.persistence;
import javax.persistence.*;

@Entity
@Table(name="Product")
public class ProductEntity {
	@Id
	@SequenceGenerator(name = "ProductSequence", sequenceName = "Product_Seq", allocationSize=1)
	@GeneratedValue(generator = "ProductSequence", strategy = GenerationType.AUTO)
	private long id;

	private String name;

	public ProductEntity() {
	}

	public ProductEntity(String name) {
		this.name=name;
	}

	public void setId(long id) {
		this.id=id;
	}

	public long getId() {
		return this.id;
	}

	public void setName(String name) {
		this.name=name;
	}

	public String getName() {
		return this.name;
	}

}
