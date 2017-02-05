package com.crumbs.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;

/**
 * Created by low on 2/2/17 11:34 PM.
 */
@Table (name = "transaction")
@Entity
@Getter
@Setter
public class Transactions implements Serializable {

	@Id
	String uuid;
	BigInteger price;
	String item;
	int quantity;
	boolean isSell;
	@ManyToOne
	@JoinColumn(name = "member")
	Member accepter;
	BigInteger transportPrice;
	boolean pending;
}
