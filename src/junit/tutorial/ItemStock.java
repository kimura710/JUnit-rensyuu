package junit.tutorial;

public interface ItemStock {
	/* 商品と数量を指定して追加
	 * @param item 商品名
	 * @param num 追加する数量
	 */
	public void add(String item,int num);
	
	/*
	 * 商品をして、商品の在庫数を返す
	 * @param item 商品名
	 * @return 在庫数、登録されていない場合は0
	 */
	public int size(String item);
	
	/*商品の在庫が残っている場合にtrueを返す
	 * @param item 商品名
	 * @return 在庫が1以上の場合にtrue
	 */
	public boolean contains(String item);

}
