package com.crumbs.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created by low on 2/2/17 11:34 PM.
 */
@Table (name = "tx_sent")
@Entity
@Getter
@Setter
public class TxSent implements Serializable {

	@Id
	String uuid;
	BigInteger price;
	String item;
	int quantity;
	Date expiry;
	boolean isSell;
	@ManyToOne
	@JoinColumn(name = "member")
	Member accepter;
	BigInteger transportPrice;
	boolean pending;
}