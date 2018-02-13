
public class StockMarket {
	public static void main(String[] args)
	{
		ReadFiles r = new ReadFiles();
		//System.out.println(r.checkIsFile());
		//System.out.println(r.findRowNumber());
		r.convertToArray();
		r.ptinyArray();
	}
}
