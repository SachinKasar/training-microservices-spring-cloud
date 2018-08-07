package demo;

/**
 * 'Data' object is nicely represented in JSON over a regular String.
 */
public class Data {

	public String data;

	public Data() {
		super();
	}	
	
	public Data(String data) {
		this();
		this.data = data;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	
}