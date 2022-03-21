package co.com.experimentality.prueba.stepdefinitions;

import co.com.experimentality.prueba.questions.CorrectlyPrice;
import co.com.experimentality.prueba.questions.InSummaryPurchase;
import co.com.experimentality.prueba.questions.MessageDelete;
import co.com.experimentality.prueba.questions.ViewASpecificItem;
import co.com.experimentality.prueba.tasks.compras.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.Map;

import static co.com.experimentality.prueba.tasks.cargardedatos.Charge.cargoLosDatosDeLaTransaccionConLaSiguiente;
import static co.com.experimentality.prueba.utils.constans.ConstantExcelData.ACTOR;

public class StepdefinitionCompras {

    @Before
    public void initialConfiguration() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that the user loads the test data while on the page$")
    public void thatTheUserLoadsTheTestDataWhileOnThePage(List<Map<String, Object>> information) {
        OnStage.theActorCalled(ACTOR).wasAbleTo(
                cargoLosDatosDeLaTransaccionConLaSiguiente(information),
                Open.url("https://jagoqui-clothesstore-latam.netlify.app/#/home")
        );
    }


    @When("^add a item to shopping cart$")
    public void addAItemToShoppingCart() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AddItem.shoppingCart()
        );
    }

    @When("^increase a item to shopping cart$")
    public void increaseAItemToShoppingCart() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AddItem.shoppingCart(),
                IncreaseQuantity.ofItems()
        );
    }

    @When("^i decide to withdraw a item$")
    public void iDecideToWithdrawAItem() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AddItems.toShoppingCart(),
                RemoveItem.inSummary()
        );
    }

    @When("^i decide to remove all items$")
    public void iDecideToRemoveAllItems() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AddItems.toShoppingCart(),
                RemoveAllItems.inScreen()
        );
    }

    @When("^i decide to cancel an item withdrawal$")
    public void iDecideToCancelAnItemWithdrawal() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AddItem.shoppingCart(),
                CancelRemove.items()
        );
    }

    @When("^i search an item$")
    public void iSearchAnItem() {
       OnStage.theActorInTheSpotlight().attemptsTo(
               SearchAnItem.inPage()
       );
    }

    @Then("^i visualise a product related$")
    public void iVisualiseAProductRelated() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                ViewASpecificItem.inScreen()
        ));
    }

    @Then("^i see the deleted message$")
    public void iSeeTheDeletedMessage() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                MessageDelete.inScreen()
        ));
    }

    @Then("^look it in the purchase summary$")
    public void lookItInThePurchaseSummary() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                InSummaryPurchase.current()
        ));
    }

    @Then("^look it the price is right$")
    public void lookItThePriceIsRight() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(
                CorrectlyPrice.inSummary()
        ));
    }
}
