public abstract class StaffMember
{
protected String name;
protected String address;
protected String phone;
//-----------------------------------------------------------------
// Sets up a staff member using the specified information.
//-----------------------------------------------------------------
public StaffMember (String eName, String eAddress, String ePhone)
{
name = eName;
address = eAddress;
phone = ePhone;
}
}