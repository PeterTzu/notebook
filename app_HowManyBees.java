package practise;
/* 
 * 不死母蜂一年生一隻公蜂，每隻公蜂一年生一隻普通的母蜂和一個公蜂後就死掉，
 * 普通的母蜂一年生一隻公蜂後死掉。現在在一個只有一隻不死母蜂的實驗環境下，
 * Input N年，Output 公蜂有幾隻、總共有幾隻蜜蜂？
 * qu 1yr ma++
 * ma 1yr ma++fe++ma--
 * fe 1yr ma++fe--
 */
public class app_HowManyBees //2018.6.1
{

	public static void main(String[] args) 
	{	int queen=1,year=2,male=0,female=0;
		solve(1,2,0,0);
	}
	public static void solve(int queen,int yr,int male,int female)
	{		
		if(yr==0)
		{	int total=queen+male+female;
			System.out.println("queen:"+queen+" male:"+male+" female:"+female);}
		
		else 
		{	int newmale=queen*1+female*1+male;
			int newfemale=male*1-female*1+female;
			
			solve(queen,--yr,newmale,newfemale);}
	}

}
