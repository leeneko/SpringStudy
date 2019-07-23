package com.spring.model;

public class Hr {
	String CO_CD;	// CO_CD	nvarchar(30)	private,	not null
	String CO_NM;	// CO_NM	nvarchar(100)
	String CO_ENM;	// CO_ENM	nvarchar(100)
	String CEO_NM;	// CEO_NM	varchar(50)
	String CO_NO;	// CO_NO	nvarchar(50)
	String CO_DT;	// CO_DT	nvarchar(20)
	String FR_DT;	// FR_DT	nvarchar(20)
	String TO_DT;	// TO_DT	nvarchar(20)
	String NAT_CD;	// NAT_CD	nvarchar(10)
	String BIZ_BC;	// BIZ_BC	nvarchar(10)
	int CAPITAL_AMT;	// CAPITAL_AMT	int
	String LOGO;	// LOGO	nvarchar(500)
	String STAMP;	// STAMP	nvarchar(500)
	String STAMP_TRADE;	// STAMP_TRADE	nvarchar(500)
	String RMKS;	// RMKS	nvarchar(200)
	String VAT_KD;	// VAT_KD	nvarchar(10)
	String USE_YN;	// USE_YN	nvarchar(1)	not null
	String CID;	// CID	nvarchar(30)
	String CDT;	// CDT	nvarchar(20)
	String MID;	// MID	nvarchar(30)
	String MDT;	// MDT	nvarchar(20)
	public Hr() {
		
	}
	public Hr(String cO_CD, String cO_NM, String cO_ENM, String cEO_NM, String cO_NO, String cO_DT, String nAT_CD) {
		super();
		CO_CD = cO_CD;
		CO_NM = cO_NM;
		CO_ENM = cO_ENM;
		CEO_NM = cEO_NM;
		CO_NO = cO_NO;
		CO_DT = cO_DT;
		NAT_CD = nAT_CD;
	}
	public Hr(String cO_CD, String cO_NM, String cO_ENM, String cEO_NM, String cO_NO, String cO_DT, String fR_DT,
			String tO_DT, String nAT_CD, String bIZ_BC, int cAPITAL_AMT, String lOGO, String sTAMP, String sTAMP_TRADE,
			String rMKS, String vAT_KD, String uSE_YN, String cID, String cDT, String mID, String mDT) {
		super();
		CO_CD = cO_CD;
		CO_NM = cO_NM;
		CO_ENM = cO_ENM;
		CEO_NM = cEO_NM;
		CO_NO = cO_NO;
		CO_DT = cO_DT;
		FR_DT = fR_DT;
		TO_DT = tO_DT;
		NAT_CD = nAT_CD;
		BIZ_BC = bIZ_BC;
		CAPITAL_AMT = cAPITAL_AMT;
		LOGO = lOGO;
		STAMP = sTAMP;
		STAMP_TRADE = sTAMP_TRADE;
		RMKS = rMKS;
		VAT_KD = vAT_KD;
		USE_YN = uSE_YN;
		CID = cID;
		CDT = cDT;
		MID = mID;
		MDT = mDT;
	}
	public String getCO_CD() {
		return CO_CD;
	}
	public void setCO_CD(String cO_CD) {
		CO_CD = cO_CD;
	}
	public String getCO_NM() {
		return CO_NM;
	}
	public void setCO_NM(String cO_NM) {
		CO_NM = cO_NM;
	}
	public String getCO_ENM() {
		return CO_ENM;
	}
	public void setCO_ENM(String cO_ENM) {
		CO_ENM = cO_ENM;
	}
	public String getCEO_NM() {
		return CEO_NM;
	}
	public void setCEO_NM(String cEO_NM) {
		CEO_NM = cEO_NM;
	}
	public String getCO_NO() {
		return CO_NO;
	}
	public void setCO_NO(String cO_NO) {
		CO_NO = cO_NO;
	}
	public String getCO_DT() {
		return CO_DT;
	}
	public void setCO_DT(String cO_DT) {
		CO_DT = cO_DT;
	}
	public String getFR_DT() {
		return FR_DT;
	}
	public void setFR_DT(String fR_DT) {
		FR_DT = fR_DT;
	}
	public String getTO_DT() {
		return TO_DT;
	}
	public void setTO_DT(String tO_DT) {
		TO_DT = tO_DT;
	}
	public String getNAT_CD() {
		return NAT_CD;
	}
	public void setNAT_CD(String nAT_CD) {
		NAT_CD = nAT_CD;
	}
	public String getBIZ_BC() {
		return BIZ_BC;
	}
	public void setBIZ_BC(String bIZ_BC) {
		BIZ_BC = bIZ_BC;
	}
	public int getCAPITAL_AMT() {
		return CAPITAL_AMT;
	}
	public void setCAPITAL_AMT(int cAPITAL_AMT) {
		CAPITAL_AMT = cAPITAL_AMT;
	}
	public String getLOGO() {
		return LOGO;
	}
	public void setLOGO(String lOGO) {
		LOGO = lOGO;
	}
	public String getSTAMP() {
		return STAMP;
	}
	public void setSTAMP(String sTAMP) {
		STAMP = sTAMP;
	}
	public String getSTAMP_TRADE() {
		return STAMP_TRADE;
	}
	public void setSTAMP_TRADE(String sTAMP_TRADE) {
		STAMP_TRADE = sTAMP_TRADE;
	}
	public String getRMKS() {
		return RMKS;
	}
	public void setRMKS(String rMKS) {
		RMKS = rMKS;
	}
	public String getVAT_KD() {
		return VAT_KD;
	}
	public void setVAT_KD(String vAT_KD) {
		VAT_KD = vAT_KD;
	}
	public String getUSE_YN() {
		return USE_YN;
	}
	public void setUSE_YN(String uSE_YN) {
		USE_YN = uSE_YN;
	}
	public String getCID() {
		return CID;
	}
	public void setCID(String cID) {
		CID = cID;
	}
	public String getCDT() {
		return CDT;
	}
	public void setCDT(String cDT) {
		CDT = cDT;
	}
	public String getMID() {
		return MID;
	}
	public void setMID(String mID) {
		MID = mID;
	}
	public String getMDT() {
		return MDT;
	}
	public void setMDT(String mDT) {
		MDT = mDT;
	}
	
}
