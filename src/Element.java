public class Element {
	private String rf;
	private String k;
	private String t;
	private String v;

	public String toString() {
		return "Element [ref=" + rf + ", key=" + k + ", tag=" + t + ", value=" + v + "]";
	}

	public Element(String rf, String k, String t, String v) {
		this.rf = rf;
		this.k = k;
		this.t = t;
		this.v = v;
	}

	public String getRf() {
		return rf;
	}

	public void setRf(String rf) {
		this.rf = rf;
	}

	public String getK() {
		return k;
	}

	public void setK(String k) {
		this.k = k;
	}

	public String getT() {
		return t;
	}

	public void setT(String t) {
		this.t = t;
	}

	public String getV() {
		return v;
	}

	public void setV(String v) {
		this.v = v;
	}

}