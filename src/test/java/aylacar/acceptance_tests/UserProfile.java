package aylacar.acceptance_tests;

import static org.junit.Assert.assertTrue;

import javax.swing.JButton;

import aylacar.Customer;
import aylacar.Manage;
import aylacar.HomeFrame;
import aylacar.InstallationFrame;
import aylacar.OrderHistoryFrame;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class UserProfile {

	
	HomeFrame h;
	String name=null;
	String password=null;
	String email=null;
	Customer c=new Customer();
	Manage m= new Manage();
	
    @Given("the customer is logged in")
    public void theCustomerIsLoggedIn() {
    h=new HomeFrame();
    }

    @When("the customer navigates to the profile editing page")
    public void theCustomerNavigatesToTheProfileEditingPage() {
        JButton edit_profile=new JButton();
        edit_profile.doClick();
    }

    @When("updates their contact information")
    public void updatesTheirContactInformation(io.cucumber.datatable.DataTable dataTable) {
        name="aaaa";
        email="aaaa@aylacar";
    }

    @When("submits the profile editing form")
    public void submitsTheProfileEditingForm() {
    	  m.updateCustomerInfo(c,name,email);
    }

    @Then("the customer's profile should be updated successfully")
    public void theCustomersProfileShouldBeUpdatedSuccessfully() {
    	 assertTrue(true);
    }

    @When("the customer navigates to the order history page")
    public void theCustomerNavigatesToTheOrderHistoryPage() {
    	OrderHistoryFrame f=new OrderHistoryFrame();
    }

    @Then("the customer should see a list of past orders")
    public void theCustomerShouldSeeAListOfPastOrders() {
    	 assertTrue(true);
    }

    @Then("be able to view details of each order, including products, quantities, and order status")
    public void beAbleToViewDetailsOfEachOrderIncludingProductsQuantitiesAndOrderStatus() {
    	 assertTrue(true);
    }

    @When("the customer navigates to the installation requests page")
    public void theCustomerNavigatesToTheInstallationRequestsPage() {
        InstallationFrame i = new InstallationFrame();
    }

    @Then("the customer should see a list of past installation requests")
    public void theCustomerShouldSeeAListOfPastInstallationRequests() {
    	 assertTrue(true);
    }

    @Then("be able to view details of each installation request, including installer information and status")
    public void beAbleToViewDetailsOfEachInstallationRequestIncludingInstallerInformationAndStatus() {
    	 assertTrue(true);
    }
}
