public class Company {
    String name;
    String city;
    String state;
    String country;

    Company(String name, String city, 
        String state, String country){
        this.name = name;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    void displayCompanyData(){
        System.out.println("Company Name: " 
        + name);
        System.out.println("Location: " 
        + city + ", " + state + ", " + country);
    }
}
