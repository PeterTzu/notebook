package practise;
/* 
 * ���������@�~�ͤ@�������A�C�������@�~�ͤ@�����q�������M�@�Ӥ�����N�����A
 * ���q�������@�~�ͤ@�������ᦺ���C�{�b�b�@�ӥu���@�������������������ҤU�A
 * Input N�~�AOutput �������X���B�`�@���X���e���H
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
