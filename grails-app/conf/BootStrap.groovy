import pl.polsl.kojzar.lukasz.MyProduct;
import pl.polsl.kojzar.lukasz.MyShop;

class BootStrap {

    def init = { servletContext ->
		 def productOne = new MyProduct(name: "product1").save(failOnError: true)
		 def productTwo = new MyProduct(name: "product2").save(failOnError: true)
		 def productThree = new MyProduct(name: "product3").save(failOnError: true)
		 
		 def shopOne = new MyShop(
			 name: "shop1",
			 description: "desc1")
		 shopOne.addToProdukty(productOne)
		 shopOne.addToProdukty(productThree)
		 shopOne.save(failOnError: true)
		 
		 def shopTwo = new MyShop(
			 name: "shop2",
			 description: "desc2")
		 shopTwo.addToProdukty(productTwo)
		 shopTwo.addToProdukty(productThree)
		 shopTwo.save(failOnError: true)
    }
    def destroy = {
    }
}
