import java.io.*;

class College1

{	private String a,b;private int k;

	boolean check(String s)
	{
		for(int i=0;i<s.length();i++)
			if(s.charAt(i)<48 || s.charAt(i)>57)return true;

			return false;
	}


	College1()
	{
		a="";
		b="";
		k=0;
	}

	void assign(String a,String b,boolean f)
	{
		College1 o=new College1();
		o.a=a;
		o.b=b;
		o.output(f);
	}

	void assign(String a,int k,boolean f)
		{
			College1 o=new College1();
			o.a=a;
			o.k=k;
			o.output(f);
	}

	void output(boolean f)
	{	if(k==0)
		{

			if(f)
			{
				System.out.print(a+ " - ");
				System.out.println(b);
			}
			else
			{
				System.out.print(a);
				System.out.print(b);
			}
		}
		else
		{
			if(f)
				{
					System.out.print(a+ " - ");
					System.out.println(k);
				}
				else
				{
					System.out.print(a);
					System.out.print(k);
				}
		}

	}


}

class Course extends College1

{
	String x,y;boolean f;
	Course(String x,String y,boolean f)
	{
		this.x=x;
		this.y=y;
		this.f=f;
	}

	void relay()
	{
		assign(x,y,f);
	}

}

class Department extends College1

{
	String x,y;boolean f;int k;
		Department(String x,String y,boolean f)
		{
			this.x=x;
			this.y=y;
			this.f=f;
			assign(x,y,f);
		}

		Department(String x,int k,boolean f)
				{
					this.x=x;
					this.k=k;
					this.f=f;

					assign(x,k,f);
				}


}

class Student extends College1

{
	String x,y;boolean f;
		Student(String x,String y,boolean f)
		{
			this.x=x;
			this.y=y;
			this.f=f;
		}

	void relay()
	{
		assign(x,y,f);
	}

}

class TestCollege1
{

	public static void main(String args[])throws IOException

	{
		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name of the College, Department name, code, Course Name,code and Student name and roll no., separating each entry with '|'");

		String s[]=xx.readLine().split("\\|");



		Student o1=new Student(s[5],s[6],true);
		o1.relay();
		Course o2=new Course(s[3],s[4],true);
		o2.relay();
		if(o2.check(s[2])==false)
		{Department o3=new Department(s[1],(Integer.parseInt(s[2])),true);}
		else
		{Department o3=new Department(s[1],s[2],true);}

		o2.assign(s[0],". \n",false);

	}

}


