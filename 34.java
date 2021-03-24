import java.io.*;
import java.util.*;
class Circle implements Serializable
{
	double id=0;
	double radius=0,area=0;
	Circle()
	{
		this.id=0;
		this.radius=0;
	}
	Circle(double i,double r)
	{
		this.id=i;
		this.radius=r;
	}
	void setID(double i)
	{
		this.id=i;
	}
	double getID()
	{
		return(this.id);
	}
	void setRadius(double r)
	{
		this.radius=r;
	}
	double getRadius()
	{
		return(this.radius);
	}
	double getArea()
	{
		area = Math.PI * (radius * radius);
		return (area);
	}
	public String toString()
	{		
		return (""+id+"\t"+radius+"\t"+getArea());
	}	 
	public void getData() throws Exception
	{
		DataInputStream in=new DataInputStream(System.in);
		System.out.print("ID.    :  ");
		id=Double.parseDouble(in.readLine());
		System.out.print("Radius :  ");
		radius=Double.parseDouble(in.readLine());		
	}
}

class demo 
{
	public static void main(String args[]) throws Exception
	{
			DataInputStream in=new DataInputStream(System.in);
			String filename="file.data";
			int limit=0,option=0;
			ArrayList<Circle> objects=new ArrayList<Circle>();
			while(option!=5)
			{
				System.out.println("1. Add new record");
				System.out.println("2. Display record(s)");
				System.out.println("3. Search a record");
				System.out.println("4. Delete a record");
				System.out.println("5. exit");
				System.out.println("\n");
				System.out.print("Enter Your Choice :  ");
				option=Integer.parseInt(in.readLine());
	
				switch(option)
				{
					case 1:						 
						System.out.print("\nEnter the record \n");
						Circle s= new Circle();						 
						s.getData();
						objects.add(s);						 
						writeObjectsToFile(filename,objects);
						System.out.println("\n Record successfully saved..... \n ");
						break;
					case 2:
						System.out.println("\n\n");
						objects=readObjectsFromFile(filename);
						System.out.println(".........................................");
						System.out.println("id\tR\tarea");
						System.out.println(".........................................");	
						for(Object object : objects)
						{
							System.out.println(object.toString());
						}
						System.out.println(".........................................\n\n");
						break;
					case 3:
						boolean found_flag=false;
						double search;
						System.out.print("\n Enter circle id to search a record :  \n ");
						search=Double.parseDouble(in.readLine());
						objects=readObjectsFromFile(filename);
						System.out.println(".........................................");
						System.out.println("id\tR\tarea");
						System.out.println(".........................................");
						
						for(Object object : objects)
						{
							if(((Circle)object).getID()==search)
							{
								System.out.println(object.toString());
								found_flag=true;
								break;
							}
						}
						System.out.println(".........................................\n\n");
						if(found_flag==false)
						{
							System.out.print("Record not found....");
						}
						break;
					case 4:
						double delete;
						boolean delete_flag=false;
						System.out.print("Enter a circle id to delete a record :  ");
						delete=Integer.parseInt(in.readLine());
						objects=readObjectsFromFile(filename);
						int delete_index=0;
						for(Object object : objects)
						{
							if(((Circle)object).getID()==delete)
							{
								delete_flag=true;
								break;
							}
							delete_index++;
						}
						if(delete_flag==true)
						{
							objects.remove(delete_index);
							writeObjectsToFile(filename,objects);
							System.out.println("\n Record deleted...\n");
						}
						else
						{
							System.out.println("Record not found...");
						}
						break;
					case 5:
						System.out.println("\n You are exited from program..\n ");
						break;
					default:
						System.out.println("\nInvalid Option........... \n");
						break;
				}
				
			}
	}
	private static void writeObjectsToFile(String filename,ArrayList<Circle> objects)
	{
		try
		{
			FileOutputStream fos=new FileOutputStream(filename);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			for(Object object:objects)
			{
				oos.writeObject(object);
			}
			oos.flush();
			oos.close();
			fos.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static ArrayList<Circle> readObjectsFromFile(String filename) throws Exception
	{
		ArrayList<Circle> objects=new ArrayList<Circle>();
		FileInputStream fis=new FileInputStream(filename);
		ObjectInputStream ois =new ObjectInputStream(fis);				
		while(true)
		{
			try
			{						
				Circle object=(Circle)ois.readObject();
				objects.add(object);
			}
			catch(Exception e)
			{
				break;
			}
		}
		ois.close();
		fis.close();
		return objects;
	}
}