package hojinClass.domain;

import java.sql.Timestamp;

import org.apache.ibatis.type.Alias;

@Alias("ClassVO")
public class ClassVO {
	private int SEQ;
	private String NICKNAME;
	private String TITLE;
	private String INTRO;
	private String CURR1IMG;
	private String CURR1CONT;
	private String CURR2IMG;
	private String CURR2CONT;
	private String CURR3IMG;
	private String CURR3CONT;
	private String MENTOR;
	private String ITEM;
	private String PLACE;
	private int CNT;
	private Timestamp CLS_DATE;
	
	public ClassVO() {}
	
	public ClassVO(String NICKNAME,String TITLE,String INTRO,String CURR1IMG,String CURR1CONT
			,String CURR2IMG,String CURR2CONT,String CURR3IMG,String CURR3CONT,String MENTOR,String ITEM,String PLACE) {
		super();
		this.NICKNAME = NICKNAME;
		this.TITLE = TITLE;
		this.INTRO = INTRO;
		this.CURR1IMG = CURR1IMG;
		this.CURR1CONT = CURR1CONT;
		this.CURR2IMG = CURR2IMG;
		this.CURR2CONT = CURR2CONT;
		this.CURR3IMG = CURR3IMG;
		this.CURR3CONT = CURR3CONT;
		this.MENTOR = MENTOR;
		this.ITEM = ITEM;
		this.PLACE = PLACE;
		this.CNT = 0;
	}
	public int getSEQ() {
		return SEQ;
	}
	public void setSEQ(int sEQ) {
		SEQ = sEQ;
	}
	public String getNICKNAME() {
		return NICKNAME;
	}
	public void setNICKNAME(String nICKNAME) {
		NICKNAME = nICKNAME;
	}
	public String getTITLE() {
		return TITLE;
	}
	public void setTITLE(String tITLE) {
		TITLE = tITLE;
	}
	public String getINTRO() {
		return INTRO;
	}
	public void setINTRO(String iNTRO) {
		INTRO = iNTRO;
	}
	public String getCURR1IMG() {
		return CURR1IMG;
	}
	public void setCURR1IMG(String cURR1IMG) {
		CURR1IMG = cURR1IMG;
	}
	public String getCURR1CONT() {
		return CURR1CONT;
	}
	public void setCURR1CONT(String cURR1CONT) {
		CURR1CONT = cURR1CONT;
	}
	public String getCURR2IMG() {
		return CURR2IMG;
	}
	public void setCURR2IMG(String cURR2IMG) {
		CURR2IMG = cURR2IMG;
	}
	public String getCURR2CONT() {
		return CURR2CONT;
	}
	public void setCURR2CONT(String cURR2CONT) {
		CURR2CONT = cURR2CONT;
	}
	public String getCURR3IMG() {
		return CURR3IMG;
	}
	public void setCURR3IMG(String cURR3IMG) {
		CURR3IMG = cURR3IMG;
	}
	public String getCURR3CONT() {
		return CURR3CONT;
	}
	public void setCURR3CONT(String cURR3CONT) {
		CURR3CONT = cURR3CONT;
	}
	public String getMENTOR() {
		return MENTOR;
	}
	public void setMENTOR(String mENTOR) {
		MENTOR = mENTOR;
	}
	public String getITEM() {
		return ITEM;
	}
	public void setITEM(String iTEM) {
		ITEM = iTEM;
	}
	public String getPLACE() {
		return PLACE;
	}
	public void setPLACE(String pLACE) {
		PLACE = pLACE;
	}
	public int getCNT() {
		return CNT;
	}
	public void setCNT(int cNT) {
		CNT = cNT;
	}
	public Timestamp getCLS_DATE() {
		return CLS_DATE;
	}
	public void setCLS_DATE(Timestamp cLS_DATE) {
		CLS_DATE = cLS_DATE;
	}
	
	
}
