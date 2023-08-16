public class Employee2
{
    public String name;
    InsuranceInfo insurance;
    AddressInfo address;

    public Employee2(String name, InsuranceInfo insurance, AddressInfo address)
    {
        this.name = name;
        this.insurance = insurance;
        this.address = address;
    }

    public void dispaly()
    {
        System.out.println(name);
        System.out.println(address.street + " " + address.city + " " + address.state + " " + address.postalCode);
        System.out.println(insurance.policyName + " " + insurance.policyId);
    }

/*    public static void main(String[] args) {
        AddressInfo add1 = new AddressInfo("1025-A,", "Savar,", "Dhaka,", "3605");
        InsuranceInfo insurance1 =  new InsuranceInfo("Health-", 23);

        Employee2 e = new Employee2("Shrikanta", insurance1, add1);

        e.dispaly();
    }*/
}
