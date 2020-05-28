package test;
public  class Calculator{
	private static int result;
	public void add(int n){ result = result +n;}
	public void substract(int n){result = result - 1;}//故意的BUG，应该为result = result - n;
	public void dimultiply(int n){ }//假设尚未写好
	public void divide(int n){ result = result / n;}
	public void square(int n){result = n * n;}
	public void squareRoot(int n){ for(;)}//bug 死循环}
	public void clear(){ 
		result = 0;
		}//将结果清零
	public Object getresult() {
		return result;
	}
	}
	
