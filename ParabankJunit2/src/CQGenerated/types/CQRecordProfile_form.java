package CQGenerated.types;
import CQGenerated.utilities.*;
public class CQRecordProfile_form implements CQJSONizeable {
public CQRecordProfile_form(){}

public CQRecordProfile_form(String First_Name,String First_Name_textbox_Status,String Last_Name,String Last_Name_textbox_Status,String Address,String Address_textbox_Status,String City,String City_textbox_Status,String State,String State_textbox_Status,String Zip_Code,String Zip_Code_textbox_Status,String Phone,String Phone_textbox_Status)
	{
		this.First_Name = First_Name;

		this.First_Name_textbox_Status = First_Name_textbox_Status;

		this.Last_Name = Last_Name;

		this.Last_Name_textbox_Status = Last_Name_textbox_Status;

		this.Address = Address;

		this.Address_textbox_Status = Address_textbox_Status;

		this.City = City;

		this.City_textbox_Status = City_textbox_Status;

		this.State = State;

		this.State_textbox_Status = State_textbox_Status;

		this.Zip_Code = Zip_Code;

		this.Zip_Code_textbox_Status = Zip_Code_textbox_Status;

		this.Phone = Phone;

		this.Phone_textbox_Status = Phone_textbox_Status;

	}
 	public String First_Name;
	public String getFirst_Name()
	{
		return this.First_Name;
	}

	public void  setFirst_Name(String First_Name)
	{
		this.First_Name = First_Name;
	}
 	public String First_Name_textbox_Status;
	public String getFirst_Name_textbox_Status()
	{
		return this.First_Name_textbox_Status;
	}

	public void  setFirst_Name_textbox_Status(String First_Name_textbox_Status)
	{
		this.First_Name_textbox_Status = First_Name_textbox_Status;
	}
 	public String Last_Name;
	public String getLast_Name()
	{
		return this.Last_Name;
	}

	public void  setLast_Name(String Last_Name)
	{
		this.Last_Name = Last_Name;
	}
 	public String Last_Name_textbox_Status;
	public String getLast_Name_textbox_Status()
	{
		return this.Last_Name_textbox_Status;
	}

	public void  setLast_Name_textbox_Status(String Last_Name_textbox_Status)
	{
		this.Last_Name_textbox_Status = Last_Name_textbox_Status;
	}
 	public String Address;
	public String getAddress()
	{
		return this.Address;
	}

	public void  setAddress(String Address)
	{
		this.Address = Address;
	}
 	public String Address_textbox_Status;
	public String getAddress_textbox_Status()
	{
		return this.Address_textbox_Status;
	}

	public void  setAddress_textbox_Status(String Address_textbox_Status)
	{
		this.Address_textbox_Status = Address_textbox_Status;
	}
 	public String City;
	public String getCity()
	{
		return this.City;
	}

	public void  setCity(String City)
	{
		this.City = City;
	}
 	public String City_textbox_Status;
	public String getCity_textbox_Status()
	{
		return this.City_textbox_Status;
	}

	public void  setCity_textbox_Status(String City_textbox_Status)
	{
		this.City_textbox_Status = City_textbox_Status;
	}
 	public String State;
	public String getState()
	{
		return this.State;
	}

	public void  setState(String State)
	{
		this.State = State;
	}
 	public String State_textbox_Status;
	public String getState_textbox_Status()
	{
		return this.State_textbox_Status;
	}

	public void  setState_textbox_Status(String State_textbox_Status)
	{
		this.State_textbox_Status = State_textbox_Status;
	}
 	public String Zip_Code;
	public String getZip_Code()
	{
		return this.Zip_Code;
	}

	public void  setZip_Code(String Zip_Code)
	{
		this.Zip_Code = Zip_Code;
	}
 	public String Zip_Code_textbox_Status;
	public String getZip_Code_textbox_Status()
	{
		return this.Zip_Code_textbox_Status;
	}

	public void  setZip_Code_textbox_Status(String Zip_Code_textbox_Status)
	{
		this.Zip_Code_textbox_Status = Zip_Code_textbox_Status;
	}
 	public String Phone;
	public String getPhone()
	{
		return this.Phone;
	}

	public void  setPhone(String Phone)
	{
		this.Phone = Phone;
	}
 	public String Phone_textbox_Status;
	public String getPhone_textbox_Status()
	{
		return this.Phone_textbox_Status;
	}

	public void  setPhone_textbox_Status(String Phone_textbox_Status)
	{
		this.Phone_textbox_Status = Phone_textbox_Status;
	}
	public boolean equals(Object other)
	{
    
		if (other == null)
		{
    
			return false;
		}
		if (!(other instanceof CQRecordProfile_form))
		{
    
			return false;

		}
		CQRecordProfile_form otherRec = (CQRecordProfile_form) other;
		if (!CQEquals.equals(this.First_Name, otherRec.First_Name))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.First_Name_textbox_Status, otherRec.First_Name_textbox_Status))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Last_Name, otherRec.Last_Name))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Last_Name_textbox_Status, otherRec.Last_Name_textbox_Status))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Address, otherRec.Address))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Address_textbox_Status, otherRec.Address_textbox_Status))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.City, otherRec.City))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.City_textbox_Status, otherRec.City_textbox_Status))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.State, otherRec.State))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.State_textbox_Status, otherRec.State_textbox_Status))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Zip_Code, otherRec.Zip_Code))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Zip_Code_textbox_Status, otherRec.Zip_Code_textbox_Status))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Phone, otherRec.Phone))
		{
    
			return false;

		}
		if (!CQEquals.equals(this.Phone_textbox_Status, otherRec.Phone_textbox_Status))
		{
    
			return false;

		}
		return true;
	}
	public String jsonize()
	{
    
		return jsonize("");

	}
	public String jsonize(String indent)
	{
    
		StringBuffer sb = new StringBuffer();
		sb.append("\n" + indent + "{\n");
		sb.append(indent + "    " + "\"First_Name\": ");
		sb.append(CQJSONize.jsonize(First_Name, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"First_Name_textbox_Status\": ");
		sb.append(CQJSONize.jsonize(First_Name_textbox_Status, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Last_Name\": ");
		sb.append(CQJSONize.jsonize(Last_Name, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Last_Name_textbox_Status\": ");
		sb.append(CQJSONize.jsonize(Last_Name_textbox_Status, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Address\": ");
		sb.append(CQJSONize.jsonize(Address, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Address_textbox_Status\": ");
		sb.append(CQJSONize.jsonize(Address_textbox_Status, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"City\": ");
		sb.append(CQJSONize.jsonize(City, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"City_textbox_Status\": ");
		sb.append(CQJSONize.jsonize(City_textbox_Status, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"State\": ");
		sb.append(CQJSONize.jsonize(State, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"State_textbox_Status\": ");
		sb.append(CQJSONize.jsonize(State_textbox_Status, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Zip_Code\": ");
		sb.append(CQJSONize.jsonize(Zip_Code, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Zip_Code_textbox_Status\": ");
		sb.append(CQJSONize.jsonize(Zip_Code_textbox_Status, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Phone\": ");
		sb.append(CQJSONize.jsonize(Phone, indent + "    "));
		sb.append(",\n");
		sb.append(indent + "    " + "\"Phone_textbox_Status\": ");
		sb.append(CQJSONize.jsonize(Phone_textbox_Status, indent + "    "));
		sb.append("\n");
		sb.append(indent + "}");
		return sb.toString();

	}

}