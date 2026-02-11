package Override;

public class EncapSample {
	
	private int salary;
	private String name;
	
	public void setter(String name, int salary)
		{
			this.name=name;
			this.salary=salary;
		}
		public void getter()
		{
			System.out.println(name);
			int incentive=1200;
			salary=incentive+salary;
			System.out.println(salary);
		}
	}

	
