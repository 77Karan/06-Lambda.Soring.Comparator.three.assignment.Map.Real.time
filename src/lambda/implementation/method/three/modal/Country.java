package lambda.implementation.method.three.modal;

public class Country 
{
	private String cName;
	private Integer cCode;
	private long cPhnum;
	
	public Country(String cName, Integer cCode, long cPhnum) 
	{
		this.cName = cName;
		this.cCode = cCode;
		this.cPhnum = cPhnum;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public Integer getcCode() {
		return cCode;
	}

	public void setcCode(Integer cCode) {
		this.cCode = cCode;
	}

	public long getcPhnum() {
		return cPhnum;
	}

	public void setcPhnum(long cPhnum) {
		this.cPhnum = cPhnum;
	}

	@Override
	public String toString() {
		return "Country [cName=" + cName + ", cCode=" + cCode + ", cPhnum=" + cPhnum + "]";
	}
	
	
	
	

}
