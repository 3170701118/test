package test;
public  class Calculator{
	private static int result;
	public void add(int n){ result = result +n;}
	public void substract(int n){result = result - 1;}//�����BUG��Ӧ��Ϊresult = result - n;
	public void dimultiply(int n){ }//������δд��
	public void divide(int n){ result = result / n;}
	public void square(int n){result = n * n;}
	public void squareRoot(int n){ for(;)}//bug ��ѭ��}
	public void clear(){ 
		result = 0;
		}//���������
	public Object getresult() {
		return result;
	}
	}
	
