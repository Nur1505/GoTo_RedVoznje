package BO;

public class Provjera {

	public Provjera()
	{}
	public int vracaBrojOdStringa (String string)
	{
		int broj;
		if(string.contentEquals("1"))
		{
			broj=1;
		}else if(string.contentEquals("2"))
		{
			broj=2;
		}else if(string.contentEquals("3"))
		{
			broj=3;
		}else if(string.contentEquals("4"))
		{
			broj=4;
		}else if(string.contentEquals("5"))
		{
			broj=5;
		} else if(string.contentEquals("6"))
		{
			broj=6;
		}else if(string.contentEquals("7"))
		{
			broj=7;
		}else if(string.contentEquals("8"))
		{
			broj=8;
		}else if(string.contentEquals("9"))
		{
			broj=9;
		}else 
		{
			broj=10;
		} 
		
		return broj;
	}
}
