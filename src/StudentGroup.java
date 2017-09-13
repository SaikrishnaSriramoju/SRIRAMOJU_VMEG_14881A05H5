import java.util.Date;
import java.util.*;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {

		return this.students;
		// Add your implementation here
	
	}

	@Override
	public void setStudents(Student[] students) {
  if(students==null){throw new IllegalArgumentException();}
  this.students=students;}
   
		// Add your implementation here
	

	@Override
	public Student getStudent(int index) {
		

		if(index<0||index>=this.students.length)
		{
			throw new IllegalArgumentException();
		}
		
		
		 
		// Add 

		// Add your implementation here
		return this.students[index];
	}

	@Override
	public void setStudent(Student student, int index) {

		if(student==null||index<0||index>=this.students.length)
			{
			throw new IllegalArgumentException();
			}
			this.students[index]=student;
	

		// Add 
		
		// Add your implementation here
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here

			
				if(student==null)
				{
				throw new IllegalArgumentException();
				}
				/*Student[] r=new Student[students.length+1];
				r[0]=student;
				for(int i=1;i<=r.length-1;i++)
					{
						r[i]=students[i-1];
					}
				students=Arrays.copyOf(r, r.length);*/
				ArrayList<Student> al=new ArrayList<Student>();
				al.add(student);
				for(int i=0;i<=students.length-1;i++){al.add(getStudent(i));}
this.students=al.toArray(new Student[al.size()]);


			
		
		 
	}

	@Override
	public void addLast(Student student) {

				if(student==null)
				{
				throw new IllegalArgumentException();
				}
				/*Student[] r=new Student[students.length+1];
				r[r.length-1]=student;
				for(int i=0;i<this.students.length;i++)
					{
						r[i]=students[i];
					}
				students=Arrays.copyOf(r, r.length);*/
				ArrayList<Student> al=new ArrayList<Student>();
				
				for(int i=0;i<=students.length-1;i++){al.add(getStudent(i));}
				al.add(student);
this.students=al.toArray(new Student[al.size()]);
			
		  

		// Add your implementation here
	}

	@Override
	public void add(Student student, int index) {
		
		if(index<0||index>=this.students.length||student==null)
		{
			throw new IllegalArgumentException();
		}

/*	Student[] r=new Student[students.length+1];
	for(int i=0;i<r.length-1;i++)
					{
						if(i!=index)
						{
							r[i]=students[i];
						}
						else{r[i]=student;}
					}//for
				students=Arrays.copyOf(r, r.length);*/
				ArrayList<Student> al=new ArrayList<Student>();
for(int i=0;i<this.students.length;i++)
					{
						if(i!=index)
						{
							al.add(getStudent(i));
						}
						else{al.add(student);}
					}//for
this.students=al.toArray(new Student[al.size()]);



		




		// Add your implementation here
	}

	@Override
	public void remove(int index) {


		

		if(index<0||index>=this.students.length)
		{
			throw new IllegalArgumentException();
		}

	/*Student[] r=new Student[students.length-1];
	for(int i=0;i<r.length-1;i++)
					{
						if(i!=index)
						{
							r[i]=students[i];
						}
						else{i--;}
					}//for
				students=Arrays.copyOf(r, r.length);*/
					ArrayList<Student> al=new ArrayList<Student>();
				for(int i=0;i<this.students.length;i++)
					{
						if(i!=index)
						{
							al.add(getStudent(i));
						}
						
					}//for
this.students=al.toArray(new Student[al.size()]);




		



		// Add your implementation here
	}

	@Override
	public void remove(Student student) {


	

		if(student==null)
		{
			throw new IllegalArgumentException();
		}

	/*Student[] r=new Student[students.length-1];
	for(int i=0;i<r.length-1;i++)
					{
						if(students[i]!=student)
						{
							al.add(students[i]);
						}
						
					}//for
				students=Arrays.copyOf(r, r.length);*/
					
						ArrayList<Student> al=new ArrayList<Student>();
				for(int i=0;i<this.students.length;i++)
					{
						if(students[i]!=student)
						{
							al.add(getStudent(i));
						}
						
					}//for
this.students=al.toArray(new Student[al.size()]);






		
		






		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
			

		if(index<0||index>=this.students.length)
		{
			throw new IllegalArgumentException();
		}
if(index==0)
				{
				/*Student[] r=new Student[1];
				r[0]=students[0];
				students=Arrays.copyOf(r, r.length);
				} 

	else{
		Student[] r=new Student[index+1];
			for(int i=0;i<r.length-1;i++)
					{
					
						
							r[i]=students[i];
					}
				students=Arrays.copyOf(r, r.length);*/
					ArrayList<Student> al=new ArrayList<Student>();
				for(int i=0;i<this.students.length;i++)
					{
						if(i!=index)
						{
							al.add(getStudent(i));
							
						}else{al.add(getStudent(i));
						break;}
						
					}//for
this.students=al.toArray(new Student[al.size()]);



	}


		
		




		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
	
			if(student==null)
		{
			throw new IllegalArgumentException();
		}
	/*	int index=0;

	
		for(int i=0;i<students.length;i++)
		{
			if(this.students[i]==student)
			{index=i;
			break;
			}
		}
		removeFromIndex(index);
	}*/

	ArrayList<Student> al=new ArrayList<Student>();
				for(int i=0;i<this.students.length;i++)
					{
						if(students[i]!=student)
						{
							al.add(getStudent(i));
						}
						else{al.add(getStudent(i));
						break;}
						
					}//for
this.students=al.toArray(new Student[al.size()]);
	}





		// Add your implementation here
	

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}
	@Override
	public void bubbleSort() {
		Student temp;
		for(int i=0;i<students.length;i++)
		{
			for(int j=0;j<students.length-i-1;j++)
			{
				if(students[j].getId() > students[j+1].getId())
				{
					temp=students[j];
					students[j]=students[j+1];
					students[j+1]=temp;
				}
			}
		}
		// Add your implementation here
	}

//	@Override
	public Student[] getByBirthDate(Date date) {
		if(date==null){throw new IllegalArgumentException("NULL");}
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
if(firstDate==null || lastDate==null){throw new IllegalArgumentException("NULL");}
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		if(date==null){throw new IllegalArgumentException("NULL");}
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		if(indexOfStudent==0){throw new IllegalArgumentException("NULL");}
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		if(age==0){throw new IllegalArgumentException("NULL");}
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		if(student==null){throw new IllegalArgumentException("NULL");}

		for(int i=0;i<students.length;i++)
		{

	if(students[i]==student){return students[i+1];}
			

		}// Add your implementation here

		return null;
	}
}
