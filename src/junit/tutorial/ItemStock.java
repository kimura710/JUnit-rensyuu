package junit.tutorial;

public interface ItemStock {
	/* ���i�Ɛ��ʂ��w�肵�Ēǉ�
	 * @param item ���i��
	 * @param num �ǉ����鐔��
	 */
	public void add(String item,int num);
	
	/*
	 * ���i�����āA���i�̍݌ɐ���Ԃ�
	 * @param item ���i��
	 * @return �݌ɐ��A�o�^����Ă��Ȃ��ꍇ��0
	 */
	public int size(String item);
	
	/*���i�̍݌ɂ��c���Ă���ꍇ��true��Ԃ�
	 * @param item ���i��
	 * @return �݌ɂ�1�ȏ�̏ꍇ��true
	 */
	public boolean contains(String item);

}
