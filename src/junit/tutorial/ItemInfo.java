package junit.tutorial;

public class ItemInfo {
	private String id;
	private String name;
	private int stockNum;
	
	public ItemInfo() {
		this.setId("");
		this.setName("");
		this.setStockNum(0);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStockNum() {
		return stockNum;
	}

	public void setStockNum(int stockNum) {
		this.stockNum = stockNum;
	}

}
