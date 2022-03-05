package assign4th;
class Student{
	String name;
	int roll;
	String phone;
	String address;
	public Student(String name, int roll, String phone, String address) {
		super();
		this.name = name;
		this.roll = roll;
		this.phone = phone;
		this.address = address;
	}
	void show() {
		System.out.println("Name: "+name);
		System.out.println("Roll: "+roll);
		System.out.println("Mobile: "+phone);
		System.out.println("Address: "+address);
	}
	
}
class Employee{
	String name;
	int empId;
	public Employee(String name, int empId) {
		super();
		this.name = name;
		this.empId = empId;
	}
	public void show() {
		System.out.println("Employee id = " + empId);
		System.out.println("Employee name = " + name);
	}
}
public class feb_18 {
	public static void main(String[] args) {
		
		Student student1=new Student("John", 10,"9164642344","bangalore");
		Student student2=new Student("Sam", 8,"9964415126","mandya");
		student1.show();
		student2.show();
		
		Employee emp[]=new Employee[4];
		emp[0]=new Employee("Ram", 123);
		emp[1]=new Employee("Sam", 456);
		emp[2]=new Employee("John", 784);
		emp[3]=new Employee("Rock", 869);
		
		for(Employee employee:emp) {
			employee.show();
		}

	}	
	public static int[] sortWithTwoPointer(int[] arr) {
		int low=0,high=arr.length-1;
		while(low<=high){
			if(low==0 && high==1) {
				low++;high--;
			}else if(arr[low]==1 && arr[high]==0) {
				int temp=arr[high];
				arr[high]=arr[low];
				arr[low]=temp;
				low++;high--;
			}else if(arr[low]==0 && arr[high]==0){
				low++;
			}else {
				high--;
			}
		}
		return arr;
	}
	
	

	private static int[] sortWithCount(int[] arr) {
		int count0=0,count1=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				count0++;
			}else {
				count1++;
			}
		}
		for(int i=0;i<count0;i++) {
			arr[i]=0;
		}
		for(int i=count0;i<arr.length;i++) {
			arr[i]=1;
		}
		return arr;
	}
}

