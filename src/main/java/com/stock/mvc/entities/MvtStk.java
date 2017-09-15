package com.stock.mvc.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class MvtStk implements Serializable {
	
	public static final int ENTREE =1;
	public static final int SORTIE =2;
	
	
	@Id @GeneratedValue
	private long idMvtStk;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateMvt;
	private int typeMvt;
	@ManyToOne
	@JoinColumn(name="idArticle")
	private Article article;
	public long getIdMvtStk() {
		return idMvtStk;
	}
	public void setIdMvtStk(long idMvtStk) {
		this.idMvtStk = idMvtStk;
	}
	public Date getDateMvt() {
		return dateMvt;
	}
	public void setDateMvt(Date dateMvt) {
		this.dateMvt = dateMvt;
	}
	public int getTypeMvt() {
		return typeMvt;
	}
	public void setTypeMvt(int typeMvt) {
		this.typeMvt = typeMvt;
	}
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	
}
