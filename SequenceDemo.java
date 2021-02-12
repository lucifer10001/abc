package day_5;
interface Sequence{
	int ini=1;
	int next();
}
class RandomSeq implements Sequence{

	@Override
	public int next() {
		// TODO Auto-generated method stub
		int test=(int) (Math.random()*10);
		return test;
	}
	
}
class IncrementSeq implements Sequence{
	int initial=1;
	@Override
	public int next() {
		// TODO Auto-generated method stub
		System.out.print(ini++);
		return initial++;
	}
	
}
class EvenSeq implements Sequence{
	int initial=1;
	@Override
	public int next() {
		int res=initial*2;
		// TODO Auto-generated method stub
		initial++;
		return res;
	}
	
}
public class SequenceDemo {

	public static void main(String[] args) {
		RandomSeq ran=new RandomSeq();
		System.out.println(ran.next());
		
		
		EvenSeq ran1=new EvenSeq();
		System.out.println(ran1.next());
		System.out.println(ran1.next());
		System.out.println(ran1.next());
		System.out.println(ran1.next());
		
		
		IncrementSeq inc=new IncrementSeq();
		System.out.println(inc.next());
		System.out.println(inc.next());
		System.out.println(inc.next());
		System.out.println(inc.next());
		System.out.println(inc.next());
	}

}
